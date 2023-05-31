package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {
@Autowired
Hospitalservice hospitalservice;

@PostMapping("/saveHospital")
public Hospital saveHospital(@RequestBody Hospital hospital) {
	
	return hospitalservice.saveData(hospital);
	
}
@GetMapping("/hospitals")
public List<Hospital>getallHospitals(){
	return hospitalservice.getallHospitals();
	
}
@GetMapping("/hospital/{id}")
public Hospital gethHospital(@PathVariable long id) {
	return hospitalservice.getHospitalbyid(id);
	
}
@GetMapping("/getbyrating/{rating}")
public List<Hospital> getHospitalbyrating(@PathVariable double rating) {
	
	return hospitalservice.gethosHospitalbyratingHospital(rating);
}
	
@GetMapping("/findbyname/{name}")
public List<Hospital>getHospitalbyname(@PathVariable String name){
	return hospitalservice.getHospitalbyname(name);
	
	
}
@GetMapping("/getbyratingandlocation/{rating}/{location}")
	public List<Hospital> gethospitalbyratingandlocation(@PathVariable double rating,@PathVariable String location){
		return hospitalservice.getHospitalbyratingandlocation(rating, location);
}
	

}

