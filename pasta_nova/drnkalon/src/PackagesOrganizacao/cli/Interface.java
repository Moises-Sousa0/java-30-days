package PackagesOrganizacao.cli;
import PackagesOrganizacao.core.Tarefa;
import PackagesOrganizacao.core.TarefaService;


public class Interface {
    private TarefaService service;

    public Interface(TarefaService service){
        this.service = service;
    }

    public void mostrarTarefas(){
        for (Tarefa t : service.listarTarefa()){
            System.out.println("ID: "+ t.getId()+ " Descricao: " +t.getDescricao()+ " Concluida: " +t.isConcluida());
        }
    }
}
