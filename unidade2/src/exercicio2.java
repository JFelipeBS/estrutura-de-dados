package unidade2.src;

import unidade2.src.queu.InterfaceQueu;
import unidade2.src.queu.QueuArray;

public class exercicio2 {
    public static void main(String[] args) {
        
        InterfaceQueu<Integer> teste = new QueuArray<Integer>(2);

        System.out.println("Adicionando...");
        teste.add(20);
        
        System.out.println("Adicionando...");
        teste.add(50);

        System.out.println("Primeiro elemento é " + teste.peek());
        
        System.out.println("Removendo primeiro elemento " + teste.remove());

        System.out.println("Adicionando...");
        teste.add(40);

        System.out.println("Primeiro elemento é " + teste.peek());

        System.out.println("Adicionando...");
        teste.add(40);
        

    }
}
