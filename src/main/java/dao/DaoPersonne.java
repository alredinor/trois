package dao;

import java.util.List;

import model.Eleve;
import model.Formateur;
import model.Personne;

public interface DaoPersonne extends DaoGeneric<Personne, Integer> {
	public List<Formateur> findAllFormateur();
	public List<Eleve> findAllEleve();
	public List<Personne> findByCity(String city);
	public List<Formateur> findBySkill(String skill);
}
