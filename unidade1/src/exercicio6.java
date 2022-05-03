package unidade1.src;

import java.util.Scanner;

public class exercicio6 {
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float precoRefrigerante = 1.5f;
		float precoPizza = 3.0f;
		
		System.out.print("Quantidade de refrigerante: ");
		int quantidadeRefri = ler.nextInt();
		System.out.print("Quantidade de fatias de pizza: ");
		int quantidadePizza = ler.nextInt();
		System.out.print("Quantidade de pessoa na messa: ");
		int quantidadePessoas = ler.nextInt();
		
		float total = (precoRefrigerante * quantidadeRefri) + (precoPizza * quantidadePizza);
		float totalTaxa = (total + ((total*10)/100));
		
		System.out.println();
		System.out.println("****Resultados da messa****");
		System.out.println("Total sem taxa: " + (total));
		System.out.println("Total com taxa: " + (totalTaxa));
		System.out.println("Total por pessoa sem taxa: " + (total/quantidadePessoas));
		System.out.println("Total por pessoa com taxa: " + (totalTaxa/quantidadePessoas));
	
	} 

}
