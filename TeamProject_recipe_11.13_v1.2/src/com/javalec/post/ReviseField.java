package com.javalec.post;


import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.base.ShareVar;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;

public class ReviseField extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfRevise;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ReviseField dialog = new ReviseField();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the dialog.
	 */
	public ReviseField() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				tfRevise.setText(ShareVar.updateTf);
			}
		});
		setTitle("수정");
		setBounds(100, 100, 646, 112);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			tfRevise = new JTextField();
			tfRevise.setBounds(32, 27, 502, 37);
			contentPanel.add(tfRevise);
			tfRevise.setColumns(10);
		}
		{
			JButton btnRevise = new JButton("수정");
			btnRevise.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			btnRevise.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					commentUpdateAction();
				}
			});
			btnRevise.setBounds(546, 19, 71, 52);
			contentPanel.add(btnRevise);
		}
	}
	
	
	private void commentUpdateAction() { // 댓글수정
		if(tfRevise.getText().length()==0) {
			JOptionPane.showMessageDialog(null, "댓글을 입력하세요!");			
		}else{	
			DbActionPost dbaction = new DbActionPost();
			if(dbaction.commentReviseAction(tfRevise.getText().trim())==true) {
				JOptionPane.showMessageDialog(null, "수정완료");
				dispose();
			}else {
				JOptionPane.showMessageDialog(null, "입력실패!");
			}
		}
		
	}
	
	

}
