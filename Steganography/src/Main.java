import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.setBounds(121, 11, 89, 23);
		frame.getContentPane().add(btnEncrypt);
		
		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.setBounds(230, 11, 89, 23);
		frame.getContentPane().add(btnDecrypt);
	}

}
