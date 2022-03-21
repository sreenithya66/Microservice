package com.herffjonestest.student.repository;

import com.herffjonestest.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
    Student findByStudentId(String studentId);
}
