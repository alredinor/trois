package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Compte;
import model.Demande;
import model.Metier;
import model.Service;
import model.StatutDemande;

public interface DemandeRepository extends JpaRepository<Demande, Long>{
	
	List<Demande> findByIdDemande(Long idDemande);
	List<Demande> findByArtisan(Compte idArtisan);
	List<Demande> findByClient(Compte idClient);
	List<Demande> findByService(Service idService);
	List<Demande> findByMetier(Metier idMetier);
	List<Demande> findByStatut(StatutDemande statut);
	

}
