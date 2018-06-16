package com.afproject.app.payment.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afproject.app.payment.model.payment;
import com.afproject.app.payment.repository.paymentRepository;
import com.afproject.app.pcuSheet.model.PCUSheet;
import com.afproject.app.pcuSheet.repository.PCUSheetRepository;

@Service
public class paymentService {
	
	@Autowired
	private PCUSheetRepository PCURepository;
	
	@Autowired
	private paymentRepository paymentRepository;
	
	
	private int dateDiff;
	public PCUSheet viewPaymentDetails(String NIC){
		
		PCUSheet pcu = null;
		pcu = PCURepository.findOne(NIC);
		return pcu;
		
		
	}
	
public void datedif(LocalDate dueDate) {
		
		
	 
			LocalDate now = LocalDate.now();
			Period diff = Period.between(dueDate, now);
			this.dateDiff=diff.getDays();
		
		
	}

	
	public double TotCal(String NIC) {
		
	
		int d=this.dateDiff;
		
		switch(d) {
		
		case 1:
			return 25000.00;
		
		case 2:
			return 40000.00;
			
		case 3:
			return 50000.00;
			
		case 4:
			return 60000.00;
		}
		return 0;
		
	}
	
	
	public double nurcecharge(String YesorNo) {
		
		
		int noOfDates=this.dateDiff;
		
		if(YesorNo=="yes") {
			
			return noOfDates*5000;
			
		}
		else
			return 0;
		
	}

	public double Foodscharge(String YesorNo) {
		
		
	
		int noOfDates=this.dateDiff;
		
		if(YesorNo=="yes") {
			
			return noOfDates*750;
				
			
		}
		else
			return 0;
		
		
	}
	
	
	public void setDischargedDetails(String NIC) {
		
		payment p1 = this.findOne(NIC);
	
		p1.setNoOfDates(dateDiff);
		p1.setAddnurseCharge(nurcecharge(p1.getAddnurse()));
		p1.setFoodpckCharge(Foodscharge(p1.getFoodpck()));
		p1.setTotalPayment(p1.getFoodpckCharge()+p1.getTotalPayment()+p1.getAddnurseCharge());
		
		
	}
	

@SuppressWarnings("finally")
private payment findOne(String Id) {
	payment instance = null;
	try {
		List<payment> pcuList = paymentRepository.findAll();
		for(payment pcu: pcuList) {
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

