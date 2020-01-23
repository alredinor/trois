package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Personne;
import repository.PersonneRepository;

@Service
public class ClientService {

	@Autowired
	private PersonneRepository moi;

	public boolean save(Personne p) {
		Personne personneBase = null;
		if (p.getId() != null) {
			Optional<Personne> opt = moi.findById(p.getId()); // optionnal : renvois un objet
			if (opt.isPresent()) {
				personneBase = opt.get();
				personneBase.setPrenom((p.getPrenom() != null) ? p.getPrenom() : personneBase.getPrenom());
				return true;
			}
		} else {
			Boolean erreur = false;
			if (p.getPrenom() == null) {
				erreur = true;
			}
			if (p.getNom() == null) {
				erreur = true;
			}
			if (erreur) {
				moi.save(p);
				return true;
			}
		}
		//moi.save(personneBase);
		return false;

	}

}
