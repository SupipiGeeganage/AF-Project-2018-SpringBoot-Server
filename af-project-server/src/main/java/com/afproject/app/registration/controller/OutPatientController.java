package com.afproject.app.registration.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.afproject.app.registration.model.OutPatient;
import com.afproject.app.registration.services.OutPatientService;

@RestController
@RequestMapping
public class OutPatientController {
	
	OutPatientService outPService;
	
	@RequestMapping(value = "/patient", method = RequestMethod.POST)
	public void addOutPatient (@RequestBody OutPatient outpatient) {
		//outPService.add
	}

}
