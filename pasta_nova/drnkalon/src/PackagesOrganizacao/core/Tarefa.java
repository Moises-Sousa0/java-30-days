package PackagesOrganizacao.core;

public class Tarefa {
    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String descricao, boolean concluida){
        this.id = id;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public int getId() {
        return this.id;
    }

    public  String getDescricao(){
        return this.descricao;
    }

    public boolean isConcluida(){
        return this.concluida;
    }

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }
}
