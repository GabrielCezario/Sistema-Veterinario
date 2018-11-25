package Model;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	private static int idCliente;
	private String nome;
	private String dtNascimento;
	private String telefone;
	private String endereco;
	private String sexo;
	private String email;
	private String login;
	private String senha;
	private String rg;
	private String cpf;

	public Cliente() {
		
		idCliente++;
		
	}

	public Cliente(String nome, String dtNascimento, String telefone, String endereco, String sexo, String email, String login, String senha, String rg, String cpf) {
		
		idCliente++;
		
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.sexo = sexo;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.rg = rg;
		this.cpf = cpf;
		
	}
	
	

	public static int getIdCliente() {
		return idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	

}
