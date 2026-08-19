import java.util.*;

public class MainGenerics {
    public static void main(String[] args) {
        /*
        List<String> pecas = new ArrayList<>();
        pecas.add("oleo");
        pecas.add("oleo");
        pecas.add("pneu");
        pecas.add("pastilha");
        pecas.add("vela");
        pecas.get(0);
        System.out.println(pecas);
        pecas.remove(0);
        System.out.println(pecas);
        */

        /*
        Set<String> clientes = new HashSet<>();
        clientes.add("Joao");
        clientes.add("Marcelo");
        clientes.add("Carlos");
        clientes.add("Joao");
        clientes.add("joao");
        System.out.println(clientes.contains("Joao"));
        System.out.println(clientes.size());
        */

        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("Chave de fenda", 10);
        estoque.put("Chave Y", 30);
        estoque.put("Chave T", 24);
        System.out.println(estoque.get("Chave Y"));

    }

}
