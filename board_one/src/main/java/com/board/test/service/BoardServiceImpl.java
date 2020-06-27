package com.board.test.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.board.test.dao.BoardDao;
import com.board.test.dto.BoardDto;

@Service("service")
public class BoardServiceImpl implements BoardService{

	@Resource(name = "dao")
	private BoardDao boardDao;
	
	@Override
	public List<Map<String, Object>> list(Map<String, Object> map) {
		return boardDao.list(map);
	}

	@Override
	public int insert(String writer, String title, String content) {
		return boardDao.insert(writer, title, content);
	}

	@Override
	public BoardDto listOne(int boardNum){
		return boardDao.listOne(boardNum);
	}

}
