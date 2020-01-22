package repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
	List<Personne> findByPrenom(String prenom);

	List<Personne> findByPrenomLike(String prenom);

	// List<Personne>findByDtNaissGreaterThanAndLessThan(Date min,Date max);
	List<Personne> findByDtNaissBetween(Date min, Date max);

	@Query("Select p from Personne p where p.prenom Like : prenom and p.nom like:nom") // requete jpql)
	List<Personne> findByPrenomAndNom(String prenom, String nom);
}
