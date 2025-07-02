package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ItemInformationDTO;

public class ItemInformationForm extends BaseForm {

	@Size(max = 20, message = "enter 20 charactor only")

	@NotEmpty(message = "title is required")
	private String title;

	@NotEmpty(message = "overview is required")
	private String overview;

	@NotNull(message = "purchessDate is required")
	private Date purchessDate;

	@NotNull(message = "cost is required")
	private Long cost;

	@NotNull(message = "catagoryId is required")
	private Long catagoryId;

	private String catagory;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public Date getPurchessDate() {
		return purchessDate;
	}

	public void setPurchessDate(Date purchessDate) {
		this.purchessDate = purchessDate;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Long getCatagoryId() {
		return catagoryId;
	}

	public void setCatagoryId(Long catagoryId) {
		this.catagoryId = catagoryId;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	@Override
	public BaseDTO getDto() {
		ItemInformationDTO dto = initDTO(new ItemInformationDTO());
		dto.setTitle(title);
		dto.setOverview(overview);
		dto.setPurchessDate(purchessDate);
		dto.setCost(cost);
		dto.setCatagory(catagory);
		dto.setCatagoryId(catagoryId);
		return dto;
	}

}
