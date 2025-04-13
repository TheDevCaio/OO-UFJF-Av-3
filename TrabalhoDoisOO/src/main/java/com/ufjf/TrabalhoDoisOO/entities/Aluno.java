package com.ufjf.TrabalhoDoisOO.entities;

import com.ufjf.TrabalhoDoisOO.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private static int proximaMatricula = 1000;
    private int matricula;
    private List<Nota> notas = new ArrayList<>();

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
        this.matricula = proximaMatricula++;
    }

    public int getMatricula() {
        return matricula;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void adicionarNota(Nota nota) {
        notas.add(nota);
    }
}
