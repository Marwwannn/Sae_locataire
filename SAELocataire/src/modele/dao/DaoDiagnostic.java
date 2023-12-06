package modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import modele.Diagnostic;

public class DaoDiagnostic extends DaoModele<Diagnostic> implements Dao<Diagnostic> {

	@Override
	public Collection<Diagnostic> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Diagnostic findById(String... id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Diagnostic donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Diagnostic donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Diagnostic donnee) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Diagnostic creerInstance(ResultSet curseur) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
