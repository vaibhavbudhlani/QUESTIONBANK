package com.budhlani.views;

import java.awt.EventQueue;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.budhlani.helper.DataQuestions;
import com.budhlani.helper.Questions;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThirdFrame extends JFrame  {

	private JPanel contentPane;
	private JTable table;
	private JTextField SN1;
	private JTextField SN2;
	private JTextField SN3;
	private JTextField ANS1=new JTextField();
	public static  JTextField ANS2=new JTextField();
	private JTextField ANS3;
	private JTextField RA1;
	private JTextField RA2;
	private JTextField RA3;
	private JTextField S1;
	private JTextField S2;
	private JTextField S3;
	private JTextField textFieldscore;
	Questions currentquestion;	
	int index=0;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThirdFrame frame = new ThirdFrame();
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
	public ThirdFrame() {
		setResizable(false);
		setTitle("Marks Sheet");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		
		
		
		
		
		
		JLabel lblQuestionNumber = new JLabel("QUESTION NUMBER");
		lblQuestionNumber.setBounds(26, 47, 153, 27);
		contentPane.add(lblQuestionNumber);
		
		JLabel lblYourAnswer = new JLabel("YOUR ANSWER");
		lblYourAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourAnswer.setBounds(189, 47, 153, 27);
		contentPane.add(lblYourAnswer);
		
		JLabel lblRightAnswer = new JLabel("RIGHT ANSWER");
		lblRightAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblRightAnswer.setBounds(387, 47, 153, 27);
		contentPane.add(lblRightAnswer);
		
		JLabel lblScore = new JLabel("SCORE");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setBounds(545, 47, 153, 27);
		contentPane.add(lblScore);
		
		SN1 = new JTextField();
		SN1.setBounds(31, 114, 86, 20);
		contentPane.add(SN1);
		SN1.setColumns(10);
		SN1.setText("1");
		
		SN2 = new JTextField();
		SN2.setColumns(10);
		SN2.setBounds(31, 184, 86, 20);
		contentPane.add(SN2);
		SN2.setText("2");
		
		
		SN3 = new JTextField();
		SN3.setColumns(10);
		SN3.setBounds(31, 282, 86, 20);
		contentPane.add(SN3);
		SN3.setText("3");
		
		
		ANS1.setColumns(10);
		ANS1.setBounds(228, 114, 86, 20);
		contentPane.add(ANS1);
		
		
		ANS2.setColumns(10);
		ANS2.setBounds(228, 184, 86, 20);
		contentPane.add(ANS2);
		
		ANS3 = new JTextField();
		ANS3.setColumns(10);
		ANS3.setBounds(228, 282, 86, 20);
		contentPane.add(ANS3);
		
		RA1 = new JTextField();
		RA1.setColumns(10);
		RA1.setBounds(421, 114, 86, 20);
		contentPane.add(RA1);
		
		RA2 = new JTextField();
		RA2.setColumns(10);
		RA2.setBounds(421, 184, 86, 20);
		contentPane.add(RA2);
		
		RA3 = new JTextField();
		RA3.setColumns(10);
		RA3.setBounds(421, 282, 86, 20);
		contentPane.add(RA3);
		
		S1 = new JTextField();
		S1.setColumns(10);
		S1.setBounds(583, 114, 86, 20);
		contentPane.add(S1);
		
		S2 = new JTextField();
		S2.setColumns(10);
		S2.setBounds(583, 184, 86, 20);
		contentPane.add(S2);
		
		S3 = new JTextField();
		S3.setColumns(10);
		S3.setBounds(583, 282, 86, 20);
		contentPane.add(S3);
		
		JButton SCOREBTN = new JButton("TOTAL SCORE");
		SCOREBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int vb=Integer.parseInt(S1.getText()) +Integer.parseInt(S2.getText()) +Integer.parseInt(S3.getText());
				textFieldscore.setText(""+(vb));
				
			}
		});
		SCOREBTN.setBounds(225, 359, 153, 23);
		contentPane.add(SCOREBTN);
		
		textFieldscore = new JTextField();
		textFieldscore.setBounds(422, 360, 118, 20);
		contentPane.add(textFieldscore);
		textFieldscore.setColumns(10);
		
     GetValues();
		
		
	
	}

	public void GetValues(){
		
		currentquestion=DataQuestions.Getinstance().GetQuestionByIndex(index);
		ANS1.setText(currentquestion.getYourAnswer());
		RA1.setText(currentquestion.getRightAnswer());
		if(currentquestion.getYourAnswer().equals("a")){
			S1.setText(""+currentquestion.getScore());
		}
		else{
			S1.setText("0");
		}
		currentquestion=DataQuestions.Getinstance().GetQuestionByIndex(index+1);
		ANS2.setText(currentquestion.getYourAnswer());
		RA2.setText(currentquestion.getRightAnswer());
		if(currentquestion.getYourAnswer().equals("b")){
			S2.setText(""+currentquestion.getScore());
		}
		else{
			S2.setText("0");
		}
		
		
		currentquestion=DataQuestions.Getinstance().GetQuestionByIndex(index+2);
		ANS3.setText(currentquestion.getYourAnswer());
		RA3.setText(currentquestion.getRightAnswer());
		if(currentquestion.getYourAnswer().equals("c")){
			S3.setText(""+currentquestion.getScore());
		}
		else{
			S3.setText("0");
		}		
}	
}