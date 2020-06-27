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
	public List<Map<String, Object>> list(Map<String, Object> map,int page) {
		int size=10;
		int offset=(page-1)*size;
		return boardDao.list(map,size,offset);
	}

	@Override
	public int insert(String writer, String title, String content) {
		return boardDao.insert(writer, title, content);
	}

	@Override
	public BoardDto listOne(int boardNum){
		return boardDao.listOne(boardNum);
	}

	@Override
	public int listCount() {
		int all  = boardDao.listCount();
		int size = 10;
		int page = (boardDao.listCount() % size == 0)? 0 : 1;
		int maxPage = (all/size)+page;
		return maxPage;
	}

	@Override
	public List<BoardDto> listAll(int page) {
		int size = 10;
		int offset = (page-1)*size;
		return boardDao.selectAll(size,offset);
	}

}
