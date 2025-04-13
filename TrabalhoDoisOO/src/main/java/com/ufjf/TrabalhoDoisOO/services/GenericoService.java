package com.ufjf.TrabalhoDoisOO.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GenericoService<T> {

    private final JpaRepository<T, Long> repository;

    @Autowired
    public GenericoService(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    public T criar(T entity) {
        return repository.save(entity);
    }

    public Optional<T> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public T atualizar(Long id, T entity) {
        if (repository.existsById(id)) {
            return repository.save(entity);
        }
        return null;
    }

    public boolean remover(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
