package unidade2.src.listaSimplesmenteEncadeada;

public class LikendSigly<T> implements InterfaceSigly<T> {

    class Node {

        T data;
        Node next;

        public Node(T elemente) {
            data = elemente;
            next = null;
        }
    }

    private Node head;
    private Node tail;
    public int size;

    public LikendSigly() {
        head = null;
        tail = null;
        size = 0;
    }


    public void show() {

        Node aponta = head;

        if (head == null) {
            System.out.println("É null: Vazio");
        } else {
            while (aponta != null) {

                System.out.print("[" + aponta.data + "] ");
                aponta = aponta.next;
            }
        }
    }

    @Override
    public void addFirst(T elemente) {

        Node novo = new Node(elemente);

        if (head == null) {

            head = novo;
            tail = novo;

        } else {

            novo.next = head;
            head = novo;

        }

        size++;

    }

    @Override
    public void addLast(T elemente) {

        Node novo = new Node(elemente);

        if (head == null) {

            head = novo;
            tail = novo;

        } else {

            tail.next = novo;
            tail = novo;

        }

        size++;

    }

    @Override
    public void addAfter(T elemente, T criterio) {

        Node retorno = searchNode(criterio);

        if (retorno == null) {
            System.out.println("É null: invalido");
        } else {
            Node novo = new Node(elemente);

            if (retorno.next == null) {
                tail = novo;
            }

            novo.next = retorno.next;
            retorno.next = novo;

            size++;

        }
    }

    @Override
    public T peekFirst() {

        if (head == null) {
            System.out.println("É null: invalido");
            return null;
        }
        return head.data;
    }

    @Override
    public T peekLast() {

        if (tail == null) {
            System.out.println("É null: invalido");
            return null;
        }
        return tail.data;
    }

    @Override
    public T removeFirst() {

        Node removendo = head;
        T retorno = null;

        if (head == null) {
            System.out.println("É null: invalido");
            return null;
        } else {

            retorno = head.data;

            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = removendo.next;
            }

            removendo = null;
            size--;

        }

        return retorno;

    }

    @Override
    public T removeLast() {

        T retorno = null;

        if (tail == null) {

            System.out.println("É null: invalido");
            return null;

        } else {

            retorno = tail.data;

            if (tail == head) {
                head = null;
                tail = null;
            } else {

                Node antecessor = head;

                while (antecessor.next != tail) {

                    antecessor = antecessor.next;

                }

                tail = antecessor;
                tail.next = null;
            }

            size--;
        }

        return retorno;
    }

    @Override
    public T remove(T criterio) {

        Node anterior = null;
        Node removido = null;

        if (head == null) {
            System.out.println("É null: invalido");
            return null;
        } else {

            anterior = searchNodeBefore(criterio);

            if (anterior == null) {

                if (head.data.equals(criterio) == false) {
                    System.out.println("É null: invalido");
                    return null;
                } else {
                    return removeFirst();
                }

            } else {

                removido = anterior.next;

                if (removido == tail) {
                    return removeLast();
                } else {
                    anterior.next = removido.next;
                    removido.next = null;
                    size--;

                    return removido.data;

                }
            }
        }
    }

    private Node searchNodeBefore(T criterio) {

        Node p = head;
        Node anterior = null;

        while (p != null) {
            anterior = p;
            p = p.next;

            if (p != null && p.data.equals(criterio)) {
                return anterior;
            }

        }
        return null;
    }

    private Node searchNode(T criterio) {

        Node p = head;

        while (p != null) {

            if (p.data.equals(criterio)) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    @Override
    public T search(T criterio) {

        Node retorno = searchNode(criterio);

        if (retorno == null) {
            System.out.println("É null: invalido");
            return null;
        }
        return retorno.data;
    }

    

}
