import java.util.HashMap;
import java.util.Map;

public class InventarioNinja<T> {
    private Map<String, T> itens;

    public InventarioNinja(){
        this.itens = new HashMap<>();
    }

    public void adicionar(String nome, T item){
        itens.put(nome, item);
    }

    public T pegar(String nome){
        return itens.get(nome);
    }
}
