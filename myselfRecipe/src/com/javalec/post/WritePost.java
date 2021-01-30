package com.javalec.post;

import java.awt.EventQueue;



import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.javalec.base.ShareVar;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JScrollPane;



public class WritePost extends JDialog {
	private JLabel lblNewLabel;
	private JTextField tfTitle;
	private JLabel lblNewLabel_1;
	private JTextField tfWriter;
	private JLabel lblNewLabel_1_1;
	private JComboBox cbMenu;
	private JLabel lblNewLabel_1_1_1;
	private JComboBox cbCookTime;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;
	private JLabel lblImage;
	private JTextField tfFilePath;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WritePost dialog = new WritePost();
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
	public WritePost() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				tfWriter.setText(ShareVar.idUser);
			}
		});
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석. all rights reserved");
		setBounds(100, 100, 607, 630);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTfTitle());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getTfWriter());
		getContentPane().add(getLblNewLabel_1_1());
		getContentPane().add(getCbMenu());
		getContentPane().add(getLblNewLabel_1_1_1());
		getContentPane().add(getCbCookTime());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblImage());
		getContentPane().add(getTfFilePath());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getScrollPane());

	}
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("제목 : ");
			lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(54, 27, 70, 27);
		}
		return lblNewLabel;
	}
	
	private JTextField getTfTitle() {
		if (tfTitle == null) {
			tfTitle = new JTextField();
			tfTitle.setHorizontalAlignment(SwingConstants.CENTER);
			tfTitle.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			tfTitle.setBounds(138, 24, 403, 32);
			tfTitle.setColumns(10);
		}
		return tfTitle;
	}
	
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("작성자 : ");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel_1.setBounds(54, 78, 70, 27);
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
			tfWriter.setBounds(138, 75, 168, 32);
		}
		return tfWriter;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("메뉴 : ");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(54, 132, 70, 27);
		}
		return lblNewLabel_1_1;
	}
	
	private JComboBox getCbMenu() {
		if (cbMenu == null) {
			cbMenu = new JComboBox();
			cbMenu.setBackground(Color.WHITE);
			cbMenu.setModel(new DefaultComboBoxModel(new String[] {"밥요리", "면요리", "기타"}));
			cbMenu.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			cbMenu.setBounds(160, 124, 120, 41);
		}
		return cbMenu;
	}
	
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("조리 시간 : ");
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(54, 178, 84, 27);
		}
		return lblNewLabel_1_1_1;
	}
	
	private JComboBox getCbCookTime() {
		if (cbCookTime == null) {
			cbCookTime = new JComboBox();
			cbCookTime.setBackground(Color.WHITE);
			cbCookTime.setModel(new DefaultComboBoxModel(new String[] {"10분 이내", "20분 이내", "30분 이내"}));
			cbCookTime.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			cbCookTime.setBounds(160, 170, 120, 41);
		}
		return cbCookTime;
	}
	
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("완료");
			btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			btnNewButton.setForeground(new Color(65, 105, 225));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(writeInsertAction()==1) {
						
						JOptionPane.showMessageDialog(null, "작성완료");
						dispose();
					}
				}
			});
			btnNewButton.setBounds(359, 551, 90, 44);
		}
		return btnNewButton;
	}
	
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("취소");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_1.setForeground(new Color(255, 0, 0));
			btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			btnNewButton_1.setBounds(457, 551, 90, 44);
		}
		return btnNewButton_1;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon("/Users/tj/Desktop/스크린샷 2020-11-06 오후 2.23.25.png"));
			lblNewLabel_2.setBounds(309, 187, -4, 59);
		}
		return lblNewLabel_2;
	}
	
	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
			lblImage.setBackground(Color.WHITE);
			lblImage.setHorizontalAlignment(SwingConstants.CENTER);
			lblImage.setBorder(LineBorder.createGrayLineBorder());
			lblImage.setBounds(365, 69, 179, 138);
		}
		return lblImage;
	}
	
	
	// 게시글작성
	private JTextField getTfFilePath() {
		if (tfFilePath == null) {
			tfFilePath = new JTextField();
			tfFilePath.setEditable(false);
			tfFilePath.setBounds(49, 224, 386, 27);
			tfFilePath.setColumns(10);
		}
		return tfFilePath;
	}
	
	
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("파일 첨부 ( + )");
			btnNewButton_2.setForeground(new Color(65, 105, 225));
			btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					FilePath();
				}
			});
			btnNewButton_2.setBounds(439, 219, 114, 35);
		}
		return btnNewButton_2;
	}
	
	
	private int writeInsertAction() {	
		
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
		if(tfFilePath.getText().length()==0) {
			JOptionPane.showMessageDialog(null, "사진을 넣어주세요");
			fieldcheck++;
			return 0;
		}
		
		
		if(fieldcheck==0) {
			DbActionPost dbAction = new DbActionPost();
			FileInputStream input = null;
			File file = new File(tfFilePath.getText());
			try {
				input = new FileInputStream(file);
			} catch (Exception e) {
				System.out.println(e);
			}
			DbActionPost dbActionPost = new DbActionPost();
			dbAction.writeinsertAction(cbMenu.getSelectedItem().toString(), cbCookTime.getSelectedIndex()+1, tfTitle.getText().trim(),textArea.getText().trim(),input);
			
			
			return 1;
		}
		return 0;
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
		tfFilePath.setText(filePath);
		ImageIcon icon = new ImageIcon(filePath); 
        Image img = icon.getImage();
        Image changeImage = img.getScaledInstance(179, 138, Image.SCALE_DEFAULT);
        ImageIcon changeIcon = new ImageIcon(changeImage);
		lblImage.setIcon(new ImageIcon(changeImage));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
				
	}

	
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(34, 269, 510, 270);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
	
 

