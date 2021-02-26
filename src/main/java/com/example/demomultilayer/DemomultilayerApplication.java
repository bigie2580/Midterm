package com.example.demomultilayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class DemomultilayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomultilayerApplication.class, args);
	}

	@GetMapping
	public List<Random> showRandomList(){
		return List.of(
				new Random(

				)
		);
	}

}
