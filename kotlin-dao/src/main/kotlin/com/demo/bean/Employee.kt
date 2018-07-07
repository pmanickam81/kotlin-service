package com.demo.bean

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
//@Table(name = "employee")
data class Employee(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "emp_id") val employeeId: Long,
        @Column(name = "emp_name")val employeeName: String,
        @JsonManagedReference @OneToOne(cascade = [(CascadeType.ALL)])@JoinColumn(name = "dept_id")val dept: Department? = null
)
