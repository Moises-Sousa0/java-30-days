public class Rpg {
    public static void main(String[] args) {
        Guerreiro guer = new Guerreiro();
        Globin glob = new Globin();

        // globin
        glob.nivel = 1;
        glob.nome = "vietkz";

        // guerreiro
        guer.nivel = 3;
        guer.nome = "arthur";

        Personagem atacante = guer;
        Personagem defensor = glob;

        while (guer.pontosDeVida > 0 && glob.pontosDeVida > 0) {
            defensor.receberDano(atacante.acaoAtacar());

            if (defensor.pontosDeVida <= 0){
                System.out.println(defensor.nome + " morreu!");
                break;
            }

            atacante.receberDano(defensor.acaoAtacar());

            if (atacante.pontosDeVida <= 0){
                System.out.println(atacante.nome + " morreu!");
                break;
            }
        }
    }
}
