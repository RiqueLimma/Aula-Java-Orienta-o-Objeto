package br.generation.poo.ex2;

import java.util.Scanner;

public class TesteAviao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Aviao aviao2 = new Aviao();
		System.out.println("==============>Peso Maximo Permetido Para o Embarque: <========================");
		aviao2.setPesodaMala(20.20);
		
		System.out.println("============> Ganhei 30,00 de Desconto na Generation Decola <=======================");
		aviao2.decolar(80.00);
		
		System.out.println(" =========> Confirma seu Codigo de Bordo Sr.(a) ? <===================");
		System.out.println(" =========> Atr�s da etiqueta ter� um codigo de at� 4 numeros ? <===================");
		aviao2.setCodigoDBordo(ler.nextInt());
		
		if( aviao2.getCodigoDBordo() < 4 ) {
				System.out.println("Op��o �nvalida !!");
			}  else  {
				System.out.println("Bem vindo ao Vo� da companha Generation ");
				
			}
		aviao2.setNome("Seja Bem Vindo Luis Henrique"); 
		
		System.out.println("Obrigado Pela Prefer�ncia !! :");
		
		
		
	
	}
	
}
