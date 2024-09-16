package com.example.inicial1.repositories;

import com.example.inicial1.entities.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Long> {
}
