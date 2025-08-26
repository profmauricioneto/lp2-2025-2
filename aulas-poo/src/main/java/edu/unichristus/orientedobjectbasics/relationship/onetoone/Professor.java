package edu.unichristus.orientedobjectbasics.relationship.onetoone;

public class Professor {
    public String nomeProfessor;
    public int id;
    public Disciplina disciplina;

    public Professor(String nomeProfessor, int id, Disciplina disciplina) {
        this.nomeProfessor = nomeProfessor;
        this.id = id;
        this.disciplina = disciplina;
    }
}
