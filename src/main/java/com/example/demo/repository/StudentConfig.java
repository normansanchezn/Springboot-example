package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student norman = new Student(
                    "Norman",
                    "normansanchezn@gmail.com",
                    LocalDate.of(1994, Month.JUNE, 4)
            );

            Student cesar = new Student(
                    "Cesar",
                    "cesar@gmail.com",
                    LocalDate.of(2003, Month.MARCH, 1)
            );

            repository.saveAll(List.of(
                    norman,
                    cesar
            ));
        };
    }
}
