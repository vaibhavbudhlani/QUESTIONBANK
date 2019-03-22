package com.budhlani.helper;

import java.util.Arrays;

public class Questions {
	private int id;
	private String name;
	private String answers[] = new String[4];
	@Override
	public String toString() {
		return "Questions [id=" + id + ", name=" + name + ", answers=" + Arrays.toString(answers) + ", score=" + score
				+ ", rightAnswer=" + rightAnswer + ", yourAnswer=" + yourAnswer + "]";
	}
	private int score;
	private String rightAnswer;
	private String yourAnswer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getAnswers() {
		return answers;
	}
	@Override
	public int hashCode() {
		int vb= name.trim().length();
		System.out.println(vb);
		return vb;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj){
			return true;
		}
		if (obj instanceof Questions)
		{
			Questions ques=(Questions)obj;
			if(ques.name.equals(this.name)){
				return true;
			}
		}
		return false;
		
		
	}
	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public String getYourAnswer() {
		return yourAnswer;
	}
	public void setYourAnswer(String yourAnswer) {
		this.yourAnswer = yourAnswer;
	}
}