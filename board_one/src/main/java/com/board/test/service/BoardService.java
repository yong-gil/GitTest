package com.board.test.service;

import java.util.List;
import java.util.Map;

import com.test.dto.BoardDto;

public interface BoardService{

	List<Map<String, Object>> list(Map<String, Object> map);

	int insert(String writer,String title,String content);

	List<BoardDto> listOne(int boardNum);
}
