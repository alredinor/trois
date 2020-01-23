package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Artisan;
import repository.ArtisanRepository;

@Service
public class ArtisanService {

	@Autowired
	private ArtisanRepository artisanRepository;

	public boolean save(Artisan a) {
		Artisan ArtisanBase = null;
		if (a.getIdCompte() != null) {
			Optional<Artisan> opt = artisanRepository.findById(a.getIdCompte()); // optionnal : renvois un objet
			if (opt.isPresent()) {
				ArtisanBase = opt.get();  
				ArtisanBase.setPrenom((a.getPrenom() != null) ? a.getPrenom() : ArtisanBase.getPrenom());
				return true;
			}
		} else {
			Boolean erreur = false;
			if (a.getPrenom() == null) {
				erreur = true;
			}
			if (a.getNom() == null) {
				erreur = true;
			}
			if (erreur) {
				artisanRepository.save(a);
				return true;
			}
		}
		//artisanRepository.save(ArtisanBase);
		return false;

	}

}
