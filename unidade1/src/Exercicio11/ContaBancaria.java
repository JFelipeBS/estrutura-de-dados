package Exercicio11;

public class ContaBancaria {

    String nome;
    double valor = 100;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double transferencia(double valor) {

        if (valor > this.valor) {
            System.out.println("Saldo insuficientes");
        } else {
            this.valor -= valor;
            System.out.println("Transferencia no valor de " + valor + " realizada com sucesso.");

        }

        return valor;

    }

    public void recebido(double valor) {
        this.valor+=valor;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
