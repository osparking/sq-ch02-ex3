package ch02_ex3.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ch02_ex3.config.ProjectConfig;

public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
	}

}
