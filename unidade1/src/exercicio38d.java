package unidade1.src;


import java.util.Deque;
import java.util.LinkedList;

public class exercicio38d {

    public static void main(String[] args) {

        // Deque: manipula o inicio e o fim da estrutura;

        System.out.println("Deque LinkedList");
        Deque<String> deque = new LinkedList<String>();

        // inserir no fim
        deque.add("Itaicaba");
        // inserir no fim
        deque.addLast("Jaguaretama");
        // inserir no inicio
        deque.addFirst("Russas");
        deque.add("Barro");
        deque.add("jaguaruana");
        System.out.println(deque);

        // Consulta o inicio
        System.out.println("Inicio: " + deque.peek());
        // Consulta o inicio
        System.out.println("Inicio: " + deque.peekFirst());
        // Consulta o fim
        System.out.println("Fim: " + deque.peekLast());

        // Remove o inicio
        System.out.println("Remove Inicio: " + deque.remove());
        // Remove o inicio
        System.out.println("Remove Inicio: " + deque.removeFirst());
        // Remove o fim
        System.out.println("Remove Fim: " + deque.removeLast());
        System.out.println(deque);


    }
}
