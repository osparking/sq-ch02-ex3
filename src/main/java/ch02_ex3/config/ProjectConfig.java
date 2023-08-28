package ch02_ex3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch02_ex3.entity.Parrot;

@Configuration
public class ProjectConfig {
	@Bean
	Parrot parrot1() {
		var p = new Parrot();
		p.setName("루키");
		return p;
	}

	@Bean
	Parrot parrot2() {
		var p = new Parrot();
		p.setName("미키");
		return p;
	}

	@Bean
	Parrot parrot3() {
		var p = new Parrot();
		p.setName("리키");
		return p;
	}

}
