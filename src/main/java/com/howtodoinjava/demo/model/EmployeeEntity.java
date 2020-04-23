package com.howtodoinjava.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="TBL_EMPLOYEES")
public class EmployeeEntity {

	@Id
    private long employeeNumber;
	
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
   //@Column 
   //private Long id;
    
    @Column
    @NotEmpty(message="Please provide the your name")
    private String employeeName;
    
    
    @Column
    private String projectCode;
    
    @Column
    private String sowRole;
    
    @Column
    private String offShoreCodName;
    
    @Column
    private String info;
    
    @Column
    private String infyJoiningDate;
    
    @Column
    private String appleAccountCreationDate;
    
    @Column
    private String apsJoiningDate;
    
    @Column
    private String priorEx;
    
    @Column
    private String infyEx;
    
    @Column
    private String totalEx;
    
    @Column
    private String priorApsExperience;
    
    @Column
    private String apsEx;
    
    @Column
    private String priorAppleExperience;
    
    @Column
    private String totalAppleExperience;
    
    @Column
    private String teBucket;
    
    @Column
    private String apsBucket;
    
    @Column
    private String appleBucket;
    
    @Column
    private String location;
    
    @Column
    private String po;
    
    @Column
    private String poDescription;
    
    @Column
    private String nameInInfosysDirectory;
    
    @Column
    private String appleEmailId;
    
    @Column
    private String dsId;
    
    @Column
    private String interviewClearedDate;
    
    @Column
    private String infosyEmailId;
    
    @Column
    private String presentState;
    
    @Column
    private String lwd;
    
    @Column
    private String appleManager;
    
    @Column
    private String infyManager;

	

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(long employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getSowRole() {
		return sowRole;
	}

	public void setSowRole(String sowRole) {
		this.sowRole = sowRole;
	}

	public String getOffShoreCodName() {
		return offShoreCodName;
	}

	public void setOffShoreCodName(String offShoreCodName) {
		this.offShoreCodName = offShoreCodName;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfyJoiningDate() {
		return infyJoiningDate;
	}

	public void setInfyJoiningDate(String infyJoiningDate) {
		this.infyJoiningDate = infyJoiningDate;
	}

	public String getAppleAccountCreationDate() {
		return appleAccountCreationDate;
	}

	public void setAppleAccountCreationDate(String appleAccountCreationDate) {
		this.appleAccountCreationDate = appleAccountCreationDate;
	}

	public String getApsJoiningDate() {
		return apsJoiningDate;
	}

	public void setApsJoiningDate(String apsJoiningDate) {
		this.apsJoiningDate = apsJoiningDate;
	}

	public String getPriorEx() {
		return priorEx;
	}

	public void setPriorEx(String priorEx) {
		this.priorEx = priorEx;
	}

	public String getInfyEx() {
		return infyEx;
	}

	public void setInfyEx(String infyEx) {
		this.infyEx = infyEx;
	}

	public String getTotalEx() {
		return totalEx;
	}

	public void setTotalEx(String totalEx) {
		this.totalEx = totalEx;
	}

	public String getPriorApsExperience() {
		return priorApsExperience;
	}

	public void setPriorApsExperience(String priorApsExperience) {
		this.priorApsExperience = priorApsExperience;
	}

	public String getPriorAppleExperience() {
		return priorAppleExperience;
	}

	public void setPriorAppleExperience(String priorAppleExperience) {
		this.priorAppleExperience = priorAppleExperience;
	}

	public String getTotalAppleExperience() {
		return totalAppleExperience;
	}

	public void setTotalAppleExperience(String totalAppleExperience) {
		this.totalAppleExperience = totalAppleExperience;
	}

	public String getTeBucket() {
		return teBucket;
	}

	public void setTeBucket(String teBucket) {
		this.teBucket = teBucket;
	}

	public String getApsBucket() {
		return apsBucket;
	}

	public void setApsBucket(String apsBucket) {
		this.apsBucket = apsBucket;
	}

	public String getAppleBucket() {
		return appleBucket;
	}

	public void setAppleBucket(String appleBucket) {
		this.appleBucket = appleBucket;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public String getPoDescription() {
		return poDescription;
	}

	public void setPoDescription(String poDescription) {
		this.poDescription = poDescription;
	}

	public String getNameInInfosysDirectory() {
		return nameInInfosysDirectory;
	}

	public void setNameInInfosysDirectory(String nameInInfosysDirectory) {
		this.nameInInfosysDirectory = nameInInfosysDirectory;
	}

	public String getAppleEmailId() {
		return appleEmailId;
	}

	public void setAppleEmailId(String appleEmailId) {
		this.appleEmailId = appleEmailId;
	}

	public String getDsId() {
		return dsId;
	}

	public void setDsId(String dsId) {
		this.dsId = dsId;
	}

	public String getInterviewClearedDate() {
		return interviewClearedDate;
	}

	public void setInterviewClearedDate(String interviewClearedDate) {
		this.interviewClearedDate = interviewClearedDate;
	}

	public String getInfosyEmailId() {
		return infosyEmailId;
	}

	public void setInfosyEmailId(String infosyEmailId) {
		this.infosyEmailId = infosyEmailId;
	}

	public String getPresentState() {
		return presentState;
	}

	public void setPresentState(String presentState) {
		this.presentState = presentState;
	}

	public String getLwd() {
		return lwd;
	}

	public void setLwd(String lwd) {
		this.lwd = lwd;
	}

	public String getApsEx() {
		return apsEx;
	}

	public void setApsEx(String apsEx) {
		this.apsEx = apsEx;
	}

	public String getAppleManager() {
		return appleManager;
	}

	public void setAppleManager(String appleManager) {
		this.appleManager = appleManager;
	}

	public String getInfyManager() {
		return infyManager;
	}

	public void setInfyManager(String infyManager) {
		this.infyManager = infyManager;
	}

}