package br.com.generation.poo.ex3;

import java.util.Scanner;

public class ProdutosEletronicos {

	public static void main(String[] args) {

		Eletronico produtoEletronico = new Eletronico();
		
		Scanner ler = new Scanner(System.in);
	
		
		
		produtoEletronico.setSmarthfone("IPHONE 12");
		produtoEletronico.setNotebook("DEL GAMER");
		produtoEletronico.setTv("TCL");
		
		
		produtoEletronico.xaiomi("");
		produtoEletronico.dell("");
		produtoEletronico.tcl("");
	
		System.out.println(produtoEletronico.getSmarthfone());
		System.out.println(produtoEletronico.getNotebook());
		System.out.println(produtoEletronico.getTv());
			
			
		}
		
		
		
	
		
		
		
	
	}


