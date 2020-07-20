package com.mercedes.heremaps.restfulwebservice.HereMaps.util;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mercedes.heremaps.restfulwebservice.HereMaps.Model.Items;
import com.mercedes.heremaps.restfulwebservice.HereMaps.Model.Results;

@Component
public class Distance_Util {

	public List<Items> getNearbyLocations(List<Items> items) {
		Collections.sort(items);
		return items.subList(0,3);
	}

}
