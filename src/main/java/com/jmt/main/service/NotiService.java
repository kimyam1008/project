package com.jmt.main.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmt.main.dao.NotiDAO;

@Service
public class NotiService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired NotiDAO dao;



}
