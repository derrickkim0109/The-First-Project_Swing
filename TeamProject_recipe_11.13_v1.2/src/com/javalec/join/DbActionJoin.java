package com.javalec.join;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.javalec.base.ShareVar;




public class DbActionJoin {

	// Field 
	// SQL문장 넣어줄 클래스
	// 꼭 들어가야 할 3줄을 사용하기 위해
	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	
	
//	int userno;
	String userid;
	String userpw;
	String username;
	String useremail;
	
	
	// constructor
	public DbActionJoin() {
		
	}

	public DbActionJoin(String userid) {
		super();
		this.userid = userid;
	}
	
	
	
	//name, userid, userpw,useremail
	public DbActionJoin(String username, String userid, String userpw, String useremail) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.useremail = useremail;

	}

	// method
	
	//_Join_아이디 중복 체크
		public int idCheck() {
			
			int duplication = 0;
			
			String A = "select count(*) from userinfo where userid = '"+ userid +"'";
			
			try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
		          Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		          @SuppressWarnings("unused")
					Statement stmt_mysql = conn_mysql.createStatement();
		          
					ResultSet rs = stmt_mysql.executeQuery(A);
					
				    if(rs.next()) {
				    	
				    	int wkId = rs.getInt(1);
				    	duplication=wkId;
				    }
					
				conn_mysql.close();
				
				} catch(Exception e) {
					System.out.println(e);
				} 
			
			return duplication;
			
		}
	
	
	// _Join_DB에 입력해주는 메소드
	public boolean insertAction() {
	      PreparedStatement ps = null;
	      try{
	          Class.forName("com.mysql.cj.jdbc.Driver");
	          Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	          @SuppressWarnings("unused")
			  Statement stmt_mysql = conn_mysql.createStatement();

	          String A = "insert into userinfo (username, userid, userpw, useremail, userstate, userinsertdate)";
	          String B = " values (?, ?, ?, ?,'회원',now())";
	          
	          
	          ps = conn_mysql.prepareStatement(A+B);
	          
	          ps.setString(1, username);
	          ps.setString(2, userid);
	          ps.setString(3, userpw);
	          ps.setString(4, useremail);
	          ps.executeUpdate();

	          conn_mysql.close();
	      } catch (Exception e){
	    	  System.out.println(e);
	          return false;       
	      }
	       return true;
		}
	
	
	
			

	
	
	
	
	
	
}


