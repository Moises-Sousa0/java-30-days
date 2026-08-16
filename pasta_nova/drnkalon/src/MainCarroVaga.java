import javax.sql.rowset.CachedRowSet;

public class MainCarroVaga {
    public static void main(String[] args) {
        Carro car1 = new Carro("AH21x4");
        Carro car2 = new Carro("AHN8H2");
        Vaga vaga1 = new Vaga();
        Vaga vaga2 = new Vaga();

        car1.estacionar(vaga1);
        car2.estacionar(vaga1);
        car2.estacionar(vaga2);
        System.out.println(car1.getVagasUsadas());
        System.out.println(car2.getVagasUsadas());

    }
}
