package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="room")
@NamedQueries({@NamedQuery(name="Salle.findAll",query="select s from Salle s"),
    @NamedQuery(name="Salle.findByNameLike",query="select s from Salle s where s.nom like :nom"),
    @NamedQuery(name="Salle.findAllWithPersonnes",query="select s from Salle s left join fetch s.personnes"),//fetch : le résultat de la requête/la jointure est gardée en mémoire
    @NamedQuery(name="Salle.findByKeyWithPersonnes",query="select s from Salle s left join fetch s.personnes where s.nom=:nom")})
public class Salle {
    @Id
    @Column(name="name", length=100)
    private String nom;
    @OneToMany(mappedBy="salle") //créé une relation virtuelle pour jpa, qui ne modifie pas la base. MappedBy choisi sur quoi faire la jointure
    private Set<Personne> personnes;
	@Version
	private int version;
	
	
	
    public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Salle() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Set<Personne> personnes) {
		this.personnes = personnes;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
        Salle other = (Salle) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        return true;
    }



}