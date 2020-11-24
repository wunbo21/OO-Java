package Semana_08;

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
	private JPanel painel = new JPanel();
	
	private JLabel lbltitulo = new JLabel("Calculadora");
	private JLabel lblnum1 = new JLabel("Entre com num 1:");
	private JLabel lblnum2 = new JLabel("Entre com num 2:");
	
	private JTextField txtnum_1 = new JTextField("0");
	private JTextField txtnum_2 = new JTextField("0");
	
	private JButton btnSoma = new JButton("Somar");
	
	private JLabel lblresultado = new JLabel("Resultado: ");
	
	public Janela() {
		// Programar o botão para escutar
		btnSoma.addActionListener(this);
		
		// Título
		lbltitulo.setForeground(new Color(255, 133, 51));
		
		painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 100, 300));
		painel.setLayout(new GridLayout(0,1));
		painel.add(lbltitulo);
		painel.add(lblnum1);
		painel.add(txtnum_1);
		painel.add(lblnum2);
		painel.add(txtnum_2);
		painel.add(btnSoma);
		painel.add(lblresultado);
		painel.setBackground(new Color(70, 200, 155));
		
		frame.add(painel, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setTitle("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(txtnum_1.getText()), 
			num2 = Integer.parseInt(txtnum_2.getText());
		
		Matematica mat = new Matematica();
		
		lblresultado.setText("Resultado: " + mat.soma(num1, num2));
		
	}
}