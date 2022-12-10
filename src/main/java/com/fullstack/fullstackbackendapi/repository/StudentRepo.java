package com.fullstack.fullstackbackendapi.repository;

import com.fullstack.fullstackbackendapi.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
}
