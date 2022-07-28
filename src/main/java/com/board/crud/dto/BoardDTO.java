package com.board.crud.dto;

//create table BOARD(
//	    bno number not null,
//	    title varchar2(200) not null,
//	    content varchar2(4000),
//	    writer varchar2(50) not null,
//	    regdate date default sysdate,
//	    viewcnt number default 0,
//	    primary key(bno)
//	);

public class BoardDTO {
	
	private int seq;
	private String subject;
	private String content;
	private String name;
	private String reg_date;
	private int readCount;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	
	@Override
	public String toString() {
		return "BoardDTO [seq=" + seq + ", subject=" + subject + ", content=" + content + ", name=" + name
				+ ", reg_date=" + reg_date + ", readCount=" + readCount + "]";
	}
	
}
