package com.afproject.app.pcuSheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.afproject.app.pcuSheet.model.PCUSheet;
import com.afproject.app.pcuSheet.service.PCUSheetService;


@RestController
@RequestMapping
public class PCUSheetController {
	
	@Autowired
	private PCUSheetService PCUService;
	
	@CrossOrigin(origins = {"http://localhost:8083", "http://localhost:3000"})
	
	@RequestMapping(value = "/pcusheet", method = RequestMethod.POST)
	public void AddUser(@Validated @RequestBody PCUSheet pcu) {
		
		try {
			PCUService.addPCUSheet(pcu);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@CrossOrigin(origins = {"http://localhost:8083", "http://localhost:3000"})
	
	@RequestMapping(value = "/pcusheet", method = RequestMethod.GET)
	public List<PCUSheet> GetAllPCUs() {
		List<PCUSheet> pcu = null;
		try {
			pcu = PCUService.getAllUsers();  
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pcu;
	}
	
	@CrossOrigin(origins = {"http://localhost:8083", "http://localhost:3000"})
	
	@RequestMapping(value = "/pcusheet/{id}", method = RequestMethod.GET)
	public PCUSheet GetOnePCU(@PathVariable String id) {
		PCUSheet pcu = null;
		try {
			pcu = PCUService.getOne(id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pcu;
	}
	
	@CrossOrigin(origins = {"http://localhost:8083", "http://localhost:3000"})
	
	@RequestMapping(value="pcusheet/{id}", method=RequestMethod.PUT)
	public void updateDetails(@RequestBody PCUSheet pcu, @PathVariable String id) {
		try {
				PCUService.updateDetails(pcu , id);
		} catch(Exception e) {
		e.printStackTrace();
		}
	}
	
	@CrossOrigin(origins = {"http://localhost:8083", "http://localhost:3000"})
	
	@RequestMapping(value="pcusheet/{id}", method= RequestMethod.DELETE)
	public void deletePatient( @PathVariable String id) {
		PCUService.deletePatient(id);
	}
	
	
	
}
