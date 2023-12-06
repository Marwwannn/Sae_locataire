package modele;

public class HistoriquePaiement {
	private static String idHistPaiement;
	private String stocker;
	private String dateDebutContrat;

	public HistoriquePaiement(int idHistPaiement, String stocker, String dateDebutContrat) {
		this.stocker = stocker;
		this.dateDebutContrat = dateDebutContrat;
	}

	public String getIdHistPaiement() {
		return idHistPaiement;
	}

	public String getStocker() {
		return stocker;
	}

	public void setStocker(String stocker) {
		this.stocker = stocker;
	}

	public String getDateDebutContrat() {
		return dateDebutContrat;
	}

	public void setDateDebutContrat(String dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}
}
