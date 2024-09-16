package com.example.inicial1.services;

import com.example.inicial1.entities.Autor;
import com.example.inicial1.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService implements BaseService<Autor>{

    @Autowired
    private AutorRepository autorRepository;
    @Override
    public List<Autor> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Autor findById(Long id) throws Exception {
        return null;
    }

    @Override
    public Autor save(Autor entity) throws Exception {
        return null;
    }

    @Override
    public Autor update(Long id, Autor entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
