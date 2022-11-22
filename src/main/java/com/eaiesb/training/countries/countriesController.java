/*package com.eaiesb.training.countries;



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

import com.eaiesb.training.countries.countries;
import com.eaiesb.training.countries.countriesRepository;


@CrossOrigin
@RequestMapping("/api/v1")
@RestController

public class countriesController {
	
	
	
	@Autowired
	private countriesController counRepo;


	@GetMapping("/countries")
	public List<countries> getAllcountires() {
		return counRepo.findAll();

	}

	@PostMapping("/countries")
	public countries saveEmployo(@Validated @RequestBody countries countries)

	{
		return counRepo.save(countries);

	}

	@PutMapping("/countries/{id}")
	public countries update(@PathVariable String id, @Validated @RequestBody countries emp) {
		countries.setId(id);
		return counRepo.save(countries);
	}

	@DeleteMapping("/countries/{id}")
	public void deletecountries(@PathVariable String id) {
		counRepo.deleteById(id);
	}
	

}*/


package com.eaiesb.training.countries;



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

//import com.eaiesb.training.employee.employee;
//import com.eaiesb.training.employee.employeeRepository;

@CrossOrigin
@RequestMapping("/api/v2")
@RestController
public class countriesController {
	
	
	@Autowired
	private countriesRepository empRepo;

	@GetMapping("/countries")
	public List<countries> getAllcountries() {
		return empRepo.findAll();

	}

	@PostMapping("/countries")
	public countries saveCountries(@Validated @RequestBody countries countries)

	{
		return empRepo.save(countries);

	}

	@PutMapping("/countries/{id}")
	public countries update(@PathVariable String id, @Validated @RequestBody countries emp) {
		emp.setId(id);
		return empRepo.save(emp);
	}

	@DeleteMapping("/countries/{id}")
	public void deleteCountries(@PathVariable String id) {
		empRepo.deleteById(id);
	}

}
