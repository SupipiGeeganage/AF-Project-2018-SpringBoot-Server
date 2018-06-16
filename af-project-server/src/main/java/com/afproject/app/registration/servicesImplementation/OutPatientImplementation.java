package com.afproject.app.registration.servicesImplementation;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.afproject.app.registration.model.InPatient;
import com.afproject.app.registration.model.OutPatient;
import com.afproject.app.registration.repository.OutPatientRepository;
import com.afproject.app.registration.services.OutPatientService;

@Component
@Service
public class OutPatientImplementation implements OutPatientService {

	@Autowired
	OutPatientRepository outRepo;
	
//	LocalDate todaydate = LocalDate.now();	
	@Override
	public OutPatient addOutPatient(OutPatient outpatient) {
		outpatient.setRegistration_no(UUID.randomUUID().toString());
		outpatient.setDate(LocalDate.now().toString());
		return outRepo.save(outpatient);
	}
	
	@Override
	public List<OutPatient> listOutPatient(){
		return outRepo.findAll();
	}
	
	
	@SuppressWarnings("finally")
	public OutPatient getOnePatient(String Id) {
		OutPatient instance = null;
		try {
			List<OutPatient> userList = outRepo.findAll();
			for(OutPatient op: userList) {
				if(op.getRegistration_no().equals(Id)) {
					instance =  op;
					break;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			return instance;
		}
	}
	
	public void updateDetails(OutPatient outPatient, String id) {
		OutPatient outp = getOnePatient(id);
		
		outp.setAddress(outPatient.getAddress());
		outp.setAdmittedCondition(outPatient.getAdmittedCondition());
		
		
		outRepo.save(outp);
	}
	
	@Override
	public void deletePatient(String id) {
		OutPatient outp = getOnePatient(id);
		
		outRepo.delete(outp);
		
	}
}
