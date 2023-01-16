package com.DFinelli.studentsystem.repository;

import com.DFinelli.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// @nobean trick if this bugs.. D:

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
}