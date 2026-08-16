public class Carro {
    private String placa;
    private int vagasUsadas;
    private static int contador;

    Carro(String placa){
        this.placa = placa;
        this.vagasUsadas = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isEmpty()){
            System.out.println("Invalido");
        }else {
            this.placa = placa;
        }
    }

    public int getVagasUsadas() {
        return vagasUsadas;
    }

    public void estacionar(Vaga vaga){
        if (vaga.isOcupada() == true){
            System.out.println("Vaga ocupada");
        }else{
            vaga.ocupar();
            this.vagasUsadas++;
        }



    }
}
