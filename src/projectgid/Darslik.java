package projectgid;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Darslik {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Darslik window = new Darslik();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Darslik() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 716, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout( null);
		
		JButton btnsinf = new JButton(" 5-sinf");
		btnsinf.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnsinf);
		
		JButton btnsinf_7 = new JButton(" 6-sinf");
		btnsinf_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnsinf_7.setBounds(99, 28, 89, 23);
		frame.getContentPane().add(btnsinf_7);
		
		JButton btnsinf_1 = new JButton(" 7-sinf");
		btnsinf_1.setBounds(188, 42, 89, 23);
		frame.getContentPane().add(btnsinf_1);
		
		JButton btnsinf_2 = new JButton(" 8-sinf");
		btnsinf_2.setBounds(278, 59, 89, 23);
		frame.getContentPane().add(btnsinf_2);
		
		JButton btnsinf_3 = new JButton(" 9-sinf");
		btnsinf_3.setBounds(366, 75, 89, 23);
		frame.getContentPane().add(btnsinf_3);
		
		JButton btnsinf_4 = new JButton(" 10-sinf");
		btnsinf_4.setBounds(452, 87, 89, 23);
		frame.getContentPane().add(btnsinf_4);
		
		JButton btnsinf_5 = new JButton("11-sinf");
		btnsinf_5.setBounds(533, 110, 89, 23);
		frame.getContentPane().add(btnsinf_5);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 110, 502, 237);
		frame.getContentPane().add(panel);
	}
}
