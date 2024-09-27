package com.devfleming.address_microservice;

import org.springframework.boot.SpringApplication;

public class TestAddressMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.from(AddressMicroserviceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
