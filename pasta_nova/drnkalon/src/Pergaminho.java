public class Pergaminho<T> {
    private T conteudo;

    public Pergaminho(T conteudo) {
        this.conteudo = conteudo;
    }

    public T revelar() {
        return this.conteudo;
    }

}
