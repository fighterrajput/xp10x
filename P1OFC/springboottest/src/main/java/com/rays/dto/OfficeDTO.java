package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name = "st_office")
public class OfficeDTO extends BaseDTO  {

	@Column(name = "DEPT" , length=20)
	private String dept;

	@Column(name = "Name" , length=50)
	private String name ;

	@Column(name = "DOJ")
	private Date doj;

	@Column(name = "SALARY" , length=8)
	private Integer salary ;
	
	@Column(name = "ORG_NAME", length = 50)
	private String orgName;
	


	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getKey() {
		return id + "";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "orgName";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "orgName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return "orgName";
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "orgName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("name", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("modifiedBy", modifiedBy);
		return map;
	}

	
	

	
	

}

	
	
	
	