package com.example.demo;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "Norman Sanchez",
                "normansanchezn@gmail.com",
                26,
                LocalDate.of(19994, Month.JUNE, 4)
        ));
    }
}
