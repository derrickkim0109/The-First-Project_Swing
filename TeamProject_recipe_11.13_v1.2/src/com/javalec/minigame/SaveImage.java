package com.javalec.minigame;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SaveImage extends JDialog {
	private JButton btnLoad;
	private JButton btnSave;
	private JTextField tfFilePath;
	private JLabel gameimage;
	FileInputStream file;
	String filename = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaveImage dialog = new SaveImage();
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
	public SaveImage() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnLoad());
		getContentPane().add(getBtnSave());
		getContentPane().add(getTfFilePath());
		getContentPane().add(getGameimage());

	}

	
	
	
	
	
	
	private JButton getBtnLoad() {
		if (btnLoad == null) {
			btnLoad = new JButton("Load");
			btnLoad.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FilePath();
				}
			});
			btnLoad.setBounds(335, 42, 84, 74);
		}
		return btnLoad;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					insertAction();
				}
			});
			btnSave.setBounds(337, 126, 84, 74);
		}
		return btnSave;
	}
	private JTextField getTfFilePath() {
		if (tfFilePath == null) {
			tfFilePath = new JTextField();
			tfFilePath.setBounds(31, 224, 388, 20);
			tfFilePath.setColumns(10);
		}
		return tfFilePath;
	}
	private JLabel getGameimage() {
		if (gameimage == null) {
			gameimage = new JLabel("");
			gameimage.setHorizontalAlignment(SwingConstants.CENTER);
			gameimage.setBounds(31, 29, 292, 179);
		}
		return gameimage;
	}



		// 메소드
	// 파일 불러와서 보여주기
	private void FilePath() {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG, BMP, JPEG", "jpeg", "jpg","png","bmp");
		chooser.setFileFilter(filter);
		
		int ret = chooser.showOpenDialog(null);
		if(ret != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다!", "경고", JOptionPane.WARNING_MESSAGE);
			return;
		}
		String filePath = chooser.getSelectedFile().getPath();
		tfFilePath.setText(filePath);
		gameimage.setIcon(new ImageIcon(filePath));
		gameimage.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	
	// 불러온 이미지 파일 디비에 이미지 저장
	private void insertAction(){

		FileInputStream input = null;
		File file = new File(tfFilePath.getText());
		try {
			input = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DbActionMiniGame dbaction = new DbActionMiniGame(filename, input);
		boolean aaa = dbaction.InsertAction();
		if(aaa == true){
	          JOptionPane.showMessageDialog(null, "저장되었습니다.");                    
		}else{
	          JOptionPane.showMessageDialog(null, "Error!");   
	          
		}
	}
	




} //끝
