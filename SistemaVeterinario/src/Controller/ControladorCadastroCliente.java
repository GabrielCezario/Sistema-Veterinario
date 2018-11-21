package Controller;

import Exceptions.ClienteInvalidoException;
import Model.Cliente;

public class ControladorCadastroCliente {

	// Metodos privados

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
		
		if (cliente.getRg() < 0) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}
			
			clienteInvalidoException.setRgVazio(true);
		}
		
		if (cliente.getCpf() < 0) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}
			
			clienteInvalidoException.setCpfVazio(true);
		}
		
		if (cliente.getLogin() == null || cliente.getLogin().trim().isEmpty()) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}
			
			clienteInvalidoException.setLoginVazio(true);
		}
		
		if (cliente.getSenha() == null || cliente.getLogin().trim().isEmpty()) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}
			
			clienteInvalidoException.setSenhaVazio(true);
		}

		return clienteInvalidoException;
	}

}
