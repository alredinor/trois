package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="skill")
@SequenceGenerator(name="seqCompetence",sequenceName="seq_skill",initialValue=100,allocationSize=50) //génère des séquences (incrémentation auto). Commence à 100 histoire de pouvoir rajouter des données à la main si besoin sans conflit

public class Competence {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqCompetence") 
	@Column(name = "skill_id")
	private Integer id;
	@Column(name="skill_name",length=150)
	private String nom;
	@Version
	private int version;
	
	
	
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Competence() {
	
	
	}

public Competence(String nom) {
		super();
		this.nom = nom;
	}



		public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Competence other = (Competence) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
	
}
