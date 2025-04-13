package com.ufjf.TrabalhoDoisOO.controllers;

import com.ufjf.TrabalhoDoisOO.entities.Aluno;
import com.ufjf.TrabalhoDoisOO.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public ResponseEntity<Aluno> criarAluno(@RequestBody Aluno aluno) {
        Aluno alunoCriado = alunoService.criarAluno(aluno);
        return ResponseEntity.status(201).body(alunoCriado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarAlunoPorId(@PathVariable Long id) {
        Aluno aluno = alunoService.buscarAlunoPorId(id);
        if (aluno != null) {
            return ResponseEntity.ok(aluno);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> listarAlunos() {
        List<Aluno> alunos = alunoService.listarTodos();
        return ResponseEntity.ok(alunos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizarAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        Aluno alunoAtualizado = alunoService.atualizarAluno(id, aluno);
        if (alunoAtualizado != null) {
            return ResponseEntity.ok(alunoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerAluno(@PathVariable Long id) {
        if (alunoService.removerAluno(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}