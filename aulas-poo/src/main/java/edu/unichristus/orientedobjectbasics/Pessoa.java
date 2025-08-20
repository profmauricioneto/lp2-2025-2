package edu.unichristus.orientedobjectbasics;

import java.util.Calendar;

public class Pessoa {
    public String nome;
    public int anoNascimento;
    public float altura;

    public Pessoa(String nome, int anoNascimento, float altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    public void infoPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Altura: " + altura);
    }

    public int calcIdadePessoa() {
        Calendar data = Calendar.getInstance();
        int anoAtual = data.get(Calendar.YEAR);
        return anoAtual - anoNascimento;
    }
}
