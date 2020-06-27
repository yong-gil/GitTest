package com.board.test.dao;

import java.util.List;
import java.util.Map;

import com.board.test.dto.BoardDto;

public interface BoardDao {

	List<Map<String, Object>> list(Map<String, Object> map);
	
	int insert(String writer,String title,String content);

	BoardDto listOne(int boardNum);
	
//	[�߰��� ����]
//	1. �Խ��� �˻�
//	2. �Խ��� ����¡ó��
//	3. �Խ��� ��ȸ��
//	4. �׷��� api ����غ���
//	5. ���߰��޴� ����غ���
//	6. ������ �Ǹ��� �ٸ� ������ �����ֱ�


}
