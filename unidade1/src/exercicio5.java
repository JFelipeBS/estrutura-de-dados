
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio5 {
	
	static Scanner ler = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Informe o primeiro valor: ");
		float num1 = ler.nextFloat();
		System.out.print("Informe o segundo valor: ");
		float num2 = ler.nextFloat();
		System.out.print("Informe o terceiro valor: ");
		float num3 = ler.nextFloat();
		
		float media = (num1+num2+num3)/3;

		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.println();
		System.out.println("****Resultado da media****");
		System.out.print("A media e: " + df.format(media) );
		
	}

}