package repository;

import java.util.List;

import javax.xml.soap.Detail;

import org.springframework.data.jpa.repository.JpaRepository;

import model.DetailPK;

public interface DetailRepository extends JpaRepository<Detail, DetailPK> {
	
	//List<Detail> findAll();
	
}
