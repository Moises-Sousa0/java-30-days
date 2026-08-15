import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Produto> listaDeProdutos = new ArrayList<>();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Digite o número da opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Nome produto: ");
                String nome = sc.nextLine();

                System.out.println("Preço produto: ");
                float preco = sc.nextFloat();

                System.out.println("Quantidade produto: ");
                int quantidade = sc.nextInt();

                Produto novoProduto = new Produto();
                novoProduto.cadastrarProduto(nome, preco, quantidade);
                listaDeProdutos.add(novoProduto);

            } else if (opcao == 2) {
                if (listaDeProdutos.isEmpty()) {
                    System.out.println("Ainda não existe produtos aqui");
                } else {
                    for (Produto p : listaDeProdutos) {
                        p.listarProduto();
                    }
                }

            } else if (opcao == 3) {
                if (listaDeProdutos.isEmpty()) {
                    System.out.println("Ainda não existe produtos aqui");
                } else {
                    System.out.println("Número do produto que deseja remover: ");
                    int removerProduto = sc.nextInt();
                    sc.nextLine();

                    if (removerProduto >= 0 && removerProduto < listaDeProdutos.size()) {
                        listaDeProdutos.remove(removerProduto);
                        System.out.println("Produto removido");
                    } else {
                        System.out.println("Produto invalido");
                    }
                }
            } else if (opcao == 4) {
                if (listaDeProdutos.isEmpty()) {
                    System.out.println("Ainda não existe produtos aqui");
                } else {
                    System.out.println("Numero do produto que deseja atualizar: ");
                    int atualizarProduto = sc.nextInt();
                    sc.nextLine();

                    if (atualizarProduto >= 0 && atualizarProduto < listaDeProdutos.size()) {
                        System.out.println("Novo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.println("Novo preço: ");
                        float novoPreco = sc.nextFloat();

                        System.out.println("Nova quantidade: ");
                        int novaQuantidade = sc.nextInt();
                        sc.nextLine();

                        Produto produtoAtualizado = new Produto();

                        produtoAtualizado.cadastrarProduto(novoNome, novoPreco, novaQuantidade);

                        listaDeProdutos.set(atualizarProduto, produtoAtualizado);

                    } else {
                        System.out.println("Produto invalido");
                    }
                }
            }else if (opcao == 5){
                System.out.println("Saindo");
                break;
            }

            else {
                System.out.println("inválido");
            }
        }




}
}