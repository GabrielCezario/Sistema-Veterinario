package Controller;

import java.util.List;

import Model.Atendente;

public class ControladorCadastroAtendente {

	// ============================================================( METODOS PUBLICOS )===============================================================

	public void cadastrarAtendente(Atendente atendente) throws AtendenteInvalidoException {

		AtendenteInvalidoException atendenteInvalidoException = validarAtendente(atendente);

		if (atendente == null) {
			// AtendenteDAO.adicionarAtendente(atendente);
		} else {
			throw atendenteInvalidoException;
		}

	}

	public List<Atendente> obterTodosAtendentes() {
		return null;// AtendenteDAO.listarTodosAtendentes;
	}

	// ============================================================( METODOS PRIVADOS )===============================================================

	private AtendenteInvalidoException validarAtendente(Atendente atendente) {
		AtendenteInvalidoException atendenteInvalidoException = null;

		if (atendente.getNome() == null || atendente.getNome().trim().isEmpty()) {
			if (atendenteInvalidoException == null) {
				atendenteInvalidoException = new AtendenteInvalidoException();
			}

			atendenteInvalidoException.setNomeVazio(true);
		}

		if (atendente.getDtNascimento() == null || atendente.getDtNascimento().trim().isEmpty()) {
			if (atendenteInvalidoException == null) {
				atendenteInvalidoException = new AtendenteInvalidoException();
			}

			atendenteInvalidoException.setDtNascimentoVazio(true);
		}

		if (atendente.getTelefone() == null || atendente.getTelefone().trim().isEmpty()) {
			if (atendenteInvalidoException == null) {
				atendenteInvalidoException = new AtendenteInvalidoException();
			}

			atendenteInvalidoException.setTelefoneVazio(true);
		}

		if (atendente.getEndereco() == null || atendente.getEndereco().trim().isEmpty()) {
			if (atendenteInvalidoException == null) {
				atendenteInvalidoException = new AtendenteInvalidoException();
			}

			atendenteInvalidoException.setEnderecoVazio(true);
		}

		if (atendente.getSexo() == null || atendente.getSexo().trim().isEmpty()) {
			if (atendenteInvalidoException == null) {
				atendenteInvalidoException = new AtendenteInvalidoException();
			}

			atendenteInvalidoException.setSexoVazio(true);
		}

		if (atendente.getEmail() == null || atendente.getSexo().trim().isEmpty()) {
			if (atendenteInvalidoException == null) {
				atendenteInvalidoException = new AtendenteInvalidoException();
			}

			atendenteInvalidoException.setEmailVazio(true);
		}

		if (!(atendente.getRg() == 1111111 && atendente.getRg() == 2222222 && atendente.getRg() == 3333333 && atendente.getRg() == 4444444 && 
			  atendente.getRg() == 5555555 && atendente.getRg() == 6666666 && atendente.getRg() == 7777777 && atendente.getRg() == 8888888 && 
			  atendente.getRg() == 9999999 && atendente.getRg() == 1234567 && atendente.getRg() == 7654321)) {

			if (atendenteInvalidoException == null) {
				atendenteInvalidoException = new AtendenteInvalidoException();
			}

			atendenteInvalidoException.setRgVazio(true);
		}
		
		if (!(atendente.getCpf() == 111111111 && atendente.getCpf() == 222222222 && atendente.getCpf() == 333333333 && atendente.getCpf() == 444444444 && 
			  atendente.getCpf() == 555555555 && atendente.getCpf() == 666666666 && atendente.getCpf() == 777777777 && atendente.getCpf() == 888888888 && 
			  atendente.getCpf() == 999999999 && atendente.getCpf() == 123456789 && atendente.getCpf() == 987654321)) {

			if (atendenteInvalidoException == null) {
				atendenteInvalidoException = new AtendenteInvalidoException();
			}

			atendenteInvalidoException.setCpfVazio(true);
		}
		
		if (atendente.getLogin() == null || atendente.getLogin().trim().isEmpty()) {
			if (atendenteInvalidoException == null) {
				atendenteInvalidoException = new AtendenteInvalidoException();
			}
			
			atendenteInvalidoException.setLoginVazio(true);
		}		
		
		if (atendente.getSenha() == null || atendente.getLogin().trim().isEmpty()) {
			if (atendenteInvalidoException == null) {
				atendenteInvalidoException = new AtendenteInvalidoException();
			}
			
			atendenteInvalidoException.setSenhaVazio(true);
		}

		return atendenteInvalidoException;
	}

}
