package edu.unichristus.orientedobjectbasics.relationship.onetoone;

public class Main {
    public static void main(String[] args) {

        Disciplina POO = new Disciplina("POO", 123);
        Disciplina Mobile = new Disciplina("Mobile", 321);

        Professor mauricio = new Professor("Mauricio Neto", 1, POO);
        Professor sombra = new Professor("Thiago Sombra", 2, Mobile);

        POO.setProfessor(mauricio);
        Mobile.setProfessor(sombra);

        System.out.println("Professor da Disciplina: " + POO.nomeDisciplina);
        System.out.println(POO.getNomeProfessor());

        System.out.println("Professor da Disciplina: " + Mobile.nomeDisciplina);
        System.out.println(Mobile.getNomeProfessor());
    }
}
