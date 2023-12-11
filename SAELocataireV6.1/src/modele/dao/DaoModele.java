package modele.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import SQL.CictOracleDataSource;
import select.Requete;

public abstract class DaoModele<T> implements Dao<T> {

    protected abstract T creerInstance(ResultSet curseur) throws SQLException;

    protected List<T> select(PreparedStatement prSt) throws SQLException {
        List<T> resultat = new ArrayList<>();
        ResultSet curseur = prSt.executeQuery();

        while (curseur.next()) {
            T instance = creerInstance(curseur);
            resultat.add(instance);
        }

        curseur.close();
        prSt.close();
        return resultat;
    }

    protected int miseAJour(Requete<T> req, T donnee) throws SQLException {
    	PreparedStatement st = CictOracleDataSource.getConnectionBD().prepareStatement(req.requete());
        req.parametres(st,donnee);
        return st.executeUpdate();
    }

    protected List<T> find(Requete<T> req, String... id) throws SQLException {
    	PreparedStatement st = CictOracleDataSource.getConnectionBD().prepareStatement(req.requete());
        req.parametres(st,id);
        return select(st);
    }

    protected T findById(Requete<T> req, String... id) throws SQLException {
		T cr = null;
		List<T> res = this.find(req,id);
		if(res.isEmpty()) {
			cr = null;
		}else {
			cr = res.get(0);
		}
		
		return cr;
    }

    @Override
    public java.util.Collection<T> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public T findById(String... id) throws SQLException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void update(T donnee) throws SQLException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void create(T donnee) throws SQLException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void delete(T donnee) throws SQLException {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
