package com.mod3week2hw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
/*
 * Resolving “Failed to Configure a DataSource” Error - if we you don't add the exclude ={DataSourceAutoConficuration.class}
 * Generally we add mydriver sql - connection dependency, but we're not yet ready to define our data source?
  Let's see how to prevent Spring Boot from auto-configuring the data source.
  The class DataSourceAutoConfiguration is the base class for configuring a data source using
  the spring.datasource.* properties.
  Now, there are a few ways that we can exclude this from the auto-configuration.
  First, we can disable the auto-configuration using the spring.autoconfigure.exclude property 
  in our application.properties file:
  spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
  
  Likewise, we can do the same using our application.yml file:
  spring:
  autoconfigure:
    exclude:
    - org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
    
   Or, we can use the exclude attribute on our @SpringBootApplication or @EnableAutoConfiguration annotation:
   like above
 */
public class MovieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApiApplication.class, args);
	}

}
