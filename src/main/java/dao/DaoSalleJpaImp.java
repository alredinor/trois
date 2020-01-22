package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import model.Salle;

@Repository // annotation pour créer un bean (objet gérer par Spring)
@Transactional(propagation=Propagation.REQUIRED, readOnly=true) // true si pas de changement pas de modif
class DaoSalleJpaImp implements DaoSalle { // PLUS BESOIN D'ECRIRE DE COMMANDE SQL AVEC L'ENTITY MANAGER !!

	@PersistenceContext // je veux un entityManagerFactory si disponible à un entityManager sion en
	// creer un nouveau
	private EntityManager em;

	@Override
	public Salle findByKey(String key) {
		Salle s = null;
		s = em.find(Salle.class, key); // on utilise une méthode qui existe déjà

		return s;
	}

	@Override
	public List<Salle> findAll() {
		List<Salle> personnes = null;
		Query query = em.createQuery("select p from Salle p"); // peut s'écrire ("from Personne p"). On met une CLASSE
		// et pas une TABLE derrière le FROM
		personnes = query.getResultList();
		return personnes;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false) // false pour pouvoir lire et écrire
	public void insert(Salle obj) {
	
			em.persist(obj);
			
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Salle update(Salle obj) {

		
		Salle s = null;
		
			s = em.merge(obj); // MEME CODE QUE INSERT sauf cette ligne
		return s;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void delete(Salle obj) {
	
			em.remove(em.merge(obj));
			
	}

	@Override
	public void deleteByKey(String key) {
		delete(findByKey(key));

	}

	@Override
	public Salle findByKeyWithPersonnes(String nom) {
		// TODO Auto-generated method stub
		Salle salle=null;         
		Query query=em.createNamedQuery("Salle.findKeyWithPersonnes");         
		query.setParameter("nom",nom);         
		return salle;
	}

}
