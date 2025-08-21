package edu.unichristus.orientedobjectbasics.relationship.onetoone;

public class Main {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio Neto", 1);
        Professor sombra = new Professor("Thiago Sombra", 2);

        Disciplina POO = new Disciplina("POO", 123);
        Disciplina Mobile = new Disciplina("Mobile", 321);

        POO.setProfessor(mauricio);
        Mobile.setProfessor(sombra);

        System.out.println("Professor da Disciplina: " + POO.nomeDisciplina);
        System.out.println(POO.getNomeProfessor());

        System.out.println("Professor da Disciplina: " + Mobile.nomeDisciplina);
        System.out.println(Mobile.getNomeProfessor());
    }
}
