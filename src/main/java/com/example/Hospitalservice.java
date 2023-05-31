package com.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Hospitalservice {
	List<Hospital> hospitals = new ArrayList<Hospital>(Arrays.asList(new Hospital(111L,"apolo","hyd",3.8),
            new Hospital(222L,"aims","mumbai",4.2)));

	public Hospital saveData(Hospital hospital) {
		
		return hospitals.add(hospital)?hospital:null;
	}
	public List<Hospital>getallHospitals(){
		return hospitals;
		
	}
	public Hospital getHospitalbyid(long id) {
		return hospitals.stream().filter(hosp->hosp.getId()==id).findAny().get();
		
	}
	public List<Hospital> gethosHospitalbyratingHospital(double rating){
		return hospitals.stream().filter(hosp->hosp.getRating()>rating).toList();
		
	}
     public List<Hospital>getHospitalbyname(String name){
		return hospitals.stream().filter(hosp->hosp.getName().equals(name)).toList();
    	 
    
		
	}
	public List<Hospital> getHospitalbyratingandlocation(double rating, String location) {
		return hospitals.stream().filter(hosp->hosp.getLocation().equals(location) && hosp.getRating()>rating).toList();
	}
		
	
	}
     



	


	
		
	
     
     
     
		
    	 
     



