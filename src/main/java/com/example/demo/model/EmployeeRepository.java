package com.example.demo.model;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	public List<Employee> findByEmpname(String name);
	@Query("select e from Employee e where e.salary >5000 and e.salary<10000")
	public List<Employee> getEmpBySalary();
	public List<Employee> findByOrderByEmpnameAsc();

}