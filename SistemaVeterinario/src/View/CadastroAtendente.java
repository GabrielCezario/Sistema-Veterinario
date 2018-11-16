package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLayeredPane;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;

public class CadastroAtendente extends JPanel {
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtCpf;
	private JTextField txtRg;
	private JTextField txtSexo;

	/**
	 * Create the panel.
	 */
	public CadastroAtendente() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 204, 51));
		panel.setBounds(0, 0, 640, 34);
		add(panel);
		
		JLabel lblCadastroAtendente = new JLabel("Cadastro Atendente");
		lblCadastroAtendente.setForeground(Color.WHITE);
		lblCadastroAtendente.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(lblCadastroAtendente);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNome.setBounds(27, 64, 46, 14);
		add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(83, 62, 231, 20);
		add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.LEFT);
		lblDataDeNascimento.setFont(new Font("Arial", Font.PLAIN, 13));
		lblDataDeNascimento.setBounds(340, 64, 140, 14);
		add(lblDataDeNascimento);
		
		JFormattedTextField ftfDtNascimento = new JFormattedTextField();
		ftfDtNascimento.setToolTipText("");
		ftfDtNascimento.setBounds(490, 61, 118, 23);
		add(ftfDtNascimento);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelefone.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTelefone.setBounds(27, 96, 61, 14);
		add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(83, 94, 171, 20);
		add(txtTelefone);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(301, 93, 147, 20);
		add(txtCpf);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setHorizontalAlignment(SwingConstants.LEFT);
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCpf.setBounds(264, 96, 37, 14);
		add(lblCpf);
		
		txtRg = new JTextField();
		txtRg.setColumns(10);
		txtRg.setBounds(490, 93, 118, 20);
		add(txtRg);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setHorizontalAlignment(SwingConstants.LEFT);
		lblRg.setFont(new Font("Arial", Font.PLAIN, 13));
		lblRg.setBounds(458, 95, 26, 14);
		add(lblRg);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(27, 305, 581, 98);
		add(editorPane);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSexo.setBounds(27, 127, 37, 14);
		add(lblSexo);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(83, 125, 171, 20);
		add(txtSexo);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setHorizontalAlignment(SwingConstants.LEFT);
		lblEndereo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEndereo.setBounds(27, 280, 61, 14);
		add(lblEndereo);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 446, 89, 23);
		add(btnVoltar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(277, 446, 89, 23);
		add(btnLimpar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(541, 446, 89, 23);
		add(btnCadastrar);

	}
}
