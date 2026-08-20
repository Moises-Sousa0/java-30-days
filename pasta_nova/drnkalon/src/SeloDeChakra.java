public class SeloDeChakra<T extends Number> {
    private T quantidade;

    public SeloDeChakra(T quantidade){
        this.quantidade = quantidade;
    }

    public double dobrar(){
        double calc = quantidade.doubleValue() * 2;
        return calc;
    }
}
