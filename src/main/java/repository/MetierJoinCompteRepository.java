package repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Compte;
import model.Metier;
import model.MetierJoinCompte;

public interface MetierJoinCompteRepository extends JpaRepository<MetierJoinCompte, Integer> {
	
	
	Optional <MetierJoinCompte> findById (Integer id);
	List <MetierJoinCompte> findByMetier(Metier metier);
	List <MetierJoinCompte> findByCompte(Compte compte);
}
