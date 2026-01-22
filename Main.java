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

            switch (opcao) {
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
                    if (usuarios.isEmpty()) {
                        System.out.println("Sem usuarios cadastrados ainda");

                    } else {
                        for (int i = 0; i < usuarios.size(); i++) {
                            Usuario u = usuarios.get(i);
                            System.out.println("\nUSUARIO: " + (i + 1));
                            System.out.println("NOME: " + u.nome);
                            System.out.println("IDADE: " + u.idade);
                            System.out.println("EMAIL: " + u.email);

                        }
                    }
                    break;


                case 3:
                    if (usuarios.isEmpty()){
                        System.out.println("Sem usuarios cadastrados ainda");

                    } else {
                        System.out.print("Qual usuario deseja remover?");

                        for (int i = 0; i < usuarios.size(); i++) {
                            Usuario u = usuarios.get(i);
                            System.out.println("\nUSUARIO: " + (i + 1));
                            System.out.println("NOME: " + u.nome);
                            System.out.println("IDADE: " + u.idade);
                            System.out.println("EMAIL: " + u.email);
                        }


                        System.out.println("\nDigite o número do usuario que será removido: ");
                            int opc = inputt.nextInt();
                            opc = opc - 1;

                        if (opc >= 0 && opc < usuarios.size()) {
                            usuarios.remove(opc);
                            System.out.println("Removido com sucesso\n");

                        } else {
                            System.out.println("\nUsuario não encontrado\n");
                        }
                    }
                    break;

            }

            }

        }

    }
