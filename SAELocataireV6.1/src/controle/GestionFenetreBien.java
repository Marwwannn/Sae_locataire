package controle;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JInternalFrame;

public class GestionFenetreBien {

    private JInternalFrame fenetreBien;

    public GestionFenetreBien(JInternalFrame fenetreBien) {
        this.fenetreBien = fenetreBien;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source instanceof JButton) {
            JButton buttonValider = (JButton) source;

            switch (buttonValider.getText()) {
                case "Valider":
                    fenetreBien.dispose();
                    break;
            }
        }
    }

    public static void main(String[] args) {
    }
}
