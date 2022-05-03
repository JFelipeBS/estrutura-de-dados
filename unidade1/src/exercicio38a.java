package unidade1.src;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class exercicio38a {

    public static void main(String[] args) {

        // list: usado quando pode haver elementos repetidos;
        // capacidade do tamnho + 50% do tamnho;
        List<String> list1 = new ArrayList<String>();

        System.out.println("ArrayList");
        // adicionar elemento
        list1.add(0, "saopaulo"); // indicando a posicao
        list1.add("riodejaneiro"); // vai para o fim
        list1.add("itaicaba");
        list1.add("pernambuco");
        list1.add("natal");
        list1.add("mossoro");
        list1.add("mossoro");

        System.out.println(list1);
        // tamanho do ArrayListe
        System.out.println("Tamanho " + list1.size());
        // Removendo do ArrayListe
        list1.remove(0); // remover por index
        list1.remove("sai"); // remover por valor
        System.out.println(list1);

        // pegar valor usado get
        System.out.println(list1.get(1));

        // setar valor usado set
        // permite substituir pelo index
        list1.set(0, "Amapa");
        System.out.println(list1);

        // obter primeira ocorrencia do elemento informado
        System.out.println(list1.indexOf("itaicaba"));

        // obter primeira ocorrencia do elemento informado

        // ===========================================
        List<String> list2 = new ArrayList<String>();
        list2.add("roraima");
        list2.add("rondonia");
        list2.add("acre");
        // ===========================================

        // adicionado list2 no indice 0 de list1
        list1.addAll(0, list2);
        System.out.println(list1);

        // ordena
        Collections.sort(list1);
        System.out.println(list1);

        // LinkendList
        // Melhor eficiencia em: add, remove (elementos no meio, se comparado com
        // ArrayList)
        // Nao adiciona elementos de forma adjacente, e duplamente encadeada
        // dificuldade no acesso da memoria(nao indexado)
        System.out.println();
        System.out.println("LinkedList");
        List<String> list3 = new LinkedList<String>();
        list3.add("itaicaba");
        list3.add("jaguaruana");
        list3.add("palhano"); // adicionados ao final
        System.out.println(list3);
        System.out.println();

        // Vector
        // diferenca do arreylist: (capacidade e do tamanho do array + 100%)
        System.out.println();
        System.out.println("Vector");
        Vector<String> vector = new Vector<String>();
        vector.add("felipe");
        System.out.println(vector);

    }
}
