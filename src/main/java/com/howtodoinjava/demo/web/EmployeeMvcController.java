package com.howtodoinjava.demo.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.EmployeeEntity;
import com.howtodoinjava.demo.service.EmployeeService;

@Controller
@RequestMapping("/")
public class EmployeeMvcController 
{
	@Autowired
	EmployeeService service;

	@RequestMapping
	public String getAllEmployeees(Model model) 
	{
		//List<EmployeeEntity> list = service.getAllEmployees();

		//model.addAttribute("employees", list);
		return "login";
	}
	
	
	@RequestMapping(path = {"/login"})
	public String getAllEmployees(Model model) 
	{
		List<EmployeeEntity> list = service.getAllEmployees();

		model.addAttribute("employees", list);
		return "list-employees";
	}
	
	@RequestMapping(path = {"/report"})
	public String getReport(Model model) 
	
	{
		System.out.println("/report");
		List<EmployeeEntity> list = service.getAllEmployees();

		model.addAttribute("employees", list);
		return "report";
	}
	
	
	@RequestMapping(path = {"/register"})
	public String cool(Model model)
{
		List<EmployeeEntity> list = service.getAllEmployees();

		model.addAttribute("employee", new EmployeeEntity());

		return "add-edit-employee";
	}
	
	

	@RequestMapping(path = {"/edit", "/edit/{id}"})
	public String editEmployeeById(Model model, @PathVariable("id") Optional<Long> employeeNumber) 
							throws RecordNotFoundException 
	{
		if (employeeNumber.isPresent()) {
			EmployeeEntity entity = service.getEmployeeById(employeeNumber.get());
			model.addAttribute("employee", entity);
		} else {
			model.addAttribute("employee", new EmployeeEntity());
		}
		return "add-edit-employee";
	}
	
	@RequestMapping(path = "/delete/{id}")
	public String deleteEmployeeById(Model model,@PathVariable("id") Long id) 
							throws RecordNotFoundException 
	{
		service.deleteEmployeeById(id);
		List<EmployeeEntity> list = service.getAllEmployees();

		model.addAttribute("employees", list);
		return "list-employees";
	}

	@RequestMapping(path = "/createEmployee", method = RequestMethod.POST)
	public ModelAndView createOrUpdateEmployee(Model model,@Valid EmployeeEntity employee, BindingResult bindingResult) 
	
	{
		ModelAndView modelAndView = new ModelAndView();
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("employee", employee);
			modelAndView.setViewName("add-edit-employee");
			
		}
		else {
			service.createOrUpdateEmployee(employee);
			modelAndView.setViewName("redirect:/");
		}
		
		
		return modelAndView;
	}
}
