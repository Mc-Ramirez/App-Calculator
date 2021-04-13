import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class Calculator extends JFrame {
	private JLabel lblDigit1;
	private JLabel lblDigit2;
	private JTextField textDigit1;
	private JTextField textDigit2;
	private JButton btnsuma;
	private JButton btnresta;
	private JButton btnmultiplicar;
	private JButton btndivision;
	private JLabel lblresultado;
	private int num1;
	private int num2;
	private int outcome;
	private JButton btnSeven;
	private JButton btnEight;
	private JButton btnNine;
	private JButton btnZero;

	public static void main(String[] args) {
		Calculator window = new Calculator();
	}

	public Calculator() {
		getContentPane().setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 13));
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contenido = getContentPane();
		setTitle("Basic Calculator");
		contenido.setLayout(null);

		lblDigit1 = new JLabel("First Digit");
		lblDigit1.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 13));
		lblDigit1.setBounds(26, 30, 80, 16);
		contenido.add(lblDigit1);

		lblDigit2 = new JLabel("Second Digit");
		lblDigit2.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 13));
		lblDigit2.setBounds(26, 64, 97, 16);
		contenido.add(lblDigit2);

		textDigit1 = new JTextField();
		textDigit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textDigit1.setBounds(132, 25, 132, 26);
		contenido.add(textDigit1);
		textDigit1.setColumns(10);

		textDigit2 = new JTextField();
		textDigit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textDigit2.setBounds(132, 59, 130, 26);
		contenido.add(textDigit2);
		textDigit2.setColumns(10);

		btnsuma = new JButton("Plus");
		btnsuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(textDigit1.getText());
					int num2 = Integer.parseInt(textDigit2.getText());
					outcome = num1 + num2;
					System.out.println(outcome);
				} catch (NumberFormatException e1) {
					System.out.println("Not a number");
				}
			}
		});
		btnsuma.setBounds(6, 109, 117, 29);
		contenido.add(btnsuma);

		btnresta = new JButton("Subtract");
		btnresta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(textDigit1.getText());
					int num2 = Integer.parseInt(textDigit2.getText());
					outcome = num1 - num2;
					System.out.println(outcome);
				} catch (NumberFormatException e1) {
					System.out.println("Not a number");
				}
			}
		});
		btnresta.setBounds(145, 109, 117, 29);
		contenido.add(btnresta);

		btnmultiplicar = new JButton("Multiply");
		btnmultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(textDigit1.getText());
					int num2 = Integer.parseInt(textDigit2.getText());
					outcome = num1 * num2;
					System.out.println(outcome);
				} catch (NumberFormatException e1) {
					System.out.println("Not a number");
				}
			}
		});
		btnmultiplicar.setBounds(6, 150, 117, 29);
		contenido.add(btnmultiplicar);

		btndivision = new JButton("Divide");
		btndivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(textDigit1.getText());
					int num2 = Integer.parseInt(textDigit2.getText());
					outcome = num1 / num2;
					System.out.println(outcome);
				} catch (NumberFormatException e1) {
					System.out.println("Not a number");
				}
			}
		});
		btndivision.setBounds(145, 150, 117, 29);
		contenido.add(btndivision);

		JTextField textresultado = new JTextField();
		textresultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		textresultado.setBounds(303, 203, 130, 45);
		contenido.add(textresultado);
		textresultado.setColumns(10);

		lblresultado = new JLabel("Outcome");
		lblresultado.setBounds(333, 180, 61, 16);
		contenido.add(lblresultado);
		
		JButton btnOne = new JButton("1");
		btnOne.setBackground(SystemColor.windowText);
		btnOne.setForeground(SystemColor.activeCaptionText);
		btnOne.setBounds(316, 25, 33, 29);
		getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setForeground(SystemColor.activeCaptionText);
		btnTwo.setBounds(361, 25, 33, 29);
		getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.setForeground(SystemColor.activeCaptionText);
		btnThree.setBounds(400, 25, 33, 29);
		getContentPane().add(btnThree);
		
		JButton btnFour = new JButton("4");
		btnFour.setBounds(316, 64, 33, 29);
		getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.setBounds(361, 64, 33, 29);
		getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.setBounds(400, 64, 33, 29);
		getContentPane().add(btnSix);
		
		btnSeven = new JButton("7");
		btnSeven.setBounds(315, 105, 32, 29);
		getContentPane().add(btnSeven);
		
		btnEight = new JButton("8");
		btnEight.setBounds(361, 105, 33, 29);
		getContentPane().add(btnEight);
		
		btnNine = new JButton("9");
		btnNine.setBounds(400, 105, 33, 29);
		getContentPane().add(btnNine);
		
		btnZero = new JButton("0");
		btnZero.setBounds(362, 139, 32, 29);
		getContentPane().add(btnZero);
		setVisible(true);
	}
}
