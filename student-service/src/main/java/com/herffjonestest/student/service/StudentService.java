package com.herffjonestest.student.service;

import com.herffjonestest.student.dto.StudentDepartmentDto;
import com.herffjonestest.student.entity.Department;
import com.herffjonestest.student.entity.Student;
import com.herffjonestest.student.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private RestTemplate restTemplate;


    public Student saveStudent(Student student){
        log.info("Inside save student method of StudentService ");
        return studentRepository.save(student);
    }

    public StudentDepartmentDto getStudentDepartmentInfo(String studentId){
        log.info("Inside save student method of StudentService ");
        StudentDepartmentDto dto = new StudentDepartmentDto();
        Student student = studentRepository.findByStudentId(studentId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+student.getDepartment(), Department.class);
        dto.setStudent(student);
        dto.setDepartment(department);
        return dto;
    }
}
