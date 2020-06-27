package com.board.test.dto;

public class BoardDto {
	private int boardNum;
	private String writer;
	private String title;
	private String content;
	
	
	public BoardDto() {}	
	public BoardDto(String writer, String title, String content) {
		super();
		this.writer = writer;
		this.title = title;
		this.content = content;
	}
	public BoardDto(int boardNum, String writer, String title, String content) {
		super();
		this.boardNum = boardNum;
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "BoardDto [boardNum=" + boardNum + ", writer=" + writer + ", title=" + title + ", content=" + content
				+ "]";
	}


	public int getBoardNum() {
		return boardNum;
	}
	
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
