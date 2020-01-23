package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {
	
}
