package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Detail;
import model.DetailPK;

public interface DetailRepository extends JpaRepository<Detail, DetailPK> {
	
	//List<Detail> findAll();
	
}
