package com.budhlani.helper;

import java.util.HashSet;
import java.util.Iterator;

import com.budhlani.views.ThirdFrame;

public class DataQuestions{
	private static DataQuestions dataquestions;
	Questions ques=new Questions();
	private DataQuestions(){}
	public static DataQuestions Getinstance(){
		if (dataquestions==null){
			dataquestions=new DataQuestions();
		}
		return dataquestions;
		
	}
	HashSet<Questions> questionset=new HashSet<>();
	public void AddQuestions(Questions question){
		questionset.add(question);
	}
	public HashSet<Questions> GetQuestions(){
		return questionset;
		
	}
	public Questions GetQuestionByIndex(int index){
		int start = 0;
		Questions currentQuestion = null;
		Iterator<Questions> questionItr = questionset.iterator();
		while(questionItr.hasNext()){
			 currentQuestion = questionItr.next();
			if(start==index){
				break;
			}
			start++;
		}
	
		return currentQuestion;
	}
	
} 