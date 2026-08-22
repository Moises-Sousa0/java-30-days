public class MainMissaoNinja {
    public static void main(String[] args) {
        try {
            MissaoNiinja.aceitarMissao("Jounin", "S");
        } catch (MissaoException e){
            System.out.println(e.getMessage());
        }

        ChakraJutsu teste = new ChakraJutsu();
        try {
            teste.usarJutsu(20, 10);
        } catch (ChakraInsuficienteException e){
            System.out.println(e.getMessage());
        }

    }
}
