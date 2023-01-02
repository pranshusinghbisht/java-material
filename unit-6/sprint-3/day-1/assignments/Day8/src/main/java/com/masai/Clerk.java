package com.masai;

public class Clerk implements Person{
	
	public void registerStudent(){
		 System.out.println("Enroll the Student in Collage");
		}

	@Override
	public void doTAsk() {
		registerStudent();
		
	}

}
