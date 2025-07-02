package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "iteminformation")
public class ItemInformationDTO extends BaseDTO {
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "OVERVIEW")
	private String overview;
	
	@Column(name = "PURCHESS_DATE")
	private Date purchessDate;
	
	@Column(name = "COST")
	private Long cost;
	
	@Column(name = "CATAGORY_ID", length = 50)
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

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	@Column(name = "ORG_NAME", length = 50)
	private String orgName;
	
	

	

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
		map.put("title", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("modifiedBy", modifiedBy);
		return map;
	}

	
	

	

	
	

}

	
	
	
	

