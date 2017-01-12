package com.cyzicus;

import com.cyzicus.mvc.controller.StudentController;
import com.cyzicus.mvc.model.Student;
import com.cyzicus.mvc.view.StudentView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcPatternDemo {

	public static void main(String[] args) {

		SpringApplication.run(MvcPatternDemo.class, args);

		// fetch student record based on his roll no from the database
		Student model = retrieveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.printStudentInfo();

		controller.setStudentName("James");
		controller.printStudentInfo();

	}

	private static Student retrieveStudentFromDatabase() {
		return new Student("10", "Robert");
	}
}
