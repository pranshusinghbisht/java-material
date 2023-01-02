package com.masai.Model;

public class AccountDTO {
	private Integer Accountt;
	private Integer Accnot;
	private Integer amount;
	
	public AccountDTO(Integer accountt, Integer accnot, Integer amount) {
		super();
		this.Accountt = accountt;
		this.Accnot = accnot;
		this.amount = amount;
	}

	public AccountDTO() {
		// TODO Auto-generated constructor stub
	}

	public Integer getAccountt() {
		return Accountt;
	}

	public void setAccountt(Integer accountt) {
		Accountt = accountt;
	}

	public Integer getAccnot() {
		return Accnot;
	}

	public void setAccnot(Integer accnot) {
		Accnot = accnot;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
		
}
