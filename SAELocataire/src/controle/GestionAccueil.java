package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLayeredPane;
import javax.swing.JMenuItem;

import vue.Accueil;
import vue.FenetreBien;
import vue.FenetreDetailsPropriete2;
import vue.FenetreListeLocataire;
import vue.Page_Ajout_Locataire;

public class GestionAccueil implements ActionListener {
    private Accueil accueil;

    public GestionAccueil(Accueil accueil) {
        this.accueil = accueil;
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        JLayeredPane layeredPane = accueil.getLayeredPane();

        switch (menuItem.getText()) {
            case "Ajouter locataire":
                afficherFenetre(new Page_Ajout_Locataire(), layeredPane);
                break;
            case "Consulter locataire":
                afficherFenetre(new FenetreListeLocataire(), layeredPane);
                break;
            case "Ajouter logement":
                afficherFenetre(new FenetreBien(), layeredPane);
                break;
            case "Consulter logement":
                afficherFenetre(new FenetreDetailsPropriete2(), layeredPane);
                break;
            case "Consultation":
                afficherFenetre(new FenetreDetailsPropriete2(), layeredPane);
                break;
        }
    }

    private void afficherFenetre(javax.swing.JInternalFrame fenetre, JLayeredPane layeredPane) {
        layeredPane.add(fenetre);
        fenetre.setVisible(true);
    }
}
