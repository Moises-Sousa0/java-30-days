import java.util.*;

public class MainNinja {
    public static void main(String[] args) {
        List<Ninja> time7 = new ArrayList<>();
        time7.add(new Ninja("Naruto", 200));
        time7.add(new Ninja("Sasuke", 100));
        time7.add(new Ninja("Sakura", 50));

        for (Ninja ninja : time7){
            System.out.println("\nNome: " + ninja.getNome());
            System.out.println("Chakra: " + ninja.getNivelChakra());
        }

        System.out.println("\n===============\n");

        Set<String> jutsusAprendidos = new HashSet<>();
        jutsusAprendidos.add("Chidori");
        jutsusAprendidos.add("Rasengan");
        jutsusAprendidos.add("Clone das sombras");
        jutsusAprendidos.add("Chidori");

        for (String jutsus : jutsusAprendidos){
            System.out.println(jutsus);
        }

        Map<String, Integer> rankingChakra = new HashMap<>();
        for (Ninja ninja : time7){
            rankingChakra.put(ninja.getNome(), ninja.getNivelChakra());
        }

        for (Map.Entry<String, Integer> par : rankingChakra.entrySet()){
            System.out.println(par.getKey() + " - " + par.getValue());
        }

        System.out.println("\n===============\n");

    }
}
