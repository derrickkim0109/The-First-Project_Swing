package com.javalec.post;
import java.awt.EventQueue;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.javalec.base.ShareVar;
import com.mysql.cj.xdevapi.TableImpl;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RevisePost extends JDialog {
	private JLabel lblNewLabel;
	private JTextField tfTitle;
	private JLabel lblNewLabel_1;
	private JTextField tfWriter;
	private JLabel lblNewLabel_1_1;
	private JComboBox cbMenu;
	private JLabel lblNewLabel_1_1_1;
	private JComboBox cbCookTime;
	private JButton btnRevise;
	private JButton btnNewButton_1;
	private JButton btnDelete;
	private JButton btnLike;
	private JTextField tfLikeCount;
	private JScrollPane scrollPane;
	private JTable Inner_table;
	private JScrollPane scrollPane_1;
	private JTextArea textArea;
	private final DefaultTableModel Outer_table = new DefaultTableModel();
	private JTextField tfComment;
	private JButton btnNewButton;
	//private String adminNo="1";
	private JButton btnNewButton_2;
	private JButton btnCommentDelete;
	private JLabel lblImage;
	private JLabel tfFilePath;
	private JButton btnNewButton_3;
	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	private JLabel lbllike;
	private JTextField tfFilePath2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RevisePost dialog = new RevisePost();
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
	public RevisePost() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				writerCheck();
				GetText();
				tableInit();
				searchAction();
				DbActionPost dbActionPost = new DbActionPost();
				tfLikeCount.setText(Integer.toString(dbActionPost.likeCount()));
			}
			@Override
			public void windowActivated(WindowEvent e) {
				tableInit();
				searchAction();
				DbActionPost dbActionPost = new DbActionPost();
				tfLikeCount.setText(Integer.toString(dbActionPost.likeCount()));
				
			}
		});
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석. all rights reserved");
		setBounds(100, 100, 601, 768);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTfTitle());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getTfWriter());
		getContentPane().add(getLblNewLabel_1_1());
		getContentPane().add(getCbMenu());
		getContentPane().add(getLblNewLabel_1_1_1());
		getContentPane().add(getCbCookTime());
		getContentPane().add(getBtnRevise());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnDelete());
		getContentPane().add(getBtnLike());
		getContentPane().add(getTfLikeCount());
		getContentPane().add(getScrollPane());
		getContentPane().add(getScrollPane_1());
		getContentPane().add(getTfComment());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getBtnCommentDelete());
		getContentPane().add(getLblImage());
		getContentPane().add(getTfFilePath());
		getContentPane().add(getBtnNewButton_3());
		getContentPane().add(getLbllike());
		getContentPane().add(getTfFilePath2());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("제목 : ");
			lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(38, 29, 70, 27);
		}
		return lblNewLabel;
	}
	private JTextField getTfTitle() {
		if (tfTitle == null) {
			tfTitle = new JTextField();
			tfTitle.setHorizontalAlignment(SwingConstants.CENTER);
			tfTitle.setEditable(false);
			tfTitle.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			tfTitle.setBounds(115, 28, 421, 32);
			tfTitle.setColumns(10);
		}
		return tfTitle;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("작성자 : ");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel_1.setBounds(38, 74, 70, 27);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfWriter() {
		if (tfWriter == null) {
			tfWriter = new JTextField();
			tfWriter.setHorizontalAlignment(SwingConstants.CENTER);
			tfWriter.setEditable(false);
			tfWriter.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			tfWriter.setColumns(10);
			tfWriter.setBounds(115, 73, 168, 32);
		}
		return tfWriter;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("메뉴 : ");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(38, 122, 70, 27);
		}
		return lblNewLabel_1_1;
	}
	private JComboBox getCbMenu() {
		if (cbMenu == null) {
			cbMenu = new JComboBox();
			cbMenu.setEditable(true);
			cbMenu.setEnabled(false);
			cbMenu.setModel(new DefaultComboBoxModel(new String[] {"밥요리", "면요리", "기타"}));
			cbMenu.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			cbMenu.setBounds(138, 116, 120, 34);
		}
		return cbMenu;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("조리 시간 : ");
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(36, 165, 99, 27);
		}
		return lblNewLabel_1_1_1;
	}
	private JComboBox getCbCookTime() {
		if (cbCookTime == null) {
			cbCookTime = new JComboBox();
			cbCookTime.setEditable(true);
			cbCookTime.setEnabled(false);
			cbCookTime.setModel(new DefaultComboBoxModel(new String[] {"10분 이내", "20분 이내", "30분 이내"}));
			cbCookTime.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			cbCookTime.setBounds(136, 159, 120, 34);
		}
		return cbCookTime;
	}
	private JButton getBtnRevise() {
		if (btnRevise == null) {
			btnRevise = new JButton("수정");
			btnRevise.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			btnRevise.setForeground(new Color(65, 105, 225));
			btnRevise.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					writeReviseAction();
					
				}
			});
			btnRevise.setBounds(354, 677, 90, 44);
		}
		return btnRevise;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("취소");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_1.setForeground(new Color(0, 0, 0));
			btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			btnNewButton_1.setBounds(460, 677, 90, 44);
		}
		return btnNewButton_1;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭제");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reviseDeleteAction();
				}
			});
			btnDelete.setForeground(Color.RED);
			btnDelete.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			btnDelete.setBounds(246, 677, 90, 44);
		}
		return btnDelete;
	}
	private JButton getBtnLike() {
		if (btnLike == null) {
			btnLike = new JButton("Like");
			btnLike.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			btnLike.setBackground(Color.WHITE);
			btnLike.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					likebtnAction();
				}
			});
			btnLike.setBounds(199, 217, 64, 50);
		}
		return btnLike;
	}
	private JTextField getTfLikeCount() {
		if (tfLikeCount == null) {
			tfLikeCount = new JTextField();
			tfLikeCount.setHorizontalAlignment(SwingConstants.CENTER);
			tfLikeCount.setFont(new Font("Lucida Grande", Font.BOLD, 20));
			tfLikeCount.setEditable(false);
			tfLikeCount.setBounds(124, 211, 67, 57);
			tfLikeCount.setColumns(10);
		}
		return tfLikeCount;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(36, 498, 508, 89);
			scrollPane.setViewportView(getInner_table());
		}
		return scrollPane;
	}
	private JTable getInner_table() {
		if (Inner_table == null) {
			Inner_table = new JTable();
			Inner_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Inner_table.setModel(Outer_table);
			scrollPane.setViewportView(Inner_table);
			
		}
		return Inner_table;
	}
	
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("댓글수정");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					commentUpdateAction();
				}
			});
			btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 14));
			btnNewButton_2.setBounds(35, 633, 90, 29);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(36, 281, 506, 205);
			scrollPane_1.setViewportView(getTextArea());
		}
		return scrollPane_1;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
			textArea.setWrapStyleWord(true);
			textArea.setLineWrap(true);
			
		}
		return textArea;
	}
	private JTextField getTfComment() {
		if (tfComment == null) {
			tfComment = new JTextField();
			tfComment.setBounds(36, 600, 508, 31);
			tfComment.setColumns(10);
		}
		return tfComment;
	}
	private JButton getBtnCommentDelete() {
		if (btnCommentDelete == null) {
			btnCommentDelete = new JButton("댓글삭제");
			btnCommentDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					commentDeleteAction();
				}
			});
			btnCommentDelete.setFont(new Font("굴림", Font.PLAIN, 14));
			btnCommentDelete.setBounds(138, 633, 90, 29);
		}
		return btnCommentDelete;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("댓글입력");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					commentInsertAction();
					tfComment.setText("");
					tableInit();
					searchAction();
				}
			});
			btnNewButton.setFont(new Font("굴림", Font.PLAIN, 14));
			btnNewButton.setBounds(458, 633, 90, 29);
		}
		return btnNewButton;
	}
	
	//게시글 수정
		private int writeReviseAction() {
			int fieldcheck=0;
			if(tfTitle.getText().length()==0) {
				JOptionPane.showMessageDialog(null, "제목을 입력하세요");
				fieldcheck++;
				return 0;
			}
			if(textArea.getText().length()==0) {
				JOptionPane.showMessageDialog(null, "내용을 입력하세요");
				fieldcheck++;
				return 0;
			}
		
			if(fieldcheck==0) {
				
			DbActionPost dbActionPost = new DbActionPost();
			FileInputStream input = null;
			File file = new File(tfFilePath2.getText());
			try {
				input = new FileInputStream(file);
			} catch (Exception e) {
				System.out.println(e);
			}
			int imageCheck=tfFilePath2.getText().length();
			dbActionPost.writeReviseAction(cbMenu.getSelectedItem().toString(), cbCookTime.getSelectedIndex()+1, tfTitle.getText().trim(),textArea.getText().trim(),input,imageCheck);
			JOptionPane.showMessageDialog(null, "수정이 완료되었습니다.");
			dispose();
			return 1;
			}
			return 0;
			
		}
	private void GetText() {
		DbActionPost dbAction = new DbActionPost();
		
		ArrayList<BeanPost> beanList = dbAction.GetText();
		int listCount = beanList.size();
		for(int i = 0; i < listCount;i++) {			// get i 는 한뭉탱이 
			//String idString = beanList.get(i).getId();
			//String idString = Integer.toString(beanList.get(i).getSeqno());
			//String seqno = Integer.toString(i+1);
			//String [] qTxt = {beanList.get(i).getSttsseqno(), beanList.get(i).getUserid(), beanList.get(i).getTitle()};
			
			String j = Integer.toString(i+1);
			String [] qTxt = {beanList.get(i).getTitle(),beanList.get(i).getWriter(),beanList.get(i).getText(),beanList.get(i).getMenu(),beanList.get(i).getCooktime()};
			tfTitle.setText(qTxt[0]);
			tfWriter.setText(qTxt[1]);
			textArea.setText(qTxt[2]);
			cbMenu.setSelectedItem(qTxt[3]);
			cbCookTime.setSelectedIndex((Integer.parseInt(qTxt[4])/10)-1);
			
			String filePath = Integer.toString(ShareVar.filename);
			tfFilePath.setText(filePath);
			
			//이미지 
			ImageIcon icon = new ImageIcon(filePath); 
	        Image img = icon.getImage();
	        Image changeImage = img.getScaledInstance(237, 160, Image.SCALE_DEFAULT);
	        ImageIcon changeIcon = new ImageIcon(changeImage);
			lblImage.setIcon(new ImageIcon(changeImage));
			lblImage.setHorizontalAlignment(SwingConstants.CENTER);
			
			File file = new File(filePath);
			file.delete();
			
			tfFilePath.setText("");
		}
		
	}
	
	// 로그인한사람이 글작성한사람인지 확인
	private void writerCheck() {
		btnDelete.setVisible(false);
		btnRevise.setVisible(false);
		tfFilePath2.setVisible(false);
		btnNewButton_3.setVisible(false);
		System.out.println(ShareVar.idUser);
		DbActionPost dbActionPost = new DbActionPost();
		// 현재 로그인되어있는 유저가 글을 작성햇는지 체크
		
		if(Integer.parseInt(ShareVar.userno)==dbActionPost.writerCheck()) {
			btnDelete.setVisible(true);
			btnRevise.setVisible(true);		
			tfTitle.setEditable(true);
			textArea.setEditable(true);
			cbMenu.setEnabled(true);
			cbCookTime.setEnabled(true);
			btnNewButton_3.setVisible(true);
			
		}
		if(ShareVar.idUser.equals("admin")){
			btnDelete.setVisible(true);
		}
	}
	
	//게시글 삭제
	private void reviseDeleteAction() {
		DbActionPost dbActionPost = new DbActionPost();
		if(dbActionPost.reviseDeleteAction()==true) {
			JOptionPane.showMessageDialog(null, "삭제가 완료되었습니다.");
			dispose();
		}
		
		
	}
	public void tableInit() {
		int i = Outer_table.getRowCount();
		Outer_table.addColumn("userid");
		Outer_table.addColumn("comment");
		Outer_table.addColumn("write_date");
		Outer_table.addColumn("seq");
		
		Outer_table.setColumnCount(4);
		
		for(int j=0; j<i; j++) {
			Outer_table.removeRow(0);
		}
		Inner_table.setAutoResizeMode(Inner_table.AUTO_RESIZE_OFF);
		
		int vIndex = 0;
		TableColumn col = Inner_table.getColumnModel().getColumn(vIndex);
		int width = 70;
		col.setPreferredWidth(width);
		vIndex = 1;
		col = Inner_table.getColumnModel().getColumn(vIndex);
		width = 300;
		col.setPreferredWidth(width);
		vIndex = 2;
		col = Inner_table.getColumnModel().getColumn(vIndex);
		width = 90;
		col.setPreferredWidth(width);
		vIndex = 3;
		col = Inner_table.getColumnModel().getColumn(vIndex);
		width = 45;
		col.setPreferredWidth(width);
	
	}
	// 댓글창 띄우기
	public void searchAction() {
		DbActionPost dbActionPost = new DbActionPost();
		
		ArrayList<BeanPost> beanList = dbActionPost.searchAction(ShareVar.postno);
		int listCount = beanList.size();
		for(int i = 0; i < listCount;i++) {			// get i 는 한뭉탱이 
			//String idString = beanList.get(i).getId();
			//String idString = Integer.toString(beanList.get(i).getSeqno());
			//String seqno = Integer.toString(i+1);
			//String [] qTxt = {beanList.get(i).getSttsseqno(), beanList.get(i).getUserid(), beanList.get(i).getTitle()};
			
			String j = Integer.toString(i+1);
			String [] qTxt = {beanList.get(i).getCommentUserid(), beanList.get(i).getComment(),beanList.get(i).getCommentdate(),beanList.get(i).getCommentno()};
			Outer_table.addRow(qTxt);
			
		}
		
		
	}
	
	// 댓글입력
	private void commentInsertAction() {
		if(tfComment.getText().length()==0) {
			JOptionPane.showMessageDialog(null, "댓글을 입력하세요!");			
		}else{
				
			
			DbActionPost dbaction = new DbActionPost();
			// dbaction.commentInsertAction boolean return
			if(dbaction.commentInsertAction(tfComment.getText().trim())==true) { // 댓글 입력이 성공했을때
				JOptionPane.showMessageDialog(null, "댓글 입력이 완료되었습니다.");
			}else {
				JOptionPane.showMessageDialog(null, "댓글 입력이 되지 않았습니다. \n 관리자에게 문의해주세요.");
			}
		}
	}
	
	
	private void commentUpdateAction() { // id 체크후 수정창으로 이동
		int i = Inner_table.getSelectedRow();
		String wkSequence = (String)Inner_table.getValueAt(i, 3);// 테이블에있는 댓글넘버 체크
		ShareVar.commentno = wkSequence;
		String comment = (String)Inner_table.getValueAt(i, 1);// 테이블에있는 댓글 체크
		String commentIdCheck=(String)Inner_table.getValueAt(i, 0); // 테이블에 있는 유저아이디 체크
		int seqno = Integer.parseInt(wkSequence);
		DbActionPost dbAction = new DbActionPost();
		if(commentIdCheck.equals(ShareVar.idUser)||ShareVar.userno.equals("1")) { // 댓글작성자, admin만 수정가능
			ShareVar.updateTf = comment; // 댓글내용 수정칸텍스트필드로 값 가져가기
			ReviseField reviseField = new ReviseField();
			reviseField.setLocationRelativeTo(null);
			reviseField.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "댓글 수정이 되지 않았습니다. \n 본인이 작성한 댓글만 수정 가능합니다.");
		}
	}
	
	//댓글삭제
	private void commentDeleteAction() {
		int i = Inner_table.getSelectedRow();
		String wkSequence = (String)Inner_table.getValueAt(i, 3);
		String comment = (String)Inner_table.getValueAt(i, 1);
		String commentIdCheck=(String)Inner_table.getValueAt(i, 0);
		if(commentIdCheck.equals(ShareVar.idUser)||ShareVar.userno.equals("1")) {
			DbActionPost dbActionPost = new DbActionPost();		
			if(dbActionPost.commentDeleteAction(wkSequence)==true) {
				JOptionPane.showMessageDialog(null, "댓글 삭제가 완료되었습니다.");
			}else {
				JOptionPane.showMessageDialog(null, "댓글 삭제가 되지 않았습니다. \n 관리자에게 문의해주세요.");
			}
		}else {
			JOptionPane.showMessageDialog(null, "댓글 삭제가 되지 않았습니다. \n 본인이 작성한 댓글만 삭제 가능합니다.");
		}
		
	}
	
	
	
	private void likebtnAction() { // 좋아요 버튼액션
		
		DbActionPost dbAction = new DbActionPost();
		int likeCheck = dbAction.likeCheck();
		if(likeCheck==0) {
			if(dbAction.likeUpdateAction()==true) {
				btnLike.setForeground(new Color(147, 112, 219));
//				btnLike.setBackground(new Color(147, 112, 219));
				JOptionPane.showMessageDialog(null, "이 글을 추천합니다!");
				btnLike.setText("Like");
				// 좋아요버튼 색 바꾸기!
			}
		}
		if(likeCheck==1) {
			if(dbAction.likeDeleteAction()==true) {
				
//				btnLike.setBackground(new Color(255,255,255));
				btnLike.setForeground(new Color(0, 0, 0));				
				JOptionPane.showMessageDialog(null, "이 글을 추천하지 않습니다!");
				// 좋아요버튼 색 바꾸기!
			}
		}
		if(likeCheck==2) {
			if(dbAction.likeInsertAction()==true) {
				btnLike.setForeground(new Color(147, 112, 219));
				JOptionPane.showMessageDialog(null, "이 글을 추천합니다!");
				// 좋아요버튼 색 바꾸기!
			}
		}
	}
	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
			lblImage.setBounds(312, 67, 237, 160);
			lblImage.setBorder(LineBorder.createGrayLineBorder());
		}
		return lblImage;
	}
	private JLabel getTfFilePath() {
		if (tfFilePath == null) {
			tfFilePath = new JLabel("");
			tfFilePath.setBounds(497, 26, 82, 31);
		}
		return tfFilePath;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("이미지 수정 (+)");
			btnNewButton_3.setForeground(new Color(30, 144, 255));
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FilePath();
				}
			});
			btnNewButton_3.setBounds(427, 237, 110, 38);
		}
		return btnNewButton_3;
	}
	
	private void FilePath() {
	      JFileChooser chooser = new JFileChooser();
	      FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG, BMP", "jpg","png","bmp");
	      chooser.setFileFilter(filter);
	      
	      int ret = chooser.showOpenDialog(null);
	      if(ret != JFileChooser.APPROVE_OPTION) {
	         JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다!","경고", JOptionPane.WARNING_MESSAGE);
	         return;
	      }
	      String filePath = chooser.getSelectedFile().getPath();
	      ImageIcon icon = new ImageIcon(filePath); 
          Image img = icon.getImage();
          Image changeImage = img.getScaledInstance(237, 160, Image.SCALE_DEFAULT);
          ImageIcon changeIcon = new ImageIcon(changeImage);
	      
	      tfFilePath2.setText(filePath);
	      lblImage.setIcon(new ImageIcon(changeImage));
	      lblImage.setHorizontalAlignment(SwingConstants.CENTER);
	            
	   }
				

	private JLabel getLbllike() {
		if (lbllike == null) {
			lbllike = new JLabel("");
			lbllike.setBounds(44, 206, 70, 59);
			ImageIcon icon = new ImageIcon("/Users/tj/Desktop/images/Like.png"); 
	        Image img = icon.getImage();
	        Image changeImage = img.getScaledInstance(70, 59, Image.SCALE_DEFAULT);
	        ImageIcon changeIcon = new ImageIcon(changeImage);
	        lbllike.setIcon(changeIcon);
	         
		
		}
		return lbllike;
	}
	private JTextField getTfFilePath2() {
		if (tfFilePath2 == null) {
			tfFilePath2 = new JTextField();
			tfFilePath2.setBounds(311, 238, 114, 34);
			tfFilePath2.setColumns(10);
		}
		return tfFilePath2;
	}
}
