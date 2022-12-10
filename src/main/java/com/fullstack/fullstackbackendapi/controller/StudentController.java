package com.fullstack.fullstackbackendapi.controller;

import com.fullstack.fullstackbackendapi.model.Student;
import com.fullstack.fullstackbackendapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/students")
    public Iterable<Student> findAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> findStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/students/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student student){
        studentService.updateStudent(id,student);
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
    }
}
