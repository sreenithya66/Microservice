package com.herffjonestest.student.controller;

import com.herffjonestest.student.dto.StudentDepartmentDto;
import com.herffjonestest.student.entity.Student;
import com.herffjonestest.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/")
    public Student saveStudent(@RequestBody Student student){
        log.info("Inside the save student of Student Controller") ;
        return studentService.saveStudent(student);

    }
   @GetMapping("/{id}")
    public StudentDepartmentDto getStudentWithDepartment(@PathVariable("id") String studentId){
        log.info("Inside the save student of Student Controller") ;
        return studentService.getStudentDepartmentInfo(studentId);

    }
}
