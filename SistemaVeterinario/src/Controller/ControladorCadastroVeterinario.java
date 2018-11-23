package Controller;

import Model.Veterinario;

public class ControladorCadastroVeterinario {
	
	
// >================================ MÉTODOS PRIVADOS ======================================<
	
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
		
		return veterinarioInvalidoException;
		
	}
	
}
