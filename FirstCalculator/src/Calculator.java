import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Calculator extends JFrame {
	private JLabel lblDigit1;
	private JLabel lblDigit2;
	private JTextField textDigit1;
	private JTextField textDigit2;
	private JTextField textresultado;
	private int num1;
	private int num2;
	private int outcome;

	public static void main(String[] args) {
		Calculator window = new Calculator();
	}

	public Calculator() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contenido = getContentPane();
		setTitle("Basic Calculator");
		contenido.setLayout(null);

		lblDigit1 = new JLabel("First Digit");
		lblDigit1.setBounds(26, 30, 80, 16);
		contenido.add(lblDigit1);

		lblDigit2 = new JLabel("Second Digit");
		lblDigit2.setBounds(26, 64, 80, 16);
		contenido.add(lblDigit2);

		textDigit1 = new JTextField();
		textDigit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(textDigit1.getText());
				}
				catch(NumberFormatException e1){
					System.out.println("Not a number");
				}
			}
		});
		textDigit1.setBounds(118, 25, 132, 26);
		contenido.add(textDigit1);
		textDigit1.setColumns(10);

		textDigit2 = new JTextField();
		textDigit2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					int num2 = Integer.parseInt(textDigit2.getText());
				}
				catch(NumberFormatException e1){
					System.out.println("Not a number");
				}
			}
		});
		textDigit2.setBounds(118, 59, 130, 26);
		contenido.add(textDigit2);
		textDigit2.setColumns(10);

		JButton btnsuma = new JButton("Plus");
		btnsuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outcome = num1 + num2;
				System.out.println(outcome);
			}
		});
		btnsuma.setBounds(6, 109, 117, 29);
		getContentPane().add(btnsuma);

		JButton btnresta = new JButton("Subtract");
		btnresta.setBounds(145, 109, 117, 29);
		getContentPane().add(btnresta);

		JButton btnmultiplicar = new JButton("Multiply");
		btnmultiplicar.setBounds(6, 150, 117, 29);
		getContentPane().add(btnmultiplicar);

		JButton btndivision = new JButton("Dividir");
		btndivision.setBounds(145, 150, 117, 29);
		getContentPane().add(btndivision);

		textresultado = new JTextField();
		textresultado.setBounds(303, 203, 130, 45);
		getContentPane().add(textresultado);
		textresultado.setColumns(10);

		JLabel lblresultado = new JLabel("Outcome");
		lblresultado.setBounds(333, 180, 61, 16);
		getContentPane().add(lblresultado);
		setVisible(true);
	}
}
