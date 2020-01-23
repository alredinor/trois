package service;

import java.util.Optional;

import model.Metier;
import repository.MetierRepository;

public class MetierService 
{
	private MetierRepository metier;

	public boolean save(Metier m) 
	{
		Metier metierBase = null;
		if (m.getIdMetier() != null) 
		{
			Optional<Metier> opt = metier.findById(m.getIdMetier()); // optionnal : renvois un objet
			if (opt.isPresent()) 
			{
				metierBase = opt.get();
				metierBase.setTitreMetier((m.getTitreMetier() != null) ? m.getTitreMetier() : metierBase.getTitreMetier());
				return true;
			}
		} 
		else 
		{
			Boolean erreur = false;
			if (m.getTitreMetier() == null) 
			{
				erreur = true;
			}
			if (erreur) 
			{
				metier.save(m);
				return true;
			}
		}
		//moi.save(personneBase);
		return false;
	}
}
