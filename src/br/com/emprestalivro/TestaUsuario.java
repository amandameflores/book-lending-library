package br.com.emprestalivro;

import br.com.emprestalivro.dominio.Livro;
import br.com.emprestalivro.dominio.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class TestaUsuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite sua data de nascimento: ");
        String dataNascimento = scanner.nextLine();


        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();


        Usuario usuario = new Usuario(1, nomeCompleto, dataNascimento, endereco);
        usuario.imprimeDadosUsuario();



        System.out.println("Digite o nome do Livro: ");
        String nomeLivro = scanner.nextLine();

        System.out.println("Digite o nome do autor: ");
        String nomeAutor = scanner.nextLine();


        Livro livro = new Livro(nomeLivro, nomeAutor);
        livro.imprimeLivro();

        String dataEmprestimo = "";
        String dataDevolucao = "";
        boolean invalido = true;

        while (invalido){
            System.out.println("Digite a data do empréstimo: ");
            dataEmprestimo = scanner.nextLine();

            System.out.println("Digite a data da devolução: ");
            dataDevolucao = scanner.nextLine();

            LocalDate localDateEmprestimo = LocalDate.parse(dataEmprestimo, DateTimeFormatter.ISO_DATE);
            LocalDate localDateDevolucao = LocalDate.parse(dataDevolucao, DateTimeFormatter.ISO_DATE);


            if(localDateDevolucao.isBefore(localDateEmprestimo)) {
                invalido = true;
                System.out.println("A data de devolução deve ser depois da data de empréstimo");

            } else {
                invalido = false;
                System.out.println("A sua devolução foi cadastrada com sucesso");
            }


        }

    }

}
