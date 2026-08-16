public class Usuario2 {
    private String nome;
    private final int id;
    private int livrosEmprestados;
    static int contador;

    Usuario2(String nome){
        this.nome = nome;
        this.livrosEmprestados = 0;
        contador++;
        this.id = contador;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        if (nome == null || nome.isEmpty()){
            System.out.println("Nome inválido");
        }else{
            this.nome = nome;
        }
    }

    public int getId(){
        return this.id;
    }

    public  int getLivrosEmprestados(){
        return this.livrosEmprestados;
    }

    public void emprestar(Livro2 livro){
        if (livro.isDisponivel() == false){
            System.out.println("Livro não disponivel");
        }else{
            livro.setDisponivel(false);
            System.out.println("Livro emprestado!");
            livrosEmprestados++;
        }
    }

}

