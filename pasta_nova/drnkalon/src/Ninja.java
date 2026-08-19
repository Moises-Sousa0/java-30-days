public class Ninja {
    private String nome;
    private int nivelChakra;

    Ninja(String nome, int nivelChakra){
        this.nome = nome;
        this.nivelChakra = nivelChakra;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelChakra(){
        return this.nivelChakra;
    }

    public void setNivelChakra(){
        this.nivelChakra = nivelChakra;
    }
}
