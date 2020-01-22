package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import model.Competence;

public interface CompetenceRepository extends JpaRepository<Competence, String>{

	
	Page<Competence> findAllByNomContaining(String nom, Pageable page);
	
}
