package com.jmt.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jmt.admin.service.GradeService;



@Controller
public class GradeController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired GradeService service;

}
