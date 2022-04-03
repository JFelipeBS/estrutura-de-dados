
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class exercicio38b {

    public static void main(String[] args) {

        // Set: usado quando hover elemetos (chaves) unicos;
        // HashSet
        // Seus elementos nao sao ordenados.
        System.out.println();
        System.out.println("HashSet");
        Set<String> hashset = new HashSet<String>();
        hashset.add("Foz");
        hashset.add("Foz"); // cave igual nao adiciona
        System.out.println(hashset);

        // TreeSet
        // utiliza estrutura de arvore
        // ordena automaticamente os elementos;
        // se o tipo for uma class precisa do CompareTO
        System.out.println();
        System.out.println("TreeSet");
        Set<String> treeset = new TreeSet<String>();
        treeset.add("zorro");
        treeset.add("zara");
        treeset.add("Felipe");
        System.out.println(treeset);

        // LinkedHashSet
        // boa eficiencia e
        // manter a ordem de insercao
        System.out.println();
        System.out.println("LinkedHashSet");
        Set<String> linkedhashset = new LinkedHashSet<String>();
        linkedhashset.add("zorro");
        linkedhashset.add("cair");
        linkedhashset.add("superman");
        System.out.println(linkedhashset);

        // Queue: usado quado hover elementos com caves repetidas, e facilita a adicao]

        // de elementos no inicio e fim da fila;

        // Deque: manipula o inicio e o fim da estrutura;

        // Map: composto por chave e valor nao podendo ter repeticao de chaves;

    }
}
