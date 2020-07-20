package com.mercedes.heremaps.restfulwebservice.HereMaps.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.mercedes.heremaps.restfulwebservice.HereMaps.Model.Items;
import com.mercedes.heremaps.restfulwebservice.HereMaps.Service.Location_Finder;



@RestController
public class HereMapsController{
	
	@Autowired 
	Location_Finder locationFinder;
	
	@GetMapping(path = "/maps")
	@Cacheable(value="maps")
	
	public Map<String, Object> Restro(@RequestParam("position") String position) throws Throwable{
		Map<String,Object> response = new HashMap();
		List<Items> nearByResturants = locationFinder.getLocation(position,"restaurant").get();
		List<Items> nearByChargingStations = locationFinder.getLocation(position, "ev-charging-station").get();
		List<Items> nearByParkingSpots = locationFinder.getLocation(position, "parking-facility").get();
        
        try {
        	response.put("Resturant",nearByResturants);
			response.put("ChargingStations",nearByChargingStations);
			response.put("ParkingSpots",nearByParkingSpots);
			 
        }catch(Throwable e) {
        	throw e.getCause();
        }
        return response;
	}
}