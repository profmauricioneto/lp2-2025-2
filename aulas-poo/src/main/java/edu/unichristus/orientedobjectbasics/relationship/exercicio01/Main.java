package edu.unichristus.orientedobjectbasics.relationship.exercicio01;

public class Main {
    public static void main(String[] args) {
        Universidade unichristus = new Universidade("UNICHRISTUS");

        Curso ads = new Curso("ADS", 123, unichristus);
        Curso si = new Curso("SI", 321, unichristus);

        unichristus.addCurso(ads);
        unichristus.addCurso(si);

        Estudante joao = new Estudante("João", "123456789", ads);
        Estudante maria = new Estudante("Maria", "09876543", ads);
        Estudante rafael = new Estudante("Rafael", "12349876", si);
        Estudante tulho = new Estudante("Tulho", "qwertyui", si);

        ads.addEstudante(joao);
        ads.addEstudante(maria);
        si.addEstudante(rafael);
        si.addEstudante(tulho);

        System.out.println("Universidade: " + unichristus.getNomeUniversidade());
        System.out.println("Quantidade de Cursos: " + unichristus.getTotalCursos());
        System.out.println("Quantidade de Alunos Matriculados: " + unichristus.getTotalEstudantesUniversidade());

    }
}
