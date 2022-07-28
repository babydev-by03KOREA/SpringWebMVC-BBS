package com.board.crud.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.crud.dto.BoardDTO;

@Repository
public class BoardDAO implements IBoardDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "com.board.mappers.board";
	
	@Override
	public List list() throws Exception {
		
		return sqlSession.selectList(namespace + ".list");
	}

	@Override
	public Integer getMaxSeq() {
		return sqlSession.selectOne(namespace + ".maxSeq");
	}

	@Override
	public int regi(BoardDTO dto) {
		return sqlSession.insert(namespace + ".regi", dto);
	}
	
}
