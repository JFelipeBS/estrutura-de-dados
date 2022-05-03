package unidade1.src;


import java.util.Scanner;

public class exercicio33 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite a Frase: ");
        String frase = in.nextLine();

        System.out.println("====================================");
        System.out.println("A frase digitada foi: " + frase);
        System.out.println("Resultado da contagem ");
        System.out.println("====================================");
        contador(frase);
        System.out.println("");
        System.out.println("====================================");

    }

    public static void contador(String frase) {

        frase = frase.toLowerCase();

        String[] frasesSeparada = frase.split(" ");
        String[] fraseEscrita = new String[frasesSeparada.length];

        for (int i = 0; i < frasesSeparada.length; i++) {
            int cont = 0;

            for (int j = 0; j < frasesSeparada.length; j++) {
                if (frasesSeparada[i].equals(frasesSeparada[j])) {
                    cont++;
                }
            }

            int verifique = 0;

            for (int z = 0; z < fraseEscrita.length; z++) {

                if (frasesSeparada[i].equals(fraseEscrita[z])) {
                    verifique = 1;
                }
            }

            fraseEscrita[i] = frasesSeparada[i];

            if (verifique == 0) {

                System.out.print(fraseEscrita[i] + " = " + cont + " ");
            }

        }
    }
}
