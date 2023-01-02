package com.masai;

public class Teacher implements Person {
	
	public void teaches(){
		 System.out.println("Teacher teaches");
		}

	@Override
	public void doTAsk() {
		teaches();
		
	}

	

}
