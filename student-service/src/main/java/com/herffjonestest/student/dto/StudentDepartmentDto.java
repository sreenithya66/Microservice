package com.herffjonestest.student.dto;

import com.herffjonestest.student.entity.Department;
import com.herffjonestest.student.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDepartmentDto {
  private Student student;
  private Department department;
}
