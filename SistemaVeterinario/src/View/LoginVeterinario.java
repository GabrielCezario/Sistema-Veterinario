package View;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controller.ControladorCadastroVeterinario;
import Controller.LoginInvalidoException;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

import java.text.ParseException;

public class LoginVeterinario extends JPanel {
	private JTextField txtLogin;
	private JPasswordField pswSenha;

	/**
	 * Create the panel.
	 */
	public LoginVeterinario() {
		setLayout(null);
		
		JPanel panelLoginCliente = new JPanel();
		panelLoginCliente.setBackground(SystemColor.textHighlight);
		panelLoginCliente.setBounds(0, 0, 640, 34);
		add(panelLoginCliente);
		
		JLabel lblLoginCliente = new JLabel("Login Veterin\u00E1rio");
		lblLoginCliente.setFont(new Font("Arial", Font.PLAIN, 20));
		lblLoginCliente.setForeground(SystemColor.text);
		panelLoginCliente.add(lblLoginCliente);
		
		JPanel panelErroLogin = new JPanel();
		panelErroLogin.setBackground(Color.RED);
		panelErroLogin.setBounds(0, 33, 640, 34);
		add(panelErroLogin);
		
		panelErroLogin.setVisible(false);
		
		JLabel lblLoginOuSenha = new JLabel("Login ou Senha est\u00E3o incorretos!");
		lblLoginOuSenha.setForeground(Color.WHITE);
		lblLoginOuSenha.setFont(new Font("Arial", Font.PLAIN, 20));
		panelErroLogin.add(lblLoginOuSenha);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 15));
		lblLogin.setBounds(176, 239, 48, 23);
		add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(234, 241, 227, 20);
		add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSenha.setBounds(176, 273, 48, 23);
		add(lblSenha);
		
		pswSenha = new JPasswordField();
		pswSenha.setBounds(234, 272, 227, 20);
		add(pswSenha);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.getFrame().setContentPane(new Inicio());
				Main.getFrame().getContentPane().revalidate();
				
			}
		});
		btnVoltar.setBounds(10, 446, 89, 23);
		add(btnVoltar);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String login = txtLogin.getText();
				String senha = String.valueOf(pswSenha.getPassword());
				
				try {
					ControladorCadastroVeterinario controladorCadastroVeterinario = new ControladorCadastroVeterinario();
					controladorCadastroVeterinario.logar(login, senha);
				} catch (ClassNotFoundException | IOException | LoginInvalidoException e1) {
					e1.printStackTrace();
					
					panelErroLogin.setVisible(true);
				}
				
			}
		});
		btnEntrar.setBounds(283, 299, 103, 23);
		add(btnEntrar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Gabriel\\git\\Sistema-Veterinario\\SistemaVeterinario\\Imagens\\imgVet.png"));
		lblNewLabel.setBounds(256, 78, 150, 150);
		add(lblNewLabel);

	}
}
