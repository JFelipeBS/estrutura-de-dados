package unidade1.src;


import java.util.Scanner;

public class exercicio29 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite sua frase: ");
        String frase = in.nextLine();

        System.out.println("");
        System.out.print("Sua frase foi: " + frase);
        System.out.println("");
        System.out.print("Sua frase invertida e: " + inversa(frase));

    }

    public static String inversa(String frase) {

        String invertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {

            invertida = invertida + frase.charAt(i);

        }

        return invertida;
    }
}
