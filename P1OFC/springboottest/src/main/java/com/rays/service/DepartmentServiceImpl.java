package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DepartmentDAOInt;
import com.rays.dto.DepartmentDTO;

@Service
@Transactional
public class DepartmentServiceImpl extends BaseServiceImpl<DepartmentDTO, DepartmentDAOInt> implements DepartmentServiceInt {
    
}
