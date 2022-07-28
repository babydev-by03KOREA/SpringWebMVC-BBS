package com.board.crud.dao;

import java.util.List;

import com.board.crud.dto.BoardDTO;

public interface IBoardDAO {
//	list method에 해당하는 예외처리
	public List list() throws Exception;
	public Integer getMaxSeq();
	public int regi(BoardDTO dto);
}
