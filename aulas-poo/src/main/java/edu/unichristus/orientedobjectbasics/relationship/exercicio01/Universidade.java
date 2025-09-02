package edu.unichristus.orientedobjectbasics.relationship.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    public String nomeUniversidade;
    public String descricao;
    public List<Curso> cursos;

    public Universidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
        this.cursos = new ArrayList<>();
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void getNomeCursos() {
        for (Curso c: cursos) {
            System.out.println(c.getNomeCurso());
        }
    }

    public int getTotalCursos() {
        return this.cursos.size();
    }

    public int getTotalEstudantesUniversidade() {
        int totalEstudantes = 0;
        for (Curso c: cursos) {
            totalEstudantes += c.getTotalEstudantesCurso();
        }
        return totalEstudantes;
    }
}
