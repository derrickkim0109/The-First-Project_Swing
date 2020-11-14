package com.javalec.post;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import com.javalec.base.ShareVar;

	


public class DbActionPost {
	int userinfo_userno;
	int likecheck=2; // 2 일때 insert로 likecheck=1
	int likeCount;
	public DbActionPost() {
		// TODO Auto-generated constructor stub
	}
	
	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	
	
		//글작성하기
		public boolean writeinsertAction(String menuitem, int cooktimeindex, String title, String text, FileInputStream file) {		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");	
		Date time = new Date();			
		String time1 = format1.format(time);
		System.out.println(menuitem);
		System.out.println(cooktimeindex);
		PreparedStatement ps =null;
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");

	           Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
	           Statement stmt_mysql = conn_mysql.createStatement();
	           
	           String A = "insert into post (title, text, menu, cooktime, postinsertdate , userinfo_userno, postimage) ";
	           String B = "values (?,?,?,?,?,?,?)";
	           
	           ps = conn_mysql.prepareStatement(A+B);
	           ps.setString(1, title);
	           ps.setString(2, text);
	           ps.setString(3, menuitem);
	           ps.setString(4, Integer.toString(cooktimeindex*10));
	           ps.setString(5, time1);
	           ps.setString(6, ShareVar.userno);
	           ps.setBinaryStream(7, file);
	           ps.executeUpdate();
	           conn_mysql.close();
			
		} catch (Exception e) {
			//System.out.println(e);
			return false;
			// TODO: handle exception
		}
		return true;
	}
		
		
		// 게시글 수정하기
	public boolean writeReviseAction(String menuitem, int cooktimeindex, String title, String text, FileInputStream file) {		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");		
		Date time = new Date();		
		String time1 = format1.format(time);
		
		
		
		System.out.println(menuitem);
		System.out.println(cooktimeindex);
		PreparedStatement ps =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String A = "update post set title = ?, text = ? , menu = ? , cooktime = ?, postupdatedate = ? , userinfo_userno = ?, postimage = ? ";
			String B = "where postno = ?";
			
			ps = conn_mysql.prepareStatement(A+B);
			ps.setString(1, title);
			ps.setString(2, text);
			ps.setString(3,	menuitem);
			ps.setString(4, Integer.toString(cooktimeindex*10));
			ps.setString(5, time1);
			ps.setString(6, ShareVar.userno);
			ps.setBinaryStream(7, file);
			ps.setString(8, ShareVar.postno);
			ps.executeUpdate();
			conn_mysql.close();
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		return true;
	}
	
	
	
	// 수정,보기창에 값 가져오기
	public ArrayList<BeanPost> GetText(){ 
        ArrayList<BeanPost> beanList = new ArrayList<BeanPost>();
        
        String whereDefault = "select title,userid, text, menu, cooktime, postimage from post, userinfo ";
        String whereDefault2 = " where postno = "+ShareVar.postno+" and userno = userinfo_userno";
        // String whereDefault2= "where postno in(select post_seqno from writetable where userno = userinfo_userno) and postno = " + ShareVar.postno;
        //select commentno, comment, userid from userinfo,commenttable
        //where post_no=3 and userno=user_no;
        System.out.println(whereDefault+whereDefault2);
        
  //      String whereDefault2 = " like '%" + tfSelection.getText().trim() + "%'";
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");

           Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
           Statement stmt_mysql = conn_mysql.createStatement();
           ResultSet rs = stmt_mysql.executeQuery(whereDefault+whereDefault2);
           
           while(rs.next()) {
              
        	   
              String wktitle = rs.getString(1);         
              String wkwriter = rs.getString(2);
              String wktext = rs.getString(3);
              String wkmenu = rs.getString(4);
              String wkcooktime = Integer.toString(rs.getInt(5));
              // image
              ShareVar.filename = ShareVar.filename +1;
              File file = new File(Integer.toString(ShareVar.filename));
              FileOutputStream output = new FileOutputStream(file);
              InputStream input = rs.getBinaryStream(6);
              byte[] buffer = new byte[1024];
              while(input.read(buffer)>0) {
            	  output.write(buffer);
              }
              
              
              
              
              BeanPost bean = new BeanPost(wktitle,wkwriter ,wktext, wkmenu, wkcooktime);
           
              beanList.add(bean); // bean 에 4가지를 한번에 합쳐서 넣음
              
              
           }
           conn_mysql.close();
           
           //System.out.println(whereDefault+whereDefault2);
           
        }catch(Exception e) {
           System.out.println(e);
        }
        
     return beanList;
  }
	
	
	// 로그인한유저와 작성자가 일치하는지 확인
	public int writerCheck() {
		 String whereDefault = "select userinfo_userno from post where postno = "+ShareVar.postno;
		 try {
	           Class.forName("com.mysql.cj.jdbc.Driver");

	           Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
	           Statement stmt_mysql = conn_mysql.createStatement();
	           ResultSet rs = stmt_mysql.executeQuery(whereDefault);
	           
	           while(rs.next()) {
        	   
	              int wkuserno = rs.getInt(1);
	              userinfo_userno = wkuserno;
	           }
	           conn_mysql.close();
	           
	           //System.out.println(whereDefault+whereDefault2);
	           
	        }catch(Exception e) {
	           System.out.println(e);
	        }
		
		return userinfo_userno;
		
	}
	
	
	
	// 게시글 삭제
	public boolean reviseDeleteAction() { // delete 를 update 로 !! post 컬럼 추가
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");		
		Date time = new Date();		
		String time1 = format1.format(time);
		
		PreparedStatement ps = null;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement();
	           
				String A = "update post, liketable set postdeletedate  = "+"'"+time1+"' , likecheck = 0 ";
				String B = "where postno = "+ ShareVar.postno +" and post_postno = "+ShareVar.postno;
	           
				ps = conn_mysql.prepareStatement(A+B);
				ps.executeUpdate();
				conn_mysql.close();
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		
		return true;
	}
	
	
	// 댓글창 띄우기
	public ArrayList<BeanPost> searchAction(String postno){
        ArrayList<BeanPost> beanList = new ArrayList<BeanPost>();
        
        String whereDefault = "select userid, comment, commentdate, commentno from userinfo,commenttable ";
        String whereDefault2= "where post_postno = "+postno+" and userno=userinfo_userno";
        //select commentno, comment, userid from userinfo,commenttable
        //where post_no=3 and userno=user_no;
        System.out.println(whereDefault+whereDefault2);
        
  //      String whereDefault2 = " like '%" + tfSelection.getText().trim() + "%'";
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");

           Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
           Statement stmt_mysql = conn_mysql.createStatement();
           ResultSet rs = stmt_mysql.executeQuery(whereDefault+whereDefault2);
           
           while(rs.next()) {
              
        	   
              String wkuserid = rs.getString(1);
              String wkcomment = rs.getString(2);
              String wkcommentdate = rs.getString(3);
              String wkpostno = Integer.toString(rs.getInt(4));
             
              
              
              
              
              BeanPost bean = new BeanPost(wkuserid, wkcomment, wkcommentdate, wkpostno);
              beanList.add(bean); // bean 에 4가지를 한번에 합쳐서 넣음
              
              
           }
           conn_mysql.close();
           
           //System.out.println(whereDefault+whereDefault2);
           
        }catch(Exception e) {
           System.out.println(e);
        }
        
     return beanList;
  }
	
	
	// 댓글작성
	public boolean commentInsertAction(String tfInsert) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");		
		Date time = new Date();		
		String time1 = format1.format(time);
		PreparedStatement ps =null;
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");

	           Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
	           Statement stmt_mysql = conn_mysql.createStatement();
	           
	           String A = "insert into commenttable (comment,userinfo_userno,post_postno,commentdate) ";
	           String B = "values (?,?,?,?)";
	           
	           
	           ps = conn_mysql.prepareStatement(A+B);
	           ps.setString(1, tfInsert);
	           ps.setString(2, ShareVar.userno);
	           ps.setString(3, ShareVar.postno);
	           ps.setString(4, time1);
	           ps.executeUpdate();
	           conn_mysql.close();
			
		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}
		return true;
	}
	
	
	//댓글수정
	public boolean commentReviseAction(String tfRevise) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");		
		Date time = new Date();		
		String time1 = format1.format(time);
		PreparedStatement ps = null;
		try {
			 	
				
			Class.forName("com.mysql.cj.jdbc.Driver");

	           Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
	           Statement stmt_mysql = conn_mysql.createStatement();
	           
	           String A = "update commenttable set comment = ?, commentdate = ? ";
	           String B = "where commentno = ?";
	           
	           ps = conn_mysql.prepareStatement(A+B);
	           ps.setString(1, tfRevise);
	           ps.setString(2, time1);
	           ps.setString(3, ShareVar.commentno);
	           ps.executeUpdate();
	           conn_mysql.close();
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		return true;
	}
	
	
	//댓글삭제
	public boolean commentDeleteAction(String commentno) {
		PreparedStatement ps = null;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement();
	           
				String A = "delete from commenttable ";
				String B = "where commentno = "+commentno;
	           
				ps = conn_mysql.prepareStatement(A+B);
				ps.executeUpdate();
				conn_mysql.close();
			
		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}

		return true;
	}
	public int likeCheck() {
		
		
		String A = "select likecheck from liketable where userinfo_userno = "+ShareVar.userno+" and post_postno = "+ShareVar.postno;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");

	           Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
	           Statement stmt_mysql = conn_mysql.createStatement();
	           ResultSet rs = stmt_mysql.executeQuery(A);
	           
	           if(rs.next()) {
	        	int wklikecheck= rs.getInt(1);
	        	
	        	likecheck = wklikecheck;
	        	System.out.println(likecheck);    
	           }
	           
		} catch (Exception e) {
			System.out.println("체크에러");
			// TODO: handle exception
		}
		
		return likecheck;
	}
	
	// 좋아요 처음눌렀을때!( 좋아요 delete 가 안돼서 이미 한번 누른사람은 update로 변경)
	public boolean likeInsertAction() {
		PreparedStatement ps =null;
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");

	           Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
	           Statement stmt_mysql = conn_mysql.createStatement();
	           
	           String A = "insert into liketable (userinfo_userno, post_postno, likecheck)";
	           String B = "values (?,?,?)";
	           
	           ps = conn_mysql.prepareStatement(A+B);
	           ps.setString(1, ShareVar.userno);
	           ps.setString(2, ShareVar.postno);
	           ps.setInt(3, 1);
	           ps.executeUpdate();
	           conn_mysql.close();
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		
		return true;
	}
	
	// update로 likecheck=0
	public boolean likeDeleteAction() {
		PreparedStatement ps = null;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement();
	           
				String A = "update liketable set likecheck = 0 ";
				String B = "where userinfo_userno = "+ShareVar.userno+" and post_postno = "+ShareVar.postno;
	           
				ps = conn_mysql.prepareStatement(A+B);
				ps.executeUpdate();
				conn_mysql.close();
				System.out.println(A+B);
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		
		
		
	return true;
	}
	
	
	//postno 기준으로 좋아요카운트
	public int likeCount() {
		String A = "select sum(likecheck) from liketable where post_postno = "+ShareVar.postno; //+ " and likecheck = 1";
				
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");

	           Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
	           Statement stmt_mysql = conn_mysql.createStatement();
	           ResultSet rs = stmt_mysql.executeQuery(A);
	           
	           if(rs.next()) {
	        	int wklikeCount= rs.getInt(1);
	        	
	        	likeCount = wklikeCount;    
	           }
	           
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return likeCount;	
	}
	
	
	// likecheck=0의 값이 쌓여있는 경우 update로 likecheck =1;
	public boolean likeUpdateAction() {
		PreparedStatement ps = null;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement();
	           
				String A = "update liketable set likecheck = 1 ";
				String B = "where userinfo_userno = "+ShareVar.userno+" and post_postno = "+ShareVar.postno;
	           
				ps = conn_mysql.prepareStatement(A+B);
				ps.executeUpdate();
				conn_mysql.close();
				System.out.println(A+B);
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
			// TODO: handle exception
		}
		
		return true;
	}
	
	//사진저장
//	public void imageInsertAction(FileInputStream file) {
//		PreparedStatement ps = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection conn_mysql = DriverManager.getConnection(ShareVar.url_mysql, ShareVar.id_mysql, ShareVar.pw_mysql);
//			Statement stmt_mysql = conn_mysql.createStatement();
//           
//			String A = "insert into post (postimage) ";
//			String B = "values (?)";
//           
//			ps = conn_mysql.prepareStatement(A+B);
//			ps.setBinaryStream(1, file);
//			
//			ps.executeUpdate();
//			conn_mysql.close();
//			
//		
//		 	} catch (Exception e) {
//		 		System.out.println(e);
//	
//		// TODO: handle exception
//		 	}
//	}
//	

}
