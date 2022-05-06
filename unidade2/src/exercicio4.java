package unidade2.src;

import unidade2.src.listaDuplamenteEncadeada.InterfaceDouble;
import unidade2.src.listaDuplamenteEncadeada.LikendDouble;

public class exercicio4 {
    public static void main(String[] args) {

        InterfaceDouble<Integer> teste = new LikendDouble<Integer>();

        teste.addLast(1);
        teste.addLast(2);
        teste.addLast(3);
        teste.addLast(4);
        teste.addLast(5);
        teste.addLast(6);

        System.out.println("Removido " + teste.removeFirst());
        System.out.println("Removido " + teste.removeLast());
        System.out.println("Removido " + teste.remove(3));

        teste.show();

        System.out.println();
        System.out.println(teste.peekFirst());
        System.out.println(teste.peekLast());

        teste.addAfter(10, 4);

        teste.show();
        System.out.println();

        teste.addFirst(15);

        teste.show();
        System.out.println();

        System.out.println(teste.search(15));

    }
}
