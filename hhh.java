import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class hhh {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hhh window = new hhh();
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
	public hhh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(47, 128, 83, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Passwort");
		lblNewLabel_1.setBounds(47, 168, 83, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(123, 127, 202, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		Image img = new ImageIcon (this.getClass().getResource("/sign-check-icon.png")).getImage();
		btnNewButton.setIcon(new ImageIcon (img));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Erfolgreich angemeldet");
				frame.dispose();
				Startseite1 startseite1 = new Startseite1();
				startseite1.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(123, 208, 146, 39);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 165, 202, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblBitteUserName = new JLabel("Bitte User Name und Passwort eingeben.");
		lblBitteUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblBitteUserName.setBounds(47, 45, 278, 53);
		frame.getContentPane().add(lblBitteUserName);
		
	}
}
