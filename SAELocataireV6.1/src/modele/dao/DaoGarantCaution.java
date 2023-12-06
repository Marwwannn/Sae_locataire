package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.GarantCaution;

public class DaoGarantCaution extends DaoModele<GarantCaution> implements Dao<GarantCaution> {

	@Override
	public Collection<GarantCaution> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GarantCaution findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(GarantCaution donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(GarantCaution donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(GarantCaution donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected GarantCaution creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
