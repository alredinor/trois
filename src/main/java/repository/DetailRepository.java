package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Detail;

public interface DetailRepository extends JpaRepository<Detail, String> {
	
	List<Detail> findByStatut(String s);
	
}
