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

import Controller.ControladorCadastroCliente;
import Model.Cliente;

import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class PerfilCliente extends JPanel {
	private JTextField txtNome;
	private JTextField txtSexo;
	private JTextField txtEmail;
	private JTextField txtNomeUsuario;
	private JTextField txtSenha;
	private JTable tblHistorico;
	
	public static String auxDados;
	private JTable tblAgendamentoConsultas;
	
	private String auxHistorico1;
	private String auxHistorico2;

	public PerfilCliente() throws ParseException, FileNotFoundException, IOException, ClassNotFoundException {
		setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new LoginCliente());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnVoltar.setBounds(10, 446, 89, 23);
		add(btnVoltar);
		
		ObjectInputStream os = new ObjectInputStream(new FileInputStream("DataBase\\ClienteDataBase\\" + ControladorCadastroCliente.aux + "\\" + ControladorCadastroCliente.aux + ".txt"));
		Cliente cliente = (Cliente) os.readObject();
		
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
		
		txtNome.setText(cliente.getNome());
		txtNome.setEditable(false);
		
		JLabel label_1 = new JLabel("Telefone");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Arial", Font.PLAIN, 13));
		label_1.setBounds(10, 38, 61, 14);
		panelDados.add(label_1);
		
		JFormattedTextField formattedTextFieldTelefone = new JFormattedTextField();
		formattedTextFieldTelefone.setToolTipText("");
		formattedTextFieldTelefone.setBounds(71, 36, 140, 23);
		panelDados.add(formattedTextFieldTelefone);
		
		MaskFormatter maskTelefone = new MaskFormatter("(##)#####-####");
		maskTelefone.install(formattedTextFieldTelefone);
		
		formattedTextFieldTelefone.setText(cliente.getTelefone());
		formattedTextFieldTelefone.setEditable(false);
		
		JLabel label_2 = new JLabel("Data de Nascimento");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Arial", Font.PLAIN, 13));
		label_2.setBounds(221, 38, 140, 14);
		panelDados.add(label_2);
		
		JFormattedTextField formattedTextFieldDtNascimento = new JFormattedTextField();
		formattedTextFieldDtNascimento.setToolTipText("");
		formattedTextFieldDtNascimento.setBounds(350, 35, 118, 23);
		panelDados.add(formattedTextFieldDtNascimento);
		
		MaskFormatter maskDtNascimento = new MaskFormatter("##/##/####");
		maskDtNascimento.install(formattedTextFieldDtNascimento);
		
		formattedTextFieldDtNascimento.setText(cliente.getDtNascimento());
		formattedTextFieldDtNascimento.setEditable(false);
		
		JLabel label_3 = new JLabel("Sexo");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Arial", Font.PLAIN, 13));
		label_3.setBounds(478, 38, 37, 14);
		panelDados.add(label_3);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(518, 36, 112, 20);
		panelDados.add(txtSexo);
		
		txtSexo.setText(cliente.getSexo());
		txtSexo.setEditable(false);
		
		JLabel label_4 = new JLabel("RG");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Arial", Font.PLAIN, 13));
		label_4.setBounds(478, 63, 19, 14);
		panelDados.add(label_4);
		
		JFormattedTextField formattedTextFieldRG = new JFormattedTextField();
		formattedTextFieldRG.setToolTipText("");
		formattedTextFieldRG.setBounds(518, 61, 112, 23);
		panelDados.add(formattedTextFieldRG);
		
		MaskFormatter maskRG = new MaskFormatter("#.###.###");
		maskRG.install(formattedTextFieldRG);
		
		formattedTextFieldRG.setText(cliente.getRg());
		formattedTextFieldRG.setEditable(false);
		
		JLabel label_5 = new JLabel("CPF");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Arial", Font.PLAIN, 13));
		label_5.setBounds(314, 63, 26, 14);
		panelDados.add(label_5);
		
		JFormattedTextField formattedTextField_CPF = new JFormattedTextField();
		formattedTextField_CPF.setToolTipText("");
		formattedTextField_CPF.setBounds(350, 61, 118, 23);
		panelDados.add(formattedTextField_CPF);
		
		MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
		maskCPF.install(formattedTextField_CPF);
		
		formattedTextField_CPF.setText(cliente.getCpf());
		formattedTextField_CPF.setEditable(false);
		
		JLabel label_6 = new JLabel("Email");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setFont(new Font("Arial", Font.PLAIN, 13));
		label_6.setBounds(10, 63, 44, 14);
		panelDados.add(label_6);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(54, 61, 250, 20);
		panelDados.add(txtEmail);
		
		txtEmail.setText(cliente.getEmail());
		txtEmail.setEditable(false);
		
		JLabel label_7 = new JLabel("Nome de Usu\u00E1rio");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Arial", Font.PLAIN, 13));
		label_7.setBounds(10, 90, 103, 14);
		panelDados.add(label_7);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(123, 88, 207, 20);
		panelDados.add(txtNomeUsuario);
		
		txtNomeUsuario.setText(cliente.getLogin());
		txtNomeUsuario.setEditable(false);
		
		JLabel label_8 = new JLabel("Senha");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Arial", Font.PLAIN, 13));
		label_8.setBounds(340, 90, 44, 14);
		panelDados.add(label_8);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(384, 88, 246, 20);
		panelDados.add(txtSenha);
		
		txtSenha.setText(cliente.getSenha());
		txtSenha.setEditable(false);
		
		JLabel label_9 = new JLabel("Endere\u00E7o");
		label_9.setHorizontalAlignment(SwingConstants.LEFT);
		label_9.setFont(new Font("Arial", Font.PLAIN, 13));
		label_9.setBounds(10, 115, 61, 14);
		panelDados.add(label_9);
		
		JEditorPane editorPaneEndereco = new JEditorPane();
		editorPaneEndereco.setBounds(10, 140, 505, 73);
		panelDados.add(editorPaneEndereco);
		
		editorPaneEndereco.setText(cliente.getEndereco());
		editorPaneEndereco.setEditable(false);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setForeground(new Color(0, 128, 128));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtEmail.setEditable(true);
				txtNomeUsuario.setEditable(true);
				txtSenha.setEditable(true);
				txtNome.setEditable(true);
				txtSexo.setEditable(true);
				
				formattedTextField_CPF.setEditable(true);
				formattedTextFieldDtNascimento.setEditable(true);
				formattedTextFieldRG.setEditable(true);
				formattedTextFieldTelefone.setEditable(true);
				
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
				formattedTextFieldDtNascimento.setEditable(false);
				formattedTextFieldRG.setEditable(false);
				formattedTextFieldTelefone.setEditable(false);
				
				editorPaneEndereco.setEditable(false);
				
			}
		});
		btnSalvar.setBounds(535, 190, 95, 23);
		panelDados.add(btnSalvar);
		
		JButton btnEcluirConta = new JButton("Excluir Conta");
		btnEcluirConta.setForeground(new Color(255, 0, 0));
		btnEcluirConta.setBounds(535, 122, 95, 23);
		panelDados.add(btnEcluirConta);
		
		JPanel panelAgendamentosConsultas = new JPanel();
		tabbedPane.addTab("Agendamentos de Consultas", null, panelAgendamentosConsultas, null);
		panelAgendamentosConsultas.setLayout(null);
		
		JLabel lblDescrioDoProblema = new JLabel("Descri\u00E7\u00E3o do problema (Opcional)");
		lblDescrioDoProblema.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescrioDoProblema.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDescrioDoProblema.setBounds(10, 115, 204, 14);
		panelAgendamentosConsultas.add(lblDescrioDoProblema);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 615, 93);
		panelAgendamentosConsultas.add(scrollPane_1);
		
		DefaultTableModel modelConsultasCriadas = new DefaultTableModel();
		tblAgendamentoConsultas = new JTable();
		tblAgendamentoConsultas.setModel(modelConsultasCriadas);
		
		modelConsultasCriadas.addColumn("Veterinário");
		modelConsultasCriadas.addColumn("Dia / Mês");
		modelConsultasCriadas.addColumn("Horário");
		
		File consultas = new File("DataBase\\AtendenteDataBase\\Consultas");
		File[] consul = consultas.listFiles();
		
		for (File file : consul) {
			
			ObjectInputStream ob = new ObjectInputStream(new FileInputStream(file));
			ArrayList vt = (ArrayList) ob.readObject();
			
			modelConsultasCriadas.addRow(new Object[] {
					
					vt.get(0),
					vt.get(1),
					vt.get(2)
					
			});
			
		}
		
		tblAgendamentoConsultas.getColumnModel().getColumn(0).setResizable(false);
		tblAgendamentoConsultas.getColumnModel().getColumn(1).setResizable(false);
		tblAgendamentoConsultas.getColumnModel().getColumn(1).setMinWidth(75);
		tblAgendamentoConsultas.getColumnModel().getColumn(1).setMaxWidth(75);
		tblAgendamentoConsultas.getColumnModel().getColumn(2).setResizable(false);
		tblAgendamentoConsultas.getColumnModel().getColumn(2).setMinWidth(75);
		tblAgendamentoConsultas.getColumnModel().getColumn(2).setMaxWidth(75);
		
		scrollPane_1.setViewportView(tblAgendamentoConsultas);
		
		JButton btnAgendar = new JButton("Agendar");
		btnAgendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = tblAgendamentoConsultas.getSelectedRow();
				
				String nome = (String) tblAgendamentoConsultas.getValueAt(i, 0);
				String dia = (String) tblAgendamentoConsultas.getValueAt(i, 1);
				String horario = (String) tblAgendamentoConsultas.getValueAt(i, 2);
				
				List<String> ac = new ArrayList<String>();
				ac.add(cliente.getNome());
				ac.add(nome);
				ac.add(dia);
				ac.add(horario);
				
				try {
					
					ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("DataBase\\ClienteDataBase\\"+ cliente.getLogin() + "\\Histórico Marcações\\" + ac.get(1) + ".txt"));
					ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream("DataBase\\AtendenteDataBase\\Agendamentos\\" + cliente.getNome() + ac.get(1) + ".txt"));
					os.writeObject(ac);
					os2.writeObject(ac);
					
					os.close();
					os2.close();
					
					auxHistorico1 = ac.get(0);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		JEditorPane editorPaneProblema = new JEditorPane();
		editorPaneProblema.setBounds(10, 140, 505, 73);
		panelAgendamentosConsultas.add(editorPaneProblema);
		btnAgendar.setBounds(530, 190, 95, 23);
		panelAgendamentosConsultas.add(btnAgendar);
		
		JPanel panelHistorico = new JPanel();
		tabbedPane.addTab("Hist\u00F3rico de Agendamentos", null, panelHistorico, null);
		panelHistorico.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 615, 202);
		panelHistorico.add(scrollPane);
	
		DefaultTableModel modelHistorico = new DefaultTableModel();
		tblHistorico = new JTable();
		tblHistorico.setModel(modelHistorico);
		
		modelHistorico.addColumn("Veterinário");
		modelHistorico.addColumn("Dia / Mês");
		modelHistorico.addColumn("Horário");
		
		File a = new File("DataBase\\ClienteDataBase\\"+ cliente.getLogin() + "\\Histórico Marcações\\");
		File[] b = a.listFiles();
		
		for (File fl : b) {
			
			ObjectInputStream ob = new ObjectInputStream(new FileInputStream(fl));
			ArrayList vt = (ArrayList) ob.readObject();
			
			modelHistorico.addRow(new Object[] {
					
					vt.get(1),
					vt.get(2),
					vt.get(3),
					
			});
			
		}

		tblHistorico.getColumnModel().getColumn(0).setResizable(false);
		tblHistorico.getColumnModel().getColumn(1).setResizable(false);
		tblHistorico.getColumnModel().getColumn(1).setMinWidth(75);
		tblHistorico.getColumnModel().getColumn(1).setMaxWidth(75);
		tblHistorico.getColumnModel().getColumn(2).setResizable(false);
		tblHistorico.getColumnModel().getColumn(2).setMinWidth(75);
		tblHistorico.getColumnModel().getColumn(2).setMaxWidth(75);
		scrollPane.setViewportView(tblHistorico);
		
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
		spMensagens.setBounds(10, 36, 480, 177);
		panelMensagens.add(spMensagens);
		
		JList listMensagens = new JList();
		listMensagens.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listMensagens.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spMensagens.setViewportView(listMensagens);

	}
}
