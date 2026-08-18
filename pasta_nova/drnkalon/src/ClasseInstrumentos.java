public class ClasseInstrumentos {
    public static void main(String[] args) {
        GuitarraToc guit1 = new GuitarraToc();
        BateriaToc bat1 = new BateriaToc();
        Estudio estd = new Estudio();

        estd.tocarInstrumento(guit1);
        estd.tocarInstrumento(bat1);
    }



}
