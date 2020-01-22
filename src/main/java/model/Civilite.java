package model;

public enum Civilite {
	M("monsieur","mister"), MME("madame","madam"), MLLE("mademoiselle","miss");
	
	private String francais;
	private String anglais;
	
	private Civilite(String francais, String anglais) {
		this.francais=francais;
		this.anglais=anglais;
	}
	
	public String getFrancais() {
		return francais;
	}
	
	public String getAnglais() {
		return anglais;
	}
}
