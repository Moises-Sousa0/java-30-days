public class Produto {
    String nome;
    float preco;
    int quantidade;

    void cadastrarProduto(String nomeInput, float precoInput, int quantidadeInput) {
        nome = nomeInput;
        preco = precoInput;
        quantidade = quantidadeInput;
    }

    void listarProduto(){
        System.out.println("Produto: " + nome + " Preço: " + preco + " Quantidade: " + quantidade);
    }
}
