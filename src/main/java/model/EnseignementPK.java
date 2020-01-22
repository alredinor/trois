package model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class EnseignementPK implements Serializable{
	@ManyToOne
	@JoinColumn(name="trainer_id", foreignKey = @ForeignKey(name="trainer_skill_trainer_id_fk")) //mettre le nom inséré dans la base
	private Formateur formateur;
	@ManyToOne
	@JoinColumn(name="skill_id", foreignKey = @ForeignKey(name="trainer_skill_skill_id_fk")) 
	private Competence competence;
	
	public EnseignementPK() {
		
	}

	public EnseignementPK(Formateur formateur, Competence competence) {
		super();
		this.formateur = formateur;
		this.competence = competence;
	}

	public Formateur getFormateur() {
		return formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public Competence getCompetence() {
		return competence;
	}

	public void setCompetence(Competence competence) {
		this.competence = competence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((competence == null) ? 0 : competence.hashCode());
		result = prime * result + ((formateur == null) ? 0 : formateur.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnseignementPK other = (EnseignementPK) obj;
		if (competence == null) {
			if (other.competence != null)
				return false;
		} else if (!competence.equals(other.competence))
			return false;
		if (formateur == null) {
			if (other.formateur != null)
				return false;
		} else if (!formateur.equals(other.formateur))
			return false;
		return true;
	}
	
	
	
}
