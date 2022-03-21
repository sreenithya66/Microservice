package com.herffjonestest.department.service;


import com.herffjonestest.department.entity.Department;
import com.herffjonestest.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside the save method of DepartmentService class");
        return departmentRepository.save(department);
    }
    public Department  findDepartmentById( String departmentId) {
        log.info("Inside the findDepartmentById method of DepartmentService class");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
