package com.mod3week2hw2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mod3week2hw2.entity.movie;

@RestController
@RequestMapping
public class movieController {
	
	@GetMapping("/movies")
	public movie[] getAllMovies() {
		
		String url = "https://my.api.mockaroo.com/movie.json?key=bb299fd0";

	      RestTemplate restTemplate = new RestTemplate();

	      movie[] response  = null;

	      response = restTemplate.getForObject(url, movie[].class);
	      
	      for(movie movie: response) {
	    	  System.out.println(movie);
	      }
	      
	      return response;
	      
	}

}
