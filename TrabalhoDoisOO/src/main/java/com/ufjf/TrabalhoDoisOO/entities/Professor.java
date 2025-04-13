package com.ufjf.TrabalhoDoisOO.entities;

import com.ufjf.TrabalhoDoisOO.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
}