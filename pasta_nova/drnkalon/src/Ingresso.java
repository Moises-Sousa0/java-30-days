public class Ingresso {
    private final int codigo;
    private String nomeEvento;
    private double preco;
    private boolean usado;
    static int contador;

    Ingresso(String nomeEvento, double preco){
        this.nomeEvento = nomeEvento;
        this.preco = preco;
        contador++;
        this.codigo = contador;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getNomeEvento(){
        return this.nomeEvento;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public boolean isUsado(){
        return this.usado;
    }

    public void setNomeEvento(String nomeEvento){
        if (nomeEvento == null || nomeEvento.isEmpty()){
            System.out.println("Invalido");
        }else{
            this.nomeEvento = nomeEvento;
        }
    }

    public void setPreco(double preco){
        if (preco <= 0){
            System.out.println("Invalido");
        }else{
            this.preco = preco;
        }
    }



    public void usar(){
        if (usado == true){
            System.out.println("Esse ingresso já foi utilizado");
        }else {
            this.usado = true;
            System.out.println("Ingreso válido");
        }
    }

}
