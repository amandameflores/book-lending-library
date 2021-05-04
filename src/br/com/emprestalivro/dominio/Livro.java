package br.com.emprestalivro.dominio;

public class Livro {

    private int codigoLivro;
    private String nome;
    private String autor;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void imprimeLivro() {
        System.out.println("Nome Livro: "+this.nome+
                "\nAutor Livro: "+this.autor);
    }
}
