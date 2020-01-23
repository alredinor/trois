package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Metier;

public interface MetierRepository extends JpaRepository<Metier, Long> {
	
}
