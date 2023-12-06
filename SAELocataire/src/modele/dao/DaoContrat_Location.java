package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.Contrat_Location;

public class DaoContrat_Location extends DaoModele<Contrat_Location> implements Dao<Contrat_Location> {

	@Override
	public Collection<Contrat_Location> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contrat_Location findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Contrat_Location donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Contrat_Location donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Contrat_Location donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Contrat_Location creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
