package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;

import DAO.AtendenteDAO;
import Model.Atendente;
import View.Main;
import View.PerfilAtendente;

public class ControladorCadastroAtendente {

	// ============================================================( METODOS PUBLICOS )===============================================================

	public void cadastrarAtendente(Atendente atendente) throws AtendenteInvalidoException {

		AtendenteInvalidoException atendenteInvalidoException = validarAtendente(atendente);

		if (atendenteInvalidoException != null) {
			throw atendenteInvalidoException;
		} else {
			AtendenteDAO.criarAtendente(atendente);
		}

	}
	
	public void logar(String login, String senha) throws LoginInvalidoException, FileNotFoundException, ClassNotFoundException, IOException {
		
		LoginInvalidoException loginInvalidoException = verificarSenha(login, senha);
		
		if (loginInvalidoException != null) {
			throw loginInvalidoException;
		} else {
			
			try {
				
				Main.getFrame().setContentPane(new PerfilAtendente());
				Main.getFrame().getContentPane().revalidate();
				
			} catch (ParseException e1) {
				e1.printStackTrace();			
			}
			
		}
	}

	// ======================================================== ( METODOS PRIVADOS ) ======================================================

	// =================================================== ( METODO PARA VERIFICAR A SENHA ) ==============================================
	
	private LoginInvalidoException verificarSenha(String login, String senha) throws FileNotFoundException, IOException, ClassNotFoundException {

		LoginInvalidoException loginInvalidoException = null;
		File file = new File("DataBase\\AtendenteDataBase\\" + login);
		
		if (!file.exists()) {
			
			loginInvalidoException = new LoginInvalidoException();
			loginInvalidoException.setLoginInvalido(true);
			loginInvalidoException.setSenhaInvalido(true);
			
		} else {
			
			ObjectInputStream os = new ObjectInputStream(new FileInputStream(file + "\\" + login + ".txt"));
			Atendente at = (Atendente) os.readObject();
			
			if (!at.getLogin().trim().equalsIgnoreCase(login)) {
				if (loginInvalidoException == null) {
					loginInvalidoException = new LoginInvalidoException();
				}
					
				loginInvalidoException.setLoginInvalido(false);
			}
			
			if (!at.getSenha().trim().equalsIgnoreCase(senha)) {
				if (loginInvalidoException == null) {
					loginInvalidoException = new LoginInvalidoException();
				}
				
				loginInvalidoException.setSenhaInvalido(false);
			}
			
		}
		
		return loginInvalidoException;
	}
	
	// =================================================== (METODO PARA VALIDAR O ATENDENTE) ================================================
	
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
