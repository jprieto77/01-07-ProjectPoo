package co.edu.ue.projectcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.ue.repositories", "co.edu.ue.service", "co.edu.ue.controller"})
public class ProjectcourseApplication {
	/**
	 * inyeccion por metodo y constructor
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(ProjectcourseApplication.class, args);
	}

}
