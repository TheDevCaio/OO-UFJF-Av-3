package com.ufjf.TrabalhoDoisOO.services;

import com.ufjf.TrabalhoDoisOO.entities.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final List<Aluno> alunos = new ArrayList<>();
    private long contadorId = 1;

    public Aluno criarAluno(Aluno aluno) {
        aluno.setId(contadorId++);
        alunos.add(aluno);
        return aluno;
    }

    public Aluno buscarAlunoPorId(Long id) {
        Optional<Aluno> aluno = alunos.stream().filter(a -> a.getId().equals(id)).findFirst();
        return aluno.orElse(null);
    }

    public Aluno atualizarAluno(Long id, Aluno aluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(id)) {
                aluno.setId(id);
                alunos.set(i, aluno);
                return aluno;
            }
        }
        return null;
    }

    public boolean removerAluno(Long id) {
        return alunos.removeIf(aluno -> aluno.getId().equals(id));
    }

    public List<Aluno> listarTodos() {
        return alunos;
    }
}
