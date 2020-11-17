package com.javalec.mypageEdition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.Statement;

import com.javalec.base.ShareVar;



public class DbActionEdition {
	
	
		//Field
		private final String url_mysql = ShareVar.url_mysql;//주소.
		private final String id_mysql = ShareVar.id_mysql;//아이디
		private final String pw_mysql = ShareVar.pw_mysql;//비번
		
		String pwUser;
		String email;
		String conditionQueryColumn;
		String search;
		String userid;
		String userstate;
		
		public DbActionEdition(String userid) {
			super();
			this.userid = userid;
		}

		public DbActionEdition() {
			// TODO Auto-generated constructor stub
		}
		
		public DbActionEdition(String pwUser, String email) {
			super();
			this.pwUser = pwUser;
			this.email = email;
		}
		
		
		public DbActionEdition(String pwUser, String email, String userid) {
			super();
			this.pwUser = pwUser;
			this.email = email;
			this.userid = userid;
		}
		
		
		//----------------------------------------
		//----------------------------------------
		//MyPage __회원정보 수정
		public Boolean UpdateAction() {
			

			PreparedStatement ps = null;
	      try{
	          Class.forName("com.mysql.cj.jdbc.Driver");
	          Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	          @SuppressWarnings("unused")
				Statement stmt_mysql = conn_mysql.createStatement();

	          String A = "update userinfo set userpw = ? , useremail = ? ";
	          String B = " where userid = '"+ ShareVar.idUser+"' ";
 
	          

	          ps = conn_mysql.prepareStatement(A+B);
	          ps.setString(1, pwUser);
	          ps.setString(2, email);
	          
	          ps.executeUpdate();
	          

	          conn_mysql.close();
	      } catch (Exception e){
	          e.printStackTrace();
	      }
	      return true;
		}
		
//		update userinfo set userstate = '탈퇴'
//				where userid = 'kim';
		//----------------------------------------
		//----------------------------------------
		//MyPage_탈퇴Action 
		public Boolean secessionAction() {
			PreparedStatement ps = null;
		      try{
		          Class.forName("com.mysql.cj.jdbc.Driver");
		          Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		          @SuppressWarnings("unused")
					Statement stmt_mysql = conn_mysql.createStatement();

		          String A = "update userinfo set userstate = '탈퇴' ";
		          String B = "where userid = '"+ ShareVar.idUser+"' ";
	 
		          

		          ps = conn_mysql.prepareStatement(A+B);
//		          System.out.println(A+B);
//		          ps.setString(1, userstate);
		          
		          
		          ps.executeUpdate();
		          

		          conn_mysql.close();
		      } catch (Exception e){
		          e.printStackTrace();
		      }
			return true;
		}
		
		
}///---END
