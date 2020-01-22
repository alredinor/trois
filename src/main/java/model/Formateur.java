package model;

import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("F")
public class Formateur extends Personne {
	private Integer experience;
	private Boolean referent;
//	@ManyToMany  //EST REMPLACE PAR L'ENTITE QU'ON GERE A LA MAIN, ET UN MANY TO ONE
//	@JoinTable(name="trainer_skill",
//	joinColumns = @JoinColumn(name="trainer_id", foreignKey = @ForeignKey(name="trainer_skill_trainet_id")),
//	inverseJoinColumns = @JoinColumn(name="skill_id",foreignKey = @ForeignKey(name="trainer_skill_skill_id")))
//	private Set<Competence> competences;
	@OneToMany(mappedBy="key.formateur") //fausse erreur. Coonexion virtuelle, ne modifie pas la table
	private Set<Enseignement> enseignements;
	
	public Formateur() {
	}
	
	public Formateur(Integer experience, Boolean referent) {
		this.experience = experience;
		this.referent = referent;
	}

	public Formateur(String prenom, String nom) {
		super(prenom, nom);
	
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Boolean getReferent() {
		return referent;
	}

	public void setReferent(Boolean referent) {
		this.referent = referent;
	}

	public Set<Enseignement> getEnseignements() {
		return enseignements;
	}

	public void setEnseignements(Set<Enseignement> enseignements) {
		this.enseignements = enseignements;
	}

	
	
	
	
}
