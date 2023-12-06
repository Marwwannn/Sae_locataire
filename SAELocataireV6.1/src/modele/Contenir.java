package modele;

public class Contenir {
	private static String idCaution;
	private String dateDebutContrat;


	public Contenir(int idCaution, String dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}

	public String getIdCaution() {
		return idCaution;
	}

	public String getDateDebutContrat() {
		return dateDebutContrat;
	}

	public void setDateDebutContrat(String dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}
}
