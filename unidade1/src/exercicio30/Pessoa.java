package unidade1.src.exercicio30;

public class Pessoa {

    private String cpf;
    private String nome;
    private int idade;
    private char sexo;
    private float peso;
    private float altura;
    private float imc;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        try {
            if (cpf.length() < 11) {
                throw new Exception("CPF INVALIDO");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public float calcImc() {
        float imc = (this.peso / (this.altura * this.altura));
        return imc;
    }

    @Override
    public String toString() {
        return "Pessoa [altura=" + altura + ", cpf=" + cpf + ", idade=" + idade + ", imc=" + imc + ", nome=" + nome
                + ", peso=" + peso + ", sexo=" + sexo + "]";
    }

}
