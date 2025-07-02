package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OfficeDTO;

public class OfficeForm extends BaseForm {
	@NotEmpty(message = "Please enter Name")
	@Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Only alphabets are allowed")
	private String name;

	@PastOrPresent(message = "DOJ must be today or in the past")
	@NotNull(message = "Please enter DOJ")
	private Date doj;

	@NotEmpty(message = "Please select Dept")
	private String dept;

	@NotNull(message = "Please enter Salary")
	@Min(value = 1000, message = " amount should be more than 1000")
	@Max(value = 99999999, message = " amount should have max 8 digits")
	private Integer salary;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public BaseDTO getDto() {
		OfficeDTO dto = initDTO(new OfficeDTO());
		dto.setName(name);
		dto.setDoj(doj);
		dto.setSalary(salary);
		dto.setDept(dept);
		;
		return dto;
	}
}