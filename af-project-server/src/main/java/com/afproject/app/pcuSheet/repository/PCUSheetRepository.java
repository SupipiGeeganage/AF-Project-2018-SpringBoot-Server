package com.afproject.app.pcuSheet.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.afproject.app.pcuSheet.model.PCUSheet;


public interface PCUSheetRepository extends MongoRepository<PCUSheet, String>{

	

}
