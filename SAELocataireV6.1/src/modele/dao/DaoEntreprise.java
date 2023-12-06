package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.Entreprise;

public class DaoEntreprise extends DaoModele<Entreprise> implements Dao<Entreprise> {

	@Override
	public Collection<Entreprise> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entreprise findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Entreprise donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Entreprise donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Entreprise donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Entreprise creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
