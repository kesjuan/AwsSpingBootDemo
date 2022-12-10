package com.fullstack.fullstackbackendapi.service;

import com.fullstack.fullstackbackendapi.model.Student;
import com.fullstack.fullstackbackendapi.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    //add a student
    public void addStudent(Student student){
        studentRepo.save(student);
    }
    //get all students
    public Iterable<Student> getAllStudents(){
       return studentRepo.findAll();
    }
    //get a student by id
    public Optional<Student> getStudentById(Long id){
        return studentRepo.findById(id);
    }
    //delete a student
    public void deleteStudentById(Long id){
         studentRepo.deleteById(id);
    }
    // update a student
    public void updateStudent(Long id, Student student){
        studentRepo.save(student);
    }

}
