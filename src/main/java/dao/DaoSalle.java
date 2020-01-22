package dao;

import model.Salle;

public interface DaoSalle extends DaoGeneric<Salle, String> {

	Salle findByKeyWithPersonnes(String nom);
	
}
