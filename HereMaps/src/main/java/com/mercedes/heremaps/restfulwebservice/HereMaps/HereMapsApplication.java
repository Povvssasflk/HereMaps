package com.mercedes.heremaps.restfulwebservice.HereMaps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableCaching
@SpringBootApplication
public class HereMapsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HereMapsApplication.class, args);
	}
	  @Bean
	  public RestTemplate restTemplate(RestTemplateBuilder builder) { return
	  builder.build(); }
	 
}
