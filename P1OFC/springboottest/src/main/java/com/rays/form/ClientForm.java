package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ClientDTO;

public class ClientForm extends BaseForm {

	@NotEmpty(message = "Please enter Full Name")
	@Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Only alphabets are allowed")
	private String fullName;

	@PastOrPresent(message = "appointment date must be today or in the past")
	@NotNull(message = "Please enter appointment date")
	private Date appointmentDate;

	@NotEmpty(message = "Please select Illness")
	private String illness;

	@NotNull(message = "Please enter Phone")
	@Min(value = 999999999, message = " Phone must contain 10 digits")
	private Long phone;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public BaseDTO getDto() {
		ClientDTO dto = initDTO(new ClientDTO());
		dto.setAppointmentDate(appointmentDate);
		dto.setFullName(fullName);
		dto.setPhone(phone);
		dto.setIllness(illness);
		return dto;
	}
}