package com.genspark.SpringBootDemo2.Dao;

import com.genspark.SpringBootDemo2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
