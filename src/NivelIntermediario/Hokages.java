package NivelIntermediario;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    String altura;

    public Hokages() {
    // Construtor Vazio, sem argumento
    }

    // Criar um construtor com argumentos
    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    public Hokages(int idade, boolean vivoOuNao, String nome) {
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.nome = nome;
    }

    public Hokages(String altura, String aldeia, boolean vivoOuNao, int idade, String nome) {
        this.altura = altura;
        this.aldeia = aldeia;
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
        this.nome = nome;
    }
}
