package com.demo.bean

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
//@Table(name = "department")
data class Department(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "dept_id") val deptId: Long,
        @Column(name = "dept_name") val deptName: String,
        @JsonBackReference @OneToOne(mappedBy = "dept") val employee: Employee ?= null
)
