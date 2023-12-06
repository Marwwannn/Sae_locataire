package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.FenetreListeLocataire;

public class GestionListeLocataire implements ActionListener {

    private FenetreListeLocataire listeLocataire;

    public GestionListeLocataire(FenetreListeLocataire listeLocataire) {
        this.listeLocataire = listeLocataire;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source instanceof JButton) {
            JButton button = (JButton) source;

            switch (button.getText()) {
                case "Voir le bien immobilier concerné":
                    break;
                case "Modifier":
                    // Code pour la modification du locataire
                    break;
                case "Supprimer":
                    // Code pour la suppression du locataire
                    break;
                case "Annuler":
                    listeLocataire.dispose();
                    break;
            }
        }
    }
}
