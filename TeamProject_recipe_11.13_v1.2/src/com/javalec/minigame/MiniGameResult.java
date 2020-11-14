package com.javalec.minigame;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.javalec.base.ShareVar;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;


public class MiniGameResult extends JDialog {
	private JLabel label;
	private JLabel gameimage;
	private JLabel tfgameimagename1;
	private JTextField tfgameimagename;
	int fileno;
	String filename;
	FileInputStream file;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniGameResult dialog = new MiniGameResult();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public MiniGameResult() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
					randomMenu();
			}
		});
		getContentPane().setFont(new Font("BM Dohyeon", Font.PLAIN, 20));
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석 all rights reserved.");
		setBounds(100, 100, 500, 500);
		getContentPane().setLayout(null);
		getContentPane().add(getLabel());
		getContentPane().add(getGameimage());
		getContentPane().add(getTfgameimagename());

	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("오늘의 추천 메뉴는");
			label.setFont(new Font("BM Dohyeon", Font.PLAIN, 30));
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(91, 14, 308, 68);
		}
		return label;
	}
	private JLabel getGameimage() {
		if (gameimage == null) {
			gameimage = new JLabel("");
			gameimage.setBorder(LineBorder.createBlackLineBorder());
			gameimage.setBounds(73, 84, 351, 290);
		}
		return gameimage;
	}
	
	private JTextField getTfgameimagename() {
		if (tfgameimagename == null) {
			tfgameimagename = new JTextField();
			tfgameimagename.setHorizontalAlignment(SwingConstants.CENTER);
			tfgameimagename.setEditable(false);
			tfgameimagename.setFont(new Font("BM Dohyeon", Font.BOLD, 40));
			tfgameimagename.setBounds(94, 379, 308, 78);
			tfgameimagename.setColumns(10);
		}
		return tfgameimagename;
	}
	
	
	// ------------------------------ 메소드 -------------------------
	public void random() {
		Random random = new Random();
		String menu[] = new String[3];
		
		for(int i = 1; i < menu.length; i++) {
			i = random.nextInt(menu.length);
		}
	}
	

	
	// 랜덤 숫자 출력 및 디비 매칭
	public void randomMenu() {
		String filePath;
		Random random = new Random();
		
		int menu[] = new int[3];
		
		int randomNum = random.nextInt(3)+1;
		
//		System.out.println(randomNum);
			
		DbActionMiniGame dbAction = new DbActionMiniGame();
		ArrayList<BeanMiniGame> beanList = dbAction.pickImage(randomNum);
		        	        
		        // Image처리
		        // File name이 틀려야 즉각 보여주기가 가능하여   
		        // ShareVar에서 int값으로 정의하여 계속 증가하게 하여 file name으로 사용후 삭제
//				tfFilePath.setText(filePath);
				int listCount = beanList.size();
		        for(int i =0; i<listCount;i++) {
		        String [] qTxt= {beanList.get(i).getSfileno(),beanList.get(i).getFilename()};
		        
		        tfgameimagename.setText(qTxt[0]);
		        
		        }
		       
		        filePath = Integer.toString(ShareVar.filename);
		        System.out.println(filePath);
		        File filesize = new File(filePath);
		        
		        ImageIcon icon = new ImageIcon(filePath); 
		        Image img = icon.getImage();
		        Image changeImage = img.getScaledInstance(351, 290, Image.SCALE_DEFAULT);
		        ImageIcon changeIcon = new ImageIcon(changeImage);
		        gameimage.setIcon(new ImageIcon(changeImage));
		        gameimage.setHorizontalAlignment(SwingConstants.CENTER);
		        
				filesize.delete();
				
		}
	
} // 끝
