package springhelloworldjavaconfig.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springhelloworldjavaconfig.model.Employee;
import springhelloworldjavaconfig.service.EmployeeService;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
	@RequestMapping(value="/addEmployee", method=RequestMethod.GET)
	public ModelAndView addEmployee(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("role") String role) {
	
		ModelAndView mv = new ModelAndView();
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setRole(role);
		employeeService.save(emp);
		
		mv.setViewName("empstatus");
		
		mv.addObject("msg","Employee Added Successfully");
		return mv;
		
	}
	
	@RequestMapping(value="/updateEmployee", method=RequestMethod.GET)
	public ModelAndView updateEmployee(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("role") String role) {
	
		ModelAndView mv = new ModelAndView();
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setRole(role);
		employeeService.update(emp);
		
		mv.setViewName("empstatus");
		
		mv.addObject("msg","Employee Updated Successfully");
		return mv;
		
	}
	
	@RequestMapping(value="/deleteEmployeeById", method=RequestMethod.GET)
	public ModelAndView deleteEmployeeById(@RequestParam("id") Integer id ) {
	
		ModelAndView mv = new ModelAndView();
		Employee emp = new Employee();
		emp.setId(id);
		employeeService.deleteById(id);
		
		mv.setViewName("empstatus");
		
		mv.addObject("msg","Employee Deleted By Id Successfully");
		return mv;
		
	}
	
	@RequestMapping(value="/getEmployeeById", method=RequestMethod.GET)
	public ModelAndView getEmployeeById(@RequestParam("id") Integer id) {
	
		ModelAndView mv = new ModelAndView();
		Employee emp = new Employee();
		emp = employeeService.getById(id);
		
		//List<Employee> empList = new ArrayList<Employee>();
		mv.setViewName("allemployees");
		
		mv.addObject("empList",emp);
		return mv;
		
	}
	@RequestMapping(value="/getEmployees", method=RequestMethod.GET)
	public ModelAndView getEmployees() {
	
		ModelAndView mv = new ModelAndView();
		List <Employee> empList = new ArrayList<Employee>();
		empList = employeeService.getAll();
		
		//List<Employee> empList = new ArrayList<Employee>();
		mv.setViewName("allemployees");
		
		mv.addObject("empList",empList);
		return mv;
		
	}
	
//	@RequestMapping(value="/getAllEmployees",method=RequestMethod.GET)
//	public ModelAndView getAllEmployees() {
//	
//		Employee emp = new Employee();
//		emp.setId(12);
//		emp.setName("Tinku");
//		emp.setRole("Developer");
//		List<Employee> empList = new ArrayList<Employee>();
//		empList.add(emp);
//		ModelAndView mv = new ModelAndView();
//	    employeeService.getAll();	
//		mv.setViewName("allemployees");
//		
//		mv.addObject("empList",empList);
//		return mv;
//		
	}
		
	

