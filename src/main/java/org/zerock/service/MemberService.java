package org.zerock.service;

import org.zerock.domain.MemberVO;

public interface MemberService {
	//회원가입  create
	public void insert(MemberVO mvo);
	//로그인하기 위한 member select
	public MemberVO login(MemberVO mvo);
	
}
