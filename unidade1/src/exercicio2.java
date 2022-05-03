package unidade1.src;


import java.io.IOException;
import java.util.Scanner;

public class exercicio2 {
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("informe sua idade: ");
		int idade = ler.nextInt(); 
		System.out.print("informe sua altura: ");
		float altura = ler.nextFloat();
		ler.nextLine();
		System.out.print("informe primeira letra do nome: ");
		char primeira = (char)System.in.read();
		ler.nextLine();
		System.out.print("informe seu nome completo: ");
		String nome = ler.nextLine();
		
		System.out.println();
		System.out.println("****Exibindo informacoes****");
		System.out.println(idade);
		System.out.println(altura);
		System.out.println(primeira);
		System.out.println(nome);
		
	}
}
