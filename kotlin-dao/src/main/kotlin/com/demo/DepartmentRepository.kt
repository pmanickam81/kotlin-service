package com.demo

import com.demo.bean.Department
import org.springframework.data.repository.CrudRepository
import java.util.*

interface DepartmentRepository: CrudRepository<Department, Long>{

    override fun findAll(): MutableIterable<Department>

    override fun findById(id: Long): Optional<Department>

    fun findByDeptName(dName:String): Optional<Department>


}