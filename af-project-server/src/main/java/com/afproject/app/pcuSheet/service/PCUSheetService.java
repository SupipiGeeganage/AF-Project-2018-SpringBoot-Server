package com.afproject.app.pcuSheet.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afproject.app.pcuSheet.model.PCUSheet;
import com.afproject.app.pcuSheet.repository.PCUSheetRepository;


@Service
public class PCUSheetService {

	@Autowired
	private PCUSheetRepository PCURepository;
	
	public void addPCUSheet(PCUSheet pcu) {
		PCURepository.save(pcu);
	}

	public List<PCUSheet> getAllUsers() {
		List<PCUSheet> pcu = null;
		pcu = PCURepository.findAll();
		return pcu;
	}

	public void updateDetails(PCUSheet pcu, String id) {
		

		PCUSheet pcu1 = this.findOne(id);
		
		pcu1.setDate(pcu.getDate());
		pcu1.setPatient_name(pcu.getPatient_name());
		pcu1.setDoctor_name(pcu.getDoctor_name());
		pcu1.setMedical_condition(pcu.getMedical_condition());
		pcu1.setMedical_drugs(pcu.getMedical_drugs());
		pcu1.setPatient_current_status(pcu.getPatient_current_status());
		pcu1.setDescription(pcu.getDescription());
		
		PCURepository.save(pcu1);
		
	}

	public void deletePatient(String id) {
		
		PCURepository.delete(this.findOne(id));
		
	}
	public PCUSheet getOne(String id) {
		PCUSheet pcu = this.findOne(id);
		return pcu;
		
	}
	
	
	@SuppressWarnings("finally")
	private PCUSheet findOne(String Id) {
		PCUSheet instance = null;
		try {
			List<PCUSheet> pcuList = PCURepository.findAll();
			for(PCUSheet pcu: pcuList) {
				if(pcu.getId().equals(Id)) {
					instance =  pcu;
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
