package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int studentRoll;
  private String studentName;
  private String mobileNumber;
  private String email;
  
  @ManyToOne(cascade = CascadeType.ALL)
  private Collage clg;
  
  
  
public int getStudentRoll() {
	return studentRoll;
}
public void setStudentRoll(int studentRoll) {
	this.studentRoll = studentRoll;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


public Collage getClg() {
	return clg;
}
public void setClg(Collage clg) {
	this.clg = clg;
}


public Student() {
	
}



public Student(String studentName, String mobileNumber, String email) {
	
	
	this.studentName = studentName;
	this.mobileNumber = mobileNumber;
	this.email = email;
}
@Override
public String toString() {
	return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber
			+ ", email=" + email + ", clg=" + clg + "]";
}





  


  

}
