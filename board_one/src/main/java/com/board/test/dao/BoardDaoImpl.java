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
	public List<Map<String, Object>> list(Map<String, Object> map){
		return sqlSession.selectList("mapper.list", map);
	}

	@Override
	public int insert(String writer, String title, String content) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("writer", writer);
		param.put("title", title);
		param.put("content", content);
		
		return sqlSession.insert("insert",param);
	}

	@Override
	public BoardDto listOne(int boardNum){
		return sqlSession.selectOne("mapper.listOne", boardNum);
	}

	
	

}
