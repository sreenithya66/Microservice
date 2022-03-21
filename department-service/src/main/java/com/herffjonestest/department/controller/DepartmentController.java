package com.herffjonestest.department.controller;

import com.herffjonestest.department.entity.Department;
import com.herffjonestest.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/create")
    public Department saveDepartment(@RequestBody Department departmenyt){
        log.info("inside the save department method DepartmentController");
        return departmentService.saveDepartment(departmenyt);

    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") String departmentId){
        log.info("Inside findDepartmentById method of Department Controller ");
        return departmentService.findDepartmentById(departmentId);
    }
}
