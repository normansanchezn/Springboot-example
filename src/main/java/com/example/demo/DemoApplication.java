package com.example.demo;

import com.example.demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(new Student(
				1L,
				"Norman Sanchez",
				"normansanchezn@gmail.com",
				26,
				LocalDate.of(19994, Month.JUNE, 4)
		));
	}

}
