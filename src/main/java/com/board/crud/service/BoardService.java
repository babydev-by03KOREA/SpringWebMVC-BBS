package com.board.crud.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.crud.dao.BoardDAO;
import com.board.crud.dto.BoardDTO;

@Service
public class BoardService implements IBoardService{
	// DAO Service를 맘대로 요리하려면? DAO를 주입!
	@Inject
	private BoardDAO bdao;

	@Override
	public List list() throws Exception {
		
		return bdao.list();
	}

	@Override
	public int regi(BoardDTO dto) throws Exception {
		if (bdao.getMaxSeq() == null) {
			dto.setSeq(1);
		} else {
			dto.setSeq(bdao.getMaxSeq() + 1);
		}
		
		return bdao.regi(dto);
	}


}
