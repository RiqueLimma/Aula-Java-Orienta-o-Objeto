package br.generation.poo.ex2;

/*
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 * */
public class Aviao {

	private int codigoDBordo;
	private double pesodaMala;
	private String nome;
	

	public int getCodigoDBordo() {

		return codigoDBordo;
	}

	public void setCodigoDBordo(int codigoDBordo) {
		if (codigoDBordo >= 4)
		this.codigoDBordo = codigoDBordo;
	}

	public double getPesodaMala() {
		return pesodaMala;
	}

	public void setPesodaMala(double pesodaMala) {
		System.out.println(20.00);
		this.pesodaMala = pesodaMala;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		System.out.println("Luis Henrique");
		this.nome = nome;
	}

	
	void decolar(double decolar) {
		decolar -= 30;
		System.out.println(decolar);
		}
	 
		 
	 }


