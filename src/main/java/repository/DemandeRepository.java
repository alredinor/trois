package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Demande;
import java.lang.Long;
import java.util.List;

public interface DemandeRepository extends JpaRepository<Demande, Long>{
	
	List<Demande> findByIdDemande(Long iddemande);
	

}
