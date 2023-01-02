package com.masai;

public class Demo {
	public static void main(String[] args) {
		
		Collage tr=new Collage(null);
		tr.setp(new Teacher());
		
		tr.setp(new Clerk());
		

		Collage tr1=new Collage(null);
		
		
		tr.doJob();
		//tr1.doJob();
	}

}
