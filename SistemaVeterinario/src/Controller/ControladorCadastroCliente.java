package Controller;

import java.util.List;

import Model.Cliente;

public class ControladorCadastroCliente {

	// =============================================================( METODOS
	// PUBLICOS )===============================================================

	public void cadastrarCliente(Cliente cliente) throws ClienteInvalidoException {

		ClienteInvalidoException clienteInvalidoException = validarCliente(cliente);

		if (cliente == null) {
			// ClienteDAO.adicionarCliente(cliente);
		} else {
			throw clienteInvalidoException;
		}

	}

	public List<Cliente> obterTodosClientes() {
		return null;// ClienteDao.listarTodosClientes();
	}

	// =============================================================( METODOS
	// PRIVADOS )===============================================================

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

		if (cliente.getRg() != 1111111 && cliente.getRg() != 2222222 && cliente.getRg() != 3333333
				&& cliente.getRg() != 4444444 && cliente.getRg() != 5555555 && cliente.getRg() != 6666666
				&& cliente.getRg() != 7777777 && cliente.getRg() != 8888888 && cliente.getRg() != 9999999
				&& cliente.getRg() != 0000000 && cliente.getRg() != 1234567 && cliente.getRg() != 7654321) {

			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setRgVazio(true);
		}

		if (cliente.getCpf() != 999999999 && cliente.getCpf() != 222222222 && cliente.getCpf() != 333333333
				&& cliente.getCpf() != 444444444 && cliente.getCpf() != 555555555 && cliente.getCpf() != 666666666
				&& cliente.getCpf() != 777777777 && cliente.getCpf() != 888888888 && cliente.getCpf() != 999999999
				&& cliente.getCpf() != 000000000 && cliente.getCpf() != 123456789 && cliente.getCpf() != 987654321) {

			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}

			clienteInvalidoException.setCpfVazio(true);
		}

//==============================================================//		
/*		int contador_rg=0;
		
		for (int i = 1; i <= 1; i++) {
			for (int j = 2; j <=7; j++) {

				
				if (cliente.getRg().charAt(i) == cliente.getRg().charAt(j)) {

					contador_rg++;
					
				}
			}
		}

		if (contador_rg==6) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}
			
			clienteInvalidoException.setRgVazio(true);
		}
		
*/	
//===============================================================//
		
		
		
		return clienteInvalidoException;

	}

}
