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
