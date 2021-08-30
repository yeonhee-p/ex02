package org.zerock.mapper;

import org.zerock.domain.MemberVO;

public interface MemberMapper {
	public void insert(MemberVO mvo);
	//로그인
	public MemberVO login(MemberVO mvo);
	
}
