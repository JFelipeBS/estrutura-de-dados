package unidade1.src;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class exercicio38e {

    public static void main(String[] args) {

        // Map: composto por chave e valor nao podendo ter repeticao de chaves;

        // HashMap
        // Permite apenas uma chave null
        // a ordenação e baseda na ordem natural da chave
        System.out.println("Map HashMap");
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0, "Itaicaba");
        hashMap.put(1, "Aracati");
        hashMap.put(3, "Palhano");
        hashMap.put(2, "Russas");
        hashMap.put(4, "Limoeiro");
        System.out.println(hashMap);
        // mostrar chaves
        System.out.println("Chave: " + hashMap.keySet());
        // Remover por chave
        System.out.println("Remover: " + hashMap.remove(0));
        System.out.println(hashMap);

        // LinkedHashMap
        // Permite somete uma chave null
        // matem ordem de insercao
        System.out.println();
        System.out.println("Map LinkedHashMap");
        Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
        linkedhashmap.put(7, "Ceara");
        linkedhashmap.put(2, "Rio Grande do Norte");
        linkedhashmap.put(0, "Espirito Santo");
        linkedhashmap.put(1, "Roraima");
        // Amazonia sera escrita sobre ceara
        linkedhashmap.put(null, "Ceara");
        linkedhashmap.put(null, "Amazonia");
        System.out.println(linkedhashmap);

        // Map TreeMap
        // Nao permite nenhuma chave null.
        // oredenado por padrao nativo ou por compareTo
        System.out.println();
        System.out.println("Map TreeMap");
        Map<Integer, String> treemap = new TreeMap<Integer, String>();
        treemap.put(7, "Ceara");
        treemap.put(2, "Rio Grande do Norte");
        treemap.put(0, "Espirito Santo");
        treemap.put(1, "Roraima");
        // erro : treemap.put(null, "Ceara");
        treemap.put(8, "Ceara");
        System.out.println(treemap);

    }
}
