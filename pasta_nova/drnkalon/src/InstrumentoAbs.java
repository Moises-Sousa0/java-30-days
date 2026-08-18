public abstract class InstrumentoAbs {
    private String nome;

    InstrumentoAbs(String nome){
        this.nome = nome;
    }

    public void apresentar(){
        System.out.println("Instrumento: "+ nome);
    }

    public abstract void tocar();
}
