package com.jmt.moim.dao;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import com.jmt.moim.dto.DojangDTO;

public interface DojangDAO {

	int allCount(HashMap<String, Object> searchResult);

	ArrayList<DojangDTO> foodname();

	ArrayList<DojangDTO> dojangList(HashMap<String, Object> searchResult);

	DojangDTO dojangDetail(String dojang_no);

	ArrayList<DojangDTO> dojangGreview(String dojang_no);

	int dojangApply(String dojang_no, String loginId);

	DojangDTO applyStatus(String loginId, String dojang_no);

	int dojangReg(HashMap<String, String> params);

	DojangDTO profileStatus(String loginId);

	int dojangReport(HashMap<String, String> params);

	String reported(String dojang_no);

	ArrayList<DojangDTO> dojangHome(HashMap<String, Object> post);

	ArrayList<DojangDTO> dojangHomeMember(String dojang_no);

	ArrayList<DojangDTO> dojangHomeL(HashMap<String, Object> post);

	ArrayList<DojangDTO> dojangHomeM(HashMap<String, Object> post);

	DojangDTO dojangHomeDetail(String dojangPost_no);

	int allCountHome(HashMap<String, String> params);

	int allCountHomeL(HashMap<String, String> params);

	int allCountHomeM(HashMap<String, String> params);

	int dojangPostReg(DojangDTO dto);

	void filewrite(String newFileName, String string, int dojangPost_no);






}
