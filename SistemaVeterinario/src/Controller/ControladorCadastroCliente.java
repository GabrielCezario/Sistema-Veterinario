package Controller;

import java.util.List;

import Model.Cliente;

public class ControladorCadastroCliente {
	
	//=============================================================( METODOS PUBLICOS )===============================================================
	
	public void cadastrarCliente(Cliente cliente) throws ClienteInvalidoException {
		
		ClienteInvalidoException clienteInvalidoException = validarCliente(cliente);
		
		if (cliente == null) {
			//ClienteDAO.adicionarCliente(cliente);
		} else {
			throw clienteInvalidoException;
		}
		
	}
	
	public List<Cliente> obterTodosClientes(){
		return null;//ClienteDao.listarTodosClientes();
	}	

	//=============================================================( METODOS PRIVADOS )===============================================================

	private ClienteInvalidoException validarCliente(Cliente cliente) {
		
		ClienteInvalidoException clienteInvalidoException = null;
		
		if (cliente.getNome() == null || cliente.getNome().trim().isEmpty()) {
			if (clienteInvalidoException == null) {
				clienteInvalidoException = new ClienteInvalidoException();
			}
			
			clienteInvalidoException.setNomeVazio(true);
		}
		
		return clienteInvalidoException;
	}

}
