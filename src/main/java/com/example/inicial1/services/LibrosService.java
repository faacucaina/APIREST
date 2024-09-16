package com.example.inicial1.services;

import com.example.inicial1.entities.Libros;
import com.example.inicial1.entities.Localidad;
import com.example.inicial1.repositories.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibrosService implements BaseService<Libros>{

    @Autowired
    private LibrosRepository librosRepository;

    @Override
    public List<Libros> findAll() throws Exception {
        try{

            List<Libros> entities = librosRepository.findAll();
            return entities;

        }catch (Exception e){

            throw new Exception(e.getMessage());

        }
    }

    @Override
    public Libros findById(Long id) throws Exception {
        try{

            Optional<Libros> entityOptional = librosRepository.findById(id);
            return entityOptional.get();

        }catch (Exception e){

            throw new Exception(e.getMessage());

        }
    }

    @Override
    public Libros save(Libros entity) throws Exception {
        try{

            entity = librosRepository.save(entity);
            return entity;

        }catch (Exception e){

            throw new Exception(e.getMessage());

        }
    }

    @Override
    public Libros update(Long id, Libros entity) throws Exception {
        try{

            Optional<Libros> entityOptional = librosRepository.findById(id);
            Libros libros= entityOptional.get();
            libros = librosRepository.save(libros);
            return libros;

        }catch (Exception e){

            throw new Exception(e.getMessage());

        }
    }

    @Override
    public boolean delete(Long id) throws Exception {
        try{
            if(librosRepository.existsById(id)){
                librosRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
