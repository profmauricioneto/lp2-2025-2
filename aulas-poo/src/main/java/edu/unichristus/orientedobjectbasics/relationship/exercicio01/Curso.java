package edu.unichristus.orientedobjectbasics.relationship.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    public String nomeCurso;
    public int codigo;
    public List<Estudante> estudantes;
    public Universidade universidade;

    public Curso(String nomeCurso, int codigo, Universidade universidade) {
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        this.estudantes = new ArrayList<>();
        this.universidade = universidade;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void addEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

    public void mostrarEstudantes() {
        for(Estudante e: estudantes) {
            System.out.println(e.nomeEstudante);
        }
    }

    public int getTotalEstudantesCurso() {
        return this.estudantes.size();
    }
}
