package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ItemInformationDTO;

@Repository
public class ItemInformationDAOImpl extends BaseDAOImpl<ItemInformationDTO> implements ItemInformationDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ItemInformationDTO dto, CriteriaBuilder builder,
			Root<ItemInformationDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getTitle())) {

			whereCondition.add(builder.like(qRoot.get("title"), dto.getTitle()+ "%"));
		}
		
		if (!isEmptyString(dto.getOverview())) {

			whereCondition.add(builder.like(qRoot.get("overview"), dto.getOverview()+ "%"));
		}
		
		if (isNotNull(dto.getPurchessDate())) {

			whereCondition.add(builder.equal(qRoot.get("purchessDate"), dto.getPurchessDate()));
		}

		if (!isZeroNumber(dto.getCost())) {

			whereCondition.add(builder.equal(qRoot.get("cost"), dto.getCost()));
		}
			if (!isZeroNumber(dto.getCatagoryId())) {

				whereCondition.add(builder.equal(qRoot.get("catagoryId"), dto.getCatagoryId()));
			}
			
		return whereCondition;
		}
	
	@Override
	public Class<ItemInformationDTO> getDTOClass() {
		return ItemInformationDTO.class;
	}

}

