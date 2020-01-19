package gestionare;

import java.awt.EventQueue;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JButton;

public class Catalog extends JFrame {
	private JPanel contentPane;
	private JTextField textFieldInitiala;
	private JTextField textFieldNrMatricol;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Catalog frame = new Catalog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Catalog() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(800, 800));
		setMaximumSize(new Dimension(800, 800));
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setName("frameCatalog");
		setPreferredSize(new Dimension(800, 800));
		setResizable(false);
		setTitle("Catalog virtual CNVA 2019 - 2020");
		setType(Type.POPUP);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel labelAutentificare = new JLabel("Autentificat(\u0103) ca:");
		labelAutentificare.setBackground(Color.WHITE);
		labelAutentificare.setBounds(10, 10, 120, 21);
		labelAutentificare.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(labelAutentificare);
		
		JLabel labelUsername = new JLabel("");
		labelUsername.setHorizontalAlignment(SwingConstants.LEFT);
		labelUsername.setBackground(Color.WHITE);
		labelUsername.setBounds(140, 10, 300, 21);
		labelUsername.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		labelUsername.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(labelUsername);
		
		JSeparator separator1 = new JSeparator();
		separator1.setBackground(Color.BLACK);
		separator1.setBounds(0, 41, 794, 3);
		separator1.setPreferredSize(new Dimension(0, 3));
		contentPane.add(separator1);
		
		JPanel panel1 = new JPanel();
		TitledBorder title1;
		title1 = BorderFactory.createTitledBorder(null, " Diverse ", TitledBorder.LEFT, TitledBorder.TOP, new Font("Comic Sans MS", Font.PLAIN, 14), Color.BLACK);
		panel1.setBorder(title1);
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(10, 45, 764, 180);
		panel1.setLayout(null);
		contentPane.add(panel1);
		
		JRadioButton butonSemestru1 = new JRadioButton("Semestrul 1");
		butonSemestru1.setBackground(Color.WHITE);
		butonSemestru1.setBounds(10, 20, 104, 29);
		butonSemestru1.setFocusPainted(false);
		butonSemestru1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel1.add(butonSemestru1);
		
		JRadioButton butonSemestru2 = new JRadioButton("Semestrul 2");
		butonSemestru2.setBackground(Color.WHITE);
		butonSemestru2.setBounds(140, 20, 107, 29);
		butonSemestru2.setFocusPainted(false);
		butonSemestru2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel1.add(butonSemestru2);
		
		JLabel labelSpecializare = new JLabel("Specializarea:");
		labelSpecializare.setBackground(Color.WHITE);
		labelSpecializare.setBounds(52, 62, 91, 21);
		labelSpecializare.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel1.add(labelSpecializare);
		
		JComboBox comboBoxSpecializare = new JComboBox();
		comboBoxSpecializare.setBackground(Color.WHITE);
		comboBoxSpecializare.setBounds(153, 59, 301, 27);
		comboBoxSpecializare.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		comboBoxSpecializare.setModel(new DefaultComboBoxModel(new String[] {"Filologie", "Matematic\u0103-Informatic\u0103",
				"Matematic\u0103-Informatic\u0103 (bilingv englez\u0103)", "\u0218tiin\u021Be ale Naturii (bilingv englez\u0103)", "\u0218tiin\u021Be Sociale"}));
		comboBoxSpecializare.setSelectedIndex(2);
		panel1.add(comboBoxSpecializare);
		
		JLabel labelClasa = new JLabel("Clasa:");
		labelClasa.setBackground(Color.WHITE);
		labelClasa.setBounds(106, 99, 37, 21);
		labelClasa.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel1.add(labelClasa);
		
		JComboBox comboBoxClasa = new JComboBox();
		comboBoxClasa.setBackground(Color.WHITE);
		comboBoxClasa.setBounds(153, 96, 301, 27);
		comboBoxClasa.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		DefaultComboBoxModel model1 = new DefaultComboBoxModel(new String[] {"9A", "10A", "11A", "12A"});
		DefaultComboBoxModel model2 = new DefaultComboBoxModel(new String[] {"9B", "9D", "9E", "10B", "10D", "10E", "11B", "11D", "11E", "12B", "12D", "12E"});
		DefaultComboBoxModel model3 = new DefaultComboBoxModel(new String[] {"9C", "10C", "11C", "12C"});
		DefaultComboBoxModel model4 = new DefaultComboBoxModel(new String[] {"9F", "10F", "11F", "12F"});
		DefaultComboBoxModel model5 = new DefaultComboBoxModel(new String[] {"9G", "10G", "11G", "12G"});
		panel1.add(comboBoxClasa);

		comboBoxSpecializare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxSpecializare.getSelectedItem() == "Filologie") {
					comboBoxClasa.setModel(model4);
				} else if (comboBoxSpecializare.getSelectedItem() == "Matematică-Informatică") {
					comboBoxClasa.setModel(model2);
				} else if (comboBoxSpecializare.getSelectedItem() == "Matematică-Informatică (bilingv engleză)") {
					comboBoxClasa.setModel(model1);
				} else if (comboBoxSpecializare.getSelectedItem() == "Științe ale Naturii (bilingv engleză)") {
					comboBoxClasa.setModel(model3);
				} else if (comboBoxSpecializare.getSelectedItem() == "Științe Sociale") {
					comboBoxClasa.setModel(model5);
				}
			}
		});
		
		JLabel labelMaterie = new JLabel("Denumirea materiei:");
		labelMaterie.setBackground(Color.WHITE);
		labelMaterie.setBounds(10, 136, 133, 21);
		labelMaterie.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel1.add(labelMaterie);
		
		JComboBox comboBoxMaterie = new JComboBox();
		comboBoxMaterie.setBackground(Color.WHITE);
		comboBoxMaterie.setBounds(153, 133, 301, 27);
		comboBoxMaterie.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		comboBoxMaterie.setModel(new DefaultComboBoxModel(new String[] {"Biologie", "Chimie", "Educație fizică", "Educație muzicală", "Filosofie", "Fizică",
				"Geografie", "Informatică", "Istorie", "Limba română", "Limba engleză", "Limba franceză", "Limba germană", "Religie"}));
		panel1.add(comboBoxMaterie);
		
		JPanel panel2 = new JPanel();
		TitledBorder title2;
		title2 = BorderFactory.createTitledBorder(null, " NOTARE elev ", TitledBorder.LEFT, TitledBorder.TOP, new Font("Comic Sans MS", Font.PLAIN, 14), Color.BLACK);
		panel2.setBorder(title2);
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(10, 235, 764, 324);
		panel2.setLayout(null);
		contentPane.add(panel2);
		
		JLabel labelNumePren = new JLabel("Nume și prenume:");
		labelNumePren.setBackground(Color.WHITE);
		labelNumePren.setBounds(28, 33, 115, 21);
		labelNumePren.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel2.add(labelNumePren);
		
		JComboBox comboBoxNumePren = new JComboBox();
		comboBoxNumePren.setBackground(Color.WHITE);
		comboBoxNumePren.setBounds(153, 30, 500, 27);
		comboBoxNumePren.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		comboBoxNumePren.setModel(new DefaultComboBoxModel(new String[] {"Scripcariu Bogdan"}));
		panel2.add(comboBoxNumePren);
		
		JLabel labelInitiala = new JLabel("Inițiala tatălui:");
		labelInitiala.setBackground(Color.WHITE);
		labelInitiala.setBounds(44, 70, 99, 21);
		labelInitiala.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel2.add(labelInitiala);
		
		textFieldInitiala = new JTextField();
		textFieldInitiala.setBackground(Color.WHITE);
		textFieldInitiala.setBounds(153, 67, 150, 27);
		textFieldInitiala.setColumns(10);
		textFieldInitiala.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textFieldInitiala.setHorizontalAlignment(SwingConstants.LEFT);
		panel2.add(textFieldInitiala);
		
		JLabel labelNrMatricol = new JLabel("Număr matricol:");
		labelNrMatricol.setBackground(Color.WHITE);
		labelNrMatricol.setBounds(38, 107, 105, 21);
		labelNrMatricol.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel2.add(labelNrMatricol);
		
		textFieldNrMatricol = new JTextField();
		textFieldNrMatricol.setBackground(Color.WHITE);
		textFieldNrMatricol.setBounds(153, 104, 150, 27);
		textFieldNrMatricol.setColumns(10);
		textFieldNrMatricol.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		textFieldNrMatricol.setHorizontalAlignment(SwingConstants.LEFT);
		panel2.add(textFieldNrMatricol);
		
		JLabel labelNota = new JLabel("Notă:");
		labelNota.setBackground(Color.WHITE);
		labelNota.setBounds(107, 145, 36, 21);
		labelNota.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel2.add(labelNota);
		
		JSpinner spinnerNota = new JSpinner();
		spinnerNota.setBackground(Color.WHITE);
		spinnerNota.setBounds(153, 141, 150, 28);
		spinnerNota.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		spinnerNota.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		panel2.add(spinnerNota);
		
		JLabel labelData = new JLabel("Dată:");
		labelData.setBackground(Color.WHITE);
		labelData.setBounds(108, 183, 35, 21);
		labelData.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel2.add(labelData);
		
		JSpinner spinnerData = new JSpinner();
		spinnerData.setBackground(Color.WHITE);
		spinnerData.setBounds(153, 179, 150, 28);
		spinnerData.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		spinnerData.setModel(new SpinnerDateModel(new Date(1567976400000L), new Date(1567976400000L), new Date(1591995599000L), Calendar.DAY_OF_YEAR));
		panel2.add(spinnerData);
		
		JLabel labelTeză = new JLabel("Teză:");
		labelTeză.setBackground(Color.WHITE);
		labelTeză.setBounds(107, 221, 36, 21);
		labelTeză.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel2.add(labelTeză);
		
		JSpinner spinnerTeza = new JSpinner();
		spinnerTeza.setBackground(Color.WHITE);
		spinnerTeza.setBounds(153, 217, 150, 28);
		spinnerTeza.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		spinnerTeza.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		panel2.add(spinnerTeza);
		
		JButton butonConfirmareNotare = new JButton("CONFIRMARE");
		butonConfirmareNotare.setBackground(Color.GRAY);
		butonConfirmareNotare.setBounds(153, 275, 150, 29);
		butonConfirmareNotare.setFocusPainted(false);
		butonConfirmareNotare.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel2.add(butonConfirmareNotare);

		comboBoxMaterie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxMaterie.getSelectedItem() == "Educație fizică" || comboBoxMaterie.getSelectedItem() == "Educație muzicală" ||
						comboBoxMaterie.getSelectedItem() == "Limbă germană" || comboBoxMaterie.getSelectedItem() == "Religie") {
					spinnerTeza.setEnabled(false);
				}
			}
		});
		
		JPanel panel3 = new JPanel();
		TitledBorder title3;
		title3 = BorderFactory.createTitledBorder(null, " ABSENȚE ", TitledBorder.LEFT, TitledBorder.TOP, new Font("Comic Sans MS", Font.PLAIN, 14), Color.BLACK);
		panel3.setBorder(title3);
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(10, 569, 764, 168);
		panel3.setLayout(null);
		contentPane.add(panel3);
		
		JLabel labelInsemnare = new JLabel("Însemnare:");
		labelInsemnare.setBackground(Color.WHITE);
		labelInsemnare.setBounds(88, 30, 74, 21);
		labelInsemnare.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel3.add(labelInsemnare);
		
		JSpinner spinnerInsemnare = new JSpinner();
		spinnerInsemnare.setBackground(Color.WHITE);
		spinnerInsemnare.setBounds(50, 61, 150, 28);
		spinnerInsemnare.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		spinnerInsemnare.setModel(new SpinnerDateModel(new Date(1567976400000L), new Date(1567976400000L), new Date(1591995599000L), Calendar.DAY_OF_YEAR));
		panel3.add(spinnerInsemnare);
		
		JButton butonConfirmareInsemnare = new JButton("CONFIRMARE");
		butonConfirmareInsemnare.setBackground(Color.GRAY);
		butonConfirmareInsemnare.setBounds(50, 119, 150, 29);
		butonConfirmareInsemnare.setFocusPainted(false);
		butonConfirmareInsemnare.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel3.add(butonConfirmareInsemnare);
		
		JSeparator separator2 = new JSeparator();
		separator2.setOrientation(SwingConstants.VERTICAL);
		separator2.setPreferredSize(new Dimension(3, 0));
		separator2.setBackground(Color.BLACK);
		separator2.setBounds(250, 11, 3, 154);
		panel3.add(separator2);
		
		JLabel labelMotivare = new JLabel("Motivare:");
		labelMotivare.setBackground(Color.WHITE);
		labelMotivare.setBounds(343, 30, 63, 21);
		labelMotivare.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel3.add(labelMotivare);
		
		JSpinner spinnerMotivare = new JSpinner();
		spinnerMotivare.setBackground(Color.WHITE);
		spinnerMotivare.setBounds(300, 61, 150, 28);
		spinnerMotivare.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		spinnerMotivare.setModel(new SpinnerDateModel(new Date(1567976400000L), new Date(1567976400000L), new Date(1591995599000L), Calendar.DAY_OF_YEAR));
		panel3.add(spinnerMotivare);
		
		JButton butonConfirmareMotivare = new JButton("CONFIRMARE");
		butonConfirmareMotivare.setBackground(Color.GRAY);
		butonConfirmareMotivare.setBounds(300, 119, 150, 29);
		butonConfirmareMotivare.setFocusPainted(false);
		butonConfirmareMotivare.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		panel3.add(butonConfirmareMotivare);
	}
}
