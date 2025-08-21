package edu.unichristus.orientedobjectbasics.relationship.onetoone;

public class Disciplina {
    public String nomeDisciplina;
    public int codigo;
    public Professor professor;

    public Disciplina(String nomeDisciplina, int codigo) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
    }

    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }

    // METODO PARA ADICIONAR UM PROFESSOR.
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // METODO PARA RETORNAR O NOME DO PROFESSOR.
    public String getNomeProfessor() {
        return this.professor.nomeProfessor;
    }
}
