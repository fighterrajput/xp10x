package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DepartmentDTO;

@Repository
public class DepartmentDAOImpl extends BaseDAOImpl<DepartmentDTO> implements DepartmentDAOInt {

    @Override
    protected List<Predicate> getWhereClause(DepartmentDTO dto, CriteriaBuilder builder, Root<DepartmentDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (dto.getId() != null && dto.getId() > 0) {
            whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
        }

        if (dto.getName() != null && !dto.getName().isEmpty()) {
            whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
        }

        if (dto.getDateOfJoining() != null) {
            whereCondition.add(builder.equal(qRoot.get("dateOfJoining"), dto.getDateOfJoining()));
        }

        if (dto.getAmount() != null) {
            whereCondition.add(builder.equal(qRoot.get("amount"), dto.getAmount()));
        }

        if (dto.getDepartmentName() != null && !dto.getDepartmentName().isEmpty()) {
            whereCondition.add(builder.like(qRoot.get("departmentName"), dto.getDepartmentName()));
        }

        if (dto.getLastEmployerName() != null && !dto.getLastEmployerName().isEmpty()) {
            whereCondition.add(builder.like(qRoot.get("lastEmployerName"), dto.getLastEmployerName()));
        }

        return whereCondition;
    }

    @Override
    public Class<DepartmentDTO> getDTOClass() {
        return DepartmentDTO.class;
    }
}
