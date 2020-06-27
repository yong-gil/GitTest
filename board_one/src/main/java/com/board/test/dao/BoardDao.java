package com.board.test.dao;

import java.util.List;
import java.util.Map;

import com.board.test.dto.BoardDto;

public interface BoardDao {

	List<Map<String, Object>> list(Map<String, Object> map);
	
	int insert(String writer,String title,String content);

	BoardDto listOne(int boardNum);
	
//	[추가할 사항]
//	1. 게시판 검색
//	2. 게시판 페이징처리
//	3. 게시판 조회수
//	4. 그래프 api 사용해보기
//	5. 탭추가메뉴 사용해보기
//	6. 각각의 탭마다 다른 데이터 보여주기


}
