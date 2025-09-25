package edu.unichristus.review.provanp1.questao06;

import java.util.ArrayList;
import java.util.List;

public class Disciplinas {
    public String nome;
    public String codigo;
    public int cargaHoraria;
    public List<Turmas> turmas;

    public Disciplinas(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = 0;
        this.turmas = new ArrayList<Turmas>();;
    }

    public String getNomeDisciplina() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void addTurma(Turmas turma) {
        this.turmas.add(turma);
    }


}
