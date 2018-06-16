package com.afproject.app.registration.servicesImplementation;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.afproject.app.registration.model.InPatient;
import com.afproject.app.registration.model.OutPatient;
import com.afproject.app.registration.repository.InPatientRepository;
import com.afproject.app.registration.services.InPatientService;

@Component
@Service
public class InPatientImplementation implements InPatientService{
	
	@Autowired
	InPatientRepository inPatientRepo;
	
	@Override
	public InPatient CreateInPatient(InPatient inPatient) {
		inPatient.setId(UUID.randomUUID().toString());
		inPatient.setDate(LocalDate.now().toString());
	        return inPatientRepo.save(inPatient);
	}
	

	
	
	public void updateDetails(InPatient inPatient, String id) {
		InPatient inp = getOneInPatient(id);
		
		inp.setAdmittedCondition(inPatient.getAdmittedCondition());
		inp.setConsultant(inPatient.getConsultant());
		
		
		inPatientRepo.save(inp);
	}
	
	@Override
	public void deletePatient(String id) {
		InPatient inp = getOneInPatient(id);
		
		inPatientRepo.delete(inp);
		
	}
	


	@Override
	public List<InPatient> listInPatient() {
		return inPatientRepo.findAll();
	}


	@SuppressWarnings("finally")
	@Override
	public InPatient getOneInPatient(String Id) {
		
		InPatient instance = null;
		try {
			List<InPatient> userList = inPatientRepo.findAll();
			for(InPatient ip: userList) {
				if(ip.getId().equals(Id)) {
					instance =  ip;
					break;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			return instance;
		}
	}

}
