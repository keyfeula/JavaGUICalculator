import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Frame1 {

	private JFrame frame;
	int count = 0;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JButton addButton;
	private JButton subButton;
	private JTextField answerText;
	private JLabel lblAnswer;
	private JLabel num1Label;
	private JLabel num2Label;
	private JButton multButton;
	private JButton divButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(73, 39, 110, 33);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(226, 39, 110, 33);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 + num2;
					
					answerText.setText(Integer.toString(ans));
					
				}catch(Exception exc) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		addButton.setBounds(94, 95, 89, 23);
		frame.getContentPane().add(addButton);
		
		subButton = new JButton("Subtract");
		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 - num2;
					
					answerText.setText(Integer.toString(ans));
					
				}catch(Exception exc) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		subButton.setBounds(226, 95, 89, 23);
		frame.getContentPane().add(subButton);
		
		answerText = new JTextField();
		answerText.setBounds(148, 178, 120, 20);
		frame.getContentPane().add(answerText);
		answerText.setColumns(10);
		
		lblAnswer = new JLabel("Answer:");
		lblAnswer.setBounds(73, 181, 65, 14);
		frame.getContentPane().add(lblAnswer);
		
		num1Label = new JLabel("Enter first number:");
		num1Label.setBounds(73, 14, 110, 14);
		frame.getContentPane().add(num1Label);
		
		num2Label = new JLabel("Enter second number:");
		num2Label.setBounds(226, 14, 120, 14);
		frame.getContentPane().add(num2Label);
		
		multButton = new JButton("Multiply");
		multButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 * num2;
					
					answerText.setText(Integer.toString(ans));
					
				}catch(Exception exc) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
				
			}
		});
		multButton.setBounds(94, 129, 89, 23);
		frame.getContentPane().add(multButton);
		
		divButton = new JButton("Divide");
		divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 / num2;
					
					answerText.setText(Float.toString((ans)));
					
				}catch(Exception exc) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		divButton.setBounds(226, 129, 89, 23);
		frame.getContentPane().add(divButton);
	}
}
