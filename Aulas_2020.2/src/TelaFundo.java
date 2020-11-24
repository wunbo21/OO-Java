import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFundo extends JFrame {

	private JPanel contentPane;
	private JTextField txtRed;
	private JTextField txtGreen;
	private JTextField txtBlue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFundo frame = new TelaFundo();
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
	public TelaFundo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 554);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(7, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Mudar Cor");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(7, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Red");
		panel.add(lblNewLabel_1);
		
		txtRed = new JTextField();
		panel.add(txtRed);
		txtRed.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Green");
		panel.add(lblNewLabel_2);
		
		txtGreen = new JTextField();
		panel.add(txtGreen);
		txtGreen.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Blue");
		panel.add(lblNewLabel_3);
		
		txtBlue = new JTextField();
		panel.add(txtBlue);
		txtBlue.setColumns(10);
		
		JButton btnMudarCor = new JButton("Mudar Cor");
		btnMudarCor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int red = Integer.parseInt(txtRed.getText()),
					green = Integer.parseInt(txtGreen.getText()),
					blue = Integer.parseInt(txtBlue.getText());
				
				panel.setBackground(new Color(red, green, blue));
				
				txtRed.setBackground(new Color(red, green, blue));
				txtGreen.setBackground(new Color(red, green, blue));
				txtBlue.setBackground(new Color(red, green, blue));
				
			}
		});
		panel.add(btnMudarCor);
	}

}
