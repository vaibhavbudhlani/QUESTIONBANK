package com.budhlani.helper;

import java.util.ArrayList;

import javax.swing.JRadioButton;

import com.budhlani.dto.UserDto;

public class UserOperations {
	int score=0;
	UserDto userdto=new UserDto();
	private static UserOperations useroperations;
	private ArrayList<UserDto> userlist = new ArrayList<>();
	private UserOperations(){
		
	}
	public void AddUser(UserDto user){
		userlist.add(user);
	}
	public ArrayList<UserDto> GetUser(){
		return userlist;
	}
	public  static UserOperations GetInstaceOf(){
		synchronized(UserOperations.class){
		if(useroperations==null){
			useroperations=new UserOperations();
		}
		}
		return useroperations;
	}
	public String RegisterAction(String id,int pwd) {
		// 
		
		userdto.setUserid(id);
		userdto.setPassword(pwd);
		return "Registration complete Press Login Now";
	
		
	}
	public String LoginAction(String id,int pwd) {
		if(userdto.getUserid().equalsIgnoreCase(id)&&userdto.getPassword()==pwd){
		return "success";
		}
		if(id.equals(null)&&pwd==0){
			return "please Enter the Data";
		}
		else 
			return "login Not Possible";
		
		
		
	}
	
		// TODO Auto-generated method stub
		
		
		
	
	public String Funda(JRadioButton A, JRadioButton B, JRadioButton C, JRadioButton D) {
		// TODO Auto-generated method stub
		
		if(A.isSelected()){
			return "you selected option A";
			
		}
		if(B.isSelected()){
			
			return "you selected option B";
			
			
		}
		if(C.isSelected()){
			return "you selected option C";
			
		}
		if(D.isSelected()){
			return "you selected option D";
			
		}
		else
		return "wrong option Selected";
		
	}
           
}
