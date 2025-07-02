package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ClientDAOImpl;
import com.rays.dto.ClientDTO;

@Service
@Transactional
public class ClientServiceImpl extends BaseServiceImpl<ClientDTO, ClientDAOImpl> implements ClientServiceInt {

}