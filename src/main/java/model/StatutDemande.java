package model;

public enum StatutDemande {

	Valide("valid�"), En_attente("en attente"), Termine("termin�");
	private String statut;
	private StatutDemande(String statut) {
	this.statut=statut;	
	}
	public String getStatut() {
		return statut;
	}
	
	
	
}
