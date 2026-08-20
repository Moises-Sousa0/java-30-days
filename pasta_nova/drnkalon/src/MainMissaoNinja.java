public class MainMissaoNinja {
    public static void main(String[] args) {
        try {
            MissaoNiinja.aceitarMissao("Jounin", "S");
        } catch (MissaoException e){
            System.out.println(e.getMessage());
        }
    }
}
