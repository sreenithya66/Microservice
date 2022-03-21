package com.herffjonestest.department.repository;

import com.herffjonestest.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,String> {
    Department findByDepartmentId(String departmentId);
}
