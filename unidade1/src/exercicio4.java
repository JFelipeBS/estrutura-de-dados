package unidade1.src;


import java.util.Scanner;

public class exercicio4 {
	
	static Scanner ler = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Informe o primeiro valor: ");
		int num1 = ler.nextInt();
		System.out.print("Informe o segundo valor: ");
		int num2 = ler.nextInt();
		System.out.print("Informe o terceiro valor: ");
		int num3 = ler.nextInt();
		
		int media = (num1+num2+num3)/3;
		System.out.println();
		System.out.println("****Resultado da media****");
		System.out.print("A media e: " + media);
		
	}

}
