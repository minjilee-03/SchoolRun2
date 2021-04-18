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

public class Rancking extends JFrame {

	private JPanel contentPane;
	User u1= new User();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rancking frame = new Rancking();
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
	public Rancking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(97, 142, 92, 93);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\\uC120\uB355\uC911_\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694.-1.jpg"));
		lblNewLabel_1.setBounds(996, 160, 306, 459);
		contentPane.add(lblNewLabel_1);
		
		JButton goitem = new JButton("");
		goitem.setIcon(new ImageIcon("..\\image\\btn_image\\ready_bt.png"));
		goitem.setBounds(918, 653, 468, 120);
		goitem.setFocusPainted(false);
		goitem.setBorderPainted(false);
		goitem.setContentAreaFilled(false);
		contentPane.add(goitem);
		
		goitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Item si = new Select_Item();
				si.setVisible(true);
			}
		});
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(97, 264, 92, 93);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setBounds(97, 390, 92, 93);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("");
		lblNewLabel_6_1_1.setBounds(97, 504, 92, 93);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("");
		lblNewLabel_6_1_1_1.setBounds(97, 620, 92, 93);
		contentPane.add(lblNewLabel_6_1_1_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setBounds(201, 264, 380, 93);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("");
		lblNewLabel_5_2_1.setBounds(201, 390, 380, 93);
		contentPane.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_2_1_1 = new JLabel("");
		lblNewLabel_5_2_1_1.setBounds(201, 504, 380, 93);
		contentPane.add(lblNewLabel_5_2_1_1);
		
		JLabel lblNewLabel_5_2_1_2 = new JLabel("");
		lblNewLabel_5_2_1_2.setBounds(201, 620, 380, 93);
		contentPane.add(lblNewLabel_5_2_1_2);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setBounds(593, 264, 189, 93);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("");
		lblNewLabel_5_1_2.setBounds(593, 390, 189, 93);
		contentPane.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("");
		lblNewLabel_5_1_3.setBounds(593, 504, 189, 93);
		contentPane.add(lblNewLabel_5_1_3);
		
		JLabel lblNewLabel_5_1_4 = new JLabel("");
		lblNewLabel_5_1_4.setBounds(593, 620, 189, 93);
		contentPane.add(lblNewLabel_5_1_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(201, 142, 380, 93);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setBounds(593, 142, 189, 93);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(975, 60, 360, 60);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("..\\image\\game_image\\coin.png"));
		lblNewLabel_3.setBounds(892, 50, 80, 80);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("..\\image\\back_image\\ranking_bg.png"));
		lblNewLabel_4.setBounds(0, 0, 1484, 811);
		contentPane.add(lblNewLabel_4);
		
		
		
	}
}
