package com.ufjf.TrabalhoDoisOO.controllers;

import com.ufjf.TrabalhoDoisOO.entities.Aluno;
import com.ufjf.TrabalhoDoisOO.entities.Disciplina;
import com.ufjf.TrabalhoDoisOO.entities.Turma;
import com.ufjf.TrabalhoDoisOO.services.TurmaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
    private final TurmaService turmaService = new TurmaService();

    @PostMapping
    public void cadastrarTurma(@RequestBody Turma turma) {
        turmaService.cadastrarTurma(turma);
    }

    @GetMapping
    public List<Turma> listarTurmas() {
        return turmaService.listarTurmas();
    }

    @PostMapping("/{nome}/alunos")
    public void adicionarAluno(@PathVariable String nome, @RequestBody Aluno aluno) {
        turmaService.adicionarAlunoNaTurma(nome, aluno);
    }

    @PostMapping("/{nome}/disciplinas")
    public void adicionarDisciplina(@PathVariable String nome, @RequestBody Disciplina disciplina) {
        turmaService.adicionarDisciplinaNaTurma(nome, disciplina);
    }
}
