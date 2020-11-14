package com.javalec.recipelist;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.javalec.base.MainMenu;
import com.javalec.base.ShareVar;
import com.javalec.recipelist.BeanRecipe;

public class DbActionRecipe {

	// Field
		private final String url_mysql = ShareVar.url_mysql;
		private final String id_mysql = ShareVar.id_mysql;
		private final String pw_mysql = ShareVar.pw_mysql;
		
		int postno;
		String userno;
		String title;
		String userid;
		String postinsertdate;
		int like;
		String menu;
		String cookTime;
		String str;
		
	// constructor
		
		
		public DbActionRecipe() {
			
		}
		
		
		public DbActionRecipe(int postno, String title, String userid, String postinsertdate) {
			super();
			this.postno = postno;
			this.title = title;
			this.userid = userid;
			this.postinsertdate = postinsertdate;
		}
		
		
		public DbActionRecipe(int postno) {
			super();
			this.postno = postno;
		}
		
		public DbActionRecipe(int postno, String title, String userid) {
			super();
			this.postno = postno;
			this.title = title;
			this.userid = userid;
		}
		
		
		public DbActionRecipe(int postno, String title, String userid, String postinsertdate, int like) {
			super();
			this.postno = postno;
			this.title = title;
			this.userid = userid;
			this.postinsertdate = postinsertdate;
			this.like = like;
		}

		

		public DbActionRecipe(String menu, String cookTime, String str) {
			super();
			this.menu = menu;
			this.cookTime = cookTime;
			this.str = str;
		}
		
		
		
		// method
		// 검색 결과를 Table로 (업데이트순)
		public ArrayList<BeanRecipe> SearchAction(){
			
			ArrayList<BeanRecipe> BeanRecipe = new ArrayList<BeanRecipe>();
			
			String A = "select p.postno, p.title, info.userid, p.postinsertdate, (select count(*) from myselfrecipe.liketable where post_postno = p.postno group by post_postno) cnt ";
			String B = "from userinfo info ";
			String C = "left outer join post p on info.userno = p.userinfo_userno ";
			String D = "where postdeletedate is null and postno is not null;";
	      
			try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	            Statement stmt_mysql = conn_mysql.createStatement();

	            ResultSet rs = stmt_mysql.executeQuery(A+B+C+D);

	            while(rs.next()){
	            	
	            	int wkpostno = rs.getInt(1);
	            	String wktitle = rs.getString(2);
	            	String wkuserid = rs.getString(3);
	            	String wkpostinsertdarte = rs.getString(4);
	            	int wklike = rs.getInt(5);
	            	
	            	BeanRecipe bean = new BeanRecipe(wkpostno, wktitle, wkuserid, wkpostinsertdarte, wklike);
					BeanRecipe.add(bean);
	            }
	            
	            conn_mysql.close();
	        }
	        catch (Exception e){
	            System.out.println(e);
	        }
			return BeanRecipe;
		}
		
		// 검색 결과를 Table로 (베스트순)
		public ArrayList<BeanRecipe> bestSearchAction(){
			
			ArrayList<BeanRecipe> BeanRecipe = new ArrayList<BeanRecipe>();
			
			String A = "select p.postno, p.title, info.userid, postinsertdate, ";
			String B = "(select count(*) from myselfrecipe.liketable where post_postno = p.postno group by post_postno) cnt\n" + 
					" from userinfo info ";
			String C = "left outer join post p on info.userno = p.userinfo_userno ";
			String D = "where postdeletedate is null and postno is not null ";
			String E = "order by cnt desc;";
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement();
				
				ResultSet rs = stmt_mysql.executeQuery(A+B+C+D+E);
				
				while(rs.next()){
					
					int wkpostno = rs.getInt(1);
					String wktitle = rs.getString(2);
					String wkuserid = rs.getString(3);
	            	String wkpostinsertdarte = rs.getString(4);
	            	int wklike = rs.getInt(5);
					
					BeanRecipe bean = new BeanRecipe(wkpostno, wktitle, wkuserid, wkpostinsertdarte, wklike);
					BeanRecipe.add(bean);
				}
				
				conn_mysql.close();
			}
			catch (Exception e){
				System.out.println(e);
			}
			return BeanRecipe;
		}
		


		// 베스트순 조건 검색
		public ArrayList<BeanRecipe> bestCheckKeword(String menu, String cookTime, String str) {
			
			ArrayList<BeanRecipe> beanList = new ArrayList<BeanRecipe>();
			
		   String A = "select p.postno, p.title, info.userid, postinsertdate, ";
		   String B = "(select count(*) from myselfrecipe.liketable where post_postno = p.postno group by post_postno) cnt " + 
		         " from userinfo info ";
		   String C = "left outer join post p on info.userno = p.userinfo_userno ";
		   String D = "where postdeletedate is null and postno is not null and ";
		   String F = "";
			   	if (menu != null  || !"".equals(menu)) {
					   F += " (menu = '" + menu + "')";
					   }
					   if (cookTime != null || !"".equals(cookTime)) {
					   F += " and (cooktime = " + cookTime + ") ";
					   if (str != null || !"".equals(str)) {
					   F += " and title like '%" + str + "%' "; 
					   }
				   }
		   String G = "order by cnt desc;";
					
			 	try{
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		            Statement stmt_mysql = conn_mysql.createStatement();

		            ResultSet rs = stmt_mysql.executeQuery(A+B+C+D+F+G);
		            
		            while(rs.next()){
		            	int wkpostno = rs.getInt(1);
		            	String wktitle = rs.getString(2);
		            	String wkuserid = rs.getString(3);
		            	String wkpostinsertdarte = rs.getString(4);
		            	int wklike = rs.getInt(5);
						
						BeanRecipe bean = new BeanRecipe(wkpostno, wktitle, wkuserid, wkpostinsertdarte, wklike);
						beanList.add(bean);
						
						
		            }
		            conn_mysql.close();
		        }
		        catch (Exception e){
		            System.out.println(e);
		        }
		        return beanList; // 쌓여있는 beanList가 노출됨.
			}
		
		
		// 업데이트순 조건 검색
		public ArrayList<BeanRecipe> updateCheckKeword(String menu, String cookTime, String str) {
			
			ArrayList<BeanRecipe> beanList = new ArrayList<BeanRecipe>();
			
			String A = "select p.postno, p.title, info.userid, postinsertdate, ";
			String B = "(select count(*) from myselfrecipe.liketable where post_postno = p.postno group by post_postno) cnt " + 
					" from userinfo info ";
			String C = "left outer join post p on info.userno = p.userinfo_userno ";
			String D = "where postdeletedate is null and postno is not null and ";
			String F = "";
			if (menu != null  || !"".equals(menu)) {
				F += " (menu = '" + menu + "')";
			}
			if (cookTime != null || !"".equals(cookTime)) {
				F += " and (cooktime = " + cookTime + ") ";
				if (str != null || !"".equals(str)) {
					F += " and title like '%" + str + "%' "; 
				}
			}
			String G = "order by postno";
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement();
				
				ResultSet rs = stmt_mysql.executeQuery(A+B+C+D+F+G);
				
				while(rs.next()){
					int wkpostno = rs.getInt(1);
					String wktitle = rs.getString(2);
					String wkuserid = rs.getString(3);
					String wkpostinsertdarte = rs.getString(4);
					int wklike = rs.getInt(5);
					
					BeanRecipe bean = new BeanRecipe(wkpostno, wktitle, wkuserid, wkpostinsertdarte, wklike);
					beanList.add(bean);
					
					
				}
				conn_mysql.close();
			}
			catch (Exception e){
				System.out.println(e);
			}
			return beanList; // 쌓여있는 beanList가 노출됨.
		}



}// 끝 ---------------------------------------------
