package com.challengealura.findbook;

import com.challengealura.findbook.principal.Principal;
import com.challengealura.findbook.repository.autorRepository;
import com.challengealura.findbook.repository.libroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FindBook implements CommandLineRunner {

	@Autowired
	private autorRepository autorRepository;

	@Autowired
	private libroRepository libroRepository;


	public static void main(String[] args) {
		SpringApplication.run(FindBook.class, args);
	}

	@Override
	public void run(String... args) throws  Exception {
		Principal principal = new Principal(autorRepository, libroRepository);
		principal.muestraElMenu();

	}

}
