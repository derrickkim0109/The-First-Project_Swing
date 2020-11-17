package com.javalec.join;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.login.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Join extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel label;
	private JTextField tfName;
	private JLabel lblId;
	private JTextField tfID;
	private JButton btnIDCheck;
	private JPasswordField tfPW;
	private JLabel label_1;
	private JLabel label_1_1;
	private JPasswordField tfPWCheck;
	private JLabel label_1_1_1;
	private JTextField tfEmail;
	private JButton btnJoinCancel;
	private JButton btnJoinFinish;
	private JTextField pwMessage;
	private JComboBox cbEmail;
	private JTextField tfEmailIDMessage;
	private JLabel label_2;
	private JTextField tfDomain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Join dialog = new Join();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Join() {
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석 all rights reserved.");
		setBounds(100, 100, 496, 333);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getLabel());
		contentPanel.add(getTfName());
		contentPanel.add(getLblId());
		contentPanel.add(getTfID());
		contentPanel.add(getBtnIDCheck());
		contentPanel.add(getTfPW());
		contentPanel.add(getLabel_1());
		contentPanel.add(getLabel_1_1());
		contentPanel.add(getTfPWCheck());
		contentPanel.add(getLabel_1_1_1());
		contentPanel.add(getTfEmail());
		contentPanel.add(getPwMessage());
		contentPanel.add(getCbEmail());
		contentPanel.add(getTfEmailIDMessage());
		contentPanel.add(getLabel_2());
		contentPanel.add(getTfDomain());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.add(getBtnJoinCancel());
			buttonPane.add(getBtnJoinFinish());
		}
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("이름 :");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
			label.setBounds(55, 35, 82, 25);
		}
		return label;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfName.setColumns(10);
			tfName.setBounds(125, 35, 157, 32);
		}
		return tfName;
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("아이디 :");
			lblId.setHorizontalAlignment(SwingConstants.CENTER);
			lblId.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
			lblId.setBounds(48, 83, 81, 25);
		}
		return lblId;
	}
	private JTextField getTfID() {
		if (tfID == null) {
			tfID = new JTextField();
			tfID.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfID.setColumns(10);
			tfID.setBounds(124, 77, 157, 32);
		}
		return tfID;
	}
	private JButton getBtnIDCheck() {
		if (btnIDCheck == null) {
			btnIDCheck = new JButton("✓중복체크");
			btnIDCheck.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkID();
				}
			});
			btnIDCheck.setForeground(UIManager.getColor("Button.select"));
			btnIDCheck.setBackground(SystemColor.window);
			btnIDCheck.setBounds(293, 76, 69, 42);
		}
		return btnIDCheck;
	}
	private JPasswordField getTfPW() {
		if (tfPW == null) {
			tfPW = new JPasswordField();
			tfPW.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					pwMessage.setText("Enter를 쳐주세요.");
				}
			});
			tfPW.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfPW.setBounds(125, 121, 157, 33);
		}
		return tfPW;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("비밀번호 :");
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
			label_1.setBounds(39, 127, 90, 25);
		}
		return label_1;
	}
	private JLabel getLabel_1_1() {
		if (label_1_1 == null) {
			label_1_1 = new JLabel("비밀번호 확인 : ");
			label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
			label_1_1.setBounds(18, 161, 111, 25);
		}
		return label_1_1;
	}
	private JPasswordField getTfPWCheck() {
		if (tfPWCheck == null) {
			tfPWCheck = new JPasswordField();
			tfPWCheck.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPW();
				}
			});
			tfPWCheck.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfPWCheck.setBounds(125, 159, 157, 33);
		}
		return tfPWCheck;
	}
	private JLabel getLabel_1_1_1() {
		if (label_1_1_1 == null) {
			label_1_1_1 = new JLabel("Email  : ");
			label_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
			label_1_1_1.setBounds(28, 218, 132, 25);
		}
		return label_1_1_1;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
			tfEmail.setColumns(10);
			tfEmail.setBounds(125, 220, 75, 32);
		}
		return tfEmail;
	}
	private JButton getBtnJoinCancel() {
		if (btnJoinCancel == null) {
			btnJoinCancel = new JButton("취소");
			btnJoinCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					gotoLogin();
					Join.this.dispose();
				}
			});
			btnJoinCancel.setForeground(Color.RED);
			btnJoinCancel.setActionCommand("Cancel");
		}
		return btnJoinCancel;
	}
	private JButton getBtnJoinFinish() {
		if (btnJoinFinish == null) {
			btnJoinFinish = new JButton("가입");
			btnJoinFinish.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					joinAction();
				}
			});
			
			btnJoinFinish.setForeground(Color.BLUE);
			btnJoinFinish.setActionCommand("OK");
		}
		return btnJoinFinish;
	}
	private JTextField getPwMessage() {
		if (pwMessage == null) {
			pwMessage = new JTextField();
			pwMessage.setFont(new Font("Arial", Font.BOLD, 12));
			pwMessage.setBorder(null);
			pwMessage.setForeground(Color.RED);
			pwMessage.setEditable(false);
			pwMessage.setColumns(10);
			pwMessage.setBackground(SystemColor.window);
			pwMessage.setBounds(135, 198, 191, 26);
		}
		return pwMessage;
	}
	
	//_Join_ID 체크.
	private void checkID() {
		 
		 String idUser = tfID.getText().trim();
	        
	        DbActionJoin dbActionJoin = new DbActionJoin(idUser);
	        	if(dbActionJoin.idCheck() == 1) {
	        		JOptionPane.showMessageDialog(null, "중복된 ID입니다.");
	        	} else {
	        		JOptionPane.showMessageDialog(null, "사용할 수 있는 ID입니다." );
	        	}
	 }
	 
	//_Join_비밀번호 체크 
	private void checkPW() {
		pwMessage.setText("");

		
		String pW = new String(tfPW.getPassword()).trim();
	    String pwCheck = new String(tfPWCheck.getPassword()).trim();
	    
	    
	    if(pW.equals(pwCheck)){
	    	pwMessage.setText("패스워드가 서로 일치합니다.");
	    } else {
	    	pwMessage.setText("패스워드가 서로 다릅니다.");

	    }
	   
	}	
	
	//_Join_문자 길이 체크. 
	private int blankFieldCheck(){
		
		char[] pass = tfPW.getPassword();
		String pwUser = new String(pass);
		
		int i = 0;
		if(tfName.getText().length() == 0){
			i++;
			tfName.requestFocus();
		}
		if(tfID.getText().length() == 0){
			i++;
			tfID.requestFocus();
		}
		if(pwUser.length() == 0){
			i++;
			tfPW.requestFocus();
		}
	
		return i;
	}
	
	//_Join_회원가입 + 글자수 체크 합친 액션.
	private void joinAction() {
		
		int i_chk = blankFieldCheck();
		
		if(i_chk == 0){
			insertAction();
			gotoLogin();
			Join.this.dispose();
			
			
		} else {
			JOptionPane.showMessageDialog(null, "정보를 모두 작성해주세요!");
					     			
			
		}			
	}
	
	//_Join_회원가입 액션
	private void insertAction(){
		
		// DbAction 너가 insert한 정보 DB에 넣어줘!
		String username = tfName.getText().trim();
		String idUser= tfID.getText().trim();
		
		char[] pass = tfPW.getPassword();
		String pwUser = new String(pass);
		
		String emailUser = tfEmail.getText().trim();
		String emailDomain = tfDomain.getText().trim();
		
		// DbAction에 위 name~Relation까지 들어갈 생성자 필요 
		DbActionJoin dbActionJoin = new DbActionJoin(username, idUser, pwUser,(emailUser+"@"+emailDomain));
		boolean msg = dbActionJoin.insertAction();
		
		if(msg == true) {
			JOptionPane.showMessageDialog(null, username + "님 가입이 완료되었습니다!");
		} else {
			JOptionPane.showMessageDialog(null, "입력을 다시해주세요!");
		}
	}
	
	
//	Login 화면으로 넘어가기. 
	 private void gotoLogin() {
			Login login = new Login();
			
			login.setLocationRelativeTo(null);
			login.setVisible(true);
			
		}
	private JComboBox getCbEmail() {
		if (cbEmail == null) {
			cbEmail = new JComboBox();
			cbEmail.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
					if(cbEmail.getSelectedIndex()!=0) {
						
						tfDomain.setText((String)cbEmail.getSelectedItem());
						tfDomain.setEditable(false);
					}else {
						tfDomain.setText("");
						tfDomain.setEditable(true);

					}
				}
			});
			cbEmail.setModel(new DefaultComboBoxModel(new String[] {"직접입력", "naver.com", "daum.net", "nate.com", "gmail.com"}));
			cbEmail.setBounds(315, 223, 123, 27);
		}
		return cbEmail;
	}
	private JTextField getTfEmailIDMessage() {
		if (tfEmailIDMessage == null) {
			tfEmailIDMessage = new JTextField();
			tfEmailIDMessage.setHorizontalAlignment(SwingConstants.CENTER);
			tfEmailIDMessage.setForeground(Color.RED);
			tfEmailIDMessage.setFont(new Font("Arial", Font.BOLD, 12));
			tfEmailIDMessage.setEditable(false);
			tfEmailIDMessage.setColumns(10);
			tfEmailIDMessage.setBorder(null);
			tfEmailIDMessage.setBackground(SystemColor.window);
			tfEmailIDMessage.setBounds(172, 255, 191, 26);
		}
		return tfEmailIDMessage;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("@");
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setBounds(181, 223, 61, 25);
		}
		return label_2;
	}
	private JTextField getTfDomain() {
		if (tfDomain == null) {
			tfDomain = new JTextField();
			tfDomain.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
			tfDomain.setColumns(10);
			tfDomain.setBounds(219, 219, 94, 32);
		}
		return tfDomain;
	}
	
}///---END
