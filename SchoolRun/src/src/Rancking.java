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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\\uC120\uB355\uC911_\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694.-1.jpg"));
		lblNewLabel.setBounds(55, 113, 760, 660);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\\uC120\uB355\uC911_\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694.-1.jpg"));
		lblNewLabel_1.setBounds(996, 160, 306, 459);
		contentPane.add(lblNewLabel_1);
		
		JButton goitem = new JButton("New button");
		goitem.setBounds(929, 653, 460, 120);
		contentPane.add(goitem);
		
		goitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Item si = new Select_Item();
				si.setVisible(true);
			}
		});
		
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(975, 60, 360, 60);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\\uC120\uB355\uC911_\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694\\\uC81C\uBAA9\uC744-\uC785\uB825\uD574\uC8FC\uC138\uC694.-3.jpg"));
		lblNewLabel_3.setBounds(892, 50, 80, 80);
		contentPane.add(lblNewLabel_3);
	}
}
