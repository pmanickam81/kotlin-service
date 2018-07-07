package com.demo

import com.demo.bean.Employee
import org.springframework.data.repository.CrudRepository
import java.util.*

interface EmployeeRepository:CrudRepository<Employee, Long> {

    override fun findAll(): MutableIterable<Employee>

    override fun findById(id: Long): Optional<Employee>

    fun findByEmployeeName(Name:String): Employee

}