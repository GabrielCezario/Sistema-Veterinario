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

import Controller.ControladorCadastroAtendente;
import Model.Atendente;

import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JList;

public class PerfilAtendente extends JPanel {
	private JTextField txtNome;
	private JTextField txtSexo;
	private JTextField txtEmail;
	private JTextField txtNomeUsuario;
	private JTextField txtSenha;
	private JTable tblVeterinario;
	private JTable tblClientes;
	private JTable table;
	private JTable tblConsultasCriadas;

	public PerfilAtendente() throws ParseException, FileNotFoundException, IOException, ClassNotFoundException {
		setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new LoginAtendente());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnVoltar.setBounds(10, 446, 89, 23);
		add(btnVoltar);		
		
		ObjectInputStream os = new ObjectInputStream(new FileInputStream("DataBase\\AtendenteDataBase\\" + ControladorCadastroAtendente.aux + "\\" + ControladorCadastroAtendente.aux + ".txt"));
		Atendente atendente = (Atendente) os.readObject();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 0, 640, 34);
		add(panel);
		
		JLabel lblPerfilCliente = new JLabel("Perfil Atendente");
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
		
		txtNome.setText(atendente.getNome());
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
		
		ftfTelefone.setText(atendente.getTelefone());
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
		
		ftfDtNascimento.setText(atendente.getDtNascimento());
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
		
		txtSexo.setText(atendente.getSexo());
		txtSexo.setEditable(false);
		
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
		
		ftfRG.setText(atendente.getRg());
		ftfRG.setEditable(false);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setHorizontalAlignment(SwingConstants.LEFT);
		lblCPF.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCPF.setBounds(314, 63, 26, 14);
		panelDados.add(lblCPF);
		
		JFormattedTextField formattedTextField_CPF = new JFormattedTextField();
		formattedTextField_CPF.setToolTipText("");
		formattedTextField_CPF.setBounds(350, 61, 118, 23);
		panelDados.add(formattedTextField_CPF);
		
		MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
		maskCPF.install(formattedTextField_CPF);
		
		formattedTextField_CPF.setText(atendente.getCpf());
		formattedTextField_CPF.setEditable(false);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEmail.setBounds(10, 63, 44, 14);
		panelDados.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(54, 61, 250, 20);
		panelDados.add(txtEmail);
		
		txtEmail.setText(atendente.getEmail());
		txtEmail.setEditable(false);
		
		JLabel lblNomeUsuario = new JLabel("Nome de Usu\u00E1rio");
		lblNomeUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNomeUsuario.setBounds(10, 90, 103, 14);
		panelDados.add(lblNomeUsuario);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(123, 88, 207, 20);
		panelDados.add(txtNomeUsuario);
		
		txtNomeUsuario.setText(atendente.getLogin());
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
		
		txtSenha.setText(atendente.getSenha());
		txtSenha.setEditable(false);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setHorizontalAlignment(SwingConstants.LEFT);
		lblEndereco.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEndereco.setBounds(10, 115, 61, 14);
		panelDados.add(lblEndereco);
		
		JEditorPane editorPaneEndereco = new JEditorPane();
		editorPaneEndereco.setBounds(10, 140, 505, 73);
		panelDados.add(editorPaneEndereco);
		
		editorPaneEndereco.setText(atendente.getEndereco());
		editorPaneEndereco.setEditable(false);
		
		JButton btnEcluirConta = new JButton("Excluir Conta");
		btnEcluirConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					ControladorCadastroAtendente controladorCadastroAtendente = new ControladorCadastroAtendente();
					controladorCadastroAtendente.apagarAtendente(atendente);
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		btnEcluirConta.setForeground(Color.RED);
		btnEcluirConta.setBackground(Color.WHITE);
		btnEcluirConta.setBounds(535, 122, 95, 23);
		panelDados.add(btnEcluirConta);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setForeground(new Color(0, 128, 128));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtEmail.setEditable(true);
				txtNomeUsuario.setEditable(true);
				txtSenha.setEditable(true);
				txtNome.setEditable(true);
				txtSexo.setEditable(true);
				
				formattedTextField_CPF.setEditable(true);
				ftfDtNascimento.setEditable(true);
				ftfRG.setEditable(true);
				ftfTelefone.setEditable(true);
				
				editorPaneEndereco.setEditable(true);
				
			}
		});
		btnEditar.setBounds(535, 156, 95, 23);
		panelDados.add(btnEditar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(new Color(0, 128, 0));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtEmail.setEditable(false);
				txtNomeUsuario.setEditable(false);
				txtSenha.setEditable(false);
				txtNome.setEditable(false);
				txtSexo.setEditable(false);
				
				formattedTextField_CPF.setEditable(false);
				ftfDtNascimento.setEditable(false);
				ftfRG.setEditable(false);
				ftfTelefone.setEditable(false);
				
				editorPaneEndereco.setEditable(false);
				
			}
		});
		btnSalvar.setBounds(535, 190, 95, 23);
		panelDados.add(btnSalvar);
		
		JPanel panelClientesCadastrados = new JPanel();
		panelClientesCadastrados.setLayout(null);
		tabbedPane.addTab("Clientes cadastrados", null, panelClientesCadastrados, null);
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.setBounds(530, 190, 95, 23);
		panelClientesCadastrados.add(btnVisualizar);
		
		JScrollPane spClientes = new JScrollPane();
		spClientes.setBounds(10, 11, 615, 167);
		panelClientesCadastrados.add(spClientes);
		
		
		
		tblClientes = new JTable();
		tblClientes.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblClientes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome Completo"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblClientes.getColumnModel().getColumn(0).setResizable(false);
		tblClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
		tblClientes.getColumnModel().getColumn(0).setMinWidth(50);
		tblClientes.getColumnModel().getColumn(0).setMaxWidth(50);
		tblClientes.getColumnModel().getColumn(1).setResizable(false);
		
		spClientes.setViewportView(tblClientes);
		
		JPanel panelAgendamentosConsultas = new JPanel();
		tabbedPane.addTab("Criar marca\u00E7\u00F5es", null, panelAgendamentosConsultas, null);
		panelAgendamentosConsultas.setLayout(null);
		
		JLabel lblVeterinrio = new JLabel("Veterin\u00E1rio");
		lblVeterinrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblVeterinrio.setFont(new Font("Arial", Font.PLAIN, 13));
		lblVeterinrio.setBounds(10, 10, 72, 14);
		panelAgendamentosConsultas.add(lblVeterinrio);
		
		JComboBox cbxVeterinario = new JComboBox();
		cbxVeterinario.setBounds(92, 7, 168, 23);
		panelAgendamentosConsultas.add(cbxVeterinario);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setHorizontalAlignment(SwingConstants.LEFT);
		lblDia.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDia.setBounds(270, 10, 29, 14);
		panelAgendamentosConsultas.add(lblDia);
		
		JLabel lblHorrio = new JLabel("Hor\u00E1rio");
		lblHorrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblHorrio.setFont(new Font("Arial", Font.PLAIN, 13));
		lblHorrio.setBounds(425, 10, 46, 14);
		panelAgendamentosConsultas.add(lblHorrio);
		
		JFormattedTextField ftfDia = new JFormattedTextField();
		ftfDia.setToolTipText("");
		ftfDia.setBounds(297, 7, 118, 23);
		panelAgendamentosConsultas.add(ftfDia);
		
		MaskFormatter maskData = new MaskFormatter("##/##/####");
		maskData.install(ftfDia);
		
		JFormattedTextField ftfHorario = new JFormattedTextField();
		ftfHorario.setToolTipText("");
		ftfHorario.setBounds(475, 7, 118, 23);
		panelAgendamentosConsultas.add(ftfHorario);
		
		MaskFormatter maskHorario = new MaskFormatter("##:##");
		maskHorario.install(ftfHorario);
		
		JButton btnAgendar = new JButton("Criar");
		btnAgendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(517, 156, 108, 23);
		panelAgendamentosConsultas.add(btnDeletar);
		
		JButton btnLimparCampos = new JButton("Limpar campos");
		btnLimparCampos.setBounds(517, 122, 108, 23);
		panelAgendamentosConsultas.add(btnLimparCampos);
		btnAgendar.setBounds(517, 190, 108, 23);
		panelAgendamentosConsultas.add(btnAgendar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 98, 498, 115);
		panelAgendamentosConsultas.add(scrollPane_1);
		
		tblConsultasCriadas = new JTable();
		tblConsultasCriadas.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblConsultasCriadas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Veterin\u00E1rio", "Dia / M\u00EAs", "Hor\u00E1rio"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblConsultasCriadas.getColumnModel().getColumn(0).setResizable(false);
		tblConsultasCriadas.getColumnModel().getColumn(1).setResizable(false);
		tblConsultasCriadas.getColumnModel().getColumn(1).setMinWidth(75);
		tblConsultasCriadas.getColumnModel().getColumn(1).setMaxWidth(75);
		tblConsultasCriadas.getColumnModel().getColumn(2).setResizable(false);
		tblConsultasCriadas.getColumnModel().getColumn(2).setMinWidth(75);
		tblConsultasCriadas.getColumnModel().getColumn(2).setMaxWidth(75);
		scrollPane_1.setViewportView(tblConsultasCriadas);
		
		JLabel lblConsultasMarcadas = new JLabel("Consultas criadas");
		lblConsultasMarcadas.setHorizontalAlignment(SwingConstants.LEFT);
		lblConsultasMarcadas.setFont(new Font("Arial", Font.PLAIN, 13));
		lblConsultasMarcadas.setBounds(10, 73, 108, 14);
		panelAgendamentosConsultas.add(lblConsultasMarcadas);
		
		JPanel panelVeterinariosCadastrados = new JPanel();
		panelVeterinariosCadastrados.setLayout(null);
		tabbedPane.addTab("Veterin\u00E1rio Cadastrados", null, panelVeterinariosCadastrados, null);
		
		JScrollPane spVeterinario = new JScrollPane();
		spVeterinario.setBounds(10, 11, 615, 168);
		panelVeterinariosCadastrados.add(spVeterinario);
		
		tblVeterinario = new JTable();
		tblVeterinario.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblVeterinario.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome Completo"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblVeterinario.getColumnModel().getColumn(0).setResizable(false);
		tblVeterinario.getColumnModel().getColumn(0).setPreferredWidth(50);
		tblVeterinario.getColumnModel().getColumn(0).setMinWidth(50);
		tblVeterinario.getColumnModel().getColumn(0).setMaxWidth(50);
		tblVeterinario.getColumnModel().getColumn(1).setResizable(false);
		spVeterinario.setViewportView(tblVeterinario);
		
		JButton button = new JButton("Visualizar");
		button.setBounds(365, 190, 95, 23);
		panelVeterinariosCadastrados.add(button);
		
		JButton btnCadastrarVeterinarios = new JButton("Cadastrar Veterinarios");
		btnCadastrarVeterinarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Main.getFrame().setContentPane(new CadastroVeterinario());
					Main.getFrame().getContentPane().revalidate();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
			}
		});
		btnCadastrarVeterinarios.setBackground(Color.WHITE);
		btnCadastrarVeterinarios.setForeground(Color.BLACK);
		btnCadastrarVeterinarios.setBounds(470, 190, 155, 23);
		panelVeterinariosCadastrados.add(btnCadastrarVeterinarios);
		
		JPanel panelHistorico = new JPanel();
		tabbedPane.addTab("Hist\u00F3rico de Agendamentos", null, panelHistorico, null);
		panelHistorico.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 615, 202);
		panelHistorico.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cliente", "Veterin\u00E1rio", "Dia / M\u00EAs", "Hora"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setMinWidth(75);
		table.getColumnModel().getColumn(2).setMaxWidth(75);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setMinWidth(75);
		table.getColumnModel().getColumn(3).setMaxWidth(75);
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
		
		JScrollPane spMensagens = new JScrollPane();
		spMensagens.setBounds(10, 36, 481, 177);
		panelMensagens.add(spMensagens);
		
		JList listMensagens = new JList();
		listMensagens.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spMensagens.setViewportView(listMensagens);

	}
}
