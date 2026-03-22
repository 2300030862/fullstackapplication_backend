package com.fullstack.app.controller;


import com.fullstack.app.entity.Student;
import com.fullstack.app.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/savestudent")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public java.util.List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/greet")
    public String greet() {
        return "Feature branch change";
    }


    @GetMapping("/noaccess")
    public String access() {
        return "no access";
    }
}
