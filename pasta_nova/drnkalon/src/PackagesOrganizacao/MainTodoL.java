package PackagesOrganizacao;
import PackagesOrganizacao.cli.Interface;
import PackagesOrganizacao.core.TarefaService;

import java.util.Scanner;

public class MainTodoL {
    public static void main(String[] args) {
        TarefaService tarf = new TarefaService();
        Interface intf = new Interface(tarf);

        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 8){
            System.out.println("""
                    1 - ver tarefas
                    2 - adicionar tarefas
                    3 - remover tarefas
                    4 - marcar como concluida
                    8 - sair
                    """);

            System.out.println("\nDigite o número da sua opção: \n");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 1){
                intf.mostrarTarefas();
            } else if (opcao == 2){
                System.out.println("Digite a descriçao da tarefa: ");
                String descTarefa = sc.nextLine();
                tarf.adicionarTarefa(descTarefa);
            } else if (opcao == 3) {
                System.out.println("Digite o ID da tarefa que deseja remover: ");
                int remTarefa = sc.nextInt();
                tarf.removerTarefa(remTarefa);
                System.out.println("Tarefa removida.");
            } else if (opcao == 4) {
                System.out.println("Digite o ID da tarefa que deseja marcar como concluida: ");
                int concTarefa = sc.nextInt();
                tarf.concluirTarefa(concTarefa);
                System.out.println("Tarefa concluida!");
            } else if (opcao == 8) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Invalido.");
            }
        }
    }
}
