package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.BienImmobilier;

public class DaoBienImmobilier  extends DaoModele<BienImmobilier> implements Dao<BienImmobilier> {

	@Override
	public Collection<BienImmobilier> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BienImmobilier findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BienImmobilier donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(BienImmobilier donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(BienImmobilier donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected BienImmobilier creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
