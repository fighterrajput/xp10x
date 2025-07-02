package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.OfficeDAOImpl;
import com.rays.dto.OfficeDTO;

@Service
@Transactional
public class OfficeServiceImpl extends BaseServiceImpl<OfficeDTO, OfficeDAOImpl> implements OfficeServiceInt {

}