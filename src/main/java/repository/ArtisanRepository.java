package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Metier;
import model.Service;
import model.Artisan;

public interface ArtisanRepository extends JpaRepository<Artisan, Long> {
	
	
	 List<Metier> findAllMetier();
	 List<Service> findAllService();
	 List<Service> findAllDemandes();
}
