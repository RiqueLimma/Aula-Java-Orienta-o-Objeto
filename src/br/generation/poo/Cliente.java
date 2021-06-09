package br.generation.poo;

public class Cliente {

	private String nome;
	private String endereco;
	private int telefone;
	private String genero;
	private int idade;
	private String login;
	private int senha;

	public int getSenha() {

		return senha;
	}

	public void setSenha(int senha) {

		this.senha = senha;
	}

	public String getLogin() {

		return login;
	}

	public void setLogin(String login) {

		this.login = login;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {

		this.endereco = endereco;
	}

	public int getTelefone() {

		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {

		this.genero = genero;
	}

	
}
