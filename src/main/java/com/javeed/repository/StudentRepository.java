package com.javeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javeed.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
