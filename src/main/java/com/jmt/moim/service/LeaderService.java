package com.jmt.moim.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmt.moim.dao.LeaderDAO;

@Service
public class LeaderService {
	
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired  LeaderDAO dao;

}
