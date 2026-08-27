package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Ms7AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms7AdminServerApplication.class, args);
	}

}
