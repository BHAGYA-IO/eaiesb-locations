package com.eaiesb.training.locations;


import org.springframework.data.mongodb.repository.MongoRepository;



public interface locationsRepository 
	
	extends MongoRepository <locations, String>{
		locations findByid(String id);

}
