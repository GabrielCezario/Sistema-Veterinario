package Model;

public class Secretaria {
	
	private static int idSecretaria;
	private String nome;
	private String dtNascimento;
	private String telefone;
	private String endereco;
	private String sexo;
	private int rg;
	private int cpf;
	
	public Secretaria() {
		
		idSecretaria++;
		
	}
	
	public Secretaria(String nome, String dtNascimento, String telefone, String endereco, String sexo, int rg, int cpf) {
		
		idSecretaria++;
		
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.sexo = sexo;
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
