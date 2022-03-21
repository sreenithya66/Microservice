package com.herffjonestest.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private String departmentId;
    private String departmentName;
    private String departmentBuilding;
    private String departmentHod;
}
