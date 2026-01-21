import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();


        String menu = """
        =====================
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


        }

    }
}