package model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="trainer_skill")
public class Enseignement {
	
	@EmbeddedId //on utilise une classe embarquée en tant qu'Id. Ignorer le message
	private EnseignementPK key;
	@Column(name="level",length=50)
	private String niveau;
	@Version
	private int version;
	
	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public Enseignement() {
		
	}


	public Enseignement(EnseignementPK key, String niveau) {
		super();
		this.key = key;
		this.niveau = niveau;
	}


	public EnseignementPK getKey() {
		return key;
	}


	public void setKey(EnseignementPK key) {
		this.key = key;
	}


	public String getNiveau() {
		return niveau;
	}


	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
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
		Enseignement other = (Enseignement) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	
	
	
}
