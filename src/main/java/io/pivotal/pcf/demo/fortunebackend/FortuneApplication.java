package io.pivotal.pcf.demo.fortunebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FortuneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FortuneApplication.class, args);
	}

	@Autowired
	private BackendController controller;

	@Override
	public void run(String... args) {

		try {
			if(!controller.all().isEmpty()) return;

			controller.save(new Fortune("People are naturally attracted to you."));
			controller.save(new Fortune("You learn from your mistakes... You will learn a lot today."));
			controller.save(new Fortune("What ever your goal is in life, embrace it visualize it, and for it will be yours."));
			controller.save(new Fortune("Your shoes will make you happy today."));
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
