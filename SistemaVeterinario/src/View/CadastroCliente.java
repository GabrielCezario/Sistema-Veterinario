package View;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import Model.Cliente;

import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLayeredPane;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.text.ParseException;

public class CadastroCliente extends JPanel {
	private JTextField txtNome;
	private JTextField txtSexo;
	private JTextField txtEmail;
	private JTextField txtNomeUsuario;
	private JPasswordField passwordField;


	public CadastroCliente() throws ParseException {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 204, 51));
		panel.setBounds(0, 0, 640, 34);
		add(panel);
		
		JLabel lblCadastroAtendente = new JLabel("Cadastro Cliente");
		lblCadastroAtendente.setForeground(Color.WHITE);
		lblCadastroAtendente.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(lblCadastroAtendente);
		
		JLabel lblNome = new JLabel("Nome completo");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNome.setBounds(10, 81, 103, 14);
		add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(118, 79, 512, 20);
		add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.LEFT);
		lblDataDeNascimento.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDataDeNascimento.setBounds(221, 106, 140, 14);
		add(lblDataDeNascimento);
		
		JFormattedTextField ftfDtNascimento = new JFormattedTextField();
		ftfDtNascimento.setToolTipText("");
		ftfDtNascimento.setBounds(350, 103, 118, 23);
		add(ftfDtNascimento);
		
		MaskFormatter maskData = new MaskFormatter("##/##/####");    
	    maskData.install(ftfDtNascimento);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTelefone.setBounds(10, 106, 61, 14);
		add(lblTelefone);
		
		JFormattedTextField formattedTelefone = new JFormattedTextField();
		formattedTelefone.setToolTipText("");
		formattedTelefone.setBounds(71, 104, 140, 22);
		add(formattedTelefone);
		
		MaskFormatter maskTelefone = new MaskFormatter("(##)#####-####");    
		maskTelefone.install(formattedTelefone);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setHorizontalAlignment(SwingConstants.LEFT);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCpf.setBounds(314, 131, 26, 14);
		add(lblCpf);
		
		JFormattedTextField formattedCPF = new JFormattedTextField();
		formattedCPF.setToolTipText("");
		formattedCPF.setBounds(350, 129, 118, 23);
		add(formattedCPF);
		
		MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");    
	    maskCPF.install(formattedCPF);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setHorizontalAlignment(SwingConstants.LEFT);
		lblRg.setFont(new Font("Arial", Font.PLAIN, 13));
		lblRg.setBounds(478, 131, 19, 14);
		add(lblRg);
		
		JFormattedTextField formattedRG = new JFormattedTextField();
		formattedRG.setToolTipText("");
		formattedRG.setBounds(518, 129, 112, 23);
		add(formattedRG);
		
		MaskFormatter maskRG = new MaskFormatter("#.###.###");    
	    maskRG.install(formattedRG);
		
		JEditorPane editorPaneEndereco = new JEditorPane();
		editorPaneEndereco.setBounds(10, 315, 620, 98);
		add(editorPaneEndereco);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSexo.setBounds(478, 106, 37, 14);
		add(lblSexo);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(518, 104, 112, 20);
		add(txtSexo);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setHorizontalAlignment(SwingConstants.LEFT);
		lblEndereo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEndereo.setBounds(10, 290, 61, 14);
		add(lblEndereo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEmail.setBounds(10, 131, 44, 14);
		add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(54, 129, 250, 20);
		add(txtEmail);
		
		JLabel lblLogin = new JLabel("Nome de Usu\u00E1rio");
		lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 13));
		lblLogin.setBounds(10, 213, 103, 14);
		add(lblLogin);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(123, 211, 207, 20);
		add(txtNomeUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSenha.setBounds(10, 238, 44, 14);
		add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(54, 236, 276, 20);
		add(passwordField);
		
		JLabel lblDados = new JLabel("Informa\u00E7\u00F5es de Dados");
		lblDados.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDados.setBounds(10, 45, 207, 25);
		add(lblDados);
		
		JLabel lblNewLabel = new JLabel("Informa\u00E7\u00F5es de Login");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 170, 201, 20);
		add(lblNewLabel);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new LoginCliente());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnVoltar.setBounds(10, 446, 89, 23);
		add(btnVoltar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Text Field
				txtNome.setText("");
				txtSexo.setText("");
				txtEmail.setText("");
				txtNomeUsuario.setText("");
				
				//Formatted Text Field
				formattedTelefone.setText("");
				ftfDtNascimento.setText("");
				formattedCPF.setText("");
				formattedRG.setText("");
				
				//password text Field
				passwordField.setText("");
				
				//Editor Pane
				editorPaneEndereco.setText("");
				
			}
		});
		btnLimpar.setBounds(277, 446, 89, 23);
		add(btnLimpar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente();
				
				cliente.setNome(txtNome.getText());
				cliente.setSexo(txtSexo.getText());
				cliente.setEmail(txtEmail.getText());
				cliente.setLogin(txtNomeUsuario.getText());
				
				cliente.setTelefone(formattedTelefone.getText());
				cliente.setDtNascimento(ftfDtNascimento.getText());
				cliente.setRg(formattedRG.getText());
				cliente.setCpf(formattedCPF.getText());
				
				cliente.setSenha(passwordField.getText());
				cliente.setEndereco(editorPaneEndereco.getText());
				
				
			}
		});
		btnCadastrar.setBounds(541, 446, 89, 23);
		add(btnCadastrar);

	}
}
