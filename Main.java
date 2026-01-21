import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();


        String menu = """
        \n=====================
        1 - Cadastrar usuario
        2 - Listar usuarios
        3 - Remover usuarios
        0 - Sair        
        =====================
        """;

        int opcao = -1;

        while (opcao != 0) {
            System.out.println(menu);
            System.out.print("Digite sua opção: ");
            opcao = inputt.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("\nDigite seu nome: ");
                    inputt.nextLine(); //limpar buffer
                    String nome = inputt.nextLine();
                    System.out.print("Digite sua idade: ");
                    int idade = inputt.nextInt();
                    inputt.nextLine(); //limpar buffer
                    System.out.print("Digite seu email: ");
                    String email = inputt.nextLine();

                    //cria o usuario
                    Usuario novoUsuario = new Usuario(nome, idade, email);

                    //adiciona na lista
                    usuarios.add(novoUsuario);

                    System.out.println("\nCadastrado com sucesso\n");



                    break;

                case 2:
                    System.out.println("finalizando...");
                    break;
            }

        }

    }
}