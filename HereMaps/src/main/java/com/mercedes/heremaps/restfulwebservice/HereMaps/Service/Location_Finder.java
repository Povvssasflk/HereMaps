package com.mercedes.heremaps.restfulwebservice.HereMaps.Service;
  
  import java.util.List; 
  import java.util.concurrent.CompletableFuture;
  import org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.scheduling.annotation.Async; 
  import org.springframework.stereotype.Service; 
  import org.springframework.web.client.RestTemplate; 
  import org.springframework.web.util.UriComponentsBuilder;
  import com.mercedes.heremaps.restfulwebservice.HereMaps.Model.Items; 
  import com.mercedes.heremaps.restfulwebservice.HereMaps.Model.Root; 
  import com.mercedes.heremaps.restfulwebservice.HereMaps.util.Distance_Util;
  
  @Service 
  public class Location_Finder{
  
  @Autowired 
  RestTemplate restTemplate;
  
  @Autowired 
  Distance_Util util;
  
  @Async 
  public CompletableFuture<List<Items>> getLocation(String position,String cat) {
  
  String transactionUrl =
  "https://places.demo.api.here.com/places/v1/discover/explore";
  UriComponentsBuilder builder = UriComponentsBuilder
  .fromUriString(transactionUrl)
  .queryParam("at", position)
  .queryParam("cat", cat) 
  .queryParam("app_id","DemoAppId01082013GAL") 
  .queryParam("app_code","AJKnXv84fjrb0KIHawS0Tg");
  RestTemplate restTemplate = new RestTemplate();
  Root response = restTemplate.getForObject(builder.toUriString(), Root.class); 
  return CompletableFuture.completedFuture(util.getNearbyLocations(response.getResults().getItems()));
  
  }
  
  
  }
 