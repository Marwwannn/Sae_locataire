package modele;

import java.util.Objects;

public class BienImmobilier {
	private  final String idBienImmobilier;
	private  double surface;
	private  String mdpChauffage;
	private  String mdpEau;
	private  int nbPieces;
	private  String typeBien;
	private  String nomProprietaire;
	private final String identifiant;
	private  String etage;
	private  Batiment batiment;

	public BienImmobilier(String idBienImmobilier, double surface, String mdpChauffage,
			String mdpEau, int nbPieces, String typeBien, String nomProprietaire,
			String identifiant, String etage, Batiment batiment) {
		this.idBienImmobilier = idBienImmobilier;
		this.surface = surface;
		this.mdpChauffage = mdpChauffage;
		this.mdpEau = mdpEau;
		this.nbPieces = nbPieces;
		this.typeBien = typeBien;
		this.nomProprietaire = nomProprietaire;
		this.identifiant = identifiant;
		this.etage = etage;
		this.batiment = batiment;
	}

	public String getIdBienImmobilier() {
		return idBienImmobilier;
	}

	public double getSurface() {
		return surface;
	}

	public String getMdpChauffage() {
		return mdpChauffage;
	}

	public String getMdpEau() {
		return mdpEau;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public String getTypeBien() {
		return typeBien;
	}

	public String getNomProprietaire() {
		return nomProprietaire;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public String getEtage() {
		return etage;
	}

	public Batiment getBatiment() {
		return batiment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idBienImmobilier);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof BienImmobilier)) {
			return false;
		}
		BienImmobilier other = (BienImmobilier) obj;
		return Objects.equals(idBienImmobilier, other.idBienImmobilier);
	}


	/**
	 * @param surface the surface to set
	 */
	public void setSurface(double surface) {
		this.surface = surface;
	}

	/**
	 * @param mdpChauffage the mdpChauffage to set
	 */
	public void setMdpChauffage(String mdpChauffage) {
		this.mdpChauffage = mdpChauffage;
	}

	/**
	 * @param mdpEau the mdpEau to set
	 */
	public void setMdpEau(String mdpEau) {
		this.mdpEau = mdpEau;
	}

	/**
	 * @param nbPieces the nbPieces to set
	 */
	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	/**
	 * @param typeBien the typeBien to set
	 */
	public void setTypeBien(String typeBien) {
		this.typeBien = typeBien;
	}

	/**
	 * @param nomProprietaire the nomProprietaire to set
	 */
	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}

	/**
	 * @param etage the etage to set
	 */
	public void setEtage(String etage) {
		this.etage = etage;
	}

	/**
	 * @param batiment the batiment to set
	 */
	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}
}
