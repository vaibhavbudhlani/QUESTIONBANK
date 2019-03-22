package com.budhlani.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.budhlani.helper.UserOperations;

public class UserInput extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JTextField pwd;
	private JTextField wrong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInput frame = new UserInput();
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
	public UserInput() {
		setTitle("User Input Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER CREDENTIALS");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(138, 24, 366, 22);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("USER ID");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(104, 110, 175, 35);
		contentPane.add(label);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(104, 178, 175, 35);
		contentPane.add(lblPassword);
		
		userid = new JTextField();
		userid.setBounds(308, 117, 323, 20);
		contentPane.add(userid);
		userid.setColumns(10);
		
		pwd = new JTextField();
		pwd.setColumns(10);
		pwd.setBounds(308, 185, 323, 20);
		contentPane.add(pwd);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterAction();
			}
		});
		btnRegister.setBounds(190, 261, 129, 50);
		contentPane.add(btnRegister);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginAction();
			}
		});
		btnLogin.setBounds(403, 261, 129, 50);
		contentPane.add(btnLogin);
		
		wrong = new JTextField();
		wrong.setBounds(283, 339, 290, 94);
		contentPane.add(wrong);
		wrong.setColumns(10);
		
		JLabel lblMessageBox = new JLabel("MESSAGE BOX");
		lblMessageBox.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessageBox.setBounds(47, 335, 154, 80);
		contentPane.add(lblMessageBox);
	}
	private void RegisterAction(){
		String res=UserOperations.GetInstaceOf().RegisterAction(userid.getText(),Integer.parseInt(pwd.getText()));
		JOptionPane.showMessageDialog(this, res);
		userid.setText(null);
		pwd.setText(null);
		
	}
	private void LoginAction(){
		String res1=UserOperations.GetInstaceOf().LoginAction(userid.getText(),Integer.parseInt(pwd.getText()));
		JOptionPane.showMessageDialog(this, res1);
		if(res1.equals("success")){
		SecondFrame sframe=new  SecondFrame();
		sframe.setVisible(true);
		}
		else {
			wrong.setText("Please Re Enter the values");
		}
	}
}
