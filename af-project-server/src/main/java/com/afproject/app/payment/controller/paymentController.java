package com.afproject.app.payment.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.afproject.app.payment.model.payment;
import com.afproject.app.payment.service.paymentService;

@RestController
@RequestMapping
public class paymentController {
	private String NIC=null;
	@Autowired
	private paymentService paymentService;
	
	
	



@CrossOrigin(origins = {"http://localhost:8083", "http://localhost:3000"})

	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	public void setDischargedDetails(@Validated @RequestBody payment payment) {
	this.NIC=payment.getNIC();
	try {
		paymentService.setDischargedDetails(NIC);;
	} catch(Exception e) {
		e.printStackTrace();
	}
}


	
	
}