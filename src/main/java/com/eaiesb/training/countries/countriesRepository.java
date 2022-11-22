package com.eaiesb.training.countries;
import org.springframework.data.mongodb.repository.MongoRepository;

//import com.eaiesb.training.countries.countries;

//import com.eaiesb.training.countries.countries;
public interface countriesRepository 
	
extends MongoRepository <countries, String>{
		countries findByid(String id);

}
