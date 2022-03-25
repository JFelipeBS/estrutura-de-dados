
import java.util.Scanner;

public class exercicio8 {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Altura: ");
		float altura = ler.nextFloat();
		System.out.print("Peso: ");
		float peso = ler.nextFloat();

		if (altura == 0) {
			System.out.println("Nao e possivel fazer divisao por 0. VOCE DEVE COLOCAR SUA ALTURA");
		} else {

			float imc = peso / (altura * altura);

			System.out.println();
			System.out.println("****Resultado****");

			if (imc < 18.5) {
				System.out.println(imc + " Magreza");
			} else if ((imc >= 18.5) && (imc < 24.9)) {
				System.out.println(imc + " Normal");
			} else if ((imc >= 24.9) && (imc < 30)) {
				System.out.println(imc + " Sobrepeso");
			} else if (imc > 30) {
				System.out.println(imc + " Obesidade");
			}

		}

	}

}