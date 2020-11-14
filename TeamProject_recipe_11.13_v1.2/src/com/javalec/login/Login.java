package com.javalec.login;




import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.javalec.base.MainMenu;
import com.javalec.join.Join;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JDialog {
	private JPanel panelUserID;
	private JTextField tfUserID;
	private JPanel panelPW;
	private JPasswordField tfPW;
	private JPanel panelBtnLogin;
	private JLabel label;
	private JLabel gotoIDPW;
	private JLabel lblLogin;
	private JLabel lblX;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		setBounds(100, 100, 444, 329);
		getContentPane().setLayout(null);
		getContentPane().add(getPanelUserID());
		getContentPane().add(getPanelPW());
		getContentPane().add(getPanelBtnLogin());
		getContentPane().add(getLblX());
		getContentPane().add(getLabel());
		getContentPane().add(getGotoIDPW());
	}
	private JPanel getPanelUserID() {
		if (panelUserID == null) {
			panelUserID = new JPanel();
			panelUserID.setBounds(80, 112, 174, 35);
			panelUserID.setLayout(null);
			panelUserID.add(getTfUserID());
		}
		return panelUserID;
	}
	private JTextField getTfUserID() {
		if (tfUserID == null) {
			tfUserID = new JTextField();
			tfUserID.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					if(tfUserID.getText().equals("UserID")) {
						tfUserID.setText("");
					}
					else {
						tfUserID.selectAll();//ID 만드는 구간.
					}
				}
				@Override
				public void focusLost(FocusEvent e) {
					if(tfUserID.getText().equals("")){
						tfUserID.setText("UserID");
					}
				}
			});
			tfUserID.setText("UserID");
			tfUserID.setFont(new Font("Arial", Font.BOLD, 14));
			tfUserID.setColumns(10);
			tfUserID.setBorder(null);
			tfUserID.setBounds(0, 0, 174, 35);
		}
		return tfUserID;
	}
	private JPanel getPanelPW() {
		if (panelPW == null) {
			panelPW = new JPanel();
			panelPW.setBounds(80, 172, 174, 35);
			panelPW.setLayout(null);
			panelPW.add(getTfPW());
		}
		return panelPW;
	}
	private JPasswordField getTfPW() {
		if (tfPW == null) {
			tfPW = new JPasswordField();
			tfPW.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					
					if(tfPW.getText().equals("Password")) {
						
						tfPW.setEchoChar('●');//비밀 번호 
						tfPW.setText("");
					}
					else {
						tfPW.selectAll();
					}
				}
				@Override
				public void focusLost(FocusEvent e) {
					if(tfPW.getText().equals("")) {
						tfPW.setText("Password" );
						tfPW.setEchoChar((char)0); 
					}
				}
			});
			tfPW.setEchoChar((char)0);// 비번 칸에 내가 친 텍스트글들 사라짐.
			tfPW.setBorder(null);
			tfPW.setText("Password");
			tfPW.setBounds(0, 0, 174, 32);
			tfPW.setFont(new Font("Arial", Font.BOLD, 14));
		}
		return tfPW;
	}
	private JPanel getPanelBtnLogin() {
		if (panelBtnLogin == null) {
			panelBtnLogin = new JPanel();
			panelBtnLogin.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					loginClickAction();

				}
				@Override
				public void mouseEntered(MouseEvent e) {
					panelBtnLogin.setBackground(new Color(70, 80, 80));

				}
				@Override
				public void mouseExited(MouseEvent e) {
					panelBtnLogin.setBackground(new Color(87 , 87, 87));

				}
				@Override  
				public void mousePressed(MouseEvent e) {
					panelBtnLogin.setBackground(new Color(100, 100, 100));
					
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					panelBtnLogin.setBackground(new Color(70, 80, 80));

				}
			});
			panelBtnLogin.setBounds(284, 128, 95, 61);
			panelBtnLogin.setBackground(new Color(112, 128, 144)); 
			panelBtnLogin.setLayout(null);
			panelBtnLogin.add(getLblLogin());
		}
		return panelBtnLogin;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("회원가입");
			label.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
			label.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					gotoJoin();
					Login.this.dispose();
					
				}
			});
			label.setBounds(80, 240, 61, 16);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBorder(null);
		}
		return label;
	}
	private JLabel getGotoIDPW() {
		if (gotoIDPW == null) {
			gotoIDPW = new JLabel("ID / PW찾기");
			gotoIDPW.setBounds(173, 240, 79, 16);
			gotoIDPW.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return gotoIDPW;
	}
	private JLabel getLblLogin() {
		if (lblLogin == null) {
			lblLogin = new JLabel("Login");
			lblLogin.setForeground(Color.WHITE);
			lblLogin.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
			lblLogin.setBorder(null);
			lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
			lblLogin.setBounds(17, 14, 61, 33);
		}
		return lblLogin;
	}
	private JLabel getLblX() {
		if (lblX == null) {
			lblX = new JLabel("X");
			lblX.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(JOptionPane.showConfirmDialog(null, "종료하시기를 원하십니까?","Confirmation", JOptionPane.YES_NO_OPTION) ==0) {
						Login.this.dispose();
					
					}
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblX.setForeground(Color.red);
				}
				public void mouseExited(MouseEvent e) { 
					lblX.setForeground(Color.white);
				}
			});
			lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			lblX.setHorizontalAlignment(SwingConstants.CENTER);			lblX.setBounds(561, 6, 15, 16);
		}
		return lblX;
	}
	
	//----------------------------------------
		//----------------------------------------
		//login하기. 
		 private void loginClickAction() {
			 DbActionLogin dbActionLogin = new DbActionLogin();
			 
			 if(dbActionLogin.loginclickAction(tfUserID.getText().trim(), tfPW.getText().trim())==1) {
				 loginSession();
				 gotoRecipeList();
				 Login.this.dispose();
				 
			 }else {
				 JOptionPane.showMessageDialog(null, "회원정보가 없습니다.");
			 }
			 
		 }
		 private void loginSession() {
			 DbActionLogin dbActionLogin = new DbActionLogin();
			 dbActionLogin.loginSection(tfUserID.getText().trim());
		 }

		//----------------------------------------
		//----------------------------------------
		 //Login -> _Join_회원가입
		 private void gotoJoin() {
			 	Join join = new Join();
				
			 	join.setLocationRelativeTo(null);
			 	join.setVisible(true);
				
			}
		//----------------------------------------
		//----------------------------------------
		//Login -> RecipeList 메뉴바로 돌아가기. 
		 private void gotoRecipeList() {
				 MainMenu recipe = new MainMenu();
					
				 	recipe.setLocationRelativeTo(null);
				 	recipe.setVisible(true);
					
				}
}///---END
