public class Livro2 {
    private String titulo;
    private String autor;
    private final int anoPublicado;
    private boolean disponivel;
    static int totalLivros;

    Livro2(String titulo, String autor, int anoPublicado){
        this.titulo = titulo;
        this.autor =  autor;
        if(anoPublicado <= 0){
            System.out.println("Ano inválido");
            this.anoPublicado = 0;
        } else {
            this.anoPublicado = anoPublicado;
        }
        this.disponivel = true;
        totalLivros++;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo){
        if (titulo == null || titulo.isEmpty()){
            System.out.println("Valor inválido!");
        }else {
            this.titulo = titulo;
        }

    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        if (autor == null || autor.isEmpty()){
            System.out.println("Valor inválido!");
        } else{
            this.autor = autor;
        }

    }

    public int getAnoPublicado(){
        return this.anoPublicado;
    }



    public boolean isDisponivel(){
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }


}
