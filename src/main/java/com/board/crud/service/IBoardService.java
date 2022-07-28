package com.board.crud.service;

import java.util.List;

import com.board.crud.dto.BoardDTO;

public interface IBoardService {
//	DAO의 쿼리를 요리하기 위해 Service를 생성!
	public List list() throws Exception;
	public int regi(BoardDTO dto) throws Exception;
}
