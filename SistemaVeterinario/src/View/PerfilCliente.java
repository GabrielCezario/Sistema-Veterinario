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
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;

public class PerfilCliente extends JPanel {
	private JTextField txtNome;
	private JTextField txtSexo;
	private JTextField txtEmail;
	private JTextField txtNomeUsuario;
	private JTextField txtSenha;

	/**
	 * Create the panel.
	 */
	public PerfilCliente() {
		setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 446, 89, 23);
		add(btnVoltar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 0, 640, 34);
		add(panel);
		
		JLabel lblPerfilCliente = new JLabel("Perfil Cliente");
		lblPerfilCliente.setForeground(Color.WHITE);
		lblPerfilCliente.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(lblPerfilCliente);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 33, 640, 252);
		add(tabbedPane);
		
		JPanel panelDados = new JPanel();
		tabbedPane.addTab("Dados", null, panelDados, null);
		panelDados.setLayout(null);
		
		JLabel label = new JLabel("Nome completo");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Arial", Font.PLAIN, 13));
		label.setBounds(10, 13, 103, 14);
		panelDados.add(label);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(118, 11, 512, 20);
		panelDados.add(txtNome);
		
		JLabel label_1 = new JLabel("Telefone");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Arial", Font.PLAIN, 13));
		label_1.setBounds(10, 38, 61, 14);
		panelDados.add(label_1);
		
		JFormattedTextField formattedTextFieldTelefone = new JFormattedTextField();
		formattedTextFieldTelefone.setToolTipText("");
		formattedTextFieldTelefone.setBounds(71, 36, 140, 23);
		panelDados.add(formattedTextFieldTelefone);
		
		JLabel label_2 = new JLabel("Data de Nascimento");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Arial", Font.PLAIN, 13));
		label_2.setBounds(221, 38, 140, 14);
		panelDados.add(label_2);
		
		JFormattedTextField formattedTextFieldDtNascimento = new JFormattedTextField();
		formattedTextFieldDtNascimento.setToolTipText("");
		formattedTextFieldDtNascimento.setBounds(350, 35, 118, 23);
		panelDados.add(formattedTextFieldDtNascimento);
		
		JLabel label_3 = new JLabel("Sexo");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Arial", Font.PLAIN, 13));
		label_3.setBounds(478, 38, 37, 14);
		panelDados.add(label_3);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(518, 36, 112, 20);
		panelDados.add(txtSexo);
		
		JFormattedTextField formattedTextFieldRG = new JFormattedTextField();
		formattedTextFieldRG.setToolTipText("");
		formattedTextFieldRG.setBounds(518, 61, 112, 23);
		panelDados.add(formattedTextFieldRG);
		
		JLabel label_4 = new JLabel("RG");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Arial", Font.PLAIN, 13));
		label_4.setBounds(478, 63, 19, 14);
		panelDados.add(label_4);
		
		JFormattedTextField formattedTextField_CPF = new JFormattedTextField();
		formattedTextField_CPF.setToolTipText("");
		formattedTextField_CPF.setBounds(350, 61, 118, 23);
		panelDados.add(formattedTextField_CPF);
		
		JLabel label_5 = new JLabel("CPF");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Arial", Font.PLAIN, 13));
		label_5.setBounds(314, 63, 26, 14);
		panelDados.add(label_5);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(54, 61, 250, 20);
		panelDados.add(txtEmail);
		
		JLabel label_6 = new JLabel("Email");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setFont(new Font("Arial", Font.PLAIN, 13));
		label_6.setBounds(10, 63, 44, 14);
		panelDados.add(label_6);
		
		JLabel label_7 = new JLabel("Nome de Usu\u00E1rio");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Arial", Font.PLAIN, 13));
		label_7.setBounds(10, 90, 103, 14);
		panelDados.add(label_7);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(123, 88, 207, 20);
		panelDados.add(txtNomeUsuario);
		
		JLabel label_8 = new JLabel("Senha");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Arial", Font.PLAIN, 13));
		label_8.setBounds(340, 90, 44, 14);
		panelDados.add(label_8);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(384, 88, 246, 20);
		panelDados.add(txtSenha);
		
		JLabel label_9 = new JLabel("Endere\u00E7o");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("Arial", Font.PLAIN, 13));
		label_9.setBounds(10, 115, 61, 14);
		panelDados.add(label_9);
		
		JEditorPane editorPaneEndereco = new JEditorPane();
		editorPaneEndereco.setBounds(10, 140, 505, 73);
		panelDados.add(editorPaneEndereco);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(535, 190, 95, 23);
		panelDados.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(535, 156, 95, 23);
		panelDados.add(btnEditar);
		
		JButton btnEcluirConta = new JButton("Excluir Conta");
		btnEcluirConta.setBounds(535, 122, 95, 23);
		panelDados.add(btnEcluirConta);
		
		JPanel panelPlanos = new JPanel();
		panelPlanos.setLayout(null);
		tabbedPane.addTab("Planos", null, panelPlanos, null);
		
		JLabel label_10 = new JLabel("Mensagens recebidas");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Arial", Font.PLAIN, 13));
		label_10.setBounds(10, 11, 141, 14);
		panelPlanos.add(label_10);
		
		JButton button = new JButton("Nova mensagem");
		button.setBounds(501, 190, 124, 23);
		panelPlanos.add(button);
		
		JButton button_1 = new JButton("Excluir mensagem");
		button_1.setBounds(501, 156, 124, 23);
		panelPlanos.add(button_1);
		
		JPanel panelAgendamentosConsultas = new JPanel();
		tabbedPane.addTab("Agendamentos de Consultas", null, panelAgendamentosConsultas, null);
		panelAgendamentosConsultas.setLayout(null);
		
		JLabel lblVeterinrio = new JLabel("Veterin\u00E1rio");
		lblVeterinrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblVeterinrio.setFont(new Font("Arial", Font.PLAIN, 13));
		lblVeterinrio.setBounds(10, 10, 72, 14);
		panelAgendamentosConsultas.add(lblVeterinrio);
		
		JLabel lblDescrioDoProblema = new JLabel("Descri\u00E7\u00E3o do problema (Opcional)");
		lblDescrioDoProblema.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescrioDoProblema.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDescrioDoProblema.setBounds(10, 115, 204, 14);
		panelAgendamentosConsultas.add(lblDescrioDoProblema);
		
		JEditorPane editorPaneProblema = new JEditorPane();
		editorPaneProblema.setBounds(10, 140, 505, 73);
		panelAgendamentosConsultas.add(editorPaneProblema);
		
		JButton btnAgendar = new JButton("Agendar");
		btnAgendar.setBounds(530, 190, 95, 23);
		panelAgendamentosConsultas.add(btnAgendar);
		
		JComboBox cbxVeterinario = new JComboBox();
		cbxVeterinario.setBounds(92, 8, 168, 23);
		panelAgendamentosConsultas.add(cbxVeterinario);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setHorizontalAlignment(SwingConstants.LEFT);
		lblDia.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDia.setBounds(270, 11, 29, 14);
		panelAgendamentosConsultas.add(lblDia);
		
		JComboBox cbxDia = new JComboBox();
		cbxDia.setBounds(297, 8, 108, 23);
		panelAgendamentosConsultas.add(cbxDia);
		
		JLabel lblHorrio = new JLabel("Hor\u00E1rio");
		lblHorrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblHorrio.setFont(new Font("Arial", Font.PLAIN, 13));
		lblHorrio.setBounds(415, 12, 46, 14);
		panelAgendamentosConsultas.add(lblHorrio);
		
		JComboBox cbxHorario = new JComboBox();
		cbxHorario.setBounds(471, 8, 108, 23);
		panelAgendamentosConsultas.add(cbxHorario);
		
		JPanel panelHistorico = new JPanel();
		tabbedPane.addTab("Hist\u00F3rico de Agendamentos", null, panelHistorico, null);
		
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
