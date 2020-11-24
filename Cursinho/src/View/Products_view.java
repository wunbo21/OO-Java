package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;

import DAO.Aluno_dao;
import DAO.Materia_dao;
import DAO.Professor_dao;
import DTO.Aluno_dto;
import DTO.Materia_dto;
import DTO.Professor_dto;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import java.awt.Font;
import javax.swing.JTextField;

public class Products_view extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField_Nome;
	private JTextField textField_Cod_Mat;
	private JTextField textField_Carga;
	private JTextField textField_Materia;

	Aluno_dto aluno = new Aluno_dto();
	Professor_dto professor = new Professor_dto();
	Materia_dto materia = new Materia_dto(); 
	
	Aluno_dao aluno_dao = new Aluno_dao();
	Professor_dao professor_dao = new Professor_dao();
	Materia_dao materia_dao = new Materia_dao();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Products_view frame = new Products_view();
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
	public Products_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setBounds(0, 0, 200, 560);
		menu.setBackground(new Color(86, 110, 245));
		contentPane.add(menu);
		menu.setLayout(null);
		
		JTabbedPane tabbedCrud = new JTabbedPane(JTabbedPane.TOP);
		tabbedCrud.setBounds(210, 185, 366, 368);
		contentPane.add(tabbedCrud);
		
		// ###########
		// # Paineis #
		// ###########
		
		// --------
		// Painel 1
		// --------
		JPanel panel_Insert = new JPanel();
		panel_Insert.setToolTipText("");
		tabbedCrud.addTab("Cadastrar", null, panel_Insert, null);
		panel_Insert.setLayout(null);
		panel_Insert.setBackground(new Color(21, 108, 128));
		
		// --------
		// Painel 2
		// --------
		JPanel panel_Read = new JPanel();
		tabbedCrud.addTab("Dados", null, panel_Read, null);
		panel_Read.setBackground(new Color(91, 125, 128));
		
		JLabel lblNewLabel_1 = new JLabel("Label 2");
		lblNewLabel_1.setForeground(Color.BLACK);
		panel_Read.add(lblNewLabel_1);
		
		// --------
		// Painel 3
		// --------
		JPanel panel_Update = new JPanel();
		tabbedCrud.addTab("Atualizar", null, panel_Update, null);
		panel_Update.setBackground(new Color(91, 125, 128));
		
		JLabel lblNewLabel_2 = new JLabel("Label 3");
		panel_Update.add(lblNewLabel_2);
		
		// --------
		// Painel 4
		// --------
		JPanel panel_Delete = new JPanel();
		tabbedCrud.addTab("Deletar", null, panel_Delete, null);
		panel_Delete.setBackground(new Color(91, 125, 128));
		
		JLabel lblNewLabel_3 = new JLabel("Label 4");
		panel_Delete.add(lblNewLabel_3);
		
		// ##########
		// # Botões #
		// ##########
		
		// ------
		// Alunos
		// ------
		JButton btnAluno = new JButton("Alunos");
		btnAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel_Insert.removeAll();
				
				JLabel lbl_Nome = new JLabel("Nome:");
				lbl_Nome.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lbl_Nome.setBounds(10, 10, 68, 25);
				lbl_Nome.setForeground(new Color(0, 0, 0));
				panel_Insert.add(lbl_Nome);
				
				JTextField txt_Nome = new JTextField();
				txt_Nome.setBounds(10, 50, 183, 25);
				panel_Insert.add(txt_Nome);
				txt_Nome.setColumns(10);
				
				JLabel lbl_Matricula = new JLabel("Matr\u00EDcula:");
				lbl_Matricula.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lbl_Matricula.setBounds(10, 100, 90, 25);
				lbl_Matricula.setForeground(new Color(0, 0, 0));
				panel_Insert.add(lbl_Matricula);
				
				JTextField txt_Cod_Mat = new JTextField();
				txt_Cod_Mat.setColumns(10);
				txt_Cod_Mat.setBounds(10, 140, 183, 25);
				panel_Insert.add(txt_Cod_Mat);
				
				JLabel lbl_Endereco = new JLabel("Endere\u00E7o:");
				lbl_Endereco.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lbl_Endereco.setBounds(10, 190, 90, 25);
				lbl_Endereco.setForeground(new Color(0, 0, 0));
				panel_Insert.add(lbl_Endereco);
				
				JTextField txt_Endereco = new JTextField();
				txt_Endereco.setColumns(10);
				txt_Endereco.setBounds(10, 230, 183, 25);
				panel_Insert.add(txt_Endereco);
				
				JButton btn_Cadastrar = new JButton("Cadastrar");
				btn_Cadastrar.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						aluno.setNome(txt_Nome.getText());
						aluno.setMatricula(txt_Cod_Mat.getText());
						aluno.setEndereco(txt_Endereco.getText());
						
						aluno_dao.create(aluno);
	
					}
				});
				
				btn_Cadastrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
				btn_Cadastrar.setBounds(10, 290, 118, 25);
				btn_Cadastrar.setForeground(new Color(0, 0, 0));
				panel_Insert.add(btn_Cadastrar);
			}
		});
		btnAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAluno.setBounds(50, 150, 100, 25);
		menu.add(btnAluno);
		
		// -----------
		// Professores
		// -----------
		JButton btnProfessor = new JButton("Professores");
		btnProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel_Insert.removeAll();
				
				JLabel lbl_Nome = new JLabel("Nome:");
				lbl_Nome.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lbl_Nome.setBounds(10, 10, 68, 25);
				lbl_Nome.setForeground(new Color(0, 0, 0));
				panel_Insert.add(lbl_Nome);
				
				JTextField txt_Nome = new JTextField();
				txt_Nome.setBounds(10, 45, 183, 25);
				panel_Insert.add(txt_Nome);
				txt_Nome.setColumns(10);
				
				JLabel lbl_Matricula = new JLabel("Matr\u00EDcula:");
				lbl_Matricula.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lbl_Matricula.setBounds(10, 80, 90, 25);
				lbl_Matricula.setForeground(new Color(0, 0, 0));
				panel_Insert.add(lbl_Matricula);
				
				JTextField txt_Matricula = new JTextField();
				txt_Matricula.setColumns(10);
				txt_Matricula.setBounds(10, 115, 183, 25);
				panel_Insert.add(txt_Matricula);
				
				JLabel lbl_Endereco = new JLabel("Endere\u00E7o:");
				lbl_Endereco.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lbl_Endereco.setBounds(10, 150, 90, 25);
				lbl_Endereco.setForeground(new Color(0, 0, 0));
				panel_Insert.add(lbl_Endereco);
				
				JTextField txt_Endereco = new JTextField();
				txt_Endereco.setColumns(10);
				txt_Endereco.setBounds(10, 185, 183, 25);
				panel_Insert.add(txt_Endereco);
				
				JLabel lbl_Materia = new JLabel("Cod. Mat\u00E9ria:");
				lbl_Materia.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lbl_Materia.setBounds(10, 220, 119, 25);
				lbl_Materia.setForeground(new Color(0, 0, 0));
				panel_Insert.add(lbl_Materia);
				
				JTextField txt_Cod_Materia = new JTextField();
				txt_Cod_Materia.setColumns(10);
				txt_Cod_Materia.setBounds(10, 255, 183, 25);
				panel_Insert.add(txt_Cod_Materia);
				
				JButton btn_Cadastrar = new JButton("Cadastrar");
				
				btn_Cadastrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
				btn_Cadastrar.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						professor.setNome(txt_Nome.getText());
						professor.setMatricula(txt_Matricula.getText());
						professor.setEndereco(txt_Endereco.getText());
						professor.setCodigo_Materia(txt_Cod_Materia.getText());
						
						System.out.println("Nome: "+professor.getNome());
						System.out.println("Matricula: "+professor.getMatricula());
						System.out.println("Endereço: "+professor.getEndereco());
						System.out.println("Código Matéria: "+professor.getCodigo_Materia());
						
						professor_dao.create(professor);
						
					}
				});
				btn_Cadastrar.setBounds(10, 290, 119, 25);
				btn_Cadastrar.setForeground(new Color(0, 0, 0));
				panel_Insert.add(btn_Cadastrar);
			}
		});
		btnProfessor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnProfessor.setBounds(50, 250, 100, 25);
		menu.add(btnProfessor);	
		
		// --------
		// Matérias
		// --------
		
		JButton btnMateria = new JButton("Mat\u00E9rias");
		btnMateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_Insert.removeAll();
				
				JLabel lbl_Nome = new JLabel("Nome:");
				lbl_Nome.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lbl_Nome.setBounds(10, 10, 118, 25);
				lbl_Nome.setForeground(new Color(0, 0, 0));
				panel_Insert.add(lbl_Nome);
				
				JTextField txt_Nome = new JTextField();
				txt_Nome.setBounds(10, 50, 183, 25);
				panel_Insert.add(txt_Nome);
				txt_Nome.setColumns(10);
				
				JLabel lbl_Cod_Mat = new JLabel("C\u00F3d. Mat\u00E9ria:");
				lbl_Cod_Mat.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lbl_Cod_Mat.setBounds(10, 100, 143, 25);
				lbl_Cod_Mat.setForeground(new Color(0, 0, 0));
				panel_Insert.add(lbl_Cod_Mat);
				
				JTextField txt_Codigo_Mat = new JTextField();
				txt_Codigo_Mat.setColumns(10);
				txt_Codigo_Mat.setBounds(10, 140, 183, 25);
				panel_Insert.add(txt_Codigo_Mat);
				
				JLabel lbl_Carga = new JLabel("Carga Hor\u00E1ria");
				lbl_Carga.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lbl_Carga.setBounds(10, 190, 143, 25);
				lbl_Carga.setForeground(new Color(0, 0, 0));
				panel_Insert.add(lbl_Carga);
				
				JTextField txt_Carga = new JTextField();
				txt_Carga.setColumns(10);
				txt_Carga.setBounds(10, 230, 183, 25);
				panel_Insert.add(txt_Carga);
				
				JButton btn_Cadastrar = new JButton("Cadastrar");
				btn_Cadastrar.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						materia.setNome(txt_Nome.getText());
						materia.setCodigo_Materia(txt_Codigo_Mat.getText());
						materia.setCarga_Horaria(Integer.parseInt(txt_Carga.getText()));
						
						System.out.println("Nome: "+materia.getNome());
						System.out.println("Código Matéria: "+materia.getCodigo_Materia());
						System.out.println("Carga Horária: "+materia.getCarga_Horaria());
						
						materia_dao.create(materia);
						
					}
				});
				btn_Cadastrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
				btn_Cadastrar.setBounds(10, 290, 118, 25);
				btn_Cadastrar.setForeground(new Color(0, 0, 0));
				panel_Insert.add(btn_Cadastrar);
			}
		});
		btnMateria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMateria.setBounds(50, 350, 100, 25);
		menu.add(btnMateria);
	}
}
