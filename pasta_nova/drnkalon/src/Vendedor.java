public class Vendedor extends Funcionario{
    public Vendedor(String nome, double salariobase){
        super(nome, salariobase);
    }

    @Override
    public double calcularBonus(){
        double bonus = super.calcularBonus() + 500;
        return bonus;
    }


}
