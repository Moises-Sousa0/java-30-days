public class MainAbs {
    public static void main(String[] args) {
        GuitarraAbs guitt1 = new GuitarraAbs("guitt1");
        BateriaAbs guitt2 = new BateriaAbs("guitt2");

        guitt1.tocar();
        guitt1.apresentar();
        System.out.println("================");
        guitt2.tocar();
        guitt2.apresentar();

    }
}
