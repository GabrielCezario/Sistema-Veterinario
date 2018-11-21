package View;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PerfilVeterinario extends JPanel {
	private JTextField txtNome;
	private JTextField txtSexo;
	private JTextField txtEmail;
	private JTextField txtNomeUsuario;
	private JTextField txtSenha;
	private JTable table;

	public PerfilVeterinario() throws ParseException {
		setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new LoginVeterinario());
				Main.getFrame().getContentPane().revalidate();
			}
		});
		btnVoltar.setBounds(10, 446, 89, 23);
		add(btnVoltar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 0, 640, 34);
		add(panel);
		
		JLabel lblPerfilCliente = new JLabel("Perfil Veterinario");
		lblPerfilCliente.setForeground(Color.WHITE);
		lblPerfilCliente.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(lblPerfilCliente);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 33, 640, 252);
		add(tabbedPane);
		
		JPanel panelDados = new JPanel();
		tabbedPane.addTab("Dados", null, panelDados, null);
		panelDados.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome completo");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNome.setBounds(10, 13, 103, 14);
		panelDados.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(118, 11, 512, 20);
		panelDados.add(txtNome);
		
		txtNome.setEditable(false);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTelefone.setBounds(10, 38, 61, 14);
		panelDados.add(lblTelefone);
		
		JFormattedTextField ftfTelefone = new JFormattedTextField();
		ftfTelefone.setToolTipText("");
		ftfTelefone.setBounds(71, 36, 140, 23);
		panelDados.add(ftfTelefone);
		
		MaskFormatter maskTelefone = new MaskFormatter("(##)#####-####");
		maskTelefone.install(ftfTelefone);
		
		ftfTelefone.setEditable(false);
		
		JLabel lblDtNascimento = new JLabel("Data de Nascimento");
		lblDtNascimento.setHorizontalAlignment(SwingConstants.LEFT);
		lblDtNascimento.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDtNascimento.setBounds(221, 38, 140, 14);
		panelDados.add(lblDtNascimento);
		
		JFormattedTextField ftfDtNascimento = new JFormattedTextField();
		ftfDtNascimento.setToolTipText("");
		ftfDtNascimento.setBounds(350, 35, 118, 23);
		panelDados.add(ftfDtNascimento);
		
		MaskFormatter maskDtNascimento = new MaskFormatter("##/##/####");
		maskDtNascimento.install(ftfDtNascimento);
		
		ftfDtNascimento.setEditable(false);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSexo.setBounds(478, 38, 37, 14);
		panelDados.add(lblSexo);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(518, 36, 112, 20);
		panelDados.add(txtSexo);
		
		txtSexo.setEditable(false);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEmail.setBounds(10, 63, 44, 14);
		panelDados.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(54, 61, 250, 20);
		panelDados.add(txtEmail);
		
		txtEmail.setEditable(false);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setHorizontalAlignment(SwingConstants.LEFT);
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCPF.setBounds(314, 63, 26, 14);
		panelDados.add(lblCPF);
		
		JFormattedTextField ftfCPF = new JFormattedTextField();
		ftfCPF.setToolTipText("");
		ftfCPF.setBounds(350, 61, 118, 23);
		panelDados.add(ftfCPF);
		
		MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
		maskCPF.install(ftfCPF);
		
		ftfCPF.setEditable(false);
		
		JLabel lblRG = new JLabel("RG");
		lblRG.setHorizontalAlignment(SwingConstants.LEFT);
		lblRG.setFont(new Font("Arial", Font.PLAIN, 13));
		lblRG.setBounds(478, 63, 19, 14);
		panelDados.add(lblRG);
		
		JFormattedTextField ftfRG = new JFormattedTextField();
		ftfRG.setToolTipText("");
		ftfRG.setBounds(518, 61, 112, 23);
		panelDados.add(ftfRG);
		
		MaskFormatter maskRG = new MaskFormatter("#.###.###");
		maskRG.install(ftfRG);
		
		ftfRG.setEditable(false);
		
		JLabel lblNomeUsuario = new JLabel("Nome de Usu\u00E1rio");
		lblNomeUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNomeUsuario.setBounds(10, 90, 103, 14);
		panelDados.add(lblNomeUsuario);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(123, 88, 207, 20);
		panelDados.add(txtNomeUsuario);
		
		txtNomeUsuario.setEditable(false);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSenha.setBounds(340, 90, 44, 14);
		panelDados.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(384, 88, 246, 20);
		panelDados.add(txtSenha);
		
		txtSenha.setEditable(false);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setHorizontalAlignment(SwingConstants.LEFT);
		lblEndereco.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEndereco.setBounds(10, 115, 61, 14);
		panelDados.add(lblEndereco);
		
		JEditorPane editorPaneEndereco = new JEditorPane();
		editorPaneEndereco.setBounds(10, 140, 505, 73);
		panelDados.add(editorPaneEndereco);
		
		editorPaneEndereco.setEditable(false);
		
		JButton btnEcluirConta = new JButton("Excluir Conta");
		btnEcluirConta.setBounds(535, 122, 95, 23);
		panelDados.add(btnEcluirConta);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtEmail.setEditable(true);
				txtNomeUsuario.setEditable(true);
				txtSenha.setEditable(true);
				txtNome.setEditable(true);
				txtSexo.setEditable(true);
				
				ftfCPF.setEditable(true);
				ftfDtNascimento.setEditable(true);
				ftfRG.setEditable(true);
				ftfTelefone.setEditable(true);
				
				editorPaneEndereco.setEditable(true);
				
			}
		});
		btnEditar.setBounds(535, 156, 95, 23);
		panelDados.add(btnEditar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtEmail.setEditable(false);
				txtNomeUsuario.setEditable(false);
				txtSenha.setEditable(false);
				txtNome.setEditable(false);
				txtSexo.setEditable(false);
				
				ftfCPF.setEditable(false);
				ftfDtNascimento.setEditable(false);
				ftfRG.setEditable(false);
				ftfTelefone.setEditable(false);
				
				editorPaneEndereco.setEditable(false);
				
			}
		});
		btnSalvar.setBounds(535, 190, 95, 23);
		panelDados.add(btnSalvar);
		
		JPanel panelHistorico = new JPanel();
		tabbedPane.addTab("Hist\u00F3rico de Agendamentos", null, panelHistorico, null);
		panelHistorico.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 615, 202);
		panelHistorico.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cliente", "Dia / M\u00EAs", "Hor\u00E1rio"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panelMensagens = new JPanel();
		tabbedPane.addTab("Caixa de Mensagens", null, panelMensagens, null);
		panelMensagens.setLayout(null);
		
		JLabel lblMensagensRecebidas = new JLabel("Mensagens recebidas");
		lblMensagensRecebidas.setHorizontalAlignment(SwingConstants.LEFT);
		lblMensagensRecebidas.setFont(new Font("Arial", Font.PLAIN, 13));
		lblMensagensRecebidas.setBounds(10, 11, 141, 14);
		panelMensagens.add(lblMensagensRecebidas);
		
		JButton btnNovaMensagem = new JButton("Nova mensagem");
		btnNovaMensagem.setBounds(501, 190, 124, 23);
		panelMensagens.add(btnNovaMensagem);
		
		JButton btnExcluirMensagem = new JButton("Excluir mensagem");
		btnExcluirMensagem.setBounds(501, 156, 124, 23);
		panelMensagens.add(btnExcluirMensagem);

	}
}
