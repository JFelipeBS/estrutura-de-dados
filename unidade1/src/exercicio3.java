package unidade1.src;


import java.util.Scanner;

public class exercicio3 {
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("informe o primeiro numero: ");
		int num1 = ler.nextInt(); 
		System.out.print("informe o segundo numero: ");
		int num2 = ler.nextInt();
		
		System.out.println();
		System.out.println("****Resultados****");
		System.out.println("Soma: " + (num1+num2));
		System.out.println("Subtracao: " + (num1-num2));
		System.out.println("Multiplicacao: " + (num1*num2));
		System.out.println("Divisao: " + (num1/num2));
		System.out.println("Resto: " + (num1%num2));
		
	}

}
