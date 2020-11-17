package com.javalec.login;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.base.ShareVar;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JToggleButton;

public class IDPW extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTabbedPane tabbedPane;
	private JPanel IDpanel;
	private JPanel PWpanel;
	private JLabel label;
	private JLabel lblEmail;
	private JTextField tfName;
	private JTextField tfEmail;
	private JButton button;
	private JLabel label_1;
	private JTextField tfPWName;
	private JLabel lblId_1;
	private JTextField tfIDPW;
	private JLabel lblEmail_1;
	private JTextField tfEmailPW;
	private JButton btnPW;
	private JLabel lblId;
	private JLabel lblPw;
	private JLabel tfPwMessage;
	private JLabel lblX;

	
	public final String url_mysql = ShareVar.url_mysql;
	public final String id_mysql = ShareVar.id_mysql;
	public final String pw_mysql = ShareVar.pw_mysql;
	private JTextField IDMessage;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			IDPW dialog = new IDPW();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public IDPW() {
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석 all rights reserved.");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getTabbedPane());
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(6, 23, 427, 249);
			tabbedPane.addTab("ID 찾기", null, getIDpanel(), null);
			tabbedPane.addTab("PW 찾기", null, getPWpanel(), null);
		}
		return tabbedPane;
	}
	private JPanel getIDpanel() {
		if (IDpanel == null) {
			IDpanel = new JPanel();
			IDpanel.setLayout(null);
			IDpanel.add(getLabel());
			IDpanel.add(getLblEmail());
			IDpanel.add(getTfName());
			IDpanel.add(getTfEmail());
			IDpanel.add(getButton());
			IDpanel.add(getLblId());
			IDpanel.add(getIDMessage());
		}
		return IDpanel;
	}
	private JPanel getPWpanel() {
		if (PWpanel == null) {
			PWpanel = new JPanel();
			PWpanel.setLayout(null);
			PWpanel.add(getLabel_1());
			PWpanel.add(getTfPWName());
			PWpanel.add(getLblId_1());
			PWpanel.add(getTfIDPW());
			PWpanel.add(getLblEmail_1());
			PWpanel.add(getTfEmailPW());
			PWpanel.add(getBtnPW());
			PWpanel.add(getLblPw());
			PWpanel.add(getTfPwMessage());
			PWpanel.add(getTextField());
		}
		return PWpanel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("이름 :");
			label.setBounds(88, 30, 61, 16);
		}
		return label;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email :");
			lblEmail.setBounds(88, 62, 61, 16);
		}
		return lblEmail;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(142, 25, 180, 26);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(142, 57, 180, 26);
		}
		return tfEmail;
	}
	
	//----------------------------------------

	//ID 찾기 Action거는 곳. 
	private JButton getButton() {
		if (button == null) {
			button = new JButton("아이디 찾기");
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					idSearchAction();

				}
			});
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					idSearchAction();
				}
			});
		
			button.setBounds(174, 105, 96, 29);
		}
		return button;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("이름 :");
			label_1.setBounds(93, 25, 61, 16);
		}
		return label_1;
	}
	private JTextField getTfPWName() {
		if (tfPWName == null) {
			tfPWName = new JTextField();
			tfPWName.setColumns(10);
			tfPWName.setBounds(130, 20, 180, 26);
		}
		return tfPWName;
	}
	private JLabel getLblId_1() {
		if (lblId_1 == null) {
			lblId_1 = new JLabel("ID :");
			lblId_1.setBounds(93, 53, 61, 16);
		}
		return lblId_1;
	}
	private JTextField getTfIDPW() {
		if (tfIDPW == null) {
			tfIDPW = new JTextField();
			tfIDPW.setColumns(10);
			tfIDPW.setBounds(130, 48, 180, 26);
		}
		return tfIDPW;
	}
	private JLabel getLblEmail_1() {
		if (lblEmail_1 == null) {
			lblEmail_1 = new JLabel("Email :");
			lblEmail_1.setBounds(93, 81, 61, 16);
		}
		return lblEmail_1;
	}
	private JTextField getTfEmailPW() {
		if (tfEmailPW == null) {
			tfEmailPW = new JTextField();
			tfEmailPW.setColumns(10);
			tfEmailPW.setBounds(140, 76, 170, 26);
		}
		return tfEmailPW;
	}
	private JButton getBtnPW() {
		if (btnPW == null) {
			btnPW = new JButton("비밀번호 찾기");
			btnPW.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					pwSearchAction();

				}
			});
			btnPW.setBounds(156, 114, 117, 29);
		}
		return btnPW;
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID :");
			lblId.setBounds(88, 150, 22, 16);
		}
		return lblId;
	}
	private JLabel getLblPw() {
		if (lblPw == null) {
			lblPw = new JLabel("PW :");
			lblPw.setBounds(93, 155, 61, 16);
		}
		return lblPw;
	}
	private JLabel getTfPwMessage() {
		if (tfPwMessage == null) {
			tfPwMessage = new JLabel("");
			tfPwMessage.setEnabled(false);
			
			tfPwMessage.setForeground(Color.BLACK);
			tfPwMessage.setFont(new Font("Arial", Font.BOLD, 12));
//			tfPwMessage.setBackground(Color.white);
			tfPwMessage.setBounds(130, 155, 179, 21);
		}
		return tfPwMessage;
	}
	
	//----------//----------------------------------------
	//아이디 찾기.!
	private void idSearchAction(){
				
				String username = tfName.getText().trim();
				String emailUser = tfEmail.getText().trim();

		
				try {
					Class.forName("com.mysql.cj.jdbc.Driver"); // middle ware class 이름 사용 : class를 이걸 쓸꺼다.
					Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // 사용하는 거 연결
					Statement stmt_mysql = conn_mysql.createStatement(); // mysql 언어로 convert하는 역할
					
					String whereDefault = "select userid from userinfo where username = '"+username+"' and useremail = '"+ emailUser+"'"; 
					// 검색만 executeQuery를 쓰고 추가, 수정, 삭제는 exectueUpdate 사용한다.
					ResultSet rs = stmt_mysql.executeQuery(whereDefault);
					
					
					if(rs.next()) {
					
						IDMessage.setText(rs.getString(1));
					}
					else {
						JOptionPane.showMessageDialog(null, "다시 입력해주세요");

						
					}
					conn_mysql.close();

		        } catch (Exception e){
		          System.out.println(e);
		           
		        }
				
			}
	//----------//----------------------------------------
	//비번 찾기

	private void pwSearchAction() {
		
		String username = tfPWName.getText().trim();
		String emailUser = tfEmailPW.getText().trim();
		String userid = tfIDPW.getText().trim();

		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // middle ware class 이름 사용 : class를 이걸 쓸꺼다.
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql); // 사용하는 거 연결
			Statement stmt_mysql = conn_mysql.createStatement(); // mysql 언어로 convert하는 역할
			
			String whereDefault = "select userpw from userinfo where username = '"+username+"' and userid = '"+ userid + "' and useremail = '"+ emailUser +"'"; 
			// 검색만 executeQuery를 쓰고 추가, 수정, 삭제는 exectueUpdate 사용한다.
			ResultSet rs = stmt_mysql.executeQuery(whereDefault);
			
			if(rs.next()) {
				
				tfPwMessage.setText(rs.getString(1));
			}
			else {
				JOptionPane.showMessageDialog(null, "다시 입력해주세요");
				
			}
			
			conn_mysql.close();
			

        } catch (Exception e){
          System.out.println(e);
           
        }
	}
	
private JTextField getIDMessage() {
		if (IDMessage == null) {
			IDMessage = new JTextField();
			IDMessage.setEditable(false);
			IDMessage.setForeground(Color.BLACK);
			IDMessage.setFont(new Font("Arial", Font.BOLD, 12));
			IDMessage.setBackground(new Color(255, 255, 255));
			IDMessage.setBounds(142, 146, 180, 26);
		}
		return IDMessage;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setForeground(new Color(250, 240, 230));
			textField.setFont(new Font("Arial", Font.PLAIN, 12));
			textField.setBackground(Color.WHITE);
			textField.setBounds(124, 153, 179, 21);
		}
		return textField;
	}
}//---END


