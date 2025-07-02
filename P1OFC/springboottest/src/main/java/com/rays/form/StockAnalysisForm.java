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
import com.rays.dto.AssetDTO;
import com.rays.dto.StockAnalysisDTO;

public class StockAnalysisForm extends BaseForm {

    @NotEmpty(message = "Please enter the stock symbol")
    private String stockSymbol;

  //  @PastOrPresent(message = "Start date must be today or in the past")
    @NotNull(message = "Please enter start date")
    private Date startDate;
    
    @NotNull(message = "Please enter end date")
    private Date endDate;

  
    @NotEmpty(message = "Please select Analysis Type")
    private String analysisType;

    
    public String getStockSymbol() {
		return stockSymbol;
	}


	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getAnalysisType() {
		return analysisType;
	}


	public void setAnalysisType(String analysisType) {
		this.analysisType = analysisType;
	}


	@Override
    public BaseDTO getDto() {
        StockAnalysisDTO dto = initDTO(new StockAnalysisDTO());
        dto.setAnalysisType(analysisType);
        dto.setStartDate(startDate);
        dto.setEndDate(endDate);
        dto.setStockSymbol(stockSymbol);
        return dto;
    }
}
