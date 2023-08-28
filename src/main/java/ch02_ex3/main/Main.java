package ch02_ex3.main;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ch02_ex3.config.ProjectConfig;
import ch02_ex3.entity.Parrot;

public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var ps = new PrintStream(System.out, true, UTF_8);
		var p = (Parrot) context.getBean("parrot1");
		
		ps.println(p.getName());
	}

}
