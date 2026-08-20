public class MissaoNiinja {
    public static void aceitarMissao(String rankNinja, String rankMissao) throws MissaoException{
        if (rankMissao.equals("S") && !rankNinja.equals("Jounin")){
            throw new MissaoException("Somente Jounin pode aceitar missão rank S");
        }
        System.out.println("Missão aceita");
    }
}
