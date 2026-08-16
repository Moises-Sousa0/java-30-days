public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus(){
        double bonus = getSalarioBase() * 0.20;
        return bonus;
    }

}
