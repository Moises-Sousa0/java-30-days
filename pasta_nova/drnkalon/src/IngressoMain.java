public class IngressoMain {
    public static void main(String[] args) {
        Ingresso i = new Ingresso("teste", 22);
        Ingresso i1 = new Ingresso("teste", 22);
        Ingresso i2 = new Ingresso("aii", 22);

        i.usar();
        i.usar();
        i1.usar();
        i2.usar();
        System.out.println(Ingresso.contador);
    }
}
