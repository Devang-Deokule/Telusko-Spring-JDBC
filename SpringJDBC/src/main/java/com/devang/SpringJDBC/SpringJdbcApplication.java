package com.devang.SpringJDBC;

import com.devang.SpringJDBC.model.Student;
import com.devang.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);


		Student s = context.getBean(Student.class);
		StudentService service = context.getBean(StudentService.class);

		s.setRollNo(57);
		s.setName("Devang");
		s.setMarks(87);

		service.addStudent(s);

		List<Student> students=service.getStudents();
		System.out.println(students);
	}
}
