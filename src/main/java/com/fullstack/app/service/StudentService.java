package com.fullstack.app.service;

import com.fullstack.app.entity.Student;
import com.fullstack.app.repository.Studentrepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final Studentrepo studentrepo;

    public StudentService(Studentrepo studentrepo) {
        this.studentrepo = studentrepo;
    }

    public Student saveStudent(Student student) {
        return studentrepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentrepo.findAll();
    }
}
