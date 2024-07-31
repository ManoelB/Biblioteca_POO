public class Publicacao {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private String editora;
    private int quantidadeDisponivel;

    public Publicacao(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.editora = editora;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void imprimeDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Gênero: " + genero);
        System.out.println("Editora: " + editora);
        System.out.println("Quantidade Disponível: " + quantidadeDisponivel);
    }
}

