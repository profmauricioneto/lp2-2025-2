package edu.unichristus.review.provanp1.questao06;

public class Turmas {
    public String id;
    public int semestre;
    public Disciplinas disciplinas;

    public Turmas(String id, int semestre, Disciplinas disciplinas) {
        this.id = id;
        this.semestre = semestre;
        this.disciplinas = disciplinas;
    }

    public String getId() {
        return id;
    }

    public int getSemestre() {
        return semestre;
    }
}
