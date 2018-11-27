package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import Controller.AtendenteInvalidoException;
import Controller.ControladorCadastroAtendente;
import Model.Atendente;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class CadastroAtendente extends JPanel{
	private JTextField txtNome;
	private JTextField txtSexo;
	private JTextField txtEmail;
	private JTextField txtNomeUsuario;
	private JPasswordField passwordFieldSenha;

	public CadastroAtendente() throws ParseException {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 204, 51));
		panel.setBounds(0, 0, 640, 34);
		add(panel);
		
		JLabel lblCadastroAtendente = new JLabel("Cadastro Atendente");
		lblCadastroAtendente.setForeground(Color.WHITE);
		lblCadastroAtendente.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(lblCadastroAtendente);
		
		JLabel label = new JLabel("Informa\u00E7\u00F5es de Dados");
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setBounds(10, 45, 207, 25);
		add(label);
		
		JLabel lblNomeCompleto = new JLabel("Nome completo");
		lblNomeCompleto.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeCompleto.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNomeCompleto.setBounds(10, 81, 103, 14);
		add(lblNomeCompleto);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(118, 79, 512, 20);
		add(txtNome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTelefone.setBounds(10, 106, 61, 14);
		add(lblTelefone);
		
		JFormattedTextField ftfTelefone = new JFormattedTextField();
		ftfTelefone.setToolTipText("");
		ftfTelefone.setBounds(71, 104, 140, 22);
		add(ftfTelefone);
		
		MaskFormatter maskTelefone = new MaskFormatter("(##)#####-####");    
		maskTelefone.install(ftfTelefone);
		
		JLabel lblDtNascimento = new JLabel("Data de Nascimento");
		lblDtNascimento.setHorizontalAlignment(SwingConstants.LEFT);
		lblDtNascimento.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDtNascimento.setBounds(221, 106, 140, 14);
		add(lblDtNascimento);
		
		JFormattedTextField ftfDtNascimento = new JFormattedTextField();
		ftfDtNascimento.setToolTipText("");
		ftfDtNascimento.setBounds(350, 103, 118, 23);
		add(ftfDtNascimento);
		
		MaskFormatter maskData = new MaskFormatter("##/##/####");    
	    maskData.install(ftfDtNascimento);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSexo.setBounds(478, 106, 37, 14);
		add(lblSexo);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(518, 104, 112, 20);
		add(txtSexo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEmail.setBounds(10, 132, 44, 14);
		add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(54, 129, 250, 20);
		add(txtEmail);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setHorizontalAlignment(SwingConstants.LEFT);
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCPF.setBounds(314, 131, 26, 14);
		add(lblCPF);
		
		JFormattedTextField ftfCPF = new JFormattedTextField();
		ftfCPF.setToolTipText("");
		ftfCPF.setBounds(350, 129, 118, 23);
		add(ftfCPF);
		
		MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");    
		maskCPF.install(ftfCPF);
		
		JLabel lblRG = new JLabel("RG");
		lblRG.setHorizontalAlignment(SwingConstants.LEFT);
		lblRG.setFont(new Font("Arial", Font.PLAIN, 13));
		lblRG.setBounds(478, 131, 19, 14);
		add(lblRG);
		
		JFormattedTextField ftfRG = new JFormattedTextField();
		ftfRG.setToolTipText("");
		ftfRG.setBounds(518, 129, 112, 23);
		add(ftfRG);
		
		MaskFormatter maskRG = new MaskFormatter("#.###.###");    
		maskRG.install(ftfRG);
		
		JLabel lblInformacoesLogin = new JLabel("Informa\u00E7\u00F5es de Login");
		lblInformacoesLogin.setFont(new Font("Arial", Font.PLAIN, 20));
		lblInformacoesLogin.setBounds(10, 170, 201, 20);
		add(lblInformacoesLogin);
		
		JLabel lblNomeUsuario = new JLabel("Nome de Usu\u00E1rio");
		lblNomeUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNomeUsuario.setBounds(10, 213, 103, 14);
		add(lblNomeUsuario);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(123, 211, 207, 20);
		add(txtNomeUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSenha.setBounds(10, 238, 44, 14);
		add(lblSenha);
		
		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(54, 236, 276, 20);
		add(passwordFieldSenha);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setHorizontalAlignment(SwingConstants.LEFT);
		lblEndereco.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEndereco.setBounds(10, 291, 61, 14);
		add(lblEndereco);
		
		JEditorPane editorPaneEndereco = new JEditorPane();
		editorPaneEndereco.setBounds(10, 316, 620, 98);
		add(editorPaneEndereco);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new LoginAtendente());
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
				ftfTelefone.setText("");
				ftfDtNascimento.setText("");
				ftfCPF.setText("");
				ftfRG.setText("");
				
				//password text Field
				passwordFieldSenha.setText("");
				
				//Editor Pane
				editorPaneEndereco.setText("");
				
			}
		});
		btnLimpar.setBounds(277, 446, 89, 23);
		add(btnLimpar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Atendente atendente = new Atendente();
				String senha = String.valueOf(passwordFieldSenha.getPassword());
				
				atendente.setNome(txtNome.getText());
				atendente.setSexo(txtSexo.getText());
				atendente.setEmail(txtEmail.getText());
				atendente.setLogin(txtNomeUsuario.getText());
				
				atendente.setTelefone(ftfTelefone.getText());
				atendente.setDtNascimento(ftfDtNascimento.getText());
				atendente.setRg(ftfRG.getText());
				atendente.setCpf(ftfCPF.getText());
				
				atendente.setSenha(senha);
				atendente.setEndereco(editorPaneEndereco.getText());
				
				try {
					
					ControladorCadastroAtendente controladorCadastroAtendente = new ControladorCadastroAtendente();
					controladorCadastroAtendente.cadastrarAtendente(atendente);
					
					JDialogUsuarioCriado jDialogUsuarioCriado = new JDialogUsuarioCriado();
					jDialogUsuarioCriado.setVisible(true);
					jDialogUsuarioCriado.setLocationRelativeTo(null);
					
					//Text Field
					txtNome.setText("");
					txtSexo.setText("");
					txtEmail.setText("");
					txtNomeUsuario.setText("");
					
					//Formatted Text Field
					ftfTelefone.setText("");
					ftfDtNascimento.setText("");
					ftfCPF.setText("");
					ftfRG.setText("");
					
					//password text Field
					passwordFieldSenha.setText("");
					
					//Editor Pane
					editorPaneEndereco.setText("");
					
				} catch (AtendenteInvalidoException e) {
					e.printStackTrace();
					
					JDialogUsuarioNaoCriado jDialogUsuarioNaoCriado = new JDialogUsuarioNaoCriado();
					jDialogUsuarioNaoCriado.setVisible(true);
					jDialogUsuarioNaoCriado.setLocationRelativeTo(null);
				}
				
				
			}
		});
		btnCadastrar.setBounds(541, 446, 89, 23);
		add(btnCadastrar);

	}
}
