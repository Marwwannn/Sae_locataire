package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.Facture;

public class DaoFacture extends DaoModele<Facture> implements Dao<Facture> {

	@Override
	public Collection<Facture> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facture findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Facture donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Facture donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Facture donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Facture creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
