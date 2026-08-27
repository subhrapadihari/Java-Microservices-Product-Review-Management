package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ms5ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms5ConfigServerApplication.class, args);
	}

}
