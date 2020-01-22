package model;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.validator.constraints.NotEmpty;

//ANNOTATIONS
@Entity
@Table(name="person")
@SequenceGenerator(name="seqPersonne",sequenceName="seq_person",initialValue=100,allocationSize=1) //génère des séquences (incrémentation auto). Commence à 100 histoire de pouvoir rajouter des données à la main si besoin sans conflit

//STRATEGIES D'HERITAGE !!
//@Inheritance(strategy = InheritanceType.JOINED) // STRAT A : 1 table par classe tot (ici 3) mais nécess jointures donc nul
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // STRAT B :  1 tble par classe fille (ici 2)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // STRAT C : 1 table avec toutes les classes mélangées
@DiscriminatorColumn(name="type",discriminatorType = DiscriminatorType.STRING,length=1)   //colonne discriminante, sépare les élèves des formateurs
public abstract class Personne {
	


	//ATTRIBUTS
	@Id //S'applique sur la ligne suivante : l'id est devenue la clé primaire
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqPersonne") //la numérotation est gérée automatiquement
	private Integer id;
	@NotEmpty   //VALIDATION : Permet de mettre des contraintes. Ici, si c'est Empty, lance une erreur
	@Column(name="first_name",length=150,nullable=false)
	private String prenom;
	@Column(name="last_name",length=150)
	private String nom;
	@Temporal(TemporalType.DATE)
	@Column(name="birthday")
	private Date dtNaiss;
	@Enumerated(EnumType.STRING)  //POUR DES ENUMERATIONS, ordinal([1], [2]) ou string (MME, MLLE)
	@Column(name = "title", length = 4)
	private Civilite civilite;
	@Embedded // il embarquera les 4 colonnes d'adresse, pas 1 colonne seulement
	@AttributeOverrides({
		@AttributeOverride(name="numero",column=@Column(name="person_number")),
		@AttributeOverride(name="rue",column=@Column(name="person_street")),
		@AttributeOverride(name="codePostal",column=@Column(name="person_zip_code")),
		@AttributeOverride(name="ville",column=@Column(name="person_city"))
		})
	private Adresse adresse;
	@ManyToOne
	@JoinColumn(name="room_id",foreignKey = @ForeignKey(name="person_room_id_fk"))
	private Salle salle;
	// si on veut un attribut qui ne se retrouve pas dans la DB, on ajouter comme annot° @Transient
	@Version
	private int version;
	
	public Personne(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	// CONSTRUCTEUR VIDE
	public Personne() {  
	}
	
	
	//GETTERS-SETTERS
	public Integer getId() { 
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDtNaiss() {
		return dtNaiss;
	}
	public void setDtNaiss(Date dtNaiss) {
		this.dtNaiss = dtNaiss;
	}
	public Civilite getCivilite() {
		return civilite;
	}
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	//METHODES
	//font la comparaison sur les 2 id pour savoir s'il s'agit de la même personne, si 2 objets sont égaux



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
		Personne other = (Personne) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
