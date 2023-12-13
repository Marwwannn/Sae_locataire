package select;


import modele.Locataire;
import modele.dao.requetes.Requete;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RequeteSelectLocataire implements Requete<Locataire> {
    @Override
    public String requete() {
        return "SELECT * FROM LRF4482A.LOCATAIRE ORDER BY IDIM";
    }

    @Override
    public void parametres(PreparedStatement prSt, String... id) throws SQLException {}

	@Override
	public void parametres(PreparedStatement prSt, Locataire data) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
