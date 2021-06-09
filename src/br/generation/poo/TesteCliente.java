package br.generation.poo;
/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 * */
import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			Cliente cliente1 = new Cliente();
			
		System.out.println(" =========> Informe seu login ? <===================");
		cliente1.setNome(entrada.nextLine());
		System.out.println(" ===================================================");
		System.out.println(" =========> Informe sua senha ? <===================");
		cliente1.setSenha(entrada.nextInt());
		
		cliente1.setNome("Luis Henrique");
		cliente1.setEndereco("Rua do Vento"); 
		cliente1.setGenero("Masculino");
		cliente1.setTelefone(1234567);
		
		if ( cliente1.getLogin() != "rique" && cliente1.getSenha() != 1313) {
			System.out.println("Acesso Negado");
		} else {
			System.out.println("Nome: " + cliente1.getNome() +" \nConfirme Seu Endereço: " + cliente1.getEndereco() 
			+ "\nSeu Gênero "+ cliente1.getGenero() + "\nConfirme seu Telefone ou Celular: " + cliente1.getTelefone());
				
				}
		
			}
		
		
		}	


