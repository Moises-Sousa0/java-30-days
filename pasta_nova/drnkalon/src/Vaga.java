public class Vaga {
    private final int numero;
    private boolean ocupada;
    private static int  contador;


    Vaga(){
       contador++;
       this.numero = contador;
    }

    public int getNumero() {
        return this.numero;
    }

    public boolean isOcupada(){
        return this.ocupada;
    }

    public void ocupar(){
        if (ocupada == true){
            System.out.println("Vaga ocupada");
        } else {
            this.ocupada = true;
            System.out.println("Você está ocupando essa vaga agora");
        }
    }

    public void liberar(){
        if (ocupada == false){
            System.out.println("Essa vaga já está livre!");
        }else{
            this.ocupada = false;
            System.out.println("Essa vaga foi liberada!");
        }
    }


}
