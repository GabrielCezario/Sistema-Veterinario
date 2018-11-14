package Model;

public class Veterinario {
	
	private static int idMedico;
	private String nome;
	private String dtNascimento;
	private String telefone;
	private String endereco;
	private String sexo;
	private String especialidade;
	private int rg;
	private int cpf;
	
	public Veterinario() {
		
		idMedico++;
		
	}
	
	public Veterinario(String nome, String dtNascimento, String telefone, String endereco, String sexo, String especialidade, int rg, int cpf) {
		
		idMedico++;
		
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.sexo = sexo;
		this.especialidade = especialidade;
		this.rg = rg;
		this.cpf = cpf;
		
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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}