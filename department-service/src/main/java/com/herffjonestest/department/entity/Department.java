package com.herffjonestest.department.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    private String departmentId;
    private String departmentName;
    private String departmentBuilding;
    private String departmentHod;
}
