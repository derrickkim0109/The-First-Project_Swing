package com.javalec.post;

public class BeanPost {
	String title;
	String writer;
	String text;
	String menu;
	String cooktime;
	String commentUserid;
	String comment;
	String commentdate;
	String commentno;
	
	

	

	public BeanPost(String commentUserid, String comment, String commentdate, String commentno) {
		super();
		this.commentUserid = commentUserid;
		this.comment = comment;
		this.commentdate = commentdate;
		this.commentno = commentno;
	}





	public String getCommentUserid() {
		return commentUserid;
	}





	public void setCommentUserid(String commentUserid) {
		this.commentUserid = commentUserid;
	}





	public String getComment() {
		return comment;
	}





	public void setComment(String comment) {
		this.comment = comment;
	}





	public String getCommentdate() {
		return commentdate;
	}





	public void setCommentdate(String commentdate) {
		this.commentdate = commentdate;
	}





	public String getCommentno() {
		return commentno;
	}





	public void setCommentno(String commentno) {
		this.commentno = commentno;
	}





	public BeanPost(String title, String writer, String text, String menu, String cooktime) {
		super();
		this.title = title;
		this.writer = writer;
		this.text = text;
		this.menu = menu;
		this.cooktime = cooktime;
	}





	public String getCooktime() {
		return cooktime;
	}





	public void setCooktime(String cooktime) {
		this.cooktime = cooktime;
	}





	public String getMenu() {
		return menu;
	}





	public void setMenu(String menu) {
		this.menu = menu;
	}










	public String getWriter() {
		return writer;
	}





	public void setWriter(String writer) {
		this.writer = writer;
	}





	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	

}
