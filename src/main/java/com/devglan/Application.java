package com.devglan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static final Logger LOGGER = LogManager.getLogger(Application.class);
	
	// https://www.devglan.com/spring-security/spring-boot-security-oauth2-example
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    	LOGGER.info("Info level log message");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
    }

}
