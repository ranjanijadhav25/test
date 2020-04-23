package com.howtodoinjava.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.EmployeeEntity;
import com.howtodoinjava.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	public List<EmployeeEntity> getAllEmployees()
	{
		List<EmployeeEntity> result = (List<EmployeeEntity>) repository.findAll();
		
		if(result.size() > 0) {
			return result;
		} else {
			return new ArrayList<EmployeeEntity>();
		}
	}
	
	public EmployeeEntity getEmployeeById(Long employeeNumber) throws RecordNotFoundException 
	{
		Optional<EmployeeEntity> employee = repository.findById(employeeNumber);
		
		if(employee.isPresent()) {
			return employee.get();
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}
	
	
	public EmployeeEntity createOrUpdateEmployee(EmployeeEntity entity) 
	{
		if(entity.getEmployeeNumber()  == 0) 
		{
			entity = repository.save(entity);
			
			return entity;
		} 
		else 
		{
			Optional<EmployeeEntity> employee = repository.findById(entity.getEmployeeNumber());
			
			//System.out.println(employee.get().getEmployeeNumber());
			
			if(employee.isPresent()) 
			{
				EmployeeEntity newEntity = employee.get();
				newEntity.setEmployeeName(entity.getEmployeeName());
				newEntity.setEmployeeNumber(entity.getEmployeeNumber());
				newEntity.setProjectCode(entity.getProjectCode());
				newEntity.setAppleManager(entity.getAppleManager());
				newEntity.setInfyManager(entity.getInfyManager());
				newEntity.setSowRole(entity.getSowRole());
				newEntity.setOffShoreCodName(entity.getOffShoreCodName());
				newEntity.setInfo(entity.getInfo());
				newEntity.setInfyJoiningDate(entity.getInfyJoiningDate());
				newEntity.setAppleAccountCreationDate(entity.getAppleAccountCreationDate());
				newEntity.setApsJoiningDate(entity.getApsJoiningDate());
				newEntity.setPriorEx(entity.getPriorEx());
				newEntity.setInfyEx(entity.getInfyEx());
				newEntity.setTotalEx(entity.getTotalEx());
				newEntity.setPriorApsExperience(entity.getPriorApsExperience());
				newEntity.setApsEx(entity.getApsEx());
				newEntity.setPriorAppleExperience(entity.getPriorAppleExperience());
				newEntity.setTotalAppleExperience(entity.getTotalAppleExperience());
				newEntity.setTeBucket(entity.getTeBucket());
				newEntity.setApsBucket(entity.getApsBucket());
				newEntity.setAppleBucket(entity.getAppleBucket());
				newEntity.setLocation(entity.getLocation());
				newEntity.setPo(entity.getPo());
				newEntity.setPoDescription(entity.getPoDescription());
				newEntity.setNameInInfosysDirectory(entity.getNameInInfosysDirectory());
				newEntity.setAppleEmailId(entity.getAppleEmailId());
				newEntity.setDsId(entity.getDsId());
				newEntity.setInterviewClearedDate(entity.getInterviewClearedDate());
				newEntity.setInfosyEmailId(entity.getInfosyEmailId());
				newEntity.setPresentState(entity.getPresentState());
				newEntity.setLwd(entity.getLwd());
				
				newEntity = repository.save(newEntity);
				
				return newEntity;
			} else {
				entity = repository.save(entity);
				
				return entity;
			}
		}
	} 
	
	public void deleteEmployeeById(Long id) throws RecordNotFoundException 
	{
		Optional<EmployeeEntity> employee = repository.findById(id);
		
		if(employee.isPresent()) 
		{
			repository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	} 
}