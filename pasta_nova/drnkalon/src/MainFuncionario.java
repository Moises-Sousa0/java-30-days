import java.util.ArrayList;
import java.util.List;

public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario func1 = new Gerente("daniel", 2000);
        Funcionario func2 = new Vendedor("kanye", 4000);
        Funcionario func3 = new Vendedor("Moisa", 5000);
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(func1);
        listaDeFuncionarios.add(func2);
        listaDeFuncionarios.add(func3);

        for (Funcionario f : listaDeFuncionarios){
            System.out.println(f.getSalarioBase());
            System.out.println(f.calcularBonus());
        }
    }
}
