package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.StockAnalysisDTO;

@Repository
public class StockAnalysisDAOImpl extends BaseDAOImpl<StockAnalysisDTO> implements StockAnalysisDAOInt {

    @Override
    protected List<Predicate> getWhereClause(StockAnalysisDTO dto, CriteriaBuilder builder, Root<StockAnalysisDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (dto.getId() != null && dto.getId() > 0) {
            whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
        }

        if (dto.getStockSymbol() != null && !dto.getStockSymbol().isEmpty()) {
            whereCondition.add(builder.like(qRoot.get("stockSymbol"), dto.getStockSymbol() + "%"));
        }
        
        
        if (dto.getAnalysisType() != null && !dto.getAnalysisType().isEmpty()) {
            whereCondition.add(builder.like(qRoot.get("analysisType"), dto.getAnalysisType() + "%"));
        }
        
        if (dto.getEndDate() != null) {
            whereCondition.add(builder.equal(qRoot.get("endDate"), dto.getEndDate()));
        }
        
        if (dto.getStartDate() != null) {
            whereCondition.add(builder.equal(qRoot.get("startDate"), dto.getStartDate()));
        }

        

        return whereCondition;
    }

    @Override
    public Class<StockAnalysisDTO> getDTOClass() {
        return StockAnalysisDTO.class;
    }
}
