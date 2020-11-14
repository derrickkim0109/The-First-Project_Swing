package com.javalec.minigame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.javalec.base.ShareVar;


public class DbActionMiniGame {
	// Field
			private final String url_mysql = ShareVar.url_mysql;
			private final String id_mysql = ShareVar.id_mysql;
			private final String pw_mysql = ShareVar.pw_mysql;
			
			int fileno;
			int randomNum;
			String filename;
			FileInputStream file;

			
	// Constructor
			
			public DbActionMiniGame() {
				
			}
			
	
			
			public DbActionMiniGame(int randomNum) {
				super();
				this.randomNum = randomNum;
			}


			public DbActionMiniGame(String filename, FileInputStream file) {
				super();
				this.filename = filename;
				this.file = file;
			}

			
			public DbActionMiniGame(int fileno, String filename) {
				super();
				this.fileno = fileno;
				this.filename = filename;
			}
			
			
			public DbActionMiniGame(int fileno, String filename, FileInputStream file) {
				super();
				this.fileno = fileno;
				this.filename = filename;
				this.file = file;
			}
			


			public DbActionMiniGame(int fileno, int randomNum, String filename, FileInputStream file) {
				super();
				this.fileno = fileno;
				this.randomNum = randomNum;
				this.filename = filename;
				this.file = file;
			}

			
			
	// Method



			// 입력


			public boolean InsertAction() {
			      PreparedStatement ps = null;
			      try{
			          Class.forName("com.mysql.cj.jdbc.Driver");
			          Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
			          @SuppressWarnings("unused")
						Statement stmt_mysql = conn_mysql.createStatement();
			
			          String A = "insert into minigame (filename, file";
			          String B = ") values (?,?)";
			
			          ps = conn_mysql.prepareStatement(A+B);
			          ps.setString(1, filename.trim());
			          ps.setBinaryStream(2, file);
			          ps.executeUpdate();
			
			          conn_mysql.close();
			      } catch (Exception e){
			          System.out.println(e);
			          return false;
			      }
			      return true;
			}
			
	
			// 디비에 저장된 이미지 불러오기 위한 밑밥
			public ArrayList<BeanMiniGame> pickImage(int fileno){
				
				ArrayList<BeanMiniGame> BeanList = new ArrayList<BeanMiniGame>();
				
				String A = "select fileno, filename, file from minigame ";
				String B = "where fileno = " + fileno;
				
		        try{
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
		            Statement stmt_mysql = conn_mysql.createStatement();

		            ResultSet rs = stmt_mysql.executeQuery(A+B);

		            	while(rs.next()){
		            		String wkNo = rs.getString(1);
			            	String wkFileName = rs.getString(2);
			            	// File
			            	ShareVar.filename = ShareVar.filename + 1;
			            	//ShareVar.filename = ShareVar.filename + 1;
			            	File filesize = new File(Integer.toString(ShareVar.filename));
			            	FileOutputStream output = new FileOutputStream(filesize);
			            	InputStream input = rs.getBinaryStream(3);
			                byte[] buffer = new byte[1024];
			                while (input.read(buffer) > 0) {
			                    output.write(buffer);
			                }
		            	
		            	BeanMiniGame bean = new BeanMiniGame(wkNo, wkFileName);
		            	BeanList.add(bean);
		            }
		            
		            conn_mysql.close();
		        }
		        catch (Exception e){
		            e.printStackTrace();
		        }
				return BeanList;
			}
	
}// 끝
