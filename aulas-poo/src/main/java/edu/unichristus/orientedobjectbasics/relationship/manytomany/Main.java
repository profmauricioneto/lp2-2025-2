package edu.unichristus.orientedobjectbasics.relationship.manytomany;

public class Main {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio", 1);
        Professor thiago = new Professor("Thiafo", 2);

        Disciplina poo = new Disciplina("POO", 1234);
        Disciplina mobile = new Disciplina("Mobile", 5678);
        Disciplina lp1 = new Disciplina("LP1", 4321);
        Disciplina algo = new Disciplina("Algoritmos", 987);

        // PROFESSOR -> DISCIPLINA
        mauricio.addDisciplina(lp1);
        mauricio.addDisciplina(poo);
        thiago.addDisciplina(algo);
        thiago.addDisciplina(mobile);

        // DISCIPLINA -> PROFESSOR
        lp1.addProfessor(mauricio);
        poo.addProfessor(mauricio);
        mobile.addProfessor(thiago);
        algo.addProfessor(thiago);

        System.out.println("Disciplinas de Mauricio");
        mauricio.mostrarDisciplinasMinistradas();
        System.out.println("Disciplinas de Thiago");
        thiago.mostrarDisciplinasMinistradas();
    }
}
