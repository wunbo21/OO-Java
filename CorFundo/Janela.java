package CorFundo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela implements ActionListener {

	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	
	private JLabel lblTitulo = new JLabel("Mundado Cor de Fundo");
	
	private JLabel lblred = new JLabel("Entre com um valor para cor Red, entre 0 - 255:");
	private JLabel lblgreen = new JLabel("Entre com um valor para cor Green, entre 0 - 255:");
	private JLabel lblblue = new JLabel("Entre com um valor para cor Blue, entre 0 - 255:");
	
	private JTextField txtred = new JTextField("0");
	private JTextField txtgreen = new JTextField("0");
	private JTextField txtblue = new JTextField("0");
	
	private JButton btnCorFundo = new JButton("Mudar Fundo");
	
	public Janela() {
		
		// Botão
		btnCorFundo.addActionListener(this);
		
		// Panel
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 100, 300));
		panel.setLayout(new GridLayout(0,1));
		panel.add(lblTitulo);
		
		panel.add(lblred);
		panel.add(txtred);
		
		panel.add(lblgreen);
		panel.add(txtgreen);
		
		panel.add(lblblue);
		panel.add(txtblue);
		
		panel.add(btnCorFundo);
		
		// Frame
		frame.add(panel, BorderLayout.CENTER);
		frame.setTitle("Cor de Fundo");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int red = Integer.parseInt(txtred.getText()),
			green = Integer.parseInt(txtgreen.getText()),
			blue = Integer.parseInt(txtblue.getText());
		
		panel.setBackground(new Color(red, green, blue));
	}
	
}