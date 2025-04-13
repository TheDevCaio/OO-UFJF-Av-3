package com.ufjf.TrabalhoDoisOO.services;


import com.ufjf.TrabalhoDoisOO.entities.Aluno;
import com.ufjf.TrabalhoDoisOO.entities.Nota;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> listarAlunos() {
        return alunos;
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno buscarPorMatricula(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    public void adicionarNota(int matricula, Nota nota) {
        Aluno aluno = buscarPorMatricula(matricula);
        if (aluno != null) {
            aluno.adicionarNota(nota);
        }
    }
}
