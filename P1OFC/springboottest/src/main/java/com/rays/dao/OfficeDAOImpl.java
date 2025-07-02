package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.OfficeDTO;

@Repository
public class OfficeDAOImpl extends BaseDAOImpl<OfficeDTO> implements OfficeDAOInt {

	@Override
	protected List<Predicate> getWhereClause(OfficeDTO dto, CriteriaBuilder builder, Root<OfficeDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (dto.getId() != null && dto.getId() > 0) {
			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		if (dto.getName() != null && !dto.getName().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		if (dto.getDept() != null && !dto.getDept().isEmpty()) {
			whereCondition.add(builder.like(qRoot.get("dept"), dto.getDept() + "%"));
		}

		if (dto.getDoj() != null) {
			whereCondition.add(builder.equal(qRoot.get("doj"), dto.getDoj()));
		}

		if (dto.getSalary() != null) {
			whereCondition.add(builder.equal(qRoot.get("salary"), dto.getSalary()));
		}

		return whereCondition;
	}

	@Override
	public Class<OfficeDTO> getDTOClass() {
		return OfficeDTO.class;
	}
}