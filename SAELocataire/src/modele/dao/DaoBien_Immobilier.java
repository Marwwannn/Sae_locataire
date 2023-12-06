package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.Bien_Immobilier;

public class DaoBien_Immobilier  extends DaoModele<Bien_Immobilier> implements Dao<Bien_Immobilier> {

	@Override
	public Collection<Bien_Immobilier> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bien_Immobilier findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Bien_Immobilier donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Bien_Immobilier donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Bien_Immobilier donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Bien_Immobilier creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
