package com.masai.exception;

import java.time.LocalDateTime;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class ExecptionMachine {
	
	
	@ExceptionHandler(BooknotFoundException.class)
	public ErrorDetails PEhandler(BooknotFoundException pe,WebRequest req){
		
		ErrorDetails err=new ErrorDetails();
		
		err.setTime(LocalDateTime.now());
		err.setMsg(pe.getMessage());
		err.setDesc(req.getDescription(false));
		
		return err;
		
	}
	
	@ExceptionHandler(Exception.class)
	public ErrorDetails   Otherhandler(Exception pe,WebRequest req){
	ErrorDetails err=new ErrorDetails();
		
		err.setTime(LocalDateTime.now());
		err.setMsg(pe.getMessage());
		err.setDesc(req.getDescription(false));
		
		return err;

}
}
