package com.afproject.app.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.afproject.app.registration.model.InPatient;
import com.afproject.app.registration.services.InPatientService;

@RestController
public class InPatientController {
	
	@Autowired
	InPatientService inPService;
	
	@CrossOrigin(origins = {"http://localhost:8083", "http://localhost:3000" })
	
	@RequestMapping(value="/inPatient",method = RequestMethod.POST)
	public InPatient CreateInPatient(@Validated @RequestBody InPatient inPatient) {
		return  inPService.CreateInPatient(inPatient);
	}
	
	@CrossOrigin(origins = {"http://localhost:8083", "http://localhost:3000" })
	
	@RequestMapping(value="/inPatient",method= RequestMethod.GET)
	public List<InPatient> InPatient(){
		return inPService.listInPatient();
	}
	
	@RequestMapping(value="/inPatient/{id}",method= RequestMethod.GET)
	public InPatient getOne(@PathVariable("id")  String ip_id) {
		return inPService.getOneInPatient(ip_id);
	}
	
	@RequestMapping(value="/inPatient/{id}", method=RequestMethod.PUT)
	public void updateDetails(@RequestBody InPatient inPatient, @PathVariable String id) {
		try {
			inPService.updateDetails(inPatient, id);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="inPatient/{id}", method= RequestMethod.DELETE)
	public void deletePatient(String id) {
		inPService.deletePatient(id);
	}

}
