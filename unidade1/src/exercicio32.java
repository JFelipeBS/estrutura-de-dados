package unidade1.src;


import java.util.Scanner;

public class exercicio32 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite a palavra: ");
        String palavra = in.nextLine();

        System.out.println("====================================");
        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("Resultado da contagem ");
        System.out.println("====================================");
        contador(palavra);
        System.out.println("");
        System.out.println("====================================");

    }

    public static void contador(String palavra) {

        char letra;

        for (int i = 0; i < palavra.length(); i++) {

            palavra = palavra.toLowerCase();
            letra = palavra.charAt(i);
            
            int repetir = 0;

            for (int j = 0; j < palavra.length(); j++) {

                if (letra == palavra.toLowerCase().charAt(j)) {
                    repetir++;
                }
            }
            palavra = palavra.replace(letra, '*');
            if (letra != '*') {
                System.out.print(letra + " = " + repetir + " ");

            }
        }
    }
}
