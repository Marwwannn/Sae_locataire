package modele;

public class Taxe {
	private static String idTaxeFonciere;
	private double baseImposition;
	private double typeTaxe;
	private double taux;
	private String dateTaxe;
	private static String idBienImm;

	public Taxe(String idTaxeFonciere, double baseImposition, double typeTaxe, double taux, String dateTaxe, int idBienImm) {
		this.baseImposition = baseImposition;
		this.typeTaxe = typeTaxe;
		this.taux = taux;
		this.dateTaxe = dateTaxe;
	}

	public String getIdTaxeFonciere() {
		return idTaxeFonciere;
	}

	public double getBaseImposition() {
		return baseImposition;
	}

	public void setBaseImposition(double baseImposition) {
		this.baseImposition = baseImposition;
	}

	public double getTypeTaxe() {
		return typeTaxe;
	}

	public void setTypeTaxe(double typeTaxe) {
		this.typeTaxe = typeTaxe;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public String getDateTaxe() {
		return dateTaxe;
	}

	public void setDateTaxe(String dateTaxe) {
		this.dateTaxe = dateTaxe;
	}

	public String getIdBienImm() {
		return idBienImm;
	}

}
