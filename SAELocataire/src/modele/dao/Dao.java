package modele.dao;

import java.sql.SQLException;

public interface Dao<T> {
    java.util.Collection<T> findAll() throws SQLException;

    T findById(String... id) throws SQLException;

    void update(T donnee) throws SQLException;

    void create(T donnee) throws SQLException;

    void delete(T donnee) throws SQLException;
}
