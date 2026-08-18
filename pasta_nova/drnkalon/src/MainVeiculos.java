public class MainVeiculos {
    public static void main(String[] args) {
        CarroVeiculos car1 = new CarroVeiculos();
        MotoVeiculos mot1 = new MotoVeiculos();
        OficinaVeiculos ofic = new OficinaVeiculos();

        ofic.revisarVeiculo(car1);
        ofic.revisarVeiculo(mot1);
    }
}
