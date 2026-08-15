public class Personagem {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    int danoAtaque;


    public int acaoAtacar(){
        int dano = danoAtaque;
        return dano;
    }

    void receberDano(int dano){

        pontosDeVida -= dano;
        System.out.println(nome +" Levou dano e agora está com " + pontosDeVida + " de vida");
    }



}
