package com.board.test.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.test.dto.BoardDto;

@Repository("dao")
public class BoardDaoImpl implements BoardDao{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public List<Map<String, Object>> list(Map<String, Object> map,int size,int offset){
		return sqlSession.selectList("mapper.list", map);
	}

	@Override
	public int insert(String writer, String title, String content) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("writer", writer);
		param.put("title", title);
		param.put("content", content);
		
		return sqlSession.insert("mapper.insert",param);
	}

	@Override
	public BoardDto listOne(int boardNum){
		System.out.println(sqlSession.selectOne("mapper.listOne", boardNum));
		return sqlSession.selectOne("mapper.listOne", boardNum);
	}

	@Override
	public int listCount() {
		return sqlSession.selectOne("mapper.listCount");
	}

	@Override
	public List<BoardDto> selectAll(int size,int offset) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("size", size);
		map.put("offset", offset);
		return sqlSession.selectList("mapper.listAll",map);
	}

	@Override
	public List<BoardDto> searchKeyword(String keyword) {
		System.out.println("dao"+keyword);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		return sqlSession.selectList("mapper.search",map);
	}

	
	

}
