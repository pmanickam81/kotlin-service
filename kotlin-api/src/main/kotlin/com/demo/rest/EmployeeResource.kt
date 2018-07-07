package com.demo.rest

import com.demo.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employee")
class EmployeeResource @Autowired constructor(val employeeService: EmployeeService){

    @GetMapping("/id/{empId}")
    fun retrieveEmployee(@PathVariable empId:Long): ResponseEntity<String>{
        return ResponseEntity.ok(employeeService.getEmployee(empId))
    }

    @GetMapping("/name/{empName}")
    fun retrieveEmployeeName(@PathVariable empName:String):ResponseEntity<String>{
        return ResponseEntity.ok(employeeService.getEmployeeByName(empName))
    }

    @GetMapping("/all")
    fun retrieveAllEmployees():ResponseEntity<String>{
        return ResponseEntity.ok(employeeService.getAllEmployees())
    }
}