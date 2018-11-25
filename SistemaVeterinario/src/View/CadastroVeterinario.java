package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import Controller.ControladorCadastroVeterinario;
import Controller.VeterinarioInvalidoException;
import Model.Veterinario;

import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLayeredPane;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class CadastroVeterinario extends JPanel {
	private JTextField txtNome;
	private JTextField txtSexo;
	private JTextField txtEmail;
	private JTextField txtNomeUsuario;
	private JPasswordField passwordFieldSenha;
	private JTextField txtEspecialidade;

	public CadastroVeterinario() throws ParseException {
		setLayout(null);
		
		JPanel panelCadastroVeterinario = new JPanel();
		panelCadastroVeterinario.setBackground(new Color(51, 204, 51));
		panelCadastroVeterinario.setBounds(0, 0, 640, 34);
		add(panelCadastroVeterinario);
		
		JLabel lblCadastroVeterinario = new JLabel("Cadastro Veterinario");
		lblCadastroVeterinario.setForeground(Color.WHITE);
		lblCadastroVeterinario.setFont(new Font("Arial", Font.PLAIN, 20));
		panelCadastroVeterinario.add(lblCadastroVeterinario);
		
		JLabel label = new JLabel("Informa\u00E7\u00F5es de Dados");
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setBounds(10, 45, 207, 25);
		add(label);
		
		JLabel lblNome = new JLabel("Nome completo");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNome.setBounds(10, 81, 103, 14);
		add(lblNome);
		
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
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento");
		lblDataNascimento.setHorizontalAlignment(SwingConstants.LEFT);
		lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDataNascimento.setBounds(221, 106, 140, 14);
		add(lblDataNascimento);
		
		JFormattedTextField ftfDtNascimento = new JFormattedTextField();
		ftfDtNascimento.setToolTipText("");
		ftfDtNascimento.setBounds(350, 103, 118, 23);
		add(ftfDtNascimento);
		
		MaskFormatter maskDtNascimento = new MaskFormatter("##/##/####");
		maskDtNascimento.install(ftfDtNascimento);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSexo.setBounds(478, 106, 37, 14);
		add(lblSexo);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(518, 104, 112, 20);
		add(txtSexo);
		
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
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setHorizontalAlignment(SwingConstants.LEFT);
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCPF.setBounds(314, 131, 26, 14);
		add(lblCPF);
		
		JFormattedTextField ftfCPF = new JFormattedTextField();
		ftfCPF.setToolTipText("");
		ftfCPF.setBounds(350, 129, 118, 23);
		add(ftfCPF);
		
		MaskFormatter maskCpf = new MaskFormatter("###.###.###-##");
		maskCpf.install(ftfCPF);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEmail.setBounds(10, 131, 44, 14);
		add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(54, 129, 250, 20);
		add(txtEmail);
		
		JLabel label_8 = new JLabel("Informa\u00E7\u00F5es de Login");
		label_8.setFont(new Font("Arial", Font.PLAIN, 20));
		label_8.setBounds(10, 193, 201, 20);
		add(label_8);
		
		JLabel lblNomeUsuario = new JLabel("Nome de Usu\u00E1rio");
		lblNomeUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNomeUsuario.setBounds(10, 236, 103, 14);
		add(lblNomeUsuario);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(123, 234, 207, 20);
		add(txtNomeUsuario);
		
		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(54, 259, 276, 20);
		add(passwordFieldSenha);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSenha.setBounds(10, 261, 44, 14);
		add(lblSenha);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setHorizontalAlignment(SwingConstants.LEFT);
		lblEndereco.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEndereco.setBounds(10, 290, 61, 14);
		add(lblEndereco);
		
		JEditorPane editorPaneEndereco = new JEditorPane();
		editorPaneEndereco.setBounds(10, 315, 620, 98);
		add(editorPaneEndereco);
		
		JLabel lblEspecialidade = new JLabel("Especialidade");
		lblEspecialidade.setHorizontalAlignment(SwingConstants.LEFT);
		lblEspecialidade.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEspecialidade.setBounds(10, 158, 103, 14);
		add(lblEspecialidade);
		
		txtEspecialidade = new JTextField();
		txtEspecialidade.setColumns(10);
		txtEspecialidade.setBounds(104, 156, 200, 20);
		add(txtEspecialidade);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Main.getFrame().setContentPane(new PerfilAtendente());
					Main.getFrame().getContentPane().revalidate();
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				
				
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
			public void actionPerformed(ActionEvent e) {
				
				Veterinario veterinario = new Veterinario();
				
				veterinario.setNome(txtNome.getText());
				veterinario.setSexo(txtSexo.getText());
				veterinario.setEmail(txtEmail.getText());
				veterinario.setLogin(txtNomeUsuario.getText());
				veterinario.setEspecialidade(txtEspecialidade.getText());
				
				veterinario.setTelefone(ftfTelefone.getText());
				veterinario.setDtNascimento(ftfDtNascimento.getText());
				veterinario.setRg(ftfRG.getText());
				veterinario.setCpf(ftfCPF.getText());
				
				veterinario.setSenha(passwordFieldSenha.getText());
				veterinario.setEndereco(editorPaneEndereco.getText());
				
				try {
					
					ControladorCadastroVeterinario controladorCadastroVeterinario = new ControladorCadastroVeterinario();
					controladorCadastroVeterinario.cadastrarVeterinario(veterinario);
					
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
					
				} catch (VeterinarioInvalidoException e1) {
					e1.printStackTrace();
					
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
