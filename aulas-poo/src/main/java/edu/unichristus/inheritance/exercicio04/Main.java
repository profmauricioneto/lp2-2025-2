package edu.unichristus.inheritance.exercicio04;

public class Main {
    public static void main(String[] args) {
        Departamento ciencias = new Departamento(1);

        Pessoa joaozinho = new Pessoa(1, ciencias);
        PessoaFisica mariazinha = new PessoaFisica("123456789", 1, ciencias);
        joaozinho.setNome("Joaozinho");
        mariazinha.setNome("Mariazinha");

        ciencias.addPessoa(joaozinho);
        ciencias.addPessoa(mariazinha);

        ciencias.showPessoasDepartamento();
    }
}
