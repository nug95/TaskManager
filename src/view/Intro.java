package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Intro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtInsertPin;

	/**
	 * Create the frame.
	 */
	public Intro() {
		setTitle("Inforware.pt - Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 245, 211);
		contentPane.add(panel);
		panel.setLayout(null);
		

		txtInsertPin = new JTextField();
		txtInsertPin.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtInsertPin.setEnabled(false);
		txtInsertPin.setEditable(false);
		txtInsertPin.setText("Insert Pin");
		txtInsertPin.setHorizontalAlignment(SwingConstants.CENTER);
		txtInsertPin.setBounds(10, 11, 225, 40);
		panel.add(txtInsertPin);
		txtInsertPin.setColumns(10);
		
		Button button = new Button("Login");
		button.setFont(new Font("Arial", Font.BOLD, 20));
		button.setBounds(163, 124, 72, 80);
		panel.add(button);
		
		Button button_1 = new Button("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String oldtxt = txtInsertPin.getText();
				txtInsertPin.setText(oldtxt + "1");
			}
		});
		button_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_1.setBounds(10, 57, 45, 45);
		panel.add(button_1);
		
		Button button_2 = new Button("2");
		button_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_2.setBounds(61, 57, 45, 45);
		panel.add(button_2);
		
		Button button_3 = new Button("3");
		button_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_3.setBounds(112, 57, 45, 45);
		panel.add(button_3);
		
		Button button_4 = new Button("4");
		button_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_4.setBounds(10, 108, 45, 45);
		panel.add(button_4);
		
		Button button_5 = new Button("5");
		button_5.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_5.setBounds(61, 108, 45, 45);
		panel.add(button_5);
		
		Button button_6 = new Button("6");
		button_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_6.setBounds(112, 108, 45, 45);
		panel.add(button_6);
		
		Button button_7 = new Button("7");
		button_7.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_7.setBounds(10, 159, 45, 45);
		panel.add(button_7);
		
		Button button_8 = new Button("8");
		button_8.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_8.setBounds(61, 159, 45, 45);
		panel.add(button_8);
		
		Button button_9 = new Button("9");
		button_9.setFont(new Font("Arial Black", Font.BOLD, 20));
		button_9.setBounds(112, 159, 45, 45);
		panel.add(button_9);
		
		Button button_clear = new Button("C");
		button_clear.setFont(new Font("Arial", Font.BOLD, 20));
		button_clear.setBounds(163, 57, 72, 61);
		panel.add(button_clear);
		
	}
}
