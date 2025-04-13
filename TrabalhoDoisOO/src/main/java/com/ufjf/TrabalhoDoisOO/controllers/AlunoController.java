package com.ufjf.TrabalhoDoisOO.controllers;

import com.ufjf.TrabalhoDoisOO.entities.Aluno;
import com.ufjf.TrabalhoDoisOO.entities.Nota;
import com.ufjf.TrabalhoDoisOO.services.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoService alunoService = new AlunoService();

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    @PostMapping
    public void cadastrarAluno(@RequestBody Aluno aluno) {
        alunoService.cadastrarAluno(aluno);
    }

    @PostMapping("/{matricula}/notas")
    public void adicionarNota(@PathVariable int matricula, @RequestBody Nota nota) {
        alunoService.adicionarNota(matricula, nota);
    }

    @GetMapping("/{matricula}")
    public Aluno buscarPorMatricula(@PathVariable int matricula) {
        return alunoService.buscarPorMatricula(matricula);
    }
}
