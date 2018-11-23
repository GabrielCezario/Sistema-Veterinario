package Controller;

public class VeterinarioInvalidoException extends Exception{
	
	private boolean nomeVazio;
	private boolean dtNascimentoVazio;
	private boolean telefoneVazio;
	private boolean enderecoVazio;
	private boolean sexoVazio;
	private boolean emailVazio;
	private boolean loginVazio;
	private boolean senhaVazio;
	private boolean especialidadeVazio;
	private boolean rgVazio;
	private boolean cpfVazio;
	
	public VeterinarioInvalidoException() {
		
	}

	public boolean isNomeVazio() {
		return nomeVazio;
	}

	public void setNomeVazio(boolean nomeVazio) {
		this.nomeVazio = nomeVazio;
	}

	public boolean isDtNascimentoVazio() {
		return dtNascimentoVazio;
	}

	public void setDtNascimentoVazio(boolean dtNascimentoVazio) {
		this.dtNascimentoVazio = dtNascimentoVazio;
	}

	public boolean isTelefoneVazio() {
		return telefoneVazio;
	}

	public void setTelefoneVazio(boolean telefoneVazio) {
		this.telefoneVazio = telefoneVazio;
	}

	public boolean isEnderecoVazio() {
		return enderecoVazio;
	}

	public void setEnderecoVazio(boolean enderecoVazio) {
		this.enderecoVazio = enderecoVazio;
	}

	public boolean isSexoVazio() {
		return sexoVazio;
	}

	public void setSexoVazio(boolean sexoVazio) {
		this.sexoVazio = sexoVazio;
	}

	public boolean isEmailVazio() {
		return emailVazio;
	}

	public void setEmailVazio(boolean emailVazio) {
		this.emailVazio = emailVazio;
	}

	public boolean isLoginVazio() {
		return loginVazio;
	}

	public void setLoginVazio(boolean loginVazio) {
		this.loginVazio = loginVazio;
	}

	public boolean isSenhaVazio() {
		return senhaVazio;
	}

	public void setSenhaVazio(boolean senhaVazio) {
		this.senhaVazio = senhaVazio;
	}

	public boolean isEspecialidadeVazio() {
		return especialidadeVazio;
	}

	public void setEspecialidadeVazio(boolean especialidadeVazio) {
		this.especialidadeVazio = especialidadeVazio;
	}

	public boolean isRgVazio() {
		return rgVazio;
	}

	public void setRgVazio(boolean rgVazio) {
		this.rgVazio = rgVazio;
	}

	public boolean isCpfVazio() {
		return cpfVazio;
	}

	public void setCpfVazio(boolean cpfVazio) {
		this.cpfVazio = cpfVazio;
	}
}
