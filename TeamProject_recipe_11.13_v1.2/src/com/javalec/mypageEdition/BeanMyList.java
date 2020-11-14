package com.javalec.mypageEdition;

public class BeanMyList {
	
	//field
	String userid;
	String ConditionQueryColumn;
	int sqeno;
	String like;
	int postno;
	String postinsertdate;
	String title;
	String text;
	String menu;
	String cooktime;
	
	//constructor
	public BeanMyList() {
		// TODO Auto-generated constructor stub
	}

	public BeanMyList(int sqeno) {
		super();
		this.sqeno = sqeno;
	}

	public int getSqeno() {
		return sqeno;
	}
	


	
	public BeanMyList(int postno, String title, String postinsertdate) {
		super();
		this.postno = postno;
		this.postinsertdate = postinsertdate;
		this.title = title;
	}

	
	public String getConditionQueryColumn() {
		return ConditionQueryColumn;
	}

	public void setConditionQueryColumn(String conditionQueryColumn) {
		ConditionQueryColumn = conditionQueryColumn;
	}

	public String getPostinsertdate() {
		return postinsertdate;
	}

	public void setPostinsertdate(String postinsertdate) {
		this.postinsertdate = postinsertdate;
	}

	public void setSqeno(int sqeno) {
		this.sqeno = sqeno;
	}

	public BeanMyList(String conditionQueryColumn) {
		super();
		ConditionQueryColumn = conditionQueryColumn;
	}


	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	

	

	public BeanMyList( int postno, String title, String postinsertdate,String like) {
		super();
		this.like = like;
		this.postno = postno;
		this.postinsertdate = postinsertdate;
		this.title = title;
	}

	public int getPostno() {
		return postno;
	}

	public void setPostno(int postno) {
		this.postno = postno;
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

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getCooktime() {
		return cooktime;
	}

	public void setCooktime(String cooktime) {
		this.cooktime = cooktime;
	}
	
	
	
	
	
}
