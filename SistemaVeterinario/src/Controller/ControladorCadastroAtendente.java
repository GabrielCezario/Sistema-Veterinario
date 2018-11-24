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

		if (atendente.getRg() == null || atendente.getRg().trim().isEmpty()) {

			if (atendenteInvalidoException == null) {
				atendenteInvalidoException = new AtendenteInvalidoException();
			}

			atendenteInvalidoException.setRgVazio(true);
		}
		
		if (atendente.getCpf() == null || atendente.getCpf().trim().isEmpty()) {

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
