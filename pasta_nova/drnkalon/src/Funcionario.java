public class Funcionario {
    private String nome;
    private double salarioBase;

    Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }


    public double calcularBonus(){
        double bonus = this.salarioBase / 10;
        return bonus;
    }

}
