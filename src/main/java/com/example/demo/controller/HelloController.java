package com.example.demo.controller;
import org.springframework.stereotype.Controller;
//http://localhost:8080/index
@Controller
// defines class as controller
public class HelloController {
	//	@RequestMapping("/")
	//	public String getHome() {
	//		return "Home"; //searches for home.html in result
	//	}
	//	@RequestMapping("/index")
	//	public String getPage() {
	//		return "Welcome"; //searches for welcome.html in result
	//	}
	//	@RequestMapping("/log")
	//	public String getLog() {
	//		return "Login"; //searches for welcome.html in result
	//	}
	//	@RequestMapping("/info")
	//	public ModelAndView getData() {
	//		return new ModelAndView("Data", "message", "Welcome to Spring");
	//		/*
	//		 * First parameter is name of .jsp file
	//		 * Second parameter is name of variable by which it will be accessed
	//		 * Third parameter is information to send
	//		 */
	//	}
	//	@RequestMapping("/empdata")
	//	public ModelAndView getEmpData()
	//	{
	//		Employee emp=new Employee();
	//		emp.setEmpid(101);
	//		emp.setEmpname("Jorden");
	//		emp.setSalary(90000);
	//		return new ModelAndView("EmpData","edata",emp);
	//
	//	}
}
