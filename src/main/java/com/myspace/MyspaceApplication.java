package com.myspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

//@EnableKafka
@SpringBootApplication
public class MyspaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspaceApplication.class, args);
	}

}
