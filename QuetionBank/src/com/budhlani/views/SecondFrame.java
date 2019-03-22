package com.budhlani.views;

import java.awt.EventQueue;
import java.util.HashSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import com.budhlani.helper.DataQuestions;
import com.budhlani.helper.Questions;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondFrame extends JFrame {
	private int index=0;
	private int Totalquestions;

	private JPanel contentPane;
	JRadioButton rdbtn4 = new JRadioButton("");
	JRadioButton rdbtn3 = new JRadioButton("");
	JRadioButton rdbtn2 = new JRadioButton("");
	JRadioButton rdbtn1 = new JRadioButton("");
	JButton btnprev = new JButton("Previous");
	JButton btnnext = new JButton("Next");
	JLabel qtnlabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondFrame frame = new SecondFrame();
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
	public SecondFrame() {
		setTitle("My Quiz");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		qtnlabel.setFont(new Font("Stencil", Font.PLAIN, 14));
		qtnlabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		qtnlabel.setBounds(51, 36, 634, 66);
		contentPane.add(qtnlabel);
		btnprev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prev();
			}
		});
		
		btnprev.setBounds(88, 377, 130, 50);
		contentPane.add(btnprev);
		btnnext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				next();
			}

			
		});
		
		
		btnnext.setBounds(549, 377, 130, 50);
		contentPane.add(btnnext);
		
		
		
		rdbtn1.setBounds(88, 106, 546, 23);
		contentPane.add(rdbtn1);
		
		
		
		rdbtn2.setBounds(88, 146, 546, 23);
		contentPane.add(rdbtn2);
		
		
		
		rdbtn3.setBounds(88, 197, 546, 23);
		contentPane.add(rdbtn3);
		
		
		rdbtn4.setBounds(88, 244, 546, 23);
		contentPane.add(rdbtn4);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MarksSheet();
				
		
			
				
			}
		});
		btnSubmit.setBounds(326, 377, 130, 50);
		contentPane.add(btnSubmit);

		
		AddQuestions();
		rdbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RetainAnswers(e);
			}
		});
		rdbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RetainAnswers(e);
			}
		});
		rdbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RetainAnswers(e);
			}
		});
		rdbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RetainAnswers(e);
			}
		});
		enableDisable();
		ClearFields();
		combiner();
		
		this.Totalquestions = DataQuestions.Getinstance().GetQuestions().size();
		PrintQuestions(index);
		System.out.println(Totalquestions);
	}
	private void enableDisable(){
		btnprev.setEnabled(index==0?false:true);
		btnnext.setEnabled(index==Totalquestions-1?false:true);
	}
  void PrintQuestions(int index){
	  Questions Currentquestion=DataQuestions.Getinstance().GetQuestionByIndex(index);
	  StringBuffer question=new StringBuffer();
	  String sr= (question.append("q").append(" ").append(index+1).append("  ")).append(Currentquestion.getName()).toString();
	  qtnlabel.setText(sr.toString());
	  rdbtn1.setText(Currentquestion.getAnswers()[0]);
	  rdbtn2.setText(Currentquestion.getAnswers()[1]);
	  rdbtn3.setText(Currentquestion.getAnswers()[2]);
	  rdbtn4.setText(Currentquestion.getAnswers()[3]);
	  if(!(Currentquestion.getYourAnswer()!=null && Currentquestion.getYourAnswer().trim().length()>0)){
			ClearFields();
		}
	  
		else{
			switch(Currentquestion.getYourAnswer()){
			case "a":
				rdbtn1.setSelected(true);
				
			break;	
			case "b":
				rdbtn2.setSelected(true);
			break;
			case "c":
				rdbtn3.setSelected(true);
			break;
			case "d":
				rdbtn4.setSelected(true);
			break;
			}
		}
	  
  }
		void AddQuestions(){
			DataQuestions dataquestion=DataQuestions.Getinstance();
			Questions question=new Questions();
			question.setId(1);
		
			question.setName("JVM Stands For");
			String answers [] = {"Java Vital Machine","Java Virtual Machine","Both","None of these"};
			question.setAnswers(answers);
			question.setRightAnswer("b");
			question.setScore(5);
			dataquestion.AddQuestions(question);
			
			
			
			 question  = new Questions();
			question.setId(1);
			question.setName("JVM Stands For");
			String answers0 [] = {"Java Vital Machine","Java Virtual Machine","Both","None of these"};
			question.setAnswers(answers0);
			question.setRightAnswer("b");
			question.setScore(5);
			dataquestion.AddQuestions(question);
			
			
			question  = new Questions();
			question.setId(2);
			question.setName("JRE Stands For");
			 String answers1 [] = {"Java Read Env","Java Real Env","Java Runtime Env","None of these"};
			question.setAnswers(answers1);
			question.setRightAnswer("c");
			question.setScore(5);
			dataquestion.AddQuestions(question);
			

			question  = new Questions();
			question.setId(3);
			question.setName("Java is Developed By");
			 String answers2 [] = {"Sun MicroSystem","Oracle","Microsoft","None of these"};
			question.setAnswers(answers2);
			question.setRightAnswer("a");
			question.setScore(5);
			dataquestion.AddQuestions(question);
			
			
		}
		private void next() {
			// TODO Auto-generated method stub
			if(this.index<Totalquestions){
				index++;
			}
				enableDisable();
				PrintQuestions(index);
		}
		private void prev(){
			
			 if(this.index>0){
				index--;
			enableDisable();
			}
			 PrintQuestions(index);
			 enableDisable();
		}
		public void ClearFields(){
			bg.clearSelection();
		}
		private void MarksSheet(){
			ThirdFrame thirdframe=new ThirdFrame();
			thirdframe.setVisible(true);
			
		}
		public void RetainAnswers(ActionEvent e){
			
				Questions currentQuestion = DataQuestions.Getinstance().GetQuestionByIndex(index);
				if(e.getSource()==rdbtn1){
					currentQuestion.setYourAnswer("a");
				}
				else
				if(e.getSource()==rdbtn2){
					currentQuestion.setYourAnswer("b");
				}
				else
				if(e.getSource()==rdbtn3){
					currentQuestion.setYourAnswer("c");
				}
				else
				if(e.getSource()==rdbtn4){
					currentQuestion.setYourAnswer("d");
				}
				System.out.println("Update... "+currentQuestion.getYourAnswer());
			}
		
		
	ButtonGroup bg=new ButtonGroup();
	   void combiner(){
		   bg.add(rdbtn1);
		   bg.add(rdbtn2);
		   bg.add(rdbtn3);
		   bg.add(rdbtn4);
		   
	   }
		}

