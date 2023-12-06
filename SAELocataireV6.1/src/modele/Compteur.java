package modele;

public class Compteur {
	private static String idCompteur;
	private String dateReleve;
	private String typeCompteur;
	private double valeur;
	private static String idBienImm;


	public Compteur(int idCompteur, String dateReleve, String typeCompteur, double valeur, int idBienImm) {
		this.dateReleve = dateReleve;
		this.typeCompteur = typeCompteur;
		this.valeur = valeur;
	}

	public String getIdCompteur() {
		return idCompteur;
	}

	public String getDateReleve() {
		return dateReleve;
	}

	public void setDateReleve(String dateReleve) {
		this.dateReleve = dateReleve;
	}

	public String getTypeCompteur() {
		return typeCompteur;
	}

	public void setTypeCompteur(String typeCompteur) {
		this.typeCompteur = typeCompteur;
	}

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public String getIdBienImm() {
		return idBienImm;
	}

}
