package vue;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Page_Ajout_Locataire extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Page_Ajout_Locataire frame = new Page_Ajout_Locataire();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Page_Ajout_Locataire() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("Information sur le locataire");
		panel.add(lblNewLabel_1, BorderLayout.NORTH);

		JPanel panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(5, 5));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);

		JLabel lblNewLabel_2_1 = new JLabel("Nom");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);

		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setColumns(10);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_9.add(lblNewLabel_2_1);
		panel_9.add(textField_5);

		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10);

		JLabel lblNewLabel_3_1 = new JLabel("Prénom");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_10.add(lblNewLabel_3_1);
		panel_10.add(textField);

		JPanel panel_11 = new JPanel();
		panel_1.add(panel_11);

		JLabel lblNewLabel_4_1 = new JLabel("Télephone");
		panel_11.add(lblNewLabel_4_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_11.add(textField_1);

		JPanel panel_12 = new JPanel();
		panel_1.add(panel_12);

		JLabel lblNewLabel_5_1 = new JLabel("Mail");
		panel_12.add(lblNewLabel_5_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_12.add(textField_2);

		JPanel panel_13 = new JPanel();
		panel_1.add(panel_13);

		JLabel lblNewLabel_2 = new JLabel("Date d'entrée");
		panel_13.add(lblNewLabel_2);
		
		textField_9 = new JTextField();
		panel_13.add(textField_9);
		textField_9.setColumns(10);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton = new JButton("Annuler");
		panel_2.add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton("Valider");
		panel_2.add(btnNewButton_1, BorderLayout.EAST);

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Ajouter un nouveau locataire");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel, BorderLayout.CENTER);

		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.EAST);
		panel_4.setLayout(new BorderLayout(0, 0));

		JLabel Logement_associé = new JLabel("Logement associé");
		panel_4.add(Logement_associé, BorderLayout.NORTH);

		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.WEST);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel Logement = new JLabel("Logement");
		panel_8.add(Logement);

		JList list = new JList();
		panel_8.add(list);

		JPanel panel_14 = new JPanel();
		panel_5.add(panel_14);

		JLabel lblNewLabel_3 = new JLabel("Adresse");
		panel_14.add(lblNewLabel_3);

		textField_3 = new JTextField();
		panel_14.add(textField_3);
		textField_3.setColumns(10);

		JPanel panel_15 = new JPanel();
		panel_5.add(panel_15);

		JLabel lblNewLabel_4 = new JLabel("Code Postal");
		panel_15.add(lblNewLabel_4);

		textField_6 = new JTextField();
		panel_15.add(textField_6);
		textField_6.setColumns(10);

		JPanel panel_16 = new JPanel();
		panel_5.add(panel_16);

		JLabel lblNewLabel_5 = new JLabel("Batiment");
		panel_16.add(lblNewLabel_5);

		textField_7 = new JTextField();
		panel_16.add(textField_7);
		textField_7.setColumns(10);

		JPanel panel_17 = new JPanel();
		panel_5.add(panel_17);

		JLabel lblNewLabel_6 = new JLabel("Etage");
		panel_17.add(lblNewLabel_6);

		textField_8 = new JTextField();
		panel_17.add(textField_8);
		textField_8.setColumns(10);

		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6, BorderLayout.SOUTH);

		textField_4 = new JTextField();
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7, BorderLayout.EAST);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\sirfo\\Downloads\\179337 (3).png"));
		panel_7.add(lblNewLabel_7);
	}

}
