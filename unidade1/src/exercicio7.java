package unidade1.src;

import java.util.Scanner;

public class exercicio7 {
	
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Primeiro valor: ");
		float num1 = ler.nextFloat();
		System.out.print("Segundo valor: ");
		float num2 = ler.nextFloat();
		
		System.out.println();
		System.out.println("****Resultado****");

		if (num2 == 0) {
			System.out.println("Nao e possivel fazer divisao por 0");
		}else {
			float divisao = num1/num2;
			System.out.println(divisao);
		}
		
	}  

}
