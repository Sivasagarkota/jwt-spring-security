package com.telusko.spring_security.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.spring_security.Model.Student;

@RestController
public class StudentController {
    
    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Navin", 50),
            new Student(2, "Telusko", 80)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }
}
