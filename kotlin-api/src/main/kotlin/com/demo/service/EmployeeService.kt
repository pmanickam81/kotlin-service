package com.demo.service

import com.demo.EmployeeRepository
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeService @Autowired constructor(val employeeRepository: EmployeeRepository){

    val mapper = ObjectMapper()

    fun getEmployee(employeeId:Long):String{
        return mapper.writeValueAsString(employeeRepository.findById(employeeId).get())
    }

    fun getEmployeeByName(employeeName:String):String{
        return mapper.writeValueAsString(employeeRepository.findByEmployeeName(employeeName))
    }

    fun getAllEmployees():String{
        return mapper.writeValueAsString(employeeRepository.findAll())
    }

}