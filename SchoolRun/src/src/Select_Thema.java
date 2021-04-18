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

public class Select_Thema extends JFrame {

	private JPanel contentPane;
	CoinMouseListener classlistener = new CoinMouseListener();
	ScoreMouseListener storelistener = new ScoreMouseListener();
	LifeMouseListener forestlistener = new LifeMouseListener();
	FriendMouseListener hwllistener = new FriendMouseListener();
	BoosterMouseListener xmaslistener = new BoosterMouseListener();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_Thema frame = new Select_Thema();
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt_check.png"));
			}
			else {
				check = false;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//JButton b = (JButton)e.getSource();
			//b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override//마우스가 안으로 
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt_more.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt_check.png"));
			}
		}

		@Override//마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\\store_bt_check.png"));
			}
			else {
				check = false;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//JButton b = (JButton)e.getSource();
			//b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override//마우스가 안으로 
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt_more.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt_check.png"));
			}
		}

		@Override//마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt_check.png"));
			}
			else {
				check = false;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//JButton b = (JButton)e.getSource();
			//b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override//마우스가 안으로 
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt_more.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt_check.png"));
			}
		}

		@Override//마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt_check.png"));
			}
		}
	    
	}
	class FriendMouseListener implements MouseListener{
		boolean check = false;
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				check = true;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt_check.png"));
			}
			else {
				check = false;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//JButton b = (JButton)e.getSource();
			//b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override//마우스가 안으로 
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt_more.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt_check.png"));
			}
		}

		@Override//마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt_check.png"));
			}
		}
	    
	}
	class BoosterMouseListener implements MouseListener{
		boolean check = false;
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				check = true;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt_check.png"));
			}
			else {
				check = false;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//JButton b = (JButton)e.getSource();
			//b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override//마우스가 안으로 
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt_more.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt_check.png"));
			}
		}

		@Override//마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt_check.png"));
			}
		}
	    
	}
	
	public Select_Thema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1519, 843);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton select = new JButton("");
		select.setFocusPainted(false);
		select.setBorderPainted(false);
		select.setContentAreaFilled(false);
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select_Item t1 = new Select_Item();
				t1.setVisible(true);
				setVisible(false);
			}
		});
		select.setIcon(new ImageIcon("..\\image\\btn_image\\READY_bt (2).png"));
		select.setBounds(781, 581, 540, 200);
		contentPane.add(select);
		

		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setFocusPainted(false);
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setContentAreaFilled(false);
		btnNewButton_2_1.addMouseListener(classlistener);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt.png"));
		btnNewButton_2_1.setBounds(619, 169, 130, 150);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("");
		btnNewButton_2_1_1.setFocusPainted(false);
		btnNewButton_2_1_1.setBorderPainted(false);
		btnNewButton_2_1_1.setContentAreaFilled(false);
		btnNewButton_2_1_1.addMouseListener(storelistener);
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt.png"));
		btnNewButton_2_1_1.setBounds(779, 169, 138, 150);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1.setFocusPainted(false);
		btnNewButton_2_1_1_1.setBorderPainted(false);
		btnNewButton_2_1_1_1.setContentAreaFilled(false);
		btnNewButton_2_1_1_1.addMouseListener(xmaslistener);
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1_1.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt.png"));
		btnNewButton_2_1_1_1.setBounds(1276, 169, 130, 150);
		contentPane.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("");
		btnNewButton_2_1_1_1_1.setFocusPainted(false);
		btnNewButton_2_1_1_1_1.setBorderPainted(false);
		btnNewButton_2_1_1_1_1.setContentAreaFilled(false);
		btnNewButton_2_1_1_1_1.addMouseListener(hwllistener);
		btnNewButton_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1_1_1.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt.png"));
		btnNewButton_2_1_1_1_1.setBounds(1111, 169, 130, 150);
		contentPane.add(btnNewButton_2_1_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(100, 130, 306, 459);
		contentPane.add(lblNewLabel_1);
		
		JButton backbtn = new JButton("");
		backbtn.setIcon(new ImageIcon("..\\image\\btn_image\\return_bt.png"));
		backbtn.setFocusPainted(false);
		backbtn.setBorderPainted(false);
		backbtn.setContentAreaFilled(false);
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						setVisible(false);
						Select_Item sc = new Select_Item();
						sc.setVisible(true);
					}
				});
		
		backbtn.setBounds(100, 661, 180, 120);
		contentPane.add(backbtn);
		
		JButton btnNewButton_2_1_1_2 = new JButton("");
		btnNewButton_2_1_1_2.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt.png"));
		 btnNewButton_2_1_1_2.setFocusPainted(false);
		 btnNewButton_2_1_1_2.setBorderPainted(false);
		 btnNewButton_2_1_1_2.setContentAreaFilled(false);
		 btnNewButton_2_1_1_2.addMouseListener(forestlistener);
		btnNewButton_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1_2.setBounds(947, 169, 130, 150);
		contentPane.add(btnNewButton_2_1_1_2);
		
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
		lblNewLabel_5.setBounds(608, 372, 130, 130);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(180, 60, 360, 60);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("..\\image\\game_image\\coin.png"));
		lblNewLabel_3.setBounds(100, 50, 80, 80);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("..\\image\\back_image\\theme_bg.png"));
		lblNewLabel_6.setBounds(12, 0, 1503, 811);
		contentPane.add(lblNewLabel_6);
		
	}
}
