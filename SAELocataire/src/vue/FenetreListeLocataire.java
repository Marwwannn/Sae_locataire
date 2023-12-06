package vue;
import controle.Locataire;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FenetreListeLocataire extends JInternalFrame {
    private List<Locataire> locataires;

    public FenetreListeLocataire() {
        locataires = new ArrayList<>();
        locataires.add(new Locataire("Doe", "John", "123456789", "john.doe@email.com", "123 Main St", "12345"));
        locataires.add(new Locataire("Smith", "Jane", "987654321", "jane.smith@email.com", "456 Oak St", "67890"));

        setTitle("Liste des Locataires");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Création du modèle de table
        String[] columnNames = {"Nom", "Prénom", "Téléphone", "Email", "Adresse", "Code Postal"};
        Object[][] data = new Object[locataires.size()][6];

        for (int i = 0; i < locataires.size(); i++) {
            Locataire locataire = locataires.get(i);
            data[i] = new Object[]{locataire.getNom(), locataire.getPrenom(), locataire.getTelephone(),
                    locataire.getEmail(), locataire.getAdresse(), locataire.getCodePostal()};
        }

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Boutons d'action
        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton modifierButton = new JButton("Modifier");
        modifierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code pour modifier le locataire sélectionné
            }
        });

        JButton supprimerButton = new JButton("Supprimer");
        supprimerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code pour supprimer le locataire sélectionné
            }
        });

        JButton voirBienButton = new JButton("Voir le bien immobilier concerné");
        voirBienButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code pour voir le bien immobilier du locataire sélectionné
            }
        });

        buttonPanel.add(modifierButton);
        buttonPanel.add(supprimerButton);
        buttonPanel.add(voirBienButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FenetreListeLocataire();
            }
        });
    }
}

