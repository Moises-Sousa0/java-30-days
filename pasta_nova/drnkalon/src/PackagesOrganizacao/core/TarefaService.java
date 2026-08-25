package PackagesOrganizacao.core;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {
    private List<Tarefa> tarefas;

    public TarefaService(){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        Tarefa tareff = new Tarefa(tarefas.size(), descricao, false);
        this.tarefas.add(tareff);
    }

    public List<Tarefa> listarTarefa(){
        return this.tarefas;
    }

    public void concluirTarefa(int id){
        for (Tarefa t : tarefas){
            if (t.getId() == id){
                t.setConcluida(true);
            }

        }
    }

    public void removerTarefa(int id){
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getId() == id){
                tarefas.remove(i);
                break;
            }
        }
    }
}
