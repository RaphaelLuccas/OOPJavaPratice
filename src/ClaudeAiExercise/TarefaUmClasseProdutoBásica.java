package ClaudeAiExercise;

public class TarefaUmClasseProdutoBásica {
    public static void main(String[] args) {

        // Sem Lombok, você escreveria:
        class Produto {
            private String nome;
            private int preco;
            private String codigoDeBarras;

            // Construtor sem argumentos
            public Produto() {
            }

            // Construtor com todos argumentos
            public Produto(String nome, int preco, String codigoDeBarras) {
                this.nome = nome;
                this.preco = preco;
                this.codigoDeBarras = codigoDeBarras;
            }
        }
    }
}
