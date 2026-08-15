import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menuPrincipal = """
                1 - Consultar saldo
                2 - Sacar
                3 - Depositar
                4 - Sair
                """;

        Scanner scan = new Scanner(System.in);
        System.out.println(menuPrincipal);
        float saldo = 1239.99f;


        while (true){
            System.out.println("\nDigite o número da sua opção: ");
            int opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao == 2){
                System.out.println("Quanto deseja sacar?");
                float valorSaque = scan.nextFloat();
                if (valorSaque < saldo) {
                    saldo -= valorSaque;
                    System.out.println("Saque realizado!");
                } else {
                    System.out.println("Valor inválido");
                }
            } else if (opcao == 3){
                System.out.println("Quanto deseja depositar?");
                float valorDeposito = scan.nextFloat();
                if (valorDeposito > 0){
                    System.out.println("R$" + valorDeposito + " Foram depositados!");
                    saldo += valorDeposito;
                } else {
                    System.out.println("Valor inválido");
                }

            } else if (opcao == 4){
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida");
            }

        }

    }
}