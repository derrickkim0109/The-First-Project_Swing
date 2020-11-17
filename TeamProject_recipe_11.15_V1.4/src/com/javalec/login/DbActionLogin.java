package com.javalec.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.javalec.base.ShareVar;


public class DbActionLogin {

	// ShareVar class의 공통 변수 불러와서 private로 사용
	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;

	
	
	// 내부적으로 사용할 column명 선언
	String userno;
	String userid;
	String userpw;
	String username = ShareVar.nameUser;
	String useremail = ShareVar.email;
	
	// constructor
	public DbActionLogin() {
		
	}
	

	public DbActionLogin(String userid, String userpw) {
		super();
		this.userid = userid;
		this.userpw = userpw;
	}



	public DbActionLogin(String userid, String userpw, String username, String useremail) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.useremail = useremail;
	}

	//----------------------------------------
	//----------------------------------------

	//로그인 시 회원 인지 카운트 하는 곳  1->값넘겨야 로그인됬는지 확인한다. 
	public int loginclickAction(String userid, String userpw ){
		int idCheckret=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // middle ware class 이름 사용 : class를 이걸 쓸꺼다.
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // 사용하는 거 연결
			Statement stmt_mysql = conn_mysql.createStatement(); // mysql 언어로 convert하는 역할
			
			String whereDefault = "select count(*) from userinfo where userpw = '"+userpw+"' and userid = '"+ userid+"'";
			String whereDefault2 = " and userstate = '회원' ";
			
			
			// 검색만 executeQuery를 쓰고 추가, 수정, 삭제는 exectueUpdate 사용한다.
			ResultSet rs = stmt_mysql.executeQuery(whereDefault+whereDefault2);
			
			if(rs.next()) {				
				int idCheck = rs.getInt(1);
				idCheckret = idCheck;
			}
			conn_mysql.close();
			
        } catch (Exception e){
          System.out.println(e);
           
        }
		return idCheckret;
		
	}
	
	//----------------------------------------
	//----------------------------------------
	//Login -> 하면서 RecipeList에 Id,userno,name,Email넘김. 
	public void loginSection(String userid) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // middle ware class 이름 사용 : class를 이걸 쓸꺼다.
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // 사용하는 거 연결
			Statement stmt_mysql = conn_mysql.createStatement(); // mysql 언어로 convert하는 역할
			
			String whereDefault = "select userno, username, useremail, userpw from userinfo where userid = '"+ userid+"'" ;  
			// 검색만 executeQuery를 쓰고 추가, 수정, 삭제는 exectueUpdate 사용한다.
			ResultSet rs = stmt_mysql.executeQuery(whereDefault);
			
			if(rs.next()) {				
				String wkuserno = rs.getString(1);
				String wkusername = rs.getString(2);
				String wkuseremail = rs.getString(3);
				String wkpwUser = rs.getString(4);
				ShareVar.idUser = userid;
				ShareVar.userno = wkuserno;
				ShareVar.nameUser = wkusername;
				ShareVar.email = wkuseremail;
				ShareVar.pwUser = wkpwUser;
				
//				System.out.println(ShareVar.userno);
//				System.out.println(ShareVar.nameUser);
//				System.out.println(ShareVar.email);
//				System.out.println(ShareVar.idUser);
			}
			
			conn_mysql.close();
			
        } catch (Exception e){
          System.out.println(e);
           
        }
	}
	
	
	
	//----------------------------------------
		//ID체크 
		public int idclickAction(String userid) {
			int idCheckret=0;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); // middle ware class 이름 사용 : class를 이걸 쓸꺼다.
				Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // 사용하는 거 연결
				Statement stmt_mysql = conn_mysql.createStatement(); // mysql 언어로 convert하는 역할
				
				String whereDefault = "select count(*) from userinfo where userid = '"+ ShareVar.idUser+"'";
				String whereDefault2 = " and userstate = '회원' ";
				
				
				// 검색만 executeQuery를 쓰고 추가, 수정, 삭제는 exectueUpdate 사용한다.
				ResultSet rs = stmt_mysql.executeQuery(whereDefault+whereDefault2);
				
				if(rs.next()) {				
					int idCheck = rs.getInt(1);
					idCheckret = idCheck;
				}
				conn_mysql.close();
				
	        } catch (Exception e){
	          System.out.println(e);
	           
	        }
			return idCheckret;
		}
		//PW체크 
		public int pwclickAction(String userpw) {
			int pwCheckret=0;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); // middle ware class 이름 사용 : class를 이걸 쓸꺼다.
				Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // 사용하는 거 연결
				Statement stmt_mysql = conn_mysql.createStatement(); // mysql 언어로 convert하는 역할
				
				String whereDefault = "select count(*) from userinfo where userpw = '"+userpw+"'";
				String whereDefault2 = " and userstate = '회원' ";
				
				
				// 검색만 executeQuery를 쓰고 추가, 수정, 삭제는 exectueUpdate 사용한다.
				ResultSet rs = stmt_mysql.executeQuery(whereDefault+whereDefault2);
				
				if(rs.next()) {				
					int idCheck = rs.getInt(1);
					pwCheckret = idCheck;
				}
				conn_mysql.close();
				
	        } catch (Exception e){
	          System.out.println(e);
	           
	        }
			return pwCheckret;
		}
	
	
}