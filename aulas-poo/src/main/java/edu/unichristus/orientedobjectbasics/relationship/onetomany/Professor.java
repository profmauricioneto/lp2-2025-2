package edu.unichristus.orientedobjectbasics.relationship.onetomany;

import java.util.List;
import java.util.ArrayList;

public class Professor {
    public String nomeProfessor;
    public int idProfessor;
    public List<Disciplina> disciplinas;

    public Professor(String nomeProfessor, int idProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.idProfessor = idProfessor;
        this.disciplinas = new ArrayList<>();
    }

    public String getNomeProfessor() {
        return this.nomeProfessor;
    }

    public int getIdProfessor() {
        return this.idProfessor;
    }

    // PRECISA DE RELACIONAMENTO A PARTIR DAQUI
    public void addDisciplina(Disciplina disciplinas[]) {
        for (int i = 0; i < disciplinas.length; i++) {
            this.disciplinas.add(disciplinas[i]);
        }
    }

    public int getTotalDisciplinas(){
        return this.disciplinas.size();
    }

    public void getNomeDasDisciplinas() {
        for(Disciplina d: disciplinas) {
            System.out.println(d.nomeDisciplina);
        }
    }
 }
