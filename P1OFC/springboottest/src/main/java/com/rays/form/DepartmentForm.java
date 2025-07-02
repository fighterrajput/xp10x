package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DepartmentDTO;

public class DepartmentForm extends BaseForm {

    @NotEmpty(message = "Please enter your name")
    @Pattern(regexp = "^[A-Z][a-zA-Z]{0,19}$", message = "Invalid name")
    private String name;
    
    @NotEmpty(message = "Please enter lastEmployerName")
    @Pattern(regexp = "^[A-Z][a-zA-Z]{0,19}$", message = "Invalid lastEmployerName")
    private String lastEmployerName;
  
    @NotEmpty(message = "Please select departmentName")
    private String departmentName;
    
    @PastOrPresent(message = "dateOfJoining must be today or in the past")
    @NotNull(message = "Please enter dateOfJoining")
    private Date dateOfJoining;

    @NotNull(message = "Please enter amount")
    @Min(value = 1, message = "amount should be more than 1")
    @Max(value = 999999, message = "amount should have only 6 digits")
    private Integer amount;

  

   
    public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getLastEmployerName() {
		return lastEmployerName;
	}




	public void setLastEmployerName(String lastEmployerName) {
		this.lastEmployerName = lastEmployerName;
	}




	public String getDepartmentName() {
		return departmentName;
	}




	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}




	public Date getDateOfJoining() {
		return dateOfJoining;
	}




	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}







	public Integer getAmount() {
		return amount;
	}




	public void setAmount(Integer amount) {
		this.amount = amount;
	}




	@Override
    public BaseDTO getDto() {
        DepartmentDTO dto = initDTO(new DepartmentDTO());
        dto.setName(name);
        dto.setAmount(amount);
        dto.setDepartmentName(departmentName);
        dto.setLastEmployerName(lastEmployerName);
        dto.setDateOfJoining(dateOfJoining);
        return dto;
    }
}
