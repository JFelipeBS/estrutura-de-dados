package unidade2.src;

import unidade2.src.listaSimplesmenteEncadeada.InterfaceSigly;
import unidade2.src.listaSimplesmenteEncadeada.LikendSigly;

public class exercicio3 {
    public static void main(String[] args) {

        InterfaceSigly<Integer> teste = new LikendSigly<Integer>();

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

        teste.addAfter(10, 10);

        teste.show();
        System.out.println();

        teste.addFirst(15);

        teste.show();
        System.out.println();

        System.out.println(teste.search(10));

    }
}
