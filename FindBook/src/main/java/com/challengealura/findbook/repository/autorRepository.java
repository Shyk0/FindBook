package com.challengealura.findbook.repository;

import com.challengealura.findbook.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface autorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNombreContainsIgnoreCase(String nombreAutor);

    @Query("SELECT a FROM Autor a WHERE a.fechaNacimiento <= :segundaFecha AND (a.fechaFallecimiento IS NULL OR a.fechaFallecimiento >= :primeraFecha) ORDER BY a.fechaNacimiento")
    List<Autor> buscarAutorVivoEnDeterminadaFecha(Integer primeraFecha, Integer segundaFecha);

    @Query("SELECT a.nombre, COUNT(l.titulo) FROM Autor a JOIN Libro l ON a.id = l.id GROUP BY a.nombre ORDER BY 2 DESC")
    List<Autor> consultarCantidadDeLibrosPorAutor();


}
