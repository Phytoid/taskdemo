package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeRepository;

@Controller
//@RequestMapping("/employee")
//http://localhost:8080/employee/saveEmployee
@RestController
/*
 * Controller annotation can be used to create web application
 * RestController is a combination of Controller+ResponseBody
 * which can be used to send any kind of response.
 */
public class EmployeeController {
	@Autowired
	EmployeeRepository emprep;
	/*@GetMapping-To retreive data
	@PostMapping-To insert data
	@PutMapping-To update data
	@DeleteMapping=to delete data*/
	@GetMapping("/employees")
	public List<Employee> getEmployee()
	{
		return emprep.findByOrderByEmpnameAsc();
	}
	@GetMapping("/employees/{empid}")
	public Employee getEmp(@PathVariable int empid)
	{
		Optional<Employee> eobj=emprep.findById(empid);
		Employee retreiveobj=null;
		if(eobj.isPresent())
		{
			retreiveobj=eobj.get();
		}
		return retreiveobj;
	}
	@PostMapping("/insertEmployee")
	public Employee saveEmployee(@RequestBody Employee empobj)
	{
		Employee e=emprep.save(empobj);
		return e;
	}
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee obj)
	{
		int empid=obj.getEmpid();
		Optional<Employee> updateemployee=emprep.findById(empid);
		Employee update=null;
		if(updateemployee.isPresent())
		{
			update=updateemployee.get();
			update.setEmpid(obj.getEmpid());
			update.setEmpname(obj.getEmpname());
			update.setSalary(obj.getSalary());
			emprep.save(update);
		}
		return update;
	}
	//	@Autowired
	//	UserRepository userrep;
	//	@RequestMapping("/")
	//	public String mainPage()
	//	{
	//		return "index";
	//	}
	//	@RequestMapping("/iemployee")
	//	public ModelAndView displayForm()
	//	{
	//		return new ModelAndView("EmployeeForm","empobj",new Employee());
	//	}
	//	@RequestMapping("/saveEmployee")
	//	public String saveData(@ModelAttribute("empobj") Employee eobj)
	//	{
	//		System.out.println("Employee id entered by user is "+eobj.getEmpid());
	//		System.out.println("Employee name "+eobj.getEmpname());
	//		System.out.println("Salary is "+eobj.getSalary());
	//		return "Success";
	//	}
	//	@RequestMapping("/iuser")
	//	public ModelAndView displayUserForm()
	//	{
	//		return new ModelAndView("UserForm","userobj",new User());
	//	}
	//	@RequestMapping("/saveUser")
	//	public String saveData(@ModelAttribute("userobj") User eobj)
	//	{
	//		System.out.println("User name entered by user is "+eobj.getUsername());
	//		System.out.println("Password is "+eobj.getPassword());
	//		userrep.save(eobj);
	//		//.save saves object to database
	//		return "Success";
	//	}


}
