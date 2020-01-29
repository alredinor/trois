package model;

public enum StatutDemande {

	Valide("validé"), En_attente("en attente"), Termine("terminé");
	private String statut;
	private StatutDemande(String statut) {
	this.statut=statut;	
	}
	public String getStatut() {
		return statut;
	}
	
	
	
}
