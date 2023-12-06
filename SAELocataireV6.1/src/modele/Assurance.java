package modele;

public class Assurance {
	private int numPolice;
	private String tarifInitial;
	private String typeAssurance;
	private String dateEffetDebut;
	private static int idBienImm;
	private static int idBatiment;

	public Assurance(int numPolice, String tarifInitial, String typeAssurance, String dateEffetDebut,
			int idBienImm, int idBatiment) {
		this.numPolice = numPolice;
		this.tarifInitial = tarifInitial;
		this.typeAssurance = typeAssurance;
		this.dateEffetDebut = dateEffetDebut;

	}

	public int getNumPolice() {
		return numPolice;
	}

	public void setNumPolice(int numPolice) {
		this.numPolice = numPolice;
	}

	public String getTarifInitial() {
		return tarifInitial;
	}

	public void setTarifInitial(String tarifInitial) {
		this.tarifInitial = tarifInitial;
	}

	public String getTypeAssurance() {
		return typeAssurance;
	}

	public void setTypeAssurance(String typeAssurance) {
		this.typeAssurance = typeAssurance;
	}

	public String getDateEffetDebut() {
		return dateEffetDebut;
	}

	public void setDateEffetDebut(String dateEffetDebut) {
		this.dateEffetDebut = dateEffetDebut;
	}

	public int getIdBienImm() {
		return idBienImm;
	}


	public int getIdBatiment() {
		return idBatiment;
	}


}
