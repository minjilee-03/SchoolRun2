package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.Stage1;
import Game.Stage2;
import Game.Stage3;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Select_Stage extends JFrame {

	private JPanel contentPane;
	int level;
	User u1 = new User();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_Stage frame = new Select_Stage();
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
	public Select_Stage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton stage1btn = new JButton();
		stage1btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level = 1;
				if(u1.setStage(level)) {
					setVisible(false);
					Stage1 s1 = new Stage1();
				} else {
					System.out.println("레벨이 안됩니다.");
				}
			}
		});
		stage1btn.setBounds(190, 285, 240, 240);
		contentPane.add(stage1btn);	
		
		
		JButton stage2btn = new JButton();
		stage2btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level = 2;
				if(u1.setStage(level)) {
					setVisible(false);
					Stage2 s2 = new Stage2();
				} else {
					System.out.println("레벨이 안됩니다.");
				}	
			}
		});
		stage2btn.setBounds(630, 445, 240, 240);
		contentPane.add(stage2btn);
		
		
		JButton stage3btn = new JButton();
		stage3btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level = 3;
				if(u1.setStage(level)) {
					setVisible(false);
					Stage3 s3 = new Stage3();
				} else {
					System.out.println("레벨이 안됩니다.");
				}
			}
		});
		stage3btn.setBounds(1070, 285, 240, 240);
		contentPane.add(stage3btn);

	}
}
