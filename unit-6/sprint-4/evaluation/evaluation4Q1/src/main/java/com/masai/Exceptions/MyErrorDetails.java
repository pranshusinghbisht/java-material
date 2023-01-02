package com.masai.Exceptions;

import java.time.LocalDateTime;

public class MyErrorDetails {
	private LocalDateTime time;
	private String msg;
	private String des;
	
	public MyErrorDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public MyErrorDetails(LocalDateTime time, String msg, String des) {
		super();
		this.time = time;
		this.msg = msg;
		this.des = des;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	

}
