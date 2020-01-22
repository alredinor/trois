package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Salle;

public interface SalleRepository extends JpaRepository<Salle, String>{

	
	List<Salle> findAllWithPersonnes();
	
}
