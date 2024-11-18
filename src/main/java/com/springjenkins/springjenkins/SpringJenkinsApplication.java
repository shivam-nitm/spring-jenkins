package com.springjenkins.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJenkinsApplication {
	
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
		
		testJenkinsBuild();
	}
	
	public static void testJenkinsBuild() {
		logger.info("Application started running, inside the testJenkinsBuild method");
		System.out.println("testing jenkins");
	}

}
