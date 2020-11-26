package interfazgrafica;

import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class suma_dos_numeros extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					suma_dos_numeros frame = new suma_dos_numeros();
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
	public suma_dos_numeros() {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 296);
		getContentPane().setLayout(null);
		
		JLabel lblNmero = new JLabel("Número 1");
		lblNmero.setBounds(45, 69, 70, 15);
		getContentPane().add(lblNmero);
		
		JLabel lblNmero_1 = new JLabel("Número 2");
		lblNmero_1.setBounds(45, 110, 70, 15);
		getContentPane().add(lblNmero_1);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(55, 147, 70, 24);
		getContentPane().add(lblTotal);
		
		textField = new JTextField();
		textField.setBounds(168, 67, 114, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 108, 114, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(168, 150, 114, 19);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.setBounds(65, 183, 196, 25);
		getContentPane().add(btnSumar);
	}
}
