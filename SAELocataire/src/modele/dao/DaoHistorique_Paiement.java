package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.Historique_Paiement;

public class DaoHistorique_Paiement extends DaoModele<Historique_Paiement> implements Dao<Historique_Paiement> {

	@Override
	public Collection<Historique_Paiement> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Historique_Paiement findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Historique_Paiement donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Historique_Paiement donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Historique_Paiement donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Historique_Paiement creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
