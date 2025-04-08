package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

	private JTextField text1, text2, result;
	private JButton add, subtract, multiply, divide, power, clear;

	public Calculator() {

		setTitle("Simple Calculator - Dawn");

		text1 = new JTextField(10);
		text2 = new JTextField(10);
		result = new JTextField(15);
		result.setEditable(false);

		add = new JButton("+");
		subtract = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		power = new JButton("^");
		clear = new JButton("Clear");

		setLayout(new GridLayout(4, 2, 10, 10));

		add(new JLabel("Number 1:"));
		add(text1);
		add(new JLabel("Number 2:"));
		add(text2);

		add(add);
		add(subtract);
		add(multiply);
		add(divide);
		add(power);
		add(clear);
		add(new JLabel("Result:"));
		add(result);

		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		power.addActionListener(this);
		clear.addActionListener(this);

		// Frame settings
		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			double num1 = Double.parseDouble(text1.getText());
			double num2 = Double.parseDouble(text2.getText());
			double res = 0;

			if (e.getSource() == add) {
				res = add(num1, num2);
			} else if (e.getSource() == subtract) {
				res = subtract(num1, num2);
			} else if (e.getSource() == multiply) {
				res = multiply(num1, num2);
			} else if (e.getSource() == divide) {
				res = divide(num1, num2);
			} else if (e.getSource() == power) {
				res = power(num1, num2);
			} else if (e.getSource() == clear) {
				text1.setText("");
				text2.setText("");
				result.setText("");
				return;
			}

			result.setText(String.valueOf(res));

		} catch (NumberFormatException ex) {
			result.setText("Invalid input!");
		}
	}

	private double add(double num1, double num2) {
		return 0;
	}

	private double subtract(double num1, double num2) {
		return 0;
	}

	private double multiply(double num1, double num2) {
		return 0;
	}

	private double divide(double num1, double num2) {
		return 0;
	}

	private double power(double num1, double num2) {
		return 0;
	}

	public static void main(String[] args) {
		new Calculator();
	}
}