package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Calc {

	private JFrame frmMariaLuisaSilva;
	private JTextField JTFResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frmMariaLuisaSilva.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}
	double valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9;
	double resultadoAcumulado = 0;
	String op;
	
	
	
	
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMariaLuisaSilva = new JFrame();
		frmMariaLuisaSilva.getContentPane().setBackground(new Color(118, 106, 206));
		frmMariaLuisaSilva.setTitle("Samuel vieira de souza - RA: 002429");
		frmMariaLuisaSilva.getContentPane().setFont(new Font("Arial", Font.BOLD, 12));
		frmMariaLuisaSilva.setBounds(100, 100, 400, 502);
		frmMariaLuisaSilva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMariaLuisaSilva.getContentPane().setLayout(null);
		
		JTFResultado = new JTextField();
		JTFResultado.setBounds(38, 31, 294, 99);
		frmMariaLuisaSilva.getContentPane().add(JTFResultado);
		JTFResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("1");
			}
		});
		btnNewButton.setBounds(23, 332, 57, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("2");

			}
		});
		btnNewButton_1.setBounds(90, 332, 56, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("3");

			}
		});
		btnNewButton_1_1.setBounds(156, 332, 57, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("0");
		btnNewButton_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTFResultado.setText("0");
				
			}
		});
		btnNewButton_1_2.setBounds(90, 391, 55, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("4");
		btnNewButton_1_3.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("4");

			}
		});
		btnNewButton_1_3.setBounds(23, 278, 57, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("5");
		btnNewButton_1_4.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("5");

			}
		});
		btnNewButton_1_4.setBounds(90, 278, 55, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("6");
		btnNewButton_1_5.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("6");

			}
		});
		btnNewButton_1_5.setBounds(156, 278, 57, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("7");
		btnNewButton_1_6.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("7");

			}
		});
		btnNewButton_1_6.setBounds(23, 224, 57, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("8");
		btnNewButton_1_7.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("8");

			}
		});
		btnNewButton_1_7.setBounds(90, 224, 55, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("9");
		btnNewButton_1_8.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTFResultado.setText("9");

			}
		});
		btnNewButton_1_8.setBounds(156, 224, 57, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_1_6_1 = new JButton("C");
		btnNewButton_1_6_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_6_1.setBounds(90, 167, 55, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1_6_1);
		
		JButton btnPotencia = new JButton("^");
		btnPotencia.setFont(new Font("Arial", Font.BOLD, 12));
		btnPotencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "Potencia";
			}
		});
		btnPotencia.setBounds(156, 167, 55, 52);
		frmMariaLuisaSilva.getContentPane().add(btnPotencia);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.setFont(new Font("Arial", Font.BOLD, 12));
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "Divisao";
			}
		});
		btnDivisao.setBounds(299, 167, 49, 52);
		frmMariaLuisaSilva.getContentPane().add(btnDivisao);
		
		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.setFont(new Font("Arial", Font.BOLD, 12));
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText("");
				op = "Multiplicacao";		
			}
		});
		btnMultiplicacao.setBounds(299, 224, 49, 52);
		frmMariaLuisaSilva.getContentPane().add(btnMultiplicacao);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setFont(new Font("Arial", Font.BOLD, 12));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(JTFResultado.getText());
				resultadoAcumulado += Double.parseDouble(JTFResultado.getText());
				JTFResultado.setText(" ");
				op = "Soma";	
				
			}
		});
		btnSoma.setBounds(299, 283, 49, 47);
		frmMariaLuisaSilva.getContentPane().add(btnSoma);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(JTFResultado.getText());
			JTFResultado.setText(" ");
				op="Subtracao";
			}
		});
		btnSubtracao.setFont(new Font("Arial", Font.BOLD, 12));
		btnSubtracao.setBounds(299, 337, 49, 47);
		frmMariaLuisaSilva.getContentPane().add(btnSubtracao);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Arial", Font.BOLD, 12));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (JTFResultado.getText().trim().isEmpty()) {
				return;
			}
			if (!"Potencia".equals(op) && !"Divisao".equals(op) && !"Multiplicacao".equals(op)) {
				valor1 = Double.parseDouble(JTFResultado.getText());
			}
			valor2 = Double.parseDouble(JTFResultado.getText());
			valor3 = Double.parseDouble(JTFResultado.getText());
			valor4 = Double.parseDouble(JTFResultado.getText());
			valor5 = Double.parseDouble(JTFResultado.getText());
			valor6 = Double.parseDouble(JTFResultado.getText());
			valor7 = Double.parseDouble(JTFResultado.getText());
			valor8 = Double.parseDouble(JTFResultado.getText());
			valor9 = Double.parseDouble(JTFResultado.getText());
	if("Soma".equals(op)) {
		resultadoAcumulado += valor2;
		JTFResultado.setText(String.valueOf(resultadoAcumulado));
	}
	if(op == "Subtracao"){	
		JTFResultado.setText(String.valueOf(valor1 - valor2));
				
			}
	if("Potencia".equals(op)) {
		JTFResultado.setText(String.valueOf(Math.pow(valor1, valor2)));
	}
	if("Multiplicacao".equals(op)) {
		JTFResultado.setText(String.valueOf(valor1 * valor2));
	}
	if("Divisao".equals(op)) {
		if (valor2 == 0) {
			javax.swing.JOptionPane.showMessageDialog(
					frmMariaLuisaSilva,
					"Não é possível dividir por zero.",
					"Erro",
					javax.swing.JOptionPane.ERROR_MESSAGE);
			JTFResultado.setText("0");
			op = null;
		} else {
			JTFResultado.setText(String.valueOf(valor1 / valor2));
		}
	}
			}
		});
		btnIgual.setBounds(299, 391, 49, 52);
		frmMariaLuisaSilva.getContentPane().add(btnIgual);
		
		JButton btnIgual_1 = new JButton(",");
		btnIgual_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnIgual_1.setBounds(156, 391, 55, 52);
		frmMariaLuisaSilva.getContentPane().add(btnIgual_1);
		
		JButton btnNewButton_1_6_1_1 = new JButton(".");
		btnNewButton_1_6_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1_6_1_1.setBounds(23, 391, 57, 52);
		frmMariaLuisaSilva.getContentPane().add(btnNewButton_1_6_1_1);
	}
}
