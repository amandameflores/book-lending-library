package br.com.emprestalivro.dominio;

public class Usuario {


    private int codigoUsuario;
    private String nomeCompleto;
    private String dataNascimento;
    private String endereco;


    public Usuario(int codigoUsuario, String nomeCompleto, String dataNascimento, String endereco) {
        this.codigoUsuario = codigoUsuario;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public void imprimeDadosUsuario() {
        System.out.println("Nome: "+this.nomeCompleto+
                "\nData de Nascimento: "+this.dataNascimento+
                "\nEndereço: " +this.endereco);

    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



}
