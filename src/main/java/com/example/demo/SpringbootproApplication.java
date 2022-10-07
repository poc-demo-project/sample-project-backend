package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@SpringBootApplication
@RestController
public class SpringbootproApplication {
	
	public static Logger logger= LoggerFactory.getLogger(SpringbootproApplication.class);

	
     public static void main(String args[]) throws FileNotFoundException
	{
    	
		SpringApplication.run(SpringbootproApplication.class, args);
		logger.info("Log level: INFO");
		logger.debug("Log level: DEBUG");
		logger.error("Log level: ERROR");
		logger.warn("Log level: WARN");
		
	}
	
}







