package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;

import modele.Associer;
import modele.Contrat_Location;
import modele.Creneau;
import modele.Locataire;

public class DaoAssocier extends DaoModele<Associer> implements Dao<Associer> {

	@Override
	public Collection<Associer> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Associer findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Associer donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Associer donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Associer donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Associer creerInstance(ResultSet curseur) throws SQLException {
		boolean caution = true;
		if(curseur.getString("caution") == "0") {
			 caution = false;
		}
		DaoLocataire dl= new DaoLocataire();
		DaoContrat_Location da = new DaoContrat_Location();
		Locataire
		
		Associer cr= new Associer(curseur.getDate("dateDebutContrat").toString(), curseur.getString("idLocataire"), curseur.getString("dateEntree").toString(), curseur.getString("dateSortie").toString(), caution,"",  "");
		 
				//Contrat_Location contratLocation Locataire locataire
		return null;
	}

}
