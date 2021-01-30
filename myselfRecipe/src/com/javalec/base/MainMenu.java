package com.javalec.base;

import com.javalec.admin.AdminNoticeWrite;
import com.javalec.admin.BeanAdminNotice;
import com.javalec.admin.BeanAdminUser;
import com.javalec.admin.DBadminNoitceAction;
import com.javalec.admin.DBadminUserAction;
import com.javalec.join.*;
import com.javalec.login.Login;
import com.javalec.minigame.MiniGameResult;
import com.javalec.mypageEdition.BeanMyList;
import com.javalec.mypageEdition.DbActionEdition;
import com.javalec.mypageEdition.DbActionMyList;
import com.javalec.post.RevisePost;
import com.javalec.post.WritePost;
import com.javalec.recipelist.BeanRecipe;
import com.javalec.recipelist.DbActionRecipe;

import java.awt.EventQueue;


import javax.swing.JDialog;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.Panel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;

public class MainMenu extends JDialog {
	private JPanel sideBar;
	private JPanel homeMenu;
	private JLabel lblBrandLogo;
	private JLabel lblHome;
	private JPanel noticeMenu;
	private JLabel lblHome_1;
	private JPanel recipeMenu;
	private JLabel RecipeTab;
	private JPanel myPageMenu;
	private JLabel lblHome_1_1_1;
	private JPanel miniGameMenu;
	private JLabel lblHome_1_1_1_1;
	private JPanel adminMenu;
	private JLabel lblAdminMenu;
	private JPanel panel;
	private JPanel homePanel;
	private JPanel RecipeListPanel;
	private JTabbedPane tabbedPane;
	private JPanel Best;
	private JPanel Update;
	private JScrollPane scrollPane;
	private JTable inner_table1;
	private JTextField tfSearch;
	private JButton btnOk_1;
	private JComboBox cbMenu;
	private JComboBox cbCookTime;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JComboBox cbMenu2;
	private JLabel lblNewLabel_1_1;
	private JComboBox cbCookTime2;
	private JTextField tfSearch2;
	private JButton btnOk_1_1;
	private JScrollPane scrollPane_1;
	private JButton btnNoticeView;
	private JLabel label_3;
	private JLabel lblNewLabel_3_1;
	private JPanel mypagePanel;
	private JLabel logout;
	private JLabel lblMyHome;
	private JTabbedPane tabbedPane_1;
	private JPanel mystory;
	private JPanel infoRevise;
	private JButton btnOK;
	private JLabel label_4_1;
	private JPanel AdminPanel;
	private JTabbedPane tabbedPane_1_1;
	private JPanel usermanage;
	private JLabel lblNewLabel_1_2;
	private JPanel panel_1_1;
	private JLabel lblNewLabel_2_1;
	private JTextField tfUserNum;
	private JLabel lblNewLabel_2_1_1;
	private JTextField tfUserName;
	private JLabel lblNewLabel_2_2;
	private JTextField tfUserID;
	private JLabel lblNewLabel_2_4;
	private JTextField tfUserState;
	private JLabel lblNewLabel_2_4_1;
	private JTextField tfPostNum;
	private JLabel lblNewLabel_2_4_1_1;
	private JTextField tfLikeNum;
	private JLabel lblNewLabel_2_1_1_1;
	private JTextField tfUserInsertDate;
	private JLabel lblNewLabel_2_1_1_1_1;
	private JTextField tfUserDeleteDate;
	private JLabel lblNewLabel_4;
	private JComboBox cbUserSelectSearch;
	private JTextField tfUserSearch;
	private JButton btnUserSearch;
	private JScrollPane scrollPane_2;
	private JPanel noticemanage;
	private JLabel lblNewLabel_3_1_1;
	private JScrollPane scrollPane_1_1;
	private JComboBox cbNoticeSelectSearch;
	private JTextField tfNoitceSelect;
	private JButton btnNoticeSearch;
	private JLabel lblNewLabel_4_1_2;
	private JButton btnNoticeDelete;
	private JButton btnNoticeWrite;
	private JLabel lblNewLabel_1_2_1;
	private JPanel panel_3;
	private JLabel lblNewLabel_4_1;
	private JTextField tfNoticeTitle;
	private JLabel lblNewLabel_4_1_1;
	private JTextField tfNoticeDate;
	private JTable NoticeInner_Table;
	
	private JButton btnNoticeRevise;
	private JTable UserInner_Table;
	
	//--------mypage menu table format--------------------
	private final DefaultTableModel MyPage_Outer_Table = new DefaultTableModel();
	//--------recipelist menu table format--------------------
	private final DefaultTableModel bestOuter_Table = new DefaultTableModel();
	private final DefaultTableModel updateOuter_Table = new DefaultTableModel();
	//--------admin menu table format--------------------
	private final DefaultTableModel UserOuter_Table = new DefaultTableModel(); 
	private final DefaultTableModel NoticeOuter_Table = new DefaultTableModel();
	private final DefaultTableModel UserNoticeOuter_Table = new DefaultTableModel();
	//---------------------------------------------------
	
	private JLabel lblNewLabel_2_1_1_2;
	private JTextField tfUserEmail;
	private JPanel noticePanel;
	private JComboBox cbUserNoticeSelectSearch;
	private JLabel lblNewLabel_3_1_1_1;
	private JTextField tfUserNoticeSearch;
	private JButton btnUserNoticeSearch;
	private JScrollPane scrollPane_1_1_1;
	private JTable UserNoticeInner_Table;
	private JPanel miniGamePanel;
	private JButton btnNewButton_1;
	private JLabel label_1_1;
	private JLabel lblNewLabel_5;
	private JLabel label_4;
	private JTable inner_table2;
	private JTextField textField;
	private JComboBox cbTitleText;
	private JTextField tfMypageSearch;
	private JScrollPane myStroyPane;
	private JButton btnSearch;
	private JTextField textField_2;
	private JLabel label_4_2;
	private JLabel label_4_3;
	private JTable table;
	private JLabel lblId;
	private JTextField tfIdUser;
	private JLabel lblPw;
	private JLabel lblPw_1;
	private JLabel lblEmail;
	private JTextField tfEmail;
	private JTextField textField_4;
	private JPasswordField tfPWEdition;
	private JPasswordField tfPWCheckEdition;
	private JTextField tfDomain;
	private JLabel label_3_1;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JComboBox cbEmail;
	private JTextField tfEmailMessage;
	private JTextField pwMessage;
	private JTable table_5;
	private JTable table_6;
	private JTable Mypage_Inner_Table;
	private JLabel lblNewLabel_2;
	private JScrollPane scroll;
	private JTextArea textArea;
	private JTextArea tfNoticeText;
	private JLabel labelSecession;
	private JLabel lblNewLabel_6;
	private JLabel tfMyPageIDtop;
	private JTable table_7;
	private JButton btnUserDelete;
	private int adminUserNum;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu dialog = new MainMenu();
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
	//--------윈도우 open 시 admin menu 초기화면--------------------
	public MainMenu() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				btnNoticeDelete.setVisible(false);
				btnNoticeRevise.setVisible(false);
				clearColumn();
				UserTableInit();
				userSearchAction();
				NoticeTableInit();
				noticeSearchAction();
				userNoticeTableInit();
				userNoticeSearchAction();
				updateTableInit();
				bestSearchAction();
				bestTableInit();
				SearchAction();
				if(ShareVar.idUser.equals("admin")) {
					getAdminMenu().setVisible(true);
				} else {
					getAdminMenu().setVisible(false);
				}
				
			}
			
//--------화면 전환 시 초기화면--------------------			
			@Override
			public void windowActivated(WindowEvent e) {
				btnNoticeDelete.setVisible(false);
				btnNoticeRevise.setVisible(false);
				clearColumn();
				userNoticeTableInit();
				userNoticeSearchAction();
				NoticeTableInit();
				noticeSearchAction();
//				updateTableInit();
//				bestSearchAction();
//				bestTableInit();
//				SearchAction();
			}
		});
		setTitle("copyright © 1조 - 김태현, 박경미, 송예진, 최지석 all rights reserved.");
		setBounds(100, 100, 664, 484);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		getContentPane().add(getPanel());
		getContentPane().add(getSideBar());

	}
	private JPanel getSideBar() {
		if (sideBar == null) {
			sideBar = new JPanel();
			sideBar.setBackground(SystemColor.activeCaptionBorder);
			sideBar.setBounds(0, 0, 224, 461);
			sideBar.setLayout(null);
			sideBar.add(getLblBrandLogo());
			sideBar.add(getHomeMenu());
			sideBar.add(getNoticeMenu());
			sideBar.add(getRecipeMenu());
			sideBar.add(getMyPageMenu());
			sideBar.add(getMiniGameMenu());
			sideBar.add(getAdminMenu());
			sideBar.add(getLogout());
		}
		return sideBar;
	}
	private JPanel getHomeMenu() {
		if (homeMenu == null) {
			homeMenu = new JPanel();
			homeMenu.setBackground(Color.BLACK);
			homeMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// home menu click 시 menu 화면출력 및 버튼 흰색으로 변경
					homePanel.setVisible(true);
					noticePanel.setVisible(false);
					RecipeListPanel.setVisible(false);
					mypagePanel.setVisible(false);
					AdminPanel.setVisible(false);
					miniGamePanel.setVisible(false);
					getHomeMenu().setBackground(Color.GRAY);				
					getNoticeMenu().setBackground(Color.BLACK);
					getRecipeMenu().setBackground(Color.BLACK);
					getMyPageMenu().setBackground(Color.BLACK);
					getAdminMenu().setBackground(Color.BLACK);
					getMiniGameMenu().setBackground(Color.BLACK);
				}
			});
			getHomeMenu().setBackground(Color.GRAY);	
			homeMenu.setBounds(0, 118, 224, 44);
			homeMenu.setLayout(null);
			homeMenu.add(getLblHome());
		}
		return homeMenu;
	}
	private JLabel getLblBrandLogo() {
		if (lblBrandLogo == null) {
			lblBrandLogo = new JLabel();
			lblBrandLogo.setForeground(Color.WHITE);
			lblBrandLogo.setBackground(Color.WHITE);
			lblBrandLogo.setHorizontalAlignment(SwingConstants.CENTER);
			lblBrandLogo.setBounds(0, 0, 224, 117);
			
			//lblBrandLogo.setIcon(new ImageIcon("/Users/kyeongmi/Desktop/menubarImage.png"));
			// 이미지 jlabel 사이즈 맞추기
	         ImageIcon icon = new ImageIcon("/Users/tj/Desktop/images/Menubar.png"); 
	         Image img = icon.getImage();
	         Image changeImage = img.getScaledInstance(224, 117, Image.SCALE_DEFAULT);
	         ImageIcon changeIcon = new ImageIcon(changeImage);
	        lblBrandLogo.setIcon(changeIcon);;
		}
		return lblBrandLogo;
	}
	private JLabel getLblHome() {
		if (lblHome == null) {
			lblHome = new JLabel("HOME");
			lblHome.setForeground(Color.WHITE);
			lblHome.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			lblHome.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome.setBounds(67, 0, 89, 44);
		}
		return lblHome;
	}
	private JPanel getNoticeMenu() {
		if (noticeMenu == null) {
			noticeMenu = new JPanel();
			noticeMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getButton() == 1) {
					ShareVar.noticeMenuClick = 1;
					homePanel.setVisible(false);
					noticePanel.setVisible(true);
					RecipeListPanel.setVisible(false);
					mypagePanel.setVisible(false);
					AdminPanel.setVisible(false);
					miniGamePanel.setVisible(false);
					getHomeMenu().setBackground(Color.BLACK);
					getNoticeMenu().setBackground(Color.GRAY);
					getRecipeMenu().setBackground(Color.BLACK);
					getMyPageMenu().setBackground(Color.BLACK);
					getAdminMenu().setBackground(Color.BLACK);
					getMiniGameMenu().setBackground(Color.BLACK);
					}
				}
			});
			noticeMenu.setLayout(null);
			noticeMenu.setBackground(Color.BLACK);
			noticeMenu.setBounds(0, 163, 224, 44);
			noticeMenu.add(getLblHome_1());
		}
		return noticeMenu;
	}
	private JLabel getLblHome_1() {
		if (lblHome_1 == null) {
			lblHome_1 = new JLabel("Notice");
			lblHome_1.setForeground(Color.WHITE);
			lblHome_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			lblHome_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome_1.setBounds(67, 0, 89, 44);
		}
		return lblHome_1;
	}
	private JPanel getRecipeMenu() {
		if (recipeMenu == null) {
			recipeMenu = new JPanel();
			recipeMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					homePanel.setVisible(false);
					noticePanel.setVisible(false);
					RecipeListPanel.setVisible(true);
					mypagePanel.setVisible(false);
					AdminPanel.setVisible(false);
					miniGamePanel.setVisible(false);
					getHomeMenu().setBackground(Color.BLACK);
					getNoticeMenu().setBackground(Color.BLACK);
					getRecipeMenu().setBackground(Color.GRAY);
					getMyPageMenu().setBackground(Color.BLACK);
					getAdminMenu().setBackground(Color.BLACK);
					getMiniGameMenu().setBackground(Color.BLACK);
					
					bestTableInit();
					bestSearchAction();
					
					updateTableInit();
					SearchAction();
					
				}
			});
			recipeMenu.setLayout(null);
			recipeMenu.setBackground(Color.BLACK);
			recipeMenu.setBounds(0, 208, 224, 44);
			recipeMenu.add(getRecipeTab());
		}
		return recipeMenu;
	}
	private JLabel getRecipeTab() {
		if (RecipeTab == null) {
			RecipeTab = new JLabel("Recipe");
			RecipeTab.setForeground(Color.WHITE);
			RecipeTab.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			RecipeTab.setHorizontalAlignment(SwingConstants.CENTER);
			RecipeTab.setBounds(67, 0, 89, 44);
		}
		return RecipeTab;
	}
	private JPanel getMyPageMenu() {
		if (myPageMenu == null) {
			myPageMenu = new JPanel();
			myPageMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					homePanel.setVisible(false);
					noticePanel.setVisible(false);
					RecipeListPanel.setVisible(false);
					mypagePanel.setVisible(true);
					AdminPanel.setVisible(false);
					miniGamePanel.setVisible(false);
					getHomeMenu().setBackground(Color.BLACK);
					getNoticeMenu().setBackground(Color.BLACK);
					getRecipeMenu().setBackground(Color.BLACK);
					getMyPageMenu().setBackground(Color.GRAY);
					getAdminMenu().setBackground(Color.BLACK);
					getMiniGameMenu().setBackground(Color.BLACK);

					TableInit();
					searchAction();
				}
			});
			myPageMenu.setLayout(null);
			myPageMenu.setBackground(Color.BLACK);
			myPageMenu.setBounds(0, 253, 224, 44);
			myPageMenu.add(getLblHome_1_1_1());
		}
		return myPageMenu;
	}
	private JLabel getLblHome_1_1_1() {
		if (lblHome_1_1_1 == null) {
			lblHome_1_1_1 = new JLabel("MyPage");
			lblHome_1_1_1.setForeground(Color.WHITE);
			lblHome_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			lblHome_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome_1_1_1.setBounds(67, 0, 89, 44);
		}
		return lblHome_1_1_1;
	}
	private JPanel getMiniGameMenu() {
		if (miniGameMenu == null) {
			miniGameMenu = new JPanel();
			miniGameMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					ShareVar.noticeMenuClick=0;
					homePanel.setVisible(false);
					noticePanel.setVisible(false);
					RecipeListPanel.setVisible(false);
					mypagePanel.setVisible(false);
					AdminPanel.setVisible(false);
					miniGamePanel.setVisible(true);
					getHomeMenu().setBackground(Color.BLACK);
					getNoticeMenu().setBackground(Color.BLACK);
					getRecipeMenu().setBackground(Color.BLACK);
					getMyPageMenu().setBackground(Color.BLACK);
					getAdminMenu().setBackground(Color.BLACK);
					getMiniGameMenu().setBackground(Color.GRAY);
					
				}
			});
			miniGameMenu.setLayout(null);
			miniGameMenu.setBackground(Color.BLACK);
			miniGameMenu.setBounds(0, 298, 224, 44);
			miniGameMenu.add(getLblHome_1_1_1_1());
		}
		return miniGameMenu;
	}
	private JLabel getLblHome_1_1_1_1() {
		if (lblHome_1_1_1_1 == null) {
			lblHome_1_1_1_1 = new JLabel("Mini Game\n");
			lblHome_1_1_1_1.setForeground(Color.WHITE);
			lblHome_1_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			lblHome_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblHome_1_1_1_1.setBounds(67, 0, 89, 44);
		}
		return lblHome_1_1_1_1;
	}
	private JPanel getAdminMenu() {
		if (adminMenu == null) {
			adminMenu = new JPanel();
			adminMenu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getButton() == 1) {
					ShareVar.noticeMenuClick=0;
					homePanel.setVisible(false);
					noticePanel.setVisible(false);
					RecipeListPanel.setVisible(false);
					mypagePanel.setVisible(false);
					miniGamePanel.setVisible(false);
					//if(ShareVar.userno.equals("1")) {
					AdminPanel.setVisible(true);
					getAdminMenu().setBackground(Color.GRAY);
					//}
					getHomeMenu().setBackground(Color.BLACK);
					getNoticeMenu().setBackground(Color.BLACK);
					getRecipeMenu().setBackground(Color.BLACK);
					getMyPageMenu().setBackground(Color.BLACK);
					getMiniGameMenu().setBackground(Color.BLACK);
					
					}
					
				}
			});
			adminMenu.setLayout(null);
			adminMenu.setBackground(Color.BLACK);
			adminMenu.setBounds(0, 343, 224, 44);
			adminMenu.add(getLblAdminMenu());
		}
		return adminMenu;
	}
	private JLabel getLblAdminMenu() {
		if (lblAdminMenu == null) {
			lblAdminMenu = new JLabel("Admin Menu");
			lblAdminMenu.setForeground(Color.WHITE);
			lblAdminMenu.setFont(new Font("Lucida Grande", Font.BOLD, 15));
			lblAdminMenu.setHorizontalAlignment(SwingConstants.CENTER);
			lblAdminMenu.setBounds(55, 0, 113, 44);
		}
		return lblAdminMenu;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(225, 0, 439, 461);
			panel.setLayout(new CardLayout(0, 0));
			panel.add(getPanel_2_1(), "name_11753955479258");
			panel.add(getAdminPanel(), "name_11578906124185");
			panel.add(getMiniGamePanel(), "name_6598966401622");
			panel.add(getNoticePanel(), "name_10408455378388");
			panel.add(getMypagePanel(), "name_9819590572768");
			panel.add(getRecipeListPanel(), "name_13098176263849");
		}
		return panel;
	}
	private JPanel getPanel_2_1() {
		if (homePanel == null) {
			homePanel = new JPanel();
			homePanel.setBackground(Color.WHITE);
			homePanel.setLayout(null);
			homePanel.add(getLblNewLabel_2());
		}
		return homePanel;
	}
	private JPanel getRecipeListPanel() {
		if (RecipeListPanel == null) {
			RecipeListPanel = new JPanel();
			RecipeListPanel.setBackground(Color.WHITE);
			RecipeListPanel.setLayout(null);
			RecipeListPanel.add(getTabbedPane());
			RecipeListPanel.add(getBtnNoticeView());
			RecipeListPanel.add(getLabel_3_1());
			RecipeListPanel.add(getBtnNewButton_1());
		}
		return RecipeListPanel;
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(20, 124, 393, 325);
			tabbedPane.addTab("Best", null, getBest(), null);
			tabbedPane.addTab("Update", null, getUpdate(), null);
		}
		return tabbedPane;
	}
	private JPanel getBest() {
		if (Best == null) {
			Best = new JPanel();
			Best.setLayout(null);
			Best.add(getScrollPane());
			Best.add(getBtnOk_1());
			Best.add(getCbMenu());
			Best.add(getCbCookTime());
			Best.add(getLblNewLabel());
			Best.add(getLblNewLabel_1());
			Best.add(getTfSearch());
		}
		return Best;
	}
	private JPanel getUpdate() {
		if (Update == null) {
			Update = new JPanel();
			Update.setLayout(null);
			Update.add(getLblNewLabel_3_1());
			Update.add(getCbMenu2());
			Update.add(getLblNewLabel_1_1());
			Update.add(getCbCookTime2());
			Update.add(getTfSearch2());
			Update.add(getBtnOk_1_1());
			Update.add(getScrollPane_1());
		}
		return Update;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(6, 77, 361, 198);
			scrollPane.setViewportView(getInner_table1());
		} 
		return scrollPane;
	}
	private JTable getInner_table1() {
		if (inner_table1 == null) {
			inner_table1 = new JTable();
			inner_table1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == 1){
						bestTableClick();
						goToRevisePost();
					}
				}
			});
			inner_table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			inner_table1.setModel(bestOuter_Table);			
		}
		return inner_table1;
	}

	private JTextField getTfSearch() {
		if (tfSearch == null) {
			tfSearch = new JTextField();
			tfSearch.setBounds(11, 40, 266, 27);
			tfSearch.setColumns(10);
			tfSearch.setBorder(LineBorder.createGrayLineBorder());
		}
		return tfSearch;
	}
	private JButton getBtnOk_1() {
		if (btnOk_1 == null) {
			btnOk_1 = new JButton("검색");
			btnOk_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					bestConditionQuery();
					SearchAction();
					
				}
			});
			btnOk_1.setBounds(289, 34, 68, 40);
		}
		return btnOk_1;
	}
	private JComboBox getCbMenu() {
		if (cbMenu == null) {
			cbMenu = new JComboBox();
			cbMenu.setModel(new DefaultComboBoxModel(new String[] {"전체", "밥요리", "면요리", "기타"}));
			cbMenu.setBounds(91, 10, 93, 27);
		}
		return cbMenu;
	}
	private JComboBox getCbCookTime() {
		if (cbCookTime == null) {
			cbCookTime = new JComboBox();
			cbCookTime.setModel(new DefaultComboBoxModel(new String[] {"전체", "10분 이내", "20분 이내", "30분 이내"}));
			cbCookTime.setBounds(243, 10, 93, 27);
		}
		return cbCookTime;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("메뉴  : ");
			lblNewLabel.setBounds(57, 14, 38, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("요리시간 :");
			lblNewLabel_1.setBounds(191, 14, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("카테고리 : ");
			lblNewLabel_3.setBounds(38, 12, 61, 16);
		}
		return lblNewLabel_3;
	}
	private JComboBox getCbMenu2() {
		if (cbMenu2 == null) {
			cbMenu2 = new JComboBox();
			cbMenu2.setModel(new DefaultComboBoxModel(new String[] {"전체", "밥요리", "면요리", "기타"}));
			cbMenu2.setBounds(91, 8, 93, 27);
		}
		return cbMenu2;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("요리시간 :");
			lblNewLabel_1_1.setBounds(191, 12, 61, 16);
		}
		return lblNewLabel_1_1;
	}
	private JComboBox getCbCookTime2() {
		if (cbCookTime2 == null) {
			cbCookTime2 = new JComboBox();
			cbCookTime2.setModel(new DefaultComboBoxModel(new String[] {"전체", "10분 이내", "20분 이내", "30분 이내"}));
			cbCookTime2.setBounds(243, 8, 93, 27);
		}
		return cbCookTime2;
	}
	private JTextField getTfSearch2() {
		if (tfSearch2 == null) {
			tfSearch2 = new JTextField();
//			tfSearch2.addFocusListener(new FocusAdapter() {
//				@Override
//				public void focusGained(FocusEvent e) {
//					if(tfSearch2.getText().equals("검색어를 입력해주세요.")) {
//						tfSearch2.setText("");
//						tfSearch2.setForeground(Color.black);
//					}
//					else {
//						tfSearch2.selectAll();
//					}
//				}
//				@Override
//				public void focusLost(FocusEvent e) {
//					if(tfSearch2.getText().equals("")) {
//						tfSearch2.setText("검색어를 입력해주세요.");
//						tfSearch2.setForeground(Color.black);
//					}
//					else {
//						tfSearch2.selectAll();
//					}
//					
//				}
//			});
//			tfSearch2.addKeyListener(new KeyAdapter() {
//				@Override
//				public void keyPressed(KeyEvent e) {
//					updateConditionQuery();
//					bestSearchAction();
//				}
//			});
//			tfSearch.setText("검색어를 입력해주세요.");
//			tfSearch.setForeground(Color.LIGHT_GRAY);
//			tfSearch2.setColumns(10);
			tfSearch2.setBorder(LineBorder.createGrayLineBorder());
			tfSearch2.setBounds(18, 38, 266, 27);
		}
		return tfSearch2;
	}
	private JButton getBtnOk_1_1() {
		if (btnOk_1_1 == null) {
			btnOk_1_1 = new JButton("검색");
			btnOk_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					updateConditionQuery();
					bestSearchAction(); //업데이트

				}
			});
			btnOk_1_1.setBounds(289, 32, 68, 40);
		}
		return btnOk_1_1;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(6, 75, 361, 198);
			scrollPane_1.setViewportView(getInner_table2());
		}
		return scrollPane_1;
	}
	
	private JTable getInner_table2() {
		if (inner_table2 == null) {
			inner_table2 = new JTable();
			inner_table2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == 1){
						updateTableClick();
						goToRevisePost();
					}
				}
			});
		}
		inner_table2.setModel(updateOuter_Table);
		return inner_table2;
	}
	
	private JButton getBtnNoticeView() {
		if (btnNoticeView == null) {
//----------버튼에 최신 공지사항 제목 출력----------
			btnNoticeView = new JButton(updateNotice());
//			btnNewButton = new JButton("🎁 11월 빼빼로데이 이벤트 당첨자 발표 🎉🎉🎉");
			btnNoticeView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//----------버튼 클릭 시 공지사항 목록으로 이동----------
					AdminNoticeWrite adminNoticeWrite = new AdminNoticeWrite();
					adminNoticeWrite.updatePrintAction();
					adminNoticeWrite.setVisible(true);

				}
			});
			btnNoticeView.setBounds(77, 56, 332, 23);
		}
		return btnNoticeView;
	}
	private JLabel getLabel_3_1() {
		if (label_3 == null) {
			label_3 = new JLabel("");
			// 이미지 jlabel 사이즈 맞추기
	         ImageIcon icon = new ImageIcon("/Users/tj/Desktop/images/Loudspeaker.png"); 
	         Image img = icon.getImage();
	         Image changeImage = img.getScaledInstance(57, 53, Image.SCALE_DEFAULT);
	         ImageIcon changeIcon = new ImageIcon(changeImage);
	         label_3.setIcon(changeIcon);
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setBounds(21, 41, 57, 53);
		}
		return label_3;
	}


	private JPanel getMypagePanel() {
		if (mypagePanel == null) {
			mypagePanel = new JPanel();
			mypagePanel.setLayout(null);
			mypagePanel.add(getLabel_4_3());
			mypagePanel.add(getLblMyHome());
			mypagePanel.add(getTfMyPageIDtop());
			mypagePanel.add(getTabbedPane_1());
		}
		return mypagePanel;
	}
	private JLabel getLogout() {
		if (logout == null) {
			logout = new JLabel("Log out");
			logout.setHorizontalAlignment(SwingConstants.CENTER);
			logout.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?","Confirmation", JOptionPane.YES_NO_OPTION) ==0) {
						
					gotoLogin();
					MainMenu.this.dispose();
					}
				}
			});
			logout.setBounds(141, 427, 61, 16);
		}
		return logout;
	}
	private JLabel getLblMyHome() {
		if (lblMyHome == null) {
			lblMyHome = new JLabel("MY PAGE");
			lblMyHome.setBounds(30, 30, 96, 22);
			lblMyHome.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		}
		return lblMyHome;
	}
	private JTabbedPane getTabbedPane_1() {
		if (tabbedPane_1 == null) {
			tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane_1.setBounds(6, 64, 427, 391);
			tabbedPane_1.addTab("My Story", null, getMystory(), null);
			tabbedPane_1.addTab("회원정보 수정", null, getInfoRevise(), null);
		}
		return tabbedPane_1;
	}
	private JPanel getMystory() {
		if (mystory == null) {
			mystory = new JPanel();
			mystory.setLayout(null);
			mystory.add(getTextField());
			mystory.add(getCbTitleText());
			mystory.add(getTfMypageSearch());
			mystory.add(getMyStroyPane_1());
			mystory.add(getBtnSearch());
			mystory.add(getLabel_4_2());
		}
		return mystory;
	}
	private JPanel getInfoRevise() {
		if (infoRevise == null) {
			infoRevise = new JPanel();
			infoRevise.setLayout(null);
			infoRevise.add(getBtnOK());
			infoRevise.add(getLabel_4_1());
			infoRevise.add(getLblId_1());
			infoRevise.add(getTfIdUser());
			infoRevise.add(getLblPw_2());
			infoRevise.add(getLblPw_1_1());
			infoRevise.add(getLblEmail_1());
			infoRevise.add(getTfEmail());
			infoRevise.add(getTextField_4());
			infoRevise.add(getTfPWEdition());
			infoRevise.add(getTfPWCheckEdition());
			infoRevise.add(getTfDomain());
			infoRevise.add(getLabel_3_1_1());
			infoRevise.add(getCbEmail());
			infoRevise.add(getTfEmailMessage());
			infoRevise.add(getPwMessage());
			infoRevise.add(getLabelSecession());
		}
		return infoRevise;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setText("MY STORY LIST");
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setColumns(10);
			textField.setBounds(48, 0, 302, 32);
		}
		return textField;
	}
	private JComboBox getCbTitleText() {
		if (cbTitleText == null) {
			cbTitleText = new JComboBox();
			cbTitleText.setModel(new DefaultComboBoxModel(new String[] {"제목", "내용"}));
			cbTitleText.setBounds(3, 60, 78, 27);
		}
		return cbTitleText;
	}
	private JTextField getTfMypageSearch() {
		if (tfMypageSearch == null) {
			tfMypageSearch = new JTextField();
			tfMypageSearch.setForeground(Color.LIGHT_GRAY);
			tfMypageSearch.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					TableInit();
					searchAction();
				}
			});
			tfMypageSearch.setColumns(10);
			tfMypageSearch.setBorder(LineBorder.createGrayLineBorder());
			tfMypageSearch.setBounds(85, 63, 249, 18);
		}
		return tfMypageSearch;
	}
	private JScrollPane getMyStroyPane_1() {
		if (myStroyPane == null) {
			myStroyPane = new JScrollPane();
			myStroyPane.setBounds(0, 113, 406, 232);
			myStroyPane.setViewportView(getMypage_Inner_Table());
		}
		return myStroyPane;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("검색");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TableInit();//MyPage
					mylistSearchAction();//MyPage
				}
			});
			btnSearch.setBounds(337, 58, 61, 29);
		}
		return btnSearch;
	}

	private JLabel getLabel_4_2() {
		if (label_4_2 == null) {
			label_4_2 = new JLabel("님");
			label_4_2.setBounds(373, -63, 61, 16);
		}
		return label_4_2;
	}
	private JLabel getLabel_4_3() {
		if (label_4_3 == null) {
			label_4_3 = new JLabel("님");
			label_4_3.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
			label_4_3.setBounds(395, 35, 61, 16);
		}
		return label_4_3;
	}

	private JLabel getLblId_1() {
		if (lblId == null) {
			lblId = new JLabel("아이디 :");
			lblId.setBounds(52, 100, 41, 16);
		}
		return lblId;
	}
	private JTextField getTfIdUser() {
		if (tfIdUser == null) {
			tfIdUser = new JTextField();
			tfIdUser.setText((String) null);
			tfIdUser.setEditable(false);
			tfIdUser.setColumns(10);
			tfIdUser.setBounds(100, 95, 130, 26);
			tfIdUser.setText(ShareVar.idUser);//아이디 뜨나?
		}
		return tfIdUser;
	}
	private JLabel getLblPw_2() {
		if (lblPw == null) {
			lblPw = new JLabel("비밀번호 :");
			lblPw.setBounds(41, 128, 52, 16);
		}
		return lblPw;
	}
	private JLabel getLblPw_1_1() {
		if (lblPw_1 == null) {
			lblPw_1 = new JLabel("비밀번호 확인 :");
			lblPw_1.setBounds(17, 156, 80, 16);
		}
		return lblPw_1;
	}
	private JLabel getLblEmail_1() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email : ");
			lblEmail.setBounds(17, 203, 46, 16);
		}
		return lblEmail;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					if (cbEmail.getSelectedIndex()!=0) {
						tfEmailMessage.setText("이메일을 작성하세요.");
						tfDomain.setEditable(false);
						writingCheck();
					}
				}
			});
			tfEmail.setText((String) null);
			tfEmail.setHorizontalAlignment(SwingConstants.CENTER);
			tfEmail.setColumns(10);
			tfEmail.setBounds(62, 198, 90, 26);
			tfEmail.setText(ShareVar.email.substring(0, ShareVar.email.indexOf("@")));
		}
		return tfEmail;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setHorizontalAlignment(SwingConstants.CENTER);
			textField_4.setForeground(Color.RED);
			textField_4.setFont(new Font("Arial", Font.BOLD, 12));
			textField_4.setEditable(false);
			textField_4.setColumns(10);
			textField_4.setBorder(null);
			textField_4.setBackground(SystemColor.window);
			textField_4.setBounds(105, 186, 196, 16);
		}
		return textField_4;
	}
	private JPasswordField getTfPWEdition() {
		if (tfPWEdition == null) {
			tfPWEdition = new JPasswordField();
			tfPWEdition.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfPWEdition.setBounds(100, 119, 130, 26);
			tfPWEdition.setText(ShareVar.pwUser);
		}
		return tfPWEdition;
	}
	private JPasswordField getTfPWCheckEdition() {
		if (tfPWCheckEdition == null) {
			tfPWCheckEdition = new JPasswordField();
			tfPWCheckEdition.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfPWCheckEdition.setBounds(100, 148, 130, 26);
		}
		return tfPWCheckEdition;
	}
	private JTextField getTfDomain() {
		if (tfDomain == null) {
			tfDomain = new JTextField();
			tfDomain.setText((String) null);
			tfDomain.setColumns(10);
			tfDomain.setBounds(164, 198, 121, 26);
			tfDomain.setText(ShareVar.email.substring(ShareVar.email.indexOf("@")+1));
		}
		return tfDomain;
	}
	private JLabel getLabel_3_1_1() {
		if (label_3_1 == null) {
			label_3_1 = new JLabel("@");
			label_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_3_1.setBounds(129, 203, 61, 16);
		}
		return label_3_1;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("완료");
			btnOK.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					updateAction();//MyPage_Email,PW변경 
					ClearColumn();					
				}
			});

			btnOK.setBounds(308, 259, 78, 29);
		}
		return btnOK;
	}
	private JLabel getLabel_4_1() {
		if (label_4_1 == null) {
			label_4_1 = new JLabel("회원정보 수정");
			label_4_1.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
			label_4_1.setBounds(19, 18, 102, 27);
		}
		return label_4_1;
	}
	 private void gotoJoin() {
			Join join = new Join();
			join.setLocationRelativeTo(null);
			join.setVisible(true);
			
		}
	private JPanel getAdminPanel() {
		if (AdminPanel == null) {
			AdminPanel = new JPanel();
			AdminPanel.setLayout(null);
			AdminPanel.add(getTabbedPane_1_1());
		}
		return AdminPanel;
	}
	private JTabbedPane getTabbedPane_1_1() {
		if (tabbedPane_1_1 == null) {
			tabbedPane_1_1 = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane_1_1.setBounds(0, 17, 439, 444);
			tabbedPane_1_1.addTab("회원 관리", null, getUsermanage(), null);
			tabbedPane_1_1.addTab("공지사항 관리", null, getNoticemanage(), null);
		}
		return tabbedPane_1_1;
	}
	private JPanel getUsermanage() {
		if (usermanage == null) {
			usermanage = new JPanel();
			usermanage.setLayout(null);
			usermanage.add(getLblNewLabel_1_2());
			usermanage.add(getPanel_1_1());
			usermanage.add(getLblNewLabel_4());
			usermanage.add(getCbUserSelectSearch());
			usermanage.add(getTfUserSearch());
			usermanage.add(getBtnUserSearch());
			usermanage.add(getScrollPane_2());
		}
		return usermanage;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("상세 정보");
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(166, 205, 85, 28);
		}
		return lblNewLabel_1_2;
	}
	private JPanel getPanel_1_1() {
		if (panel_1_1 == null) {
			panel_1_1 = new JPanel();
			panel_1_1.setLayout(null);
			panel_1_1.setBorder(new LineBorder(new Color(128, 128, 128)));
			panel_1_1.setBackground(SystemColor.window);
			panel_1_1.setBounds(6, 233, 406, 165);
			panel_1_1.add(getLblNewLabel_2_1());
			panel_1_1.add(getTfUserNum());
			panel_1_1.add(getLblNewLabel_2_1_1());
			panel_1_1.add(getTfUserName());
			panel_1_1.add(getLblNewLabel_2_2());
			panel_1_1.add(getTfUserID());
			panel_1_1.add(getLblNewLabel_2_4());
			panel_1_1.add(getTfUserState());
			panel_1_1.add(getLblNewLabel_2_4_1());
			panel_1_1.add(getTfPostNum());
			panel_1_1.add(getLblNewLabel_2_4_1_1());
			panel_1_1.add(getTfLikeNum());
			panel_1_1.add(getLblNewLabel_2_1_1_1());
			panel_1_1.add(getTfUserInsertDate());
			panel_1_1.add(getLblNewLabel_2_1_1_1_1());
			panel_1_1.add(getTfUserDeleteDate());
			panel_1_1.add(getLblNewLabel_2_1_1_2());
			panel_1_1.add(getTfUserEmail());
			panel_1_1.add(getBtnUserDelete());
		}
		return panel_1_1;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("회원 번호 :");
			lblNewLabel_2_1.setBounds(6, 44, 61, 16);
		}
		return lblNewLabel_2_1;
	}
	private JTextField getTfUserNum() {
		if (tfUserNum == null) {
			tfUserNum = new JTextField();
			tfUserNum.setEditable(false);
			tfUserNum.setColumns(10);
			tfUserNum.setBounds(64, 39, 96, 26);
		}
		return tfUserNum;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel("이      름 :");
			lblNewLabel_2_1_1.setBounds(6, 77, 61, 16);
		}
		return lblNewLabel_2_1_1;
	}
	private JTextField getTfUserName() {
		if (tfUserName == null) {
			tfUserName = new JTextField();
			tfUserName.setEditable(false);
			tfUserName.setColumns(10);
			tfUserName.setBounds(64, 72, 130, 26);
		}
		return tfUserName;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("I        D :");
			lblNewLabel_2_2.setBounds(6, 110, 61, 16);
		}
		return lblNewLabel_2_2;
	}
	private JTextField getTfUserID() {
		if (tfUserID == null) {
			tfUserID = new JTextField();
			tfUserID.setEditable(false);
			tfUserID.setColumns(10);
			tfUserID.setBounds(64, 105, 130, 26);
		}
		return tfUserID;
	}
	private JLabel getLblNewLabel_2_4() {
		if (lblNewLabel_2_4 == null) {
			lblNewLabel_2_4 = new JLabel("회원 상태 :");
			lblNewLabel_2_4.setBounds(6, 11, 61, 16);
		}
		return lblNewLabel_2_4;
	}
	private JTextField getTfUserState() {
		if (tfUserState == null) {
			tfUserState = new JTextField();
			tfUserState.setEditable(false);
			tfUserState.setColumns(10);
			tfUserState.setBounds(64, 6, 96, 26);
		}
		return tfUserState;
	}
	private JLabel getLblNewLabel_2_4_1() {
		if (lblNewLabel_2_4_1 == null) {
			lblNewLabel_2_4_1 = new JLabel("게시글 수 :");
			lblNewLabel_2_4_1.setBounds(216, 11, 61, 16);
		}
		return lblNewLabel_2_4_1;
	}
	private JTextField getTfPostNum() {
		if (tfPostNum == null) {
			tfPostNum = new JTextField();
			tfPostNum.setEditable(false);
			tfPostNum.setColumns(10);
			tfPostNum.setBounds(276, 6, 54, 26);
		}
		return tfPostNum;
	}
	private JLabel getLblNewLabel_2_4_1_1() {
		if (lblNewLabel_2_4_1_1 == null) {
			lblNewLabel_2_4_1_1 = new JLabel("좋아요 수:");
			lblNewLabel_2_4_1_1.setBounds(216, 44, 61, 16);
		}
		return lblNewLabel_2_4_1_1;
	}
	private JTextField getTfLikeNum() {
		if (tfLikeNum == null) {
			tfLikeNum = new JTextField();
			tfLikeNum.setEditable(false);
			tfLikeNum.setColumns(10);
			tfLikeNum.setBounds(276, 39, 54, 26);
		}
		return tfLikeNum;
	}
	private JLabel getLblNewLabel_2_1_1_1() {
		if (lblNewLabel_2_1_1_1 == null) {
			lblNewLabel_2_1_1_1 = new JLabel("가입 일자 :");
			lblNewLabel_2_1_1_1.setBounds(216, 77, 61, 16);
		}
		return lblNewLabel_2_1_1_1;
	}
	private JTextField getTfUserInsertDate() {
		if (tfUserInsertDate == null) {
			tfUserInsertDate = new JTextField();
			tfUserInsertDate.setEditable(false);
			tfUserInsertDate.setColumns(10);
			tfUserInsertDate.setBounds(276, 72, 124, 26);
		}
		return tfUserInsertDate;
	}
	private JLabel getLblNewLabel_2_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1 = new JLabel("탈퇴 일자 :");
			lblNewLabel_2_1_1_1_1.setBounds(216, 110, 61, 16);
		}
		return lblNewLabel_2_1_1_1_1;
	}
	private JTextField getTfUserDeleteDate() {
		if (tfUserDeleteDate == null) {
			tfUserDeleteDate = new JTextField();
			tfUserDeleteDate.setEditable(false);
			tfUserDeleteDate.setColumns(10);
			tfUserDeleteDate.setBounds(276, 105, 124, 26);
		}
		return tfUserDeleteDate;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("회원 목록");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel_4.setBounds(166, 0, 85, 28);
		}
		return lblNewLabel_4;
	}
	private JComboBox getCbUserSelectSearch() {
		if (cbUserSelectSearch == null) {
			cbUserSelectSearch = new JComboBox();
			cbUserSelectSearch.setModel(new DefaultComboBoxModel(new String[] {"회원상태", "ID"}));
			cbUserSelectSearch.setBounds(6, 29, 102, 27);
		}
		return cbUserSelectSearch;
	}
	private JTextField getTfUserSearch() {
		if (tfUserSearch == null) {
			tfUserSearch = new JTextField();

			tfUserSearch.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					userSearchAction();
					userCondition();
				}
			});
			tfUserSearch.setColumns(10);
			tfUserSearch.setBounds(120, 28, 187, 26);
		}
		return tfUserSearch;
	}
	private JButton getBtnUserSearch() {
		if (btnUserSearch == null) {
			btnUserSearch = new JButton("검 색");
			btnUserSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//------------회원 조건 검색------------------	
					userSearchAction();
					userCondition();
					
				}
			});
			btnUserSearch.setBounds(319, 28, 85, 29);
		}
		return btnUserSearch;
	}
	private JScrollPane getScrollPane_2() {
		if (scrollPane_2 == null) {
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(6, 62, 406, 137);
			scrollPane_2.setViewportView(getUserInner_Table());
		}
		return scrollPane_2;
	}
	private JPanel getNoticemanage() {
		if (noticemanage == null) {
			noticemanage = new JPanel();
			noticemanage.setLayout(null);
			noticemanage.add(getLblNewLabel_3_1_1_1());
			noticemanage.add(getScrollPane_1_1());
			noticemanage.add(getCbNoticeSelectSearch());
			noticemanage.add(getTfNoitceSelect());
			noticemanage.add(getBtnNoticeSearch());
			noticemanage.add(getLblNewLabel_4_1_2());
			noticemanage.add(getBtnNoticeWrite());
			noticemanage.add(getLblNewLabel_1_2_1());
			noticemanage.add(getPanel_3());
		}
		return noticemanage;
	}
	private JLabel getLblNewLabel_3_1_1_1() {
		if (lblNewLabel_3_1_1 == null) {
			lblNewLabel_3_1_1 = new JLabel("공지사항 목록");
			lblNewLabel_3_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel_3_1_1.setBounds(166, 28, 85, 28);
		}
		return lblNewLabel_3_1_1;
	}
	private JScrollPane getScrollPane_1_1() {
		if (scrollPane_1_1 == null) {
			scrollPane_1_1 = new JScrollPane();
			scrollPane_1_1.setBounds(12, 96, 379, 111);
			scrollPane_1_1.setViewportView(getNoticeInner_Table());
		}
		return scrollPane_1_1;
	}
	private JComboBox getCbNoticeSelectSearch() {
		if (cbNoticeSelectSearch == null) {
			cbNoticeSelectSearch = new JComboBox();
			cbNoticeSelectSearch.setModel(new DefaultComboBoxModel(new String[] {"제목", "내용"}));
			cbNoticeSelectSearch.setBounds(15, 57, 94, 27);
		}
		return cbNoticeSelectSearch;
	}
	private JTextField getTfNoitceSelect() {
		if (tfNoitceSelect == null) {
			tfNoitceSelect = new JTextField();
			tfNoitceSelect.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					noticeCondition();
				}
			});
			tfNoitceSelect.setColumns(10);
			tfNoitceSelect.setBounds(111, 58, 210, 26);
		}
		return tfNoitceSelect;
	}
	private JButton getBtnNoticeSearch() {
		if (btnNoticeSearch == null) {
			btnNoticeSearch = new JButton("검 색");
			btnNoticeSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//-------------- 공지사항 조건검색-----------
					btnNoticeDelete.setVisible(false);
					btnNoticeRevise.setVisible(false);
					noticeCondition();
				}
			});
			btnNoticeSearch.setBounds(322, 56, 75, 29);
		}
		return btnNoticeSearch;
	}
	private JLabel getLblNewLabel_4_1_2() {
		if (lblNewLabel_4_1_2 == null) {
			lblNewLabel_4_1_2 = new JLabel("내    용 ");
			lblNewLabel_4_1_2.setBounds(12, 275, 61, 16);
		}
		return lblNewLabel_4_1_2;
	}
	private JButton getBtnNoticeDelete() {
		if (btnNoticeDelete == null) {
			btnNoticeDelete = new JButton("삭 제");
			btnNoticeDelete.setForeground(Color.RED);
			btnNoticeDelete.setBounds(226, 129, 85, 29);
			btnNoticeDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//---------공지사항 삭제-----------------
					
					if(JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?","Confirmation", JOptionPane.YES_NO_OPTION) ==0) {
					noticeDelete();
					NoticeTableInit();
					noticeSearchAction();
					clearColumn();
					}
				}
			});
		}
		return btnNoticeDelete;
	}
	private JButton getBtnNoticeWrite() {
		if (btnNoticeWrite == null) {
			btnNoticeWrite = new JButton("글 작성");
			btnNoticeWrite.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
//--------admin menu 공지사항 작성 이벤트--------------------
					ShareVar.noticeMenuClick = 0;
					AdminNoticeWrite adminNoticeWrite = new AdminNoticeWrite();
					adminNoticeWrite.setVisible(true);
					
				}
			});
			btnNoticeWrite.setForeground(new Color(30, 144, 255));
			btnNoticeWrite.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			btnNoticeWrite.setBounds(327, 8, 85, 29);
		}
		return btnNoticeWrite;
	}
	private JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2_1 == null) {
			lblNewLabel_1_2_1 = new JLabel("상세 내용");
			lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2_1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
			lblNewLabel_1_2_1.setBounds(166, 208, 85, 28);
		}
		return lblNewLabel_1_2_1;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(null);
			panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_3.setBounds(6, 234, 406, 158);
			panel_3.add(getLblNewLabel_4_1());
			panel_3.add(getTfNoticeTitle());
			panel_3.add(getLblNewLabel_4_1_1());
			panel_3.add(getTfNoticeDate());
			panel_3.add(getBtnNoticeRevise());
			panel_3.add(getScroll());
			panel_3.add(getBtnNoticeDelete());
		}
		return panel_3;
	}
	private JLabel getLblNewLabel_4_1() {
		if (lblNewLabel_4_1 == null) {
			lblNewLabel_4_1 = new JLabel("제    목");
			lblNewLabel_4_1.setBounds(6, 21, 61, 16);
		}
		return lblNewLabel_4_1;
	}
	private JTextField getTfNoticeTitle() {
		if (tfNoticeTitle == null) {
			tfNoticeTitle = new JTextField();
			tfNoticeTitle.setColumns(10);
			tfNoticeTitle.setBounds(50, 16, 148, 26);
			tfNoticeTitle.setEditable(false);
		}
		return tfNoticeTitle;
	}
	private JLabel getLblNewLabel_4_1_1() {
		if (lblNewLabel_4_1_1 == null) {
			lblNewLabel_4_1_1 = new JLabel("작성일자");
			lblNewLabel_4_1_1.setBounds(238, 21, 61, 16);
		}
		return lblNewLabel_4_1_1;
	}
	private JTextField getTfNoticeDate() {
		if (tfNoticeDate == null) {
			tfNoticeDate = new JTextField();
			tfNoticeDate.setEditable(false);
			tfNoticeDate.setColumns(10);
			tfNoticeDate.setBounds(289, 16, 102, 26);
		}
		return tfNoticeDate;
	}
	
	
	private JTable getNoticeInner_Table() {
		if (NoticeInner_Table == null) {
			NoticeInner_Table = new JTable();
			NoticeInner_Table.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					noticeTableClick();
					btnNoticeDelete.setVisible(true);
					btnNoticeRevise.setVisible(true);
					
				}
			});
			NoticeInner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
//-------- 공지사항 table click 이벤트 --------------				
					if (e.getButton() == 1){
						noticeTableClick();
						btnNoticeDelete.setVisible(true);
						btnNoticeRevise.setVisible(true);
					}
					
				}
			});
//-------- 공지사항 outtable 추가 --------------
			NoticeInner_Table.setModel(NoticeOuter_Table); // <--***************************************************
			NoticeInner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		return NoticeInner_Table;
	}
	
	
	private JButton getBtnNoticeRevise() {
		if (btnNoticeRevise == null) {
			btnNoticeRevise = new JButton("수 정");
			btnNoticeRevise.setForeground(Color.BLUE);
			btnNoticeRevise.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 수정가능
					AdminNoticeWrite adminNoticeWrite = new AdminNoticeWrite();
					adminNoticeWrite.setVisible(true);
					noticeTableClick();
					adminNoticeWrite.adminPrintAction();
					ShareVar.noticeMenuClick = 2;
				
//-------- 공지사항 수정 클릭 시 이벤트 --------------
//					noticeUpdate();
//					NoticeTableInit();
//					noticeSearchAction();
//					clearColumn();
				}
			});
			btnNoticeRevise.setBounds(306, 129, 85, 29);
		}
		return btnNoticeRevise;
	}
	
	
	private JTable getUserInner_Table() {
		if (UserInner_Table == null) {
			UserInner_Table = new JTable();
			UserInner_Table.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					userTableClick();
				}
			});
			UserInner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			UserInner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
//-------- 회원 테이블 클릭 --------------------
					userTableClick();
				}
			});
//-------- 회원관리 out table 추가 --------------
			UserInner_Table.setModel(UserOuter_Table); // <--***************************************************
		}
		return UserInner_Table;
	}
	
	private JLabel getLblNewLabel_2_1_1_2() {
		if (lblNewLabel_2_1_1_2 == null) {
			lblNewLabel_2_1_1_2 = new JLabel("E -Mail :");
			lblNewLabel_2_1_1_2.setBounds(6, 138, 61, 16);
		}
		return lblNewLabel_2_1_1_2;
	}
	private JTextField getTfUserEmail() {
		if (tfUserEmail == null) {
			tfUserEmail = new JTextField();
			tfUserEmail.setEditable(false);
			tfUserEmail.setColumns(10);
			tfUserEmail.setBounds(64, 133, 219, 26);
		}
		return tfUserEmail;
	}
	
	private JPanel getNoticePanel() {
		if (noticePanel == null) {
			noticePanel = new JPanel();
			noticePanel.setLayout(null);
			noticePanel.add(getCbUserNoticeSelectSearch());
			noticePanel.add(getLblNewLabel_3_1_1_1_1());
			noticePanel.add(getTfUserNoticeSearch());
			noticePanel.add(getBtnUserNoticeSearch());
			noticePanel.add(getScrollPane_1_1_1());
			noticePanel.add(getLblNewLabel_6());
		}
		return noticePanel;
	}
	private JComboBox getCbUserNoticeSelectSearch() {
		if (cbUserNoticeSelectSearch == null) {
			cbUserNoticeSelectSearch = new JComboBox();
			cbUserNoticeSelectSearch.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					userNoticeTableInit();
					userNoticeCondition();
				}
			});
			cbUserNoticeSelectSearch.setModel(new DefaultComboBoxModel(new String[] {"제목", "내용"}));
			cbUserNoticeSelectSearch.setBounds(33, 79, 94, 27);
		}
		return cbUserNoticeSelectSearch;
	}
	private JLabel getLblNewLabel_3_1_1_1_1() {
		if (lblNewLabel_3_1_1_1 == null) {
			lblNewLabel_3_1_1_1 = new JLabel("공 지 사 항");
			lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
			lblNewLabel_3_1_1_1.setBounds(183, 28, 85, 28);
		}
		return lblNewLabel_3_1_1_1;
	}
	private JTextField getTfUserNoticeSearch() {
		if (tfUserNoticeSearch == null) {
			tfUserNoticeSearch = new JTextField();
			tfUserNoticeSearch.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					userNoticeTableInit();
					userNoticeCondition();
				}
			});
		
			tfUserNoticeSearch.setColumns(10);
			tfUserNoticeSearch.setBounds(129, 80, 210, 26);
		}
		return tfUserNoticeSearch;
	}
	private JButton getBtnUserNoticeSearch() {
		if (btnUserNoticeSearch == null) {
			btnUserNoticeSearch = new JButton("검 색");
			btnUserNoticeSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//-------사용자 공지사항 조건별 검색----------
					userNoticeTableInit();
					userNoticeCondition();
					tfUserNoticeSearch.setText("");
				}
			});
			btnUserNoticeSearch.setBounds(340, 78, 75, 29);
		}
		return btnUserNoticeSearch;
	}
	private JScrollPane getScrollPane_1_1_1() {
		if (scrollPane_1_1_1 == null) {
			scrollPane_1_1_1 = new JScrollPane();
			scrollPane_1_1_1.setBounds(18, 118, 402, 309);
			scrollPane_1_1_1.setViewportView(getUserNoticeInner_Table());
		}
		return scrollPane_1_1_1;
	}
	private JTable getUserNoticeInner_Table() {
		if (UserNoticeInner_Table == null) {
			UserNoticeInner_Table = new JTable();

//----inner table 조건 추가-----------
			UserNoticeInner_Table.setModel(UserNoticeOuter_Table);
			UserNoticeInner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					AdminNoticeWrite adminNoticeWrite = new AdminNoticeWrite();
					adminNoticeWrite.setVisible(true);
					userNoticeTableClick();
					adminNoticeWrite.clickPrintAction();
				
					
				}
			});
			UserNoticeInner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		return UserNoticeInner_Table;
	}
	
	private JPanel getMiniGamePanel() {
		if (miniGamePanel == null) {
			miniGamePanel = new JPanel();
			miniGamePanel.setBackground(Color.WHITE);
			miniGamePanel.setLayout(null);
			miniGamePanel.add(getLabel_1_1());
			miniGamePanel.add(getLblNewLabel_5());
			miniGamePanel.add(getLabel_4());
		}
		return miniGamePanel;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("글 작성");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					goToWritePost();
				}
			});
			btnNewButton_1.setForeground(new Color(30, 144, 255));
			btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			btnNewButton_1.setBounds(315, 91, 86, 39);
		}
		return btnNewButton_1;
	}
	private JLabel getLabel_1_1() {
		if (label_1_1 == null) {
			label_1_1 = new JLabel("오늘 뭐먹지? 메뉴 랜덤 추천★");
			label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1_1.setFont(new Font("Dialog", Font.BOLD, 26));
			label_1_1.setBounds(37, 43, 373, 60);
		}
		return label_1_1;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon("/Users/tj/Desktop/images/Minigame.png"));
			lblNewLabel_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					goToGameResult();	
				}
			});
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(73, 123, 275, 223);
		}
		return lblNewLabel_5;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("그림을 클릭하세요!");
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setFont(new Font("Dialog", Font.PLAIN, 20));
			label_4.setBounds(63, 353, 310, 60);
		}
		return label_4;
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
			cbEmail.setSelectedItem(ShareVar.email.substring(ShareVar.email.indexOf("@")+1, ShareVar.email.length()));
			cbEmail.setBounds(280, 199, 107, 27);
		}
		return cbEmail;
	}
	
	private JTextField getTfEmailMessage() {
		if (tfEmailMessage == null) {
			tfEmailMessage = new JTextField();
			tfEmailMessage.setHorizontalAlignment(SwingConstants.CENTER);
			tfEmailMessage.setForeground(Color.RED);
			tfEmailMessage.setFont(new Font("Arial", Font.BOLD, 12));
			tfEmailMessage.setEditable(false);
			tfEmailMessage.setColumns(10);
			tfEmailMessage.setBorder(null);
			tfEmailMessage.setBackground(SystemColor.window);
			tfEmailMessage.setBounds(85, 230, 196, 16);
		}
		return tfEmailMessage;
	}
	
	private JTextField getPwMessage() {
		if (pwMessage == null) {
			pwMessage = new JTextField();
			pwMessage.setHorizontalAlignment(SwingConstants.CENTER);
			pwMessage.setForeground(Color.RED);
			pwMessage.setFont(new Font("Arial", Font.BOLD, 12));
			pwMessage.setEditable(false);
			pwMessage.setColumns(10);
			pwMessage.setBorder(null);
			pwMessage.setBackground(SystemColor.window);
			pwMessage.setBounds(100, 180, 196, 16);
		}
		return pwMessage;
	}
	
	private JTable getMypage_Inner_Table() {
		if (Mypage_Inner_Table == null) {
			Mypage_Inner_Table = new JTable();
			Mypage_Inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					MyListTableClick();
					goToRevisePost();
				}
			});
			Mypage_Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Mypage_Inner_Table.setModel(MyPage_Outer_Table);
		}
		return Mypage_Inner_Table;
	}
	
	
	//-----------------------------------------recipe list-----------------------------------------
	// recipe list  공지사항 버튼 최신 notice 제목 출력 
	private String updateNotice() {
		DBadminNoitceAction dBadminNoitceAction = new DBadminNoitceAction();
		BeanAdminNotice bean = dBadminNoitceAction.updateNotice();
		return bean.getNoticetitle();
	}
	
	
	//-------------------------------------
	// ------------------------------ 메소드 모음 ----------------------------------- //
	
	
	// 글 작성 창으로 이동(창 전환)
	public void goToWritePost() {
		 WritePost write = new WritePost();
		 write.setLocationRelativeTo(null);
		 write.setVisible(true); //  창 보여주는 역할
	}
	
	// 보기(수정)창으로 이동(창 전환)
	public void goToRevisePost() {
		 RevisePost write = new RevisePost();
		 write.setLocationRelativeTo(null);
		 write.setVisible(true); //  창 보여주는 역할
	}
	
	//-------------------------------------
	// best Table 초기화
	@SuppressWarnings("static-access")
	private void bestTableInit(){
        int i = bestOuter_Table.getRowCount();
        
        bestOuter_Table.addColumn("No");
        bestOuter_Table.addColumn("제목");
        bestOuter_Table.addColumn("작성자");
        bestOuter_Table.addColumn("개시일");
        bestOuter_Table.addColumn("추천수");
        bestOuter_Table.setColumnCount(5);

        for(int j = 0 ; j < i ; j++){
            bestOuter_Table.removeRow(0);
        }

        inner_table1.setAutoResizeMode(inner_table1.AUTO_RESIZE_OFF);
        
        int vColIndex = 0;
        TableColumn col = inner_table1.getColumnModel().getColumn(vColIndex);
        int width = 30;
        col.setPreferredWidth(width);

        vColIndex = 1;
        col = inner_table1.getColumnModel().getColumn(vColIndex);
        width = 130;
        col.setPreferredWidth(width);

        vColIndex = 2;
        col = inner_table1.getColumnModel().getColumn(vColIndex);
        width = 60;
        col.setPreferredWidth(width);

        vColIndex = 3;
        col = inner_table1.getColumnModel().getColumn(vColIndex);
        width = 90;
        col.setPreferredWidth(width);
        
        vColIndex = 4;
        col = inner_table1.getColumnModel().getColumn(vColIndex);
        width = 50;
        col.setPreferredWidth(width);
	}   
	
	
	// update Table 초기화
	@SuppressWarnings("static-access")
	private void updateTableInit(){
		int i = updateOuter_Table.getRowCount();
		
		updateOuter_Table.addColumn("No");
		updateOuter_Table.addColumn("제목");
		updateOuter_Table.addColumn("작성자");
		updateOuter_Table.addColumn("개시일");
		updateOuter_Table.addColumn("추천수");
		updateOuter_Table.setColumnCount(5);
		
		for(int j = 0 ; j < i ; j++){
			updateOuter_Table.removeRow(0);
		}
		
		inner_table2.setAutoResizeMode(inner_table2.AUTO_RESIZE_OFF);
		
		int vColIndex = 0;
		TableColumn col = inner_table2.getColumnModel().getColumn(vColIndex);
		int width = 30;
		col.setPreferredWidth(width);
		
		vColIndex = 1;
		col = inner_table2.getColumnModel().getColumn(vColIndex);
		width = 130;
		col.setPreferredWidth(width);
		
		vColIndex = 2;
		col = inner_table2.getColumnModel().getColumn(vColIndex);
		width = 60;
		col.setPreferredWidth(width);
		
		vColIndex = 3;
		col = inner_table2.getColumnModel().getColumn(vColIndex);
		width = 90;
		col.setPreferredWidth(width);
		
		vColIndex = 4;
		col = inner_table2.getColumnModel().getColumn(vColIndex);
		width = 50;
		col.setPreferredWidth(width);
	}   
	
	//전체 검색결과를 Table로 
	private void SearchAction(){
		DbActionRecipe dbActionLecipe = new DbActionRecipe();
		ArrayList<BeanRecipe> BeanRecipe = dbActionLecipe.SearchAction(); 
		
		int Count = BeanRecipe.size();
		
		for (int index = 0; index < Count; index++) {
			String temp = Integer.toString(BeanRecipe.get(index).getPostno());
			String templike = Integer.toString(BeanRecipe.get(index).getLike());
			String[] qTxt = {temp, BeanRecipe.get(index).getTitle(), BeanRecipe.get(index).getUserid(), BeanRecipe.get(index).getPostinsertdate(), templike};
			updateOuter_Table.addRow(qTxt);
		}

	}
	
	
	//베스트 검색결과를 Table로 
	private void bestSearchAction(){
		DbActionRecipe dbActionLecipe = new DbActionRecipe();
		ArrayList<BeanRecipe> BeanRecipe = dbActionLecipe.bestSearchAction(); 
		
		int Count = BeanRecipe.size();
		
		for (int index = 0; index < Count; index++) {
			String temppostno = Integer.toString(BeanRecipe.get(index).getPostno());
			String templike = Integer.toString(BeanRecipe.get(index).getLike());
			String[] qTxt = {temppostno, BeanRecipe.get(index).getTitle(), BeanRecipe.get(index).getUserid(), BeanRecipe.get(index).getPostinsertdate(), templike};
			bestOuter_Table.addRow(qTxt);
		}
		
	}
	
	// 베스트 테이블 클릭
	public void bestTableClick() {
		 int i = inner_table1.getSelectedRow();
		 
			String tkposterno = (String)inner_table1.getValueAt(i, 0);
	        ShareVar.postno = tkposterno;
	        
//	        System.out.println(ShareVar.postno);
	        //DbActionRecipe dbAction = new DbActionRecipe(wkposterno);
	        //BeanRecipe bean = dbAction.TableClick();
	        
//	        tfSeqno.setText(Integer.toString(bean.getSeqno()));
//	        tfName.setText(bean.getName());
//	        tfTelno.setText(bean.getTelno());
//	        tfAddress.setText(bean.getAddress());
//	        tfEmail.setText(bean.getEmail());
//	        tfRelation.setText(bean.getRelation());
	        
//	        // Image처리
//	        // File name이 틀려야 즉각 보여주기가 가능하여   
//	        // ShareVar에서 int값으로 정의하여 계속 증가하게 하여 file name으로 사용후 삭제
//	        
//			String filePath = Integer.toString(ShareVar.filename);
//			tfFilePath.setText(filePath);
//			
//			lblImage.setIcon(new ImageIcon(filePath));
//			lblImage.setHorizontalAlignment(SwingConstants.CENTER);
//			
//			File file = new File(filePath);
//			file.delete();
//			
//			tfFilePath.setText("");
	}
	//MyPage_테이블 클릭 
	public void MyListTableClick() {
		 int i = Mypage_Inner_Table.getSelectedRow();
		 
			String tkposterno = (String)Mypage_Inner_Table.getValueAt(i, 0);
	        ShareVar.postno = tkposterno;
	        
	}
	
	// update 테이블 클릭
	public void updateTableClick() {
		 int i = inner_table2.getSelectedRow();
		 
			String tkposterno = (String)inner_table2.getValueAt(i, 0);
	        ShareVar.postno = tkposterno;
	        
	}
	
	// 베스트 조건 검색 항목 결정 
	public void bestConditionQuery() {
		int i = cbMenu.getSelectedIndex();
		int j = cbCookTime.getSelectedIndex();
		
		String menu = "";
		String cookTime = "";
		
		switch (i) {
		case 0:
			menu = "밥요리' or menu = '면요리' or menu = '기타";
			break;
		case 1:
			menu = cbMenu.getSelectedItem().toString();
			break;
		case 2:
			menu = cbMenu.getSelectedItem().toString();
			break;
		case 3:
			menu = cbMenu.getSelectedItem().toString();
			break;
		default:
			break;
		}
		

		switch (j) {
		case 0:
			cookTime = "10 or cooktime = 20 or cooktime = 30";
			break;
		case 1:
			cookTime = (cbCookTime.getSelectedItem().toString()).substring(0, 2);
			Integer.parseInt(cookTime);
			break;
		case 2:
			cookTime = (cbCookTime.getSelectedItem().toString()).substring(0, 2);
			Integer.parseInt(cookTime);
			break;
		case 3:
			cookTime = (cbCookTime.getSelectedItem().toString()).substring(0, 2);
			Integer.parseInt(cookTime);
			break;
		default:
			break;
		}
		
		bestTableInit();
		bestConditionQueryAction(menu,cookTime);
	}
		
	// 베스트 조건검색 실행 
	public void bestConditionQueryAction(String menu, String cookTime) {
		
		String str = tfSearch.getText().trim();
		DbActionRecipe dbActionRecipe = new DbActionRecipe();
		
		// dbAction의 selectlist를 실행해서 검색값이 beanList에 쌓이게 됨! (데이터가 많으니까 arraylist사용해서 넘겨줄게!)
		ArrayList<BeanRecipe> beanList = dbActionRecipe.bestCheckKeword(menu, cookTime, str);
		
		// beanlist에 몇개나 들어와있는지 확인해보는 것.
		int listCount = beanList.size();
		
		for(int k = 0; k < listCount; k++) {
			// seqno가 int기 때문에 String으로 변환해서 받아줘야 함! i번째 줄의 getSeqno를 가져오기!
			String tempPostno = Integer.toString(beanList.get(k).getPostno());
			String templike = Integer.toString(beanList.get(k).getLike());
			// 배열 잡은 것 
			String[] qTxt = {tempPostno, beanList.get(k).getTitle(), beanList.get(k).getUserid(), beanList.get(k).getPostinsertdate(), templike};
			bestOuter_Table.addRow(qTxt);
		}
	}
			
	// 업데이트 조건 검색 항목 결정 
	public void updateConditionQuery() {
		int i = cbMenu2.getSelectedIndex();
		int j = cbCookTime2.getSelectedIndex();
		
		String menu = "";
		String cookTime = "";
		
		switch (i) {
		case 0:
			menu = "밥요리' or menu = '면요리' or menu = '기타";
			break;
		case 1:
			menu = cbMenu2.getSelectedItem().toString();
			break;
		case 2:
			menu = cbMenu2.getSelectedItem().toString();
			break;
		case 3:
			menu = cbMenu2.getSelectedItem().toString();
			break;
		default:
			break;
		}
		

		switch (j) {
		case 0:
			cookTime = "10 or cooktime = 20 or cooktime = 30";
			break;
		case 1:
			cookTime = (cbCookTime2.getSelectedItem().toString()).substring(0, 2);
			Integer.parseInt(cookTime);
			break;
		case 2:
			cookTime = (cbCookTime2.getSelectedItem().toString()).substring(0, 2);
			Integer.parseInt(cookTime);
			break;
		case 3:
			cookTime = (cbCookTime2.getSelectedItem().toString()).substring(0, 2);
			Integer.parseInt(cookTime);
			break;
		default:
			break;
		}
		
		updateTableInit();
		updateConditionQueryAction(menu,cookTime);
	}
		
	// 업데이트 조건검색 실행 
	public void updateConditionQueryAction(String menu, String cookTime) {
		
		String str = tfSearch2.getText().trim();
		DbActionRecipe dbActionRecipe = new DbActionRecipe();
		
		// dbAction의 selectlist를 실행해서 검색값이 beanList에 쌓이게 됨! (데이터가 많으니까 arraylist사용해서 넘겨줄게!)
		ArrayList<BeanRecipe> beanList = dbActionRecipe.updateCheckKeword(menu, cookTime, str);
		
		// beanlist에 몇개나 들어와있는지 확인해보는 것.
		int listCount = beanList.size();
		
		for(int k = 0; k < listCount; k++) {
			// seqno가 int기 때문에 String으로 변환해서 받아줘야 함! i번째 줄의 getSeqno를 가져오기!
			String tempPostno = Integer.toString(beanList.get(k).getPostno());
			String templike = Integer.toString(beanList.get(k).getLike());
			// 배열 잡은 것 
			String[] qTxt = {tempPostno, beanList.get(k).getTitle(), beanList.get(k).getUserid(), beanList.get(k).getPostinsertdate(), templike};
			updateOuter_Table.addRow(qTxt);
		}
}
	
	//---------------------------------------- mypage Menu ----------------------------------------
	// My Page _Table 초기화
	@SuppressWarnings("static-access")
	private void TableInit(){
        int i = MyPage_Outer_Table.getRowCount();
        
        MyPage_Outer_Table.addColumn("Post No");
        MyPage_Outer_Table.addColumn("제목");
        MyPage_Outer_Table.addColumn("시일");
        MyPage_Outer_Table.addColumn("추천수");
        MyPage_Outer_Table.setColumnCount(4);

        for(int j = 0 ; j < i ; j++){
        	MyPage_Outer_Table.removeRow(0);
        }

        Mypage_Inner_Table.setAutoResizeMode(Mypage_Inner_Table.AUTO_RESIZE_OFF);
        
        int vColIndex = 0;
        TableColumn col = Mypage_Inner_Table.getColumnModel().getColumn(vColIndex);
        int width = 70;
        col.setPreferredWidth(width);

        vColIndex = 1;
        col = Mypage_Inner_Table.getColumnModel().getColumn(vColIndex);
        width = 130;
        col.setPreferredWidth(width);

        vColIndex = 2;
        col = Mypage_Inner_Table.getColumnModel().getColumn(vColIndex);
        width = 90;
        col.setPreferredWidth(width);

        vColIndex = 3;
        col = Mypage_Inner_Table.getColumnModel().getColumn(vColIndex);
        width = 90;
        col.setPreferredWidth(width);
	}   

	//-------------------------------------
	//MyPage_비번 체크->회원정보 수정
	private void checkPW() {
		
		//tfPW,tfPWCheck -> 회원정보내의 tf들  
		String pW = new String(tfPWEdition.getPassword()).trim();
		String pwCheck = new String(tfPWCheckEdition.getPassword()).trim();
		
		
		if(pW.equals(pwCheck)){
			pwMessage.setText("패스워드가 서로 일치합니다.");
		} else {
			pwMessage.setText("패스워드가 서로 다릅니다.");
			
			
//	    	tfPWCheck.requestFocus();
		}
	}	
	//-------------------------------------
	//로그인 화면으로 간다.  
	private void gotoLogin() {
		Login login = new Login();
		login.setLocationRelativeTo(null);
		login.setVisible(true);
	}
	
	//-------------------------------------
	//Join -> 탈퇴
	private void secessionAction() {
		String id = ShareVar.idUser;
		
		DbActionEdition dbActionEdition = new DbActionEdition();
		
		boolean msg = dbActionEdition.secessionAction();
		
		if(msg ==true){
			JOptionPane.showMessageDialog(null, "탈퇴완료");
		}
		
	}
	
	//-------------------------------------
	//-------------------------------------
		//MyPage_회원정보수정_PW,Email
		private void updateAction() {
			
			String pW = new String(tfPWEdition.getPassword()).trim();
			String pWcheck= new String(tfPWCheckEdition.getPassword()).trim();
			String emailId = tfEmail.getText().trim();
			String domain = tfDomain.getText().trim();
//			tfPWEdition.setText(ShareVar.pwUser);
			if(pW.equals(pWcheck) && pWcheck.length()!=0 &&pW.length() !=0){
				DbActionEdition dbAction = new DbActionEdition(pW,(emailId+"@"+domain),ShareVar.idUser); 
				
				boolean msg = dbAction.UpdateAction();
				
				if(msg ==true){
					JOptionPane.showMessageDialog(null, "입력완료");
				}else {
					JOptionPane.showMessageDialog(null, "입력실패");
					
				}
		    } else {
		    	
		    	JOptionPane.showMessageDialog(null, "패스워드를 다시 입력하세요.");

		    }
			
		}
	//-------------------------------------
	//MyPage_회원정보 수정 비번,비번체크구간 지우기.
	private void ClearColumn() {
		
	tfPWEdition.setText("");
	tfPWCheckEdition.setText("");
	}


	//-------------------------------------
	//MyPage 리스트에 죄회되는 결과  
	private void searchAction(){
		
		DbActionMyList dbAction = new DbActionMyList();
		ArrayList<BeanMyList> beanList = dbAction.selectList();
		
		int listCount = beanList.size(); //화면에 있는 테이블에 보여주기--> 몇개 들어와있다. 보여주기
		for (int i = 0; i < listCount; i++) {
			String seqString = Integer.toString(beanList.get(i).getPostno());//ArrayList첫번째 값 빼오는것이다.
												//여러개중에 		//처음 것 빼오는것. 한 열.
			String[] qTxt = {Integer.toString(beanList.get(i).getPostno()), beanList.get(i).getTitle(),beanList.get(i).getPostinsertdate(),beanList.get(i).getLike()};
							//화면에 출력할 한줄을 만들었다. ArrayList 1번을 한줄로 만들었다.
			MyPage_Outer_Table.addRow(qTxt);
			
		}

	}
	
	//-------------------------------------
	//MyPage table list
	private void mylistSearchAction() {
		DbActionMyList dbActionMyList = new DbActionMyList();
		ArrayList<BeanMyList> beanList = dbActionMyList.mylisSearchAction(cbTitleText.getSelectedIndex(),tfMypageSearch.getText().trim());
		
		int listCount = beanList.size(); //화면에 있는 테이블에 보여주기--> 몇개 들어와있다. 보여주기
		for (int i = 0; i < listCount; i++) {
			String seqString = Integer.toString(beanList.get(i).getPostno());//ArrayList첫번째 값 빼오는것이다.
												//여러개중에 		//처음 것 빼오는것. 한 열.
			String[] qTxt = {Integer.toString(beanList.get(i).getPostno()), beanList.get(i).getTitle(),beanList.get(i).getPostinsertdate(),beanList.get(i).getLike()};
							//화면에 출력할 한줄을 만들었다. ArrayList 1번을 한줄로 만들었다.
			MyPage_Outer_Table.addRow(qTxt);
			
		}
		
	}
	//-------------------------------------
	// email 문자 확인
	private void writingCheck() {
			
			String s = tfEmail.getText();  
			String ss = tfDomain.getText();
			
			if(s.matches(".*@.*") && ss.matches(".*@.*")) {
	            tfEmailMessage.setText("@가 포함되어 있습니다.");
	        }else {
	        	tfEmailMessage.setText(" ");
	        }
	        
	        //영문자가 있는지 검색
	        if(s.matches(".*[A-Z].*") && ss.matches(".*[A-Z].*")) {
	        	tfEmailMessage.setText("대문자가 포함되어 있습니다.");
	        }else {
	        	tfEmailMessage.setText(" ");
	        }
	        

		}
	
	
	//---------------------------------------- Admin Menu ----------------------------------------
	// textfield 초기화
	private void clearColumn() {
		tfNoticeTitle.setText("");
		tfNoticeText.setText("");
		tfNoticeDate.setText("");
		tfUserState.setText("");
		tfUserNum.setText("");
		tfUserName.setText("");
		tfUserInsertDate.setText("");
		tfUserDeleteDate.setText("");
		tfLikeNum.setText("");
		tfPostNum.setText("");
		tfUserID.setText("");
		tfUserEmail.setText("");
	}
	
	//---------------------------------------- 회원 관리 ----------------------------------------
	// 회원관리 table init
	private void UserTableInit(){
        int i = UserOuter_Table.getRowCount();
        
        UserOuter_Table.addColumn("회원번호");
        UserOuter_Table.addColumn("회원상태");
        UserOuter_Table.addColumn("ID");
        UserOuter_Table.addColumn("이름");
        UserOuter_Table.addColumn("게시글 수");
        UserOuter_Table.setColumnCount(5);

        for(int j = 0 ; j < i ; j++){
        	UserOuter_Table.removeRow(0);
        }

        UserInner_Table.setAutoResizeMode(UserInner_Table.AUTO_RESIZE_OFF);

        int vColIndex = 0;
        TableColumn col = UserInner_Table.getColumnModel().getColumn(vColIndex);
        int width = 70;
        col.setPreferredWidth(width);

        vColIndex = 1;
        col = UserInner_Table.getColumnModel().getColumn(vColIndex);
        width = 80;
        col.setPreferredWidth(width);

        vColIndex = 2;
        col = UserInner_Table.getColumnModel().getColumn(vColIndex);
        width = 90;
        col.setPreferredWidth(width);

        vColIndex = 3;
        col = UserInner_Table.getColumnModel().getColumn(vColIndex);
        width = 90;
        col.setPreferredWidth(width);
        
        vColIndex = 4;
        col = UserInner_Table.getColumnModel().getColumn(vColIndex);
        width = 60;
        col.setPreferredWidth(width);

	}
	
	//-------------------------------------
	// 회원 목록 전체 불러오기
	public void userSearchAction(){
        
		DBadminUserAction dBadminUserAction = new DBadminUserAction();
		ArrayList<BeanAdminUser> beanList = dBadminUserAction.userList();
		
		// beanlist에 입력된 data 개수 listcount에 저장
		int listCount = beanList.size();
		for (int i = 0; i < listCount; i++) {
			// get(i)만 하면 beanlist에 저장된 한 열을 전부 가져오지만 getSeqno를 넣으면 해당 줄의 seqno만 가져온다.
			String seqString = Integer.toString(beanList.get(i).getUserno());
			String[] qTxt = {seqString, beanList.get(i).getUserstate(), beanList.get(i).getUserid(), beanList.get(i).getUsername(), beanList.get(i).getUserpostnum()};
			UserOuter_Table.addRow(qTxt);
		}
	}
	
	//-------------------------------------
	// 회원 table 클릭
	private void userTableClick() {
		
		DBadminUserAction dBadminUserAction = new DBadminUserAction();
		ArrayList<BeanAdminUser> beanList = dBadminUserAction.userList();
		
        int i = UserInner_Table.getSelectedRow();
        String wkUserno= (String)UserInner_Table.getValueAt(i, 0);
        int tsUserno = Integer.parseInt(wkUserno);
        adminUserNum = tsUserno;
        // inner table 데이터 가져오기
        String wkpostnum= (String)UserInner_Table.getValueAt(i, 4);
        
        
        DBadminUserAction dbAction = new DBadminUserAction(tsUserno);
        BeanAdminUser bean = dbAction.userTableClick();
        String wklikenum = dbAction.userLikeSum();
        
        //클릭한 데이터값 출력
        
        tfUserNum.setText(Integer.toString(bean.getUserno()));
        tfUserState.setText(bean.getUserstate());
        tfUserID.setText(bean.getUserid());
        tfUserName.setText(bean.getUsername());
        tfUserEmail.setText(bean.getUseremail());
        tfPostNum.setText(wkpostnum);
        tfUserInsertDate.setText(bean.getUserinsertdate());
        tfUserDeleteDate.setText(bean.getUserdeletedate());
        tfLikeNum.setText(wklikenum);
        
	}
	
	//-------------------------------------
	// 회원검색 콤보 column명으로 변경
	// Condition Query
	private void userCondition() {
		int i = cbUserSelectSearch.getSelectedIndex();
		String ConditionColumn = "";
		
		switch (i) {
			case 0:
				ConditionColumn = "userstate";
				break;
				
			case 1:
				ConditionColumn = "userid";
				break;
				
				
			default:
				break;
		}
		UserTableInit();
		clearColumn();
		userConditionAction(ConditionColumn);
		
	}
	
	//-------------------------------------
	// 회원 목록 조건 검색 method
	private void userConditionAction(String ConditionColumn) {
	String search = tfUserSearch.getText().trim();
	
	DBadminUserAction dbAction = new DBadminUserAction();
	
	ArrayList<BeanAdminUser> beanList = dbAction.selectSearch(ConditionColumn, search);
	
	
	int listCount = beanList.size();
	for (int i = 0; i < listCount; i++) {
		String seqString = Integer.toString(beanList.get(i).getUserno());
		String[] qTxt = {seqString, beanList.get(i).getUserstate(), beanList.get(i).getUserid(), beanList.get(i).getUsername(), beanList.get(i).getUserpostnum()};
		UserOuter_Table.addRow(qTxt);
	}

	}

	
	//---------------------------------------- 공지사항 관리 ----------------------------------------
	// 공지사항 table init
	public void NoticeTableInit(){
        int i = NoticeOuter_Table.getRowCount();
        
        NoticeOuter_Table.addColumn("No");
        NoticeOuter_Table.addColumn("제목");
        NoticeOuter_Table.addColumn("게시일자");
        NoticeOuter_Table.addColumn("수정일자");
        NoticeOuter_Table.setColumnCount(4);

        for(int j = 0 ; j < i ; j++){
        	NoticeOuter_Table.removeRow(0);
        }

        NoticeInner_Table.setAutoResizeMode(NoticeInner_Table.AUTO_RESIZE_OFF);

        int vColIndex = 0;
        TableColumn col = NoticeInner_Table.getColumnModel().getColumn(vColIndex);
        int width = 25;
        col.setPreferredWidth(width);

        vColIndex = 1;
        col = NoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 180;
        col.setPreferredWidth(width);

        vColIndex = 2;
        col = NoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 85;
        col.setPreferredWidth(width);

        vColIndex = 3;
        col = NoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 85;
        col.setPreferredWidth(width);

	}
	
	//-------------------------------------
	// 공지사항 목록 전체 불러오기
	public void noticeSearchAction(){
        
		DBadminNoitceAction dBadminNoitceAction = new DBadminNoitceAction();

		ArrayList<BeanAdminNotice> beanList = dBadminNoitceAction.noticeList();
		
		// beanlist에 입력된 data 개수 listcount에 저장
		int listCount = beanList.size();
		for (int i = 0; i < listCount; i++) {
			// get(i)만 하면 beanlist에 저장된 한 열을 전부 가져오지만 getSeqno를 넣으면 해당 줄의 seqno만 가져온다.
			String seqString = Integer.toString(beanList.get(i).getNoticeno());
			String[] qTxt = {seqString, beanList.get(i).getNoticetitle(), beanList.get(i).getNoticetime(), beanList.get(i).getNoticeUpdatetime()};
			NoticeOuter_Table.addRow(qTxt);
		}
	}
	
	
	//-------------------------------------
	// 공지사항 table 클릭
	private void noticeTableClick() {
		
        int i = NoticeInner_Table.getSelectedRow();
        String wkNoticeno = (String)NoticeInner_Table.getValueAt(i, 0);
        
        int tsNoticeno = Integer.parseInt(wkNoticeno);
        
        DBadminNoitceAction dbAction = new DBadminNoitceAction(tsNoticeno);
        BeanAdminNotice bean = dbAction.noticeTableClick();
        
        ShareVar.noticeTableClickNum= bean.getNoticeno();
        ShareVar.noticeTitle = bean.getNoticetitle();
        ShareVar.noticeText = bean.getNoticetext();
        
        tfNoticeTitle.setText(bean.getNoticetitle());
        tfNoticeText.setText(bean.getNoticetext());
        tfNoticeDate.setText(bean.getNoticetime());
        
	}
	
	//-------------------------------------
	// notice 목록 삭제 method
	public void noticeDelete() {
		
		DBadminNoitceAction dbAction = new DBadminNoitceAction();
		
		boolean msg = dbAction.noticeDeleteAction(ShareVar.noticeTableClickNum);
		
		if(msg == true) {
			JOptionPane.showMessageDialog(this, "삭제가 완료되었습니다.");
		} else {
			JOptionPane.showMessageDialog(null, "삭제가 불가합니다.");
			
		}
	}
	
	//-------------------------------------
	// notice 목록 수정 method
	private void noticeUpdate() {
	     	String noticeTitle = tfNoticeTitle.getText().trim();
	        String noticeText = tfNoticeText.getText().trim();
		
			DBadminNoitceAction dbAction = new DBadminNoitceAction();
			
			boolean msg = dbAction.noticeUpdateAction(ShareVar.noticeTableClickNum, noticeTitle, noticeText);
			
			if(msg == true) {
				JOptionPane.showMessageDialog(this, "수정이 완료되었습니다.");
			} else {
				JOptionPane.showMessageDialog(null, "수정이 불가합니다.");
			}
			
	}

	//-------------------------------------
	// notice 콤보 column명으로 변경
	// Condition Query
	private void noticeCondition() {
		int i = cbNoticeSelectSearch.getSelectedIndex();
		String ConditionColumn = "";
		
		switch (i) {
			case 0:
				ConditionColumn = "noticetitle";
				break;
				
			case 1:
				ConditionColumn = "noticetext";
				break;
				
				
			default:
				break;
		}
		NoticeTableInit();
		clearColumn();
		noticeConditionAction(ConditionColumn);
		
	}
	
	//-------------------------------------
	// notice 목록 조건 검색 method
	private void noticeConditionAction(String ConditionColumn) {
	String search = tfNoitceSelect.getText().trim();
	
	DBadminNoitceAction dbAction = new DBadminNoitceAction();
	
	ArrayList<BeanAdminNotice> beanList = dbAction.selectSearch(ConditionColumn, search);
	
	
	int listCount = beanList.size();
	for (int i = 0; i < listCount; i++) {
		String seqString = Integer.toString(beanList.get(i).getNoticeno());
		String[] qTxt = {seqString, beanList.get(i).getNoticetitle(), beanList.get(i).getNoticetime(), beanList.get(i).getNoticeUpdatetime()};
		NoticeOuter_Table.addRow(qTxt);
	}

	}
	
	
	//-------------------------공지사항-----------------------------------------
	// 공지사항 table init
	public void userNoticeTableInit(){
        int i = UserNoticeOuter_Table.getRowCount();
        UserNoticeOuter_Table.addColumn("No");
        UserNoticeOuter_Table.addColumn("제목");
        UserNoticeOuter_Table.addColumn("게시일자");
        UserNoticeOuter_Table.addColumn("작성자");
        UserNoticeOuter_Table.setColumnCount(4);

        for(int j = 0 ; j < i ; j++){
        	UserNoticeOuter_Table.removeRow(0);
        }
        

        UserNoticeInner_Table.setAutoResizeMode(UserNoticeInner_Table.AUTO_RESIZE_OFF);

        int vColIndex = 0;
        TableColumn col = UserNoticeInner_Table.getColumnModel().getColumn(vColIndex);
        int width = 25;
        col.setPreferredWidth(width);

        vColIndex = 1;
        col = UserNoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 200;
        col.setPreferredWidth(width);

        vColIndex = 2;
        col = UserNoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 85;
        col.setPreferredWidth(width);

        vColIndex = 3;
        col = UserNoticeInner_Table.getColumnModel().getColumn(vColIndex);
        width = 85;
        col.setPreferredWidth(width);
        
        

	}
	
	//-------------------------------------
	// 공지사항 목록 전체 불러오기
	public void userNoticeSearchAction(){
        
		DBadminNoitceAction dBadminNoitceAction = new DBadminNoitceAction();

		ArrayList<BeanAdminNotice> beanList = dBadminNoitceAction.noticeList();
		
		// beanlist에 입력된 data 개수 listcount에 저장
		int listCount = beanList.size();
		for (int i = 0; i < listCount; i++) {
			// get(i)만 하면 beanlist에 저장된 한 열을 전부 가져오지만 getSeqno를 넣으면 해당 줄의 seqno만 가져온다.
			String seqString = Integer.toString(beanList.get(i).getNoticeno());
			String[] qTxt = {seqString, beanList.get(i).getNoticetitle(), beanList.get(i).getNoticetime(), "관리자"};
			UserNoticeOuter_Table.addRow(qTxt);
		}
	}
	
	
	//-------------------------------------
	// 공지사항 table 클릭
	private void userNoticeTableClick() {
		
        int i = UserNoticeInner_Table.getSelectedRow();
        String wkNoticeno = (String)UserNoticeInner_Table.getValueAt(i, 0);
        
        int tsNoticeno = Integer.parseInt(wkNoticeno);
        
        DBadminNoitceAction dbAction = new DBadminNoitceAction(tsNoticeno);
        BeanAdminNotice bean = dbAction.noticeTableClick();
        
        ShareVar.userNoticeTableClickNum = bean.getNoticeno();
        ShareVar.noticeTitle = bean.getNoticetitle();
        ShareVar.noticeText = bean.getNoticetext();
        
	}
	
	
	//-------------------------------------
	// notice 콤보 column명으로 변경
	// Condition Query
	private void userNoticeCondition() {
		int i = cbUserNoticeSelectSearch.getSelectedIndex();
		String ConditionColumn = "";
		
		switch (i) {
			case 0:
				ConditionColumn = "noticetitle";
				break;
				
			case 1:
				ConditionColumn = "noticetext";
				break;
				
				
			default:
				break;
		}
		userNoticeTableInit();
		userNoticeConditionAction(ConditionColumn);
		
	}
	
	// notice 목록 조건 검색 method
	private void userNoticeConditionAction(String ConditionColumn) {
	String search = tfUserNoticeSearch.getText().trim();
	
	DBadminNoitceAction dbAction = new DBadminNoitceAction();
	
	ArrayList<BeanAdminNotice> beanList = dbAction.selectSearch(ConditionColumn, search);
	
	
	int listCount = beanList.size();
	for (int i = 0; i < listCount; i++) {
		String seqString = Integer.toString(beanList.get(i).getNoticeno());
		String[] qTxt = {seqString, beanList.get(i).getNoticetitle(), beanList.get(i).getNoticetime(), "관리자"};
		UserNoticeOuter_Table.addRow(qTxt);
	}

	}
	
	
	//------------------------Mini Game-----------------------------------------
	// miniGame으로 화면 전환
	public void goToGameResult() {
		MiniGameResult miniGameResult = new MiniGameResult();
		miniGameResult.setLocationRelativeTo(null);
		miniGameResult.setVisible(true);
	}


	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setBounds(0, 0, 439, 461);
			ImageIcon icon = new ImageIcon("/Users/tj/Desktop/images/MainMenu.png"); 
	        Image img = icon.getImage();
	        Image changeImage = img.getScaledInstance(439, 461, Image.SCALE_DEFAULT);
	        ImageIcon changeIcon = new ImageIcon(changeImage);
	        lblNewLabel_2.setIcon(changeIcon);
	        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			
		}
		return lblNewLabel_2;
	}
	private JScrollPane getScroll() {
		if (scroll == null) {
			scroll = new JScrollPane();
			scroll.setBounds(50, 44, 338, 85);
			scroll.setViewportView(getTextArea());
			scroll.setViewportView(getTfNoticeText());
		}
		return scroll;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
		}
		return textArea;
	}
	private JTextArea getTfNoticeText() {
		if (tfNoticeText == null) {
			tfNoticeText = new JTextArea();
		}
		tfNoticeText.setEditable(false);
		return tfNoticeText;
	}
	private JLabel getLabelSecession() {
		if (labelSecession == null) {
			labelSecession = new JLabel("탈퇴하기");
			labelSecession.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(JOptionPane.showConfirmDialog(null, "탈퇴하시겠습니까?","Confirmation", JOptionPane.YES_NO_OPTION) ==0) {
					
					secessionAction();
					gotoLogin();
					MainMenu.this.dispose();
					}
					
				}
			});
			labelSecession.setHorizontalAlignment(SwingConstants.CENTER);
			labelSecession.setBounds(339, 312, 61, 16);
		}
		return labelSecession;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("");
//			lblNewLabel_6.setIcon(new ImageIcon("/Users/kyeongmi/Downloads/noticeImge.png"));
			// 이미지 jlabel 사이즈 맞추기
	         ImageIcon icon = new ImageIcon("/Users/tj/Desktop/images/Loudspeaker.png"); 
	         Image img = icon.getImage();
	         Image changeImage = img.getScaledInstance(75, 45, Image.SCALE_DEFAULT);
	         ImageIcon changeIcon = new ImageIcon(changeImage);
	         lblNewLabel_6.setIcon(changeIcon);
			
			lblNewLabel_6.setBounds(88, 22, 75, 45);
		}
		return lblNewLabel_6;
	}
	private JLabel getTfMyPageIDtop() {
		if (tfMyPageIDtop == null) {
			tfMyPageIDtop = new JLabel("");
			tfMyPageIDtop.setText(ShareVar.nameUser);
			tfMyPageIDtop.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
			tfMyPageIDtop.setHorizontalAlignment(SwingConstants.TRAILING);
			tfMyPageIDtop.setBounds(322, 35, 61, 16);
		}
		return tfMyPageIDtop;
	}
	private JButton getBtnUserDelete() {
		if (btnUserDelete == null) {
			btnUserDelete = new JButton("회원 삭제");
			btnUserDelete.setForeground(Color.RED);
			btnUserDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(JOptionPane.showConfirmDialog(null, "회원을 탈퇴하시겠습니까?","Confirmation", JOptionPane.YES_NO_OPTION) ==0) {
						userDeleteAction();
						UserTableInit();
						userSearchAction();
						}
				}
			});
			btnUserDelete.setBounds(302, 133, 98, 29);
		}
		return btnUserDelete;
	}
	// 회원정보 삭제(admin)
	private void userDeleteAction() {
		DBadminUserAction dBadminUserAction = new DBadminUserAction();
		
		boolean msg = dBadminUserAction.userDeleteAction(adminUserNum);
		
		if(msg == true) {
			JOptionPane.showMessageDialog(this, "탈퇴가 완료되었습니다.");
		} else {
			JOptionPane.showMessageDialog(null, "탈퇴가 불가합니다.");
			
		}
	}
	
	
} // 끝 --------------------------------------------------------------------
