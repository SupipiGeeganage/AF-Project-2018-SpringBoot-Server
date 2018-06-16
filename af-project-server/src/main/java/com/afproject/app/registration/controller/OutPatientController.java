package com.afproject.app.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.afproject.app.registration.model.OutPatient;
import com.afproject.app.registration.services.OutPatientService;

@RestController
@RequestMapping
public class OutPatientController {
	
	@Autowired
	OutPatientService outPService;
	
	@CrossOrigin(origins = {"http://localhost:8083", "http://localhost:3000" })
	
	@RequestMapping(value = "/outPatient", method = RequestMethod.POST)
	public void addOutPatient (@RequestBody OutPatient outpatient) {
		outPService.addOutPatient(outpatient);
	}
	
	@CrossOrigin(origins = {"http://localhost:8083", "http://localhost:3000" })
	
	@RequestMapping(value="/outPatient", method=RequestMethod.GET)
	public List<OutPatient> OutPatient(){
		return outPService.listOutPatient();
	}
	
	@RequestMapping(value="/outPatient/{id}", method=RequestMethod.GET)
	public OutPatient getOnePatient(@PathVariable @RequestBody String id) {
		return outPService.getOnePatient(id);
	}
	
	@RequestMapping(value="/outPatient/{id}", method=RequestMethod.PUT)
	public void updateDetails(@RequestBody OutPatient outPatient ,@PathVariable String id) {
		try {
			outPService.updateDetails(outPatient, id);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping(value = "/outPatient/{id}", method = RequestMethod.DELETE)
	public void deletePatient(String id) {
		outPService.deletePatient(id);
	}

}
