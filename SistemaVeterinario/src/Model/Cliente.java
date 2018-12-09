package Model;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable{
	
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
		super(nome, dtNascimento, telefone, endereco, sexo, email, login, senha, rg, cpf);
		
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

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getDtNascimento() {
		return dtNascimento;
	}

	@Override
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Override
	public String getTelefone() {
		return telefone;
	}

	@Override
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String getEndereco() {
		return endereco;
	}

	@Override
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String getSexo() {
		return sexo;
	}

	@Override
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getLogin() {
		return login;
	}

	@Override
	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String getSenha() {
		return senha;
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String getRg() {
		return rg;
	}

	@Override
	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String getCpf() {
		return cpf;
	}

	@Override
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
