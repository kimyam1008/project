package com.jmt.mypage.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.multipart.MultipartFile;

import com.jmt.member.dto.MemberDTO;
import com.jmt.member.dto.photoDTO;
import com.jmt.mypage.dto.MypageDTO;

public interface MypageDAO {

	MemberDTO mypage(String loginId);

	int blindCount(String loginId);

	int follower(String loginId);

	int following(String loginId);

	int profile_no(String loginId);

	photoDTO photoList(int profile_no);

	ArrayList<MemberDTO> foodList();

	String oriPass(HashMap<String, String> params);

	int passUpdate(HashMap<String, String> params);

	int profile_num(MemberDTO dto);

	int profileUpdate(MemberDTO dto);

	int memberUpdate(MemberDTO dto);

	int photoDel(int profile_no);

	void fileWrite(String oriFileName, String newFileName, int profile_no);

	int memberDrop(String loginId);

	String pwCon(String loginId);

	ArrayList<String> followingList(String loginId);

	ArrayList<String> followerList(String loginId);

	MemberDTO otherPage(int profile_no);

	photoDTO otherPhoto(int profile_no);

	int otherBlind(int profile_no);

	int otherFollower(int profile_no);

	int otherFollowing(int profile_no);

	int follow(HashMap<String, Object> params);

	String followCon(String loginId, int profile_no);

	int followRegist(String loginId, String member_id);

	int unfollow(String loginId, String member_id);

	ArrayList<String> otherFollowingList(int profile_no);

	ArrayList<String> otherFollowerList(int profile_no);

	ArrayList<MypageDTO> myboard(String loginId);

	ArrayList<MypageDTO> mycomment(String loginId);

	ArrayList<MypageDTO> myLightning(String loginId);

	ArrayList<MypageDTO> myDojang(String loginId);

	ArrayList<MypageDTO> myLightningRoom(String loginId);

	ArrayList<MypageDTO> myDojangRoom(String loginId);



	


}
