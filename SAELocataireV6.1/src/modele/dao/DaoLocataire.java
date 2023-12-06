package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.Locataire;

public class DaoLocataire extends DaoModele<Locataire> implements Dao<Locataire> {

	@Override
	public Collection<Locataire> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Locataire findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Locataire donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Locataire donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Locataire donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Locataire creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
