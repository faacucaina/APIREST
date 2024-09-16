package com.example.inicial1.services;

import java.util.List;

public interface BaseService<E> {
    public List<E> findAll() throws Exception; //lista de todas las personas en la bd
    public E findById(Long id) throws Exception; //traernos una persona de acuerdo a su id
    public E save(E entity) throws Exception;// crea una nueva entidad enviandole una al repo
    public E update(Long id, E entity) throws Exception;
    public boolean delete (Long id) throws Exception;// eliminar un registro de la bd
}
