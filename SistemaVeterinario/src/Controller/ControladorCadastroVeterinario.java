package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;

import DAO.VeterinarioDAO;
import Model.Veterinario;
import View.Main;
import View.PerfilVeterinario;

public class ControladorCadastroVeterinario {
	
	// =============================================================( METODOS PUBLICOS )===================================================
	
	public void cadastrarVeterinario(Veterinario veterinario) throws VeterinarioInvalidoException {
		
		VeterinarioInvalidoException veterinarioInvalidoException = validarVeterinario(veterinario);
		
		if (veterinarioInvalidoException != null) {
			throw veterinarioInvalidoException;
		} else {
			VeterinarioDAO.criarVeterinario(veterinario);
		}
		
	}
	
	public void logar(String login, String senha) throws FileNotFoundException, ClassNotFoundException, IOException, LoginInvalidoException {
		
		LoginInvalidoException loginInvalidoException = verificarSenha(login, senha);
		
		if (loginInvalidoException != null) {
			throw loginInvalidoException;
		} else {

			try {
				
				Main.getFrame().setContentPane(new PerfilVeterinario());
				Main.getFrame().getContentPane().revalidate();
				
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			
		}
		
	}
	
	
	// =============================================================( METODOS PRIVADOS )===================================================
	
	private LoginInvalidoException verificarSenha(String login, String senha) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		LoginInvalidoException loginInvalidoException = null;
		File file = new File("DataBase\\VeterinarioDataBase\\" + login);
		
		if (!file.exists()) {
			
			loginInvalidoException = new LoginInvalidoException();
			loginInvalidoException.setLoginInvalido(true);
			loginInvalidoException.setSenhaInvalido(true);
			
		} else {
			
			ObjectInputStream os = new ObjectInputStream(new FileInputStream(file + "\\" + login + ".txt"));
			Veterinario veterinario = (Veterinario) os.readObject(); 
			
			if (!veterinario.getLogin().trim().equalsIgnoreCase(login)) {
				if (loginInvalidoException == null) {
					loginInvalidoException = new LoginInvalidoException();
				}
				
				loginInvalidoException.setLoginInvalido(false);
			}
			
			if (!veterinario.getSenha().trim().equalsIgnoreCase(senha)) {
				if (loginInvalidoException == null) {
					loginInvalidoException = new LoginInvalidoException();
				}
				
				loginInvalidoException.setSenhaInvalido(false);
			}
		}
		
		return loginInvalidoException;
	}
	
	// =================================================== ( METODO PARA VERIFICAR A SENHA ) ==============================================
	
	private VeterinarioInvalidoException validarVeterinario(Veterinario veterinario) {
		
		VeterinarioInvalidoException veterinarioInvalidoException = null;
		
		if (veterinario.getNome() == null || veterinario.getNome().trim().isEmpty()) {
			
			if (veterinarioInvalidoException == null) {
				
				veterinarioInvalidoException = new VeterinarioInvalidoException();
				
			}
			
			veterinarioInvalidoException.setNomeVazio(true);
			
		}
		
		if (veterinario.getDtNascimento() == null || veterinario.getDtNascimento().trim().isEmpty()) {
			
			if (veterinarioInvalidoException == null) {
				
				veterinarioInvalidoException = new VeterinarioInvalidoException();
				
			}
			
			veterinarioInvalidoException.setDtNascimentoVazio(true);
			
		}
		
		if (veterinario.getTelefone() == null || veterinario.getTelefone().trim().isEmpty()) {
			
			if (veterinarioInvalidoException == null) {
				
				veterinarioInvalidoException = new VeterinarioInvalidoException();
				
			}
			
			veterinarioInvalidoException.setTelefoneVazio(true);
			
		}
		
		if (veterinario.getEndereco() == null || veterinario.getEndereco().trim().isEmpty()) {
			
			if (veterinarioInvalidoException == null) {
				
				veterinarioInvalidoException = new VeterinarioInvalidoException();
				
			}
			
			veterinarioInvalidoException.setEnderecoVazio(true);
			
		}
		
		if (veterinario.getSexo() == null || veterinario.getSexo().trim().isEmpty()) {
			
			if (veterinarioInvalidoException == null) {
				
				veterinarioInvalidoException = new VeterinarioInvalidoException();
				
			}
			
			veterinarioInvalidoException.setSexoVazio(true);
			
		}
		
		if (veterinario.getEmail() == null || veterinario.getEmail().trim().isEmpty()) {
			
			if (veterinarioInvalidoException == null) {
				
				veterinarioInvalidoException = new VeterinarioInvalidoException();
				
			}
			
			veterinarioInvalidoException.setEmailVazio(true);
			
		}
		
		if (veterinario.getLogin() == null || veterinario.getLogin().trim().isEmpty()) {
			
			if (veterinarioInvalidoException == null) {
				
				veterinarioInvalidoException = new VeterinarioInvalidoException();
				
			}
			
			veterinarioInvalidoException.setLoginVazio(true);
			
		}
		
		if (veterinario.getSenha() == null || veterinario.getSenha().trim().isEmpty()) {
			
			if (veterinarioInvalidoException == null) {
				
				veterinarioInvalidoException = new VeterinarioInvalidoException();
				
			}
			
			veterinarioInvalidoException.setSenhaVazio(true);
			
		}
		
		if (veterinario.getEspecialidade() == null || veterinario.getEspecialidade().trim().isEmpty()) {
			
			if (veterinarioInvalidoException == null) {
				
				veterinarioInvalidoException = new VeterinarioInvalidoException();
				
			}
			
			veterinarioInvalidoException.setEspecialidadeVazio(true);
			
		}
		
		if (veterinario.getRg() == null || veterinario.getRg().trim().isEmpty()) {
			
			if (veterinarioInvalidoException == null) {
				veterinarioInvalidoException = new VeterinarioInvalidoException();
			}
			
			veterinarioInvalidoException.setRgVazio(true);
		}
		
		if (veterinario.getCpf() == null || veterinario.getCpf().trim().isEmpty()) {
			
			if (veterinarioInvalidoException == null) {
				veterinarioInvalidoException = new VeterinarioInvalidoException();
			}
			
			veterinarioInvalidoException.setCpfVazio(true);
		}
		
		return veterinarioInvalidoException;
		
	}
	
}
