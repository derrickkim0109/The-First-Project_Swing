package com.javalec.mypageEdition;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.javalec.base.ShareVar;


public class DbActionMyList {
	//Field
	private final String url_mysql = ShareVar.url_mysql;//주소.
	private final String id_mysql = ShareVar.id_mysql;//아이디
	private final String pw_mysql = ShareVar.pw_mysql;//비번
	
	String userid;
	String ConditionQueryColumn;
	int sqeno;
	String like;
	int postno;

	String title;
	String text;
	String menu;
	String cooktime;
	
	//constructor
	public DbActionMyList() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public DbActionMyList(int sqeno,String userid, String conditionQueryColumn, String like) {
		super();
		this.userid = userid;
		ConditionQueryColumn = conditionQueryColumn;
		this.sqeno = sqeno;
		this.like = like;
	}

	

		public DbActionMyList(int sqeno) {
		super();
		this.sqeno = sqeno;
	}



		public DbActionMyList(String conditionQueryColumn) {
			super();
			ConditionQueryColumn = conditionQueryColumn;
		}



		//	Method
		//----------------------------------------
		//----------------------------------------
		//MyPage_MyList 내가 쓴글 뜨게하는 Action 
		public ArrayList<BeanMyList> selectList(){
			ArrayList<BeanMyList> beanList = new ArrayList<BeanMyList>();//객체형 변수. Array리스트에 한방에 다넣기 위해 From Bean
//			System.out.println(ShareVar.idUser);
//			System.out.println(ShareVar.userno);
	        String whereDefault = "select p.postno, p.title, p.postinsertdate, ";
	        String whereDefault2 = "(select count(*) from myselfrecipe.liketable ";
	        String whereDefault3 = "where post_postno = p.postno group by post_postno) cnt ";
	        String whereDefault4 = "from userinfo info left outer join post p on info.userno = p.userinfo_userno ";
	        String whereDefault5 = "where postdeletedate is null and userid = '" + ShareVar.idUser + "'";   
	        
	        try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	            Statement stmt_mysql = conn_mysql.createStatement();

	            ResultSet rs = stmt_mysql.executeQuery(whereDefault+whereDefault2 + whereDefault3 + whereDefault4 +
	            				whereDefault5);
	            

	            while(rs.next()){
	            	int wkpostno = rs.getInt(1);
	            	//String wkuserid = rs.getString(2);
	            	String wktitle = rs.getString(2);
	            	String wkpostinsertdate = rs.getString(3);
	            	String wklike = rs.getString(4);

	            	 
	            	//ArrayList 한개씩 못들어가기때문에 Bean 으로 4개를 통으로 만들어서 ArrayList로 한번에 넣는다.
	            	BeanMyList bean = new BeanMyList(wkpostno,wktitle,wkpostinsertdate,wklike);
	            	beanList.add(bean);
	            }
	            conn_mysql.close();
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }
	        return beanList;
			
		}
		
		//----------------------------------------
		//----------------------------------------
//		public BeanMyList deleteAction() {
//			BeanMyList bean = null;
//			
//			   PreparedStatement ps = null;
//		        try{
//		            Class.forName("com.mysql.cj.jdbc.Driver");
//		            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
//		            @SuppressWarnings("unused")
//					Statement stmt_mysql = conn_mysql.createStatement();
//		
//		            String A = "delete from userinfo where postno = ? and userid = ?";
//		
//		            ps = conn_mysql.prepareStatement(A);
//		            
//		            ps.setInt(1, postno);
//		            ps.setString(2, userid);
//		            ps.executeUpdate();
//		            
//		            bean = new BeanMyList(postno);
//		            
//		            conn_mysql.close();
//		        } catch (Exception e){
//		            e.printStackTrace();
//		        }
//		       	
//			return bean;
//		}
		
		//----------------------------------------
		//----------------------------------------
		//MyPage_MyList 검색창에서 내가 쓴글 검색하기 위해. 
		public ArrayList<BeanMyList> mylisSearchAction(int comboxindex, String search) {
			ArrayList<BeanMyList> beanList = new ArrayList<BeanMyList>();
			String whereDefault="";
			String whereDefault2="";
			String whereDefault3 ="";
			String whereDefault4 ="";
			String whereDefault5 ="";
			
			if(comboxindex==0) {
				whereDefault = "select p.postno, p.title, p.postinsertdate, ";
		        whereDefault2 = "(select count(*) from myselfrecipe.liketable ";
		        whereDefault3 = "where post_postno = p.postno group by post_postno) cnt ";
		        whereDefault4 = "from userinfo info left outer join post p on info.userno = p.userinfo_userno ";
		        whereDefault5 = "where postdeletedate is null and userid = '" + ShareVar.idUser + "' and title like '%"+search+"%'";   
			}
			if(comboxindex==1) {
				whereDefault = "select p.postno, p.title, p.postinsertdate, ";
		        whereDefault2 = "(select count(*) from myselfrecipe.liketable ";
		        whereDefault3 = "where post_postno = p.postno group by post_postno) cnt ";
		        whereDefault4 = "from userinfo info left outer join post p on info.userno = p.userinfo_userno ";
		        whereDefault5 = "where postdeletedate is null and userid = '" + ShareVar.idUser + "' and text like '%"+search+"%'";   
			}
	        
	        try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	            Statement stmt_mysql = conn_mysql.createStatement();

	            ResultSet rs = stmt_mysql.executeQuery(whereDefault+whereDefault2+whereDefault3+whereDefault4+whereDefault5);

	            while(rs.next()){
	            	int wkpostno = rs.getInt(1);
	            	String wktitle = rs.getString(2);
	            	String wkpostinsertdate = rs.getString(3);
	            	String wklike = rs.getString(4);
	
	            	 
	            	//ArrayList 한개씩 못들어가기때문에 Bean 으로 4개를 통으로 만들어서 ArrayList로 한번에 넣는다.
	            	BeanMyList bean = new BeanMyList(wkpostno,wktitle,wkpostinsertdate,wklike);
	            	beanList.add(bean);
	            }
	            conn_mysql.close();
	        }
	        catch (Exception e){
	           System.out.println(e);
	        }
			return beanList;
			

		}
		
}////--END
