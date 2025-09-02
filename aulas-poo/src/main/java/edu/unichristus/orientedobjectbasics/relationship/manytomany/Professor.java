package edu.unichristus.orientedobjectbasics.relationship.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    public String nomeProfessor;
    public int idProfessor;
    List<Disciplina> disciplinas;

    public Professor(String nomeProfessor, int idProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.idProfessor = idProfessor;
        disciplinas = new ArrayList<>();
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void mostrarDisciplinasMinistradas() {
        for(Disciplina d: disciplinas) {
            System.out.println(d.getNomeDisciplina());
        }
    }
}
