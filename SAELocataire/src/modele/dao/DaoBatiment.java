package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.Batiment;

public class DaoBatiment extends DaoModele<Batiment> implements Dao<Batiment> {

	@Override
	public Collection<Batiment> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Batiment findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Batiment donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Batiment donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Batiment donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Batiment creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}
