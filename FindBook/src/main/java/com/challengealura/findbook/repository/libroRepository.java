package com.challengealura.findbook.repository;

import com.challengealura.findbook.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface libroRepository extends JpaRepository<Libro, Long> {
    boolean existsByTitulo(String titulo);

    List<Libro> findByIdioma(String idioma);

}
