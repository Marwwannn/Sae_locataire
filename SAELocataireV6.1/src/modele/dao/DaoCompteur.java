package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.Compteur;

public class DaoCompteur extends DaoModele<Compteur> implements Dao<Compteur> {

	@Override
	public Collection<Compteur> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compteur findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Compteur donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Compteur donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Compteur donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Compteur creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
