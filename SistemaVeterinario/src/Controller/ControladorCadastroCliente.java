package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;

import DAO.ClienteDAO;
import Model.Cliente;
import View.LoginCliente;
import View.Main;
import View.PerfilCliente;

public class ControladorCadastroCliente {
	
	public static String aux;

	// =============================================================( METODOS PUBLICOS )===================================================

	public void cadastrarCliente(Cliente cliente) throws ClienteInvalidoException {

		ClienteInvalidoException clienteInvalidoException = validarCliente(cliente);

		if (clienteInvalidoException != null) {
			throw clienteInvalidoException;
		} else {
			ClienteDAO.criarCliente(cliente);
		}

	}
	
	public void apagarCliente(Cliente cliente) throws FileNotFoundException, IOException {
		ClienteDAO.deletarCliente(cliente);
		
		Main.getFrame().setContentPane(new LoginCliente());
		Main.getFrame().getContentPane().revalidate();
	}
	
	public void logar(String login, String senha) throws FileNotFoundException, ClassNotFoundException, IOException, LoginInvalidoException {
		
		LoginInvalidoException loginInvalidoException = verificarSenha(login, senha);
		
		if (loginInvalidoException != null) {
			throw loginInvalidoException;
		} else {
			
			try {
				
				Main.getFrame().setContentPane(new PerfilCliente());
				Main.getFrame().getContentPane().revalidate();
				
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			
		}
		
	}

	// =============================================================( METODOS PRIVADOS )===================================================

	private LoginInvalidoException verificarSenha(String login, String senha) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		LoginInvalidoException loginInvalidoException = null;
		File file = new File("DataBase\\ClienteDataBase" + login);
		
		if (!file.exists()) {
			
			loginInvalidoException = new LoginInvalidoException();
			loginInvalidoException.setLoginInvalido(true);
			loginInvalidoException.setSenhaInvalido(true);
			
		} else {
			
			ObjectInputStream os = new ObjectInputStream(new FileInputStream(file + "\\" + login + ".txt"));
			Cliente cliente = (Cliente) os.readObject();
			
			aux = login;
			
			if (!cliente.getLogin().trim().equalsIgnoreCase(login)) {
				if (loginInvalidoException == null) {
					loginInvalidoException = new LoginInvalidoException();
				}
				
				loginInvalidoException.setLoginInvalido(false);
			}
			
			if (!cliente.getSenha().trim().equalsIgnoreCase(senha)) {
				if (loginInvalidoException == null) {
					loginInvalidoException = new LoginInvalidoException();
				}
				
				loginInvalidoException.setSenhaInvalido(false);
			}
			
		}
		
		return loginInvalidoException;
	}
	
	
	// =================================================== (METODO PARA VALIDAR O ATENDENTE) ================================================
	
	private ClienteInvalidoException validarCliente(Cliente cliente) {

		ClienteInvalidoException clienteInvalidoException = null;

		if (cliente.getNome() == null || cliente.getNome().trim().isEmpty()) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setNomeVazio(true);
		}

		if (cliente.getDtNascimento() == null || cliente.getDtNascimento().trim().isEmpty()) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setDtNascimentoVazio(true);

		}

		if (cliente.getTelefone() == null || cliente.getTelefone().trim().isEmpty()) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setTelefoneVazio(true);
		}

		if (cliente.getEndereco() == null || cliente.getEndereco().trim().isEmpty()) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setEnderecoVazio(true);
		}

		if (cliente.getSexo() == null || cliente.getSexo().trim().isEmpty()) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setSexoVazio(true);
		}

		if (cliente.getEmail() == null || cliente.getEmail().trim().isEmpty()) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setEmailVazio(true);

		}

		if (cliente.getLogin() == null || cliente.getLogin().trim().isEmpty()) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setLoginVazio(true);
		}

		if (cliente.getSenha() == null || cliente.getSenha().trim().isEmpty()) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setSenhaVazio(true);
		}

		if (cliente.getRg() == null || cliente.getRg().trim().isEmpty()) {

			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setRgVazio(true);
		}

		if (cliente.getCpf() == null || cliente.getCpf().trim().isEmpty()) {

			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setCpfVazio(true);
		}
		
		return clienteInvalidoException;

	}

}
