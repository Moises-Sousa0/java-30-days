public class PergaminhoMain {
    public static void main(String[] args) {
        Pergaminho<String> personagens = new Pergaminho<>("Gamabunta");
        Pergaminho<Integer> nivelChakra = new Pergaminho<>(9000);

        System.out.println(personagens.revelar());
        System.out.println(nivelChakra.revelar());

        SeloDeChakra<Integer> selo = new SeloDeChakra<>(40);
        System.out.println(selo.dobrar());

        InventarioNinja<Integer> kunai = new InventarioNinja<>();
        kunai.adicionar("Kunais Simples", 15);
        Integer buscaPorNome = kunai.pegar("Kunais Simples");
        System.out.println(buscaPorNome);
    }
}
