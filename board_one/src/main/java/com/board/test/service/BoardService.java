package com.board.test.service;

import java.util.List;
import java.util.Map;

import com.board.test.dto.BoardDto;

public interface BoardService{
	
	List<Map<String, Object>> list(Map<String, Object> map,int page);

	int insert(String writer,String title,String content);

	BoardDto listOne(int boardNum);
	
	int listCount();

	List<BoardDto> listAll(int page);

	List<BoardDto> searchKeyword(String keyword);
}
