package com.myspring.protest.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.protest.member.vo.MemberVO;

public interface MemberDAO {
	public List selsctAllMemberList() throws DataAccessException;
	public int insertMember(MemberVO memberVO) throws DataAccessException;	
	public int deleteMember(String id) throws DataAccessException;
	public MemberVO modMember(String id) throws DataAccessException;
	public int updateMember(MemberVO memberVO) throws DataAccessException;	
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
}
