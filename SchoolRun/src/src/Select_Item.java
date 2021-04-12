package src;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Select_Item extends JFrame {

	private JPanel contentPane;
	User u1 = new User();
	int item_num = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_Item frame = new Select_Item();
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
	public Select_Item() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JButton gochracter = new JButton("New button");
		gochracter.setBounds(564, 581, 310, 90);
		contentPane.add(gochracter);
		
		gochracter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Character sc = new Select_Character();
				sc.setVisible(true);
			}
		});
		
		JButton gotheme = new JButton("New button");
		gotheme.setBounds(564, 691, 310, 90);
		contentPane.add(gotheme);
		
		gotheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Thema sc = new Select_Thema();
				sc.setVisible(true);
			}
		});
		
		JButton gostage = new JButton("New button");
		gostage.setBounds(904, 581, 540, 200);
		contentPane.add(gostage);
		
		gostage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Stage sc = new Select_Stage();
				sc.setVisible(true);
			}
		});

		JButton money2x = new JButton("money");
		money2x.setBounds(619, 169, 120, 120);
		contentPane.add(money2x);
		money2x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//이걸 누르면 돈2배 아이템 정보
				item_num = 1; 
			}
		});
		
		
		JButton score2x = new JButton("score");
		score2x.setBounds(781, 169, 120, 120);
		contentPane.add(score2x);
		score2x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//이걸 누르면 점수2배 아이템 정보
				item_num = 2;
			}
		});
		
		
		JButton life2x = new JButton("life");
		life2x.setBounds(945, 169, 120, 120);
		contentPane.add(life2x);
		life2x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//이걸 누르면 생명2배 아이템 정보
				item_num = 3;
			}
		});
		
		JButton friend = new JButton("friend");
		friend.setBounds(1111, 169, 120, 120);
		contentPane.add(friend);
		friend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//이걸 누르면 친구 아이템 정보
				item_num = 4;
			}
		});
		
		JButton booster = new JButton("booster");
		booster.setBounds(1275, 169, 120, 120);
		contentPane.add(booster);
		booster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//이걸 누르면 부스터 아이템 정보
				item_num = 5;
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("캐릭터");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\\uC120\uB355\uC911_\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694.-1.jpg"));
		lblNewLabel_1.setBounds(125, 169, 306, 459);
		contentPane.add(lblNewLabel_1);
		
		JButton backbtn = new JButton("New button");
		backbtn.setBounds(100, 661, 180, 120);
		contentPane.add(backbtn);
		
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Rancking sc = new Rancking();
				sc.setVisible(true);
			}
		});
		
		
		
		JButton buy_btn = new JButton("구매");
		buy_btn.setBounds(1243, 389, 180, 120);
		contentPane.add(buy_btn);
		buy_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				u1.buyItem(item_num);
			}
		});
		
		
		JLabel lblNewLabel_5 = new JLabel("New Label");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\\uC120\uB355\uC911_\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694.-10.jpg"));
		lblNewLabel_5.setBounds(593, 384, 130, 130);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("잉");
		lblNewLabel_2.setBounds(180, 60, 360, 60);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("요건가");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\\uC120\uB355\uC911_\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694.-3.jpg"));
		lblNewLabel_3.setBounds(100, 50, 80, 80);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\\uC120\uB355\uC911_\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694.-9.jpg"));
		lblNewLabel.setBounds(564, 50, 880, 300);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\\uC120\uB355\uC911_\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694.-12.jpg"));
		lblNewLabel_4.setBounds(564, 349, 880, 200);
		contentPane.add(lblNewLabel_4);
		
		
	
		

		
	
		
		
	}
}
