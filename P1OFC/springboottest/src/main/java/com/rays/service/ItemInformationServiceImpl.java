package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ItemInformationDAOInt;
import com.rays.dto.ItemInformationDTO;

@Service
@Transactional
public class ItemInformationServiceImpl extends BaseServiceImpl<ItemInformationDTO, ItemInformationDAOInt>implements ItemInformationServiceInt {

	
	@Autowired
	ItemInformationDAOInt ItemInformationDAO;
}
