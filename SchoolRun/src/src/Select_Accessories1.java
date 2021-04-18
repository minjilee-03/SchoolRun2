package src;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.Select_Item.BoosterMouseListener;
import src.Select_Item.CoinMouseListener;
import src.Select_Item.FriendMouseListener;
import src.Select_Item.LifeMouseListener;
import src.Select_Item.ScoreMouseListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Select_Accessories1 extends JFrame {

	private JPanel contentPane;
	CoinMouseListener coinlistener = new CoinMouseListener();
	ScoreMouseListener scorelistener = new ScoreMouseListener();
	LifeMouseListener lifelistener = new LifeMouseListener();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_Accessories1 frame = new Select_Accessories1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	class CoinMouseListener implements MouseListener{
		boolean check = false;
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				check = true;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt_check.png"));
			}
			else {
				check = false;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//JButton b = (JButton)e.getSource();
			//b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override//���콺�� ������ 
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt_more.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt_check.png"));
			}
		}

		@Override//���콺�� ��ư ������
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt_check.png"));
			}
		}
	}
	class ScoreMouseListener implements MouseListener{

		boolean check = false;
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				check = true;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt_check.png"));
			}
			else {
				check = false;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//JButton b = (JButton)e.getSource();
			//b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override//���콺�� ������ 
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt_more.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt_check.png"));
			}
		}

		@Override//���콺�� ��ư ������
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt_check.png"));
			}
		}
	}
	class LifeMouseListener implements MouseListener{
		boolean check = false;
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				check = true;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt_check.png"));
			}
			else {
				check = false;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//JButton b = (JButton)e.getSource();
			//b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override//���콺�� ������ 
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt_more.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt_check.png"));
			}
		}

		@Override//���콺�� ��ư ������
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt_check.png"));
			}
		}
	    
	}
	
	public Select_Accessories1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select_Item t1 = new Select_Item();
				t1.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon("..\\image\\btn_image\\READY_bt (2).png"));
		btnNewButton_1_1_1.setBounds(741, 578, 540, 200);
		contentPane.add(btnNewButton_1_1_1);
		

		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.addMouseListener(coinlistener);
		btnNewButton_2_1.setFocusPainted(false);
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setContentAreaFilled(false);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt.png"));
		btnNewButton_2_1.setBounds(728, 169, 140, 153);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("");
		btnNewButton_2_1_1.addMouseListener(scorelistener);
		btnNewButton_2_1_1.setFocusPainted(false);
		btnNewButton_2_1_1.setBorderPainted(false);
		btnNewButton_2_1_1.setContentAreaFilled(false);
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt.png"));
		btnNewButton_2_1_1.setBounds(929, 169, 140, 153);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1.addMouseListener(lifelistener);
		btnNewButton_2_1_1_1_1.setFocusPainted(false);
		btnNewButton_2_1_1_1_1.setBorderPainted(false);
		btnNewButton_2_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1_1_1.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt.png"));
		btnNewButton_2_1_1_1_1.setBounds(1130, 169, 140, 153);
		contentPane.add(btnNewButton_2_1_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(125, 169, 306, 459);
		contentPane.add(lblNewLabel_1);
		
		JButton backbtn = new JButton("");
		backbtn.setIcon(new ImageIcon("..\\image\\btn_image\\return_bt.png"));
		backbtn.setFocusPainted(false);
		backbtn.setBorderPainted(false);
		backbtn.setContentAreaFilled(false);
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						setVisible(false);
						 Select_Character sc = new Select_Character();
						sc.setVisible(true);
					}
				});
		backbtn.setBounds(100, 661, 180, 120);
		contentPane.add(backbtn);
		
		JButton btnNewButton_2_2 = new JButton("");
		 btnNewButton_2_2.setFocusPainted(false);
		 btnNewButton_2_2.setBorderPainted(false);
		 btnNewButton_2_2.setContentAreaFilled(false);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_2.setIcon(new ImageIcon("..\\image\\btn_image\\apply_bt.png"));
		btnNewButton_2_2.setBounds(1243, 389, 180, 120);
		contentPane.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(599, 376, 130, 130);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(180, 60, 360, 60);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("..\\image\\game_image\\coin.png"));
		lblNewLabel_3.setBounds(100, 50, 80, 80);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("..\\image\\back_image\\accessories__bg.png"));
		lblNewLabel_6.setBounds(0, 0, 1484, 811);
		contentPane.add(lblNewLabel_6);
		
		
	
		

		
	
		
		
	}
}