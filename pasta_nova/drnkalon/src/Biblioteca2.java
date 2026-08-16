public class Biblioteca2 {
    public static void main(String[] args) {
        Livro2 livro1 = new Livro2("loki", "lokizada", 1960);
        Livro2 livro21 = new Livro2("kanye west", "kanye", 1920);
        Livro2 livro3 = new Livro2("Father", "sla", 1922);

        Usuario2 user1 = new Usuario2("Loki");
        Usuario2 user2 = new Usuario2("Daniel");
        user1.emprestar(livro1);
        user1.emprestar(livro1);

        System.out.println(Livro2.totalLivros);
        System.out.println(Usuario2.contador);

    }

}
