package com.test.dto;

public class BoardDto {
	private int boardNum;
	private String writer;
	private String title;
	private String content;
	
	public BoardDto(int boardNum, String writer, String content) {
		super();
		this.boardNum = boardNum;
		this.writer = writer;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
