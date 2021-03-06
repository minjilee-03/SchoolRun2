package src;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.CharacterInfo;

public class Select_Character extends JFrame {

	private JPanel contentPane;
	CharacterInfo c_info = new CharacterInfo();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Select_Character frame = new  Select_Character();
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
	public  Select_Character() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton Closet1 = new JButton("Closet1");
		Closet1.setLocation(364,119);
		Closet1.setSize(100, 100);
		contentPane.add(Closet1);
		Closet1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton Closet2 = new JButton("Closet2");
		Closet2.setBounds(835, 119, 100, 100);
		contentPane.add(Closet2);
		Closet2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton Closet3 = new JButton("Closet3");
		Closet3.setBounds(1307, 119, 100, 100);
		contentPane.add(Closet3);
		Closet3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		JButton chracter1 = new JButton("chracter1");
		chracter1.setBounds(110, 160, 300, 440);
		contentPane.add(chracter1);
		chracter1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String run = "..//image//game_image//student_run.gif";
				String jump = "..//image//game_image//student_jump.jpg";
				String doubleJump = "..//image//game_image//student_doubleJump.gif";
				String fall = "..//image//game_image//student_fall.jpg";
				String slide = "..//image//game_image//student_slide.jpg";
							}
						});
		
		JButton character2 = new JButton("character2");
		character2.setBounds(594, 160, 300, 440);
		contentPane.add(character2);
		character2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String run = "..//image//game_image//baby_run.gif";
				String jump = "..//image//game_image//baby_jump.jpg";
				String doubleJump = "..//image//game_image//baby_doubleJump.gif";
				String fall = "..//image//game_image//baby_fall.jpg";
				String slide = "..//image//game_image//baby_slide.jpg";
				c_info.setCharacter(run, jump, doubleJump, fall, slide);
			}
		});
		
		JButton character3 = new JButton("character3");
		character3.setBounds(1071, 160, 300, 440);
		contentPane.add(character3);
		character3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String run = "..//image//game_image//santa_run.gif";
				String jump = "..//image//game_image//santa_jump.jpg";
				String doubleJump = "..//image//game_image//santa_doubleJump.gif";
				String fall = "..//image//game_image//santa_fall.jpg";
				String slide = "..//image//game_image//santa_slide.jpg";
				c_info.setCharacter(run, jump, doubleJump, fall, slide);
			}
		});
	}
}
