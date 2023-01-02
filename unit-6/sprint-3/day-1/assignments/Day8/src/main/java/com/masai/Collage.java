package com.masai;

public class Collage {
	
	Person p;
	
	public Collage(Person p) {
		this.p=p;
	}
	
	public Collage(Object p2) {
		// TODO Auto-generated constructor stub
	}

	public void setp(Person p) {
		this.p=p;
	
	}
	
	public void doJob(){
		
		p.doTAsk();
		System.out.println("Job is started");
		
	}

}
