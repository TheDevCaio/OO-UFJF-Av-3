package com.ufjf.TrabalhoDoisOO.services;


import com.ufjf.TrabalhoDoisOO.entities.Aluno;
import com.ufjf.TrabalhoDoisOO.entities.Disciplina;
import com.ufjf.TrabalhoDoisOO.entities.Turma;

import java.util.ArrayList;
import java.util.List;

public class TurmaService {
    private List<Turma> turmas = new ArrayList<>();

    public void cadastrarTurma(Turma turma) {
        turmas.add(turma);
    }

    public List<Turma> listarTurmas() {
        return turmas;
    }

    public void adicionarAlunoNaTurma(String nomeTurma, Aluno aluno) {
        for (Turma turma : turmas) {
            if (turma.getNome().equals(nomeTurma)) {
                turma.adicionarAluno(aluno);
            }
        }
    }

    public void adicionarDisciplinaNaTurma(String nomeTurma, Disciplina disciplina) {
        for (Turma turma : turmas) {
            if (turma.getNome().equals(nomeTurma)) {
                turma.adicionarDisciplina(disciplina);
            }
        }
    }
}
