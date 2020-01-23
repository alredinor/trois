package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.MetierJoinCompte;

public interface MetierJoinCompteRepository extends JpaRepository<MetierJoinCompte, Integer> {
	
}
