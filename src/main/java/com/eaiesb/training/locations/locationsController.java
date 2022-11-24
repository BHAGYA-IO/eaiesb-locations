package com.eaiesb.training.locations;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.eaiesb.training.locations.locations;
//import com.eaiesb.training.locations.locationsRepository;

@CrossOrigin
@RequestMapping("/api/v1")
@RestController

public class locationsController {
	
	@Autowired
	private locationsRepository empRepo;

	@GetMapping("/locations")
	public List<locations> getAllLocations() {
		return empRepo.findAll();

	}

	@PostMapping("/locations")
	public locations saveLocations(@Validated @RequestBody locations locations)

	{
		return empRepo.save(locations);

	}

	@PutMapping("/locations/{id}")
	public locations update(@PathVariable String id, @Validated @RequestBody locations emp) {
		emp.setId(id);
		return empRepo.save(emp);
	}

	@DeleteMapping("/locations/{id}")
	public void deleteLocations(@PathVariable String id) {
		empRepo.deleteById(id);
	}

}
