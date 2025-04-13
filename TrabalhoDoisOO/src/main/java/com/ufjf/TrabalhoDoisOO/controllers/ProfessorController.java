package com.ufjf.TrabalhoDoisOO.controllers;

import com.ufjf.TrabalhoDoisOO.entities.Professor;
import com.ufjf.TrabalhoDoisOO.services.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    private final ProfessorService professorService = new ProfessorService();

    @GetMapping
    public List<Professor> listarProfessores() {
        return professorService.listarProfessores();
    }

    @PostMapping
    public void cadastrarProfessor(@RequestBody Professor professor) {
        professorService.cadastrarProfessor(professor);
    }
}
