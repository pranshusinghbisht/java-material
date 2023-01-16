package com.masai.app.model;

public class StudentDTO {
	
	private String address;
	private Integer marks;
	
	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}

	public StudentDTO(String address, Integer marks) {
		super();
		this.address = address;
		this.marks = marks;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentDTO [address=" + address + ", marks=" + marks + "]";
	}
	
	

}
