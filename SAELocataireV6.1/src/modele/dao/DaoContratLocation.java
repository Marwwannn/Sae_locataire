package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.ContratLocation;

public class DaoContratLocation extends DaoModele<ContratLocation> implements Dao<ContratLocation> {

	@Override
	public Collection<ContratLocation> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContratLocation findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ContratLocation donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(ContratLocation donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ContratLocation donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected ContratLocation creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
