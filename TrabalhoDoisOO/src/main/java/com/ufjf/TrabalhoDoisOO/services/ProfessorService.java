package com.ufjf.TrabalhoDoisOO.services;

import com.ufjf.TrabalhoDoisOO.entities.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorService {
    private List<Professor> professores = new ArrayList<>();

    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }

    public List<Professor> listarProfessores() {
        return professores;
    }
}
