package com.example.DeployApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class DeployAppApplication {

    Logger logger= LoggerFactory.getLogger(DeployAppApplication.class);

	@GetMapping("hello")
	public String helloWorld()
	{
		return "welcome in pune";
	}

	public static void main(String[] args) {
		SpringApplication.run(DeployAppApplication.class, args);


	}

}
