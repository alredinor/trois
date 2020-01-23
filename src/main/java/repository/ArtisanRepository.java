package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Artisan;

public interface ArtisanRepository extends JpaRepository<Artisan, Long> {
	
}
