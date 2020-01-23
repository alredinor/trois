package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Artisan;
import model.Client;
import model.Metier;
import model.Service;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
	
	List<Metier> findAllMetier(String nom);
	List<Service> findAllService(String nom);
	List<Artisan> findAllArtisan(String nom);
}
