package edu.unichristus.orientedobjectbasics.relationship.onetomany;

public class Disciplina {
    public String nomeDisciplina;
    public int codigo;
    public Professor professor;

    public Disciplina(String nomeDisciplina, int codigo, Professor professor){
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        this.professor = professor;
    }

    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }

    public int getCodigo() {
        return this.codigo;
    }
}
