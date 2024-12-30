package com.challengealura.findbook.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(unique = true)
    private String nombre;
    private Integer fechaNacimiento;
    private Integer fechaFallecimiento;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@Transient
    private List<Libro> librosDelAutor;

    public Autor(){

    }

    public Autor(DatosDelAutor datosDelAutor) {
        try {
            this.nombre = datosDelAutor.nombre() != null ? datosDelAutor.nombre() : "Nombre desconocido";
            this.fechaNacimiento = datosDelAutor.fechaNacimiento() != null
                    ? datosDelAutor.fechaNacimiento()
                    : Integer.valueOf("Fecha de nacimiento desconocida");
            this.fechaFallecimiento = datosDelAutor.fechaFallecimiento() != null
                    ? datosDelAutor.fechaFallecimiento()
                    : Integer.valueOf("Fecha de fallecimiento desconocida");
        } catch (Exception e) {
            System.err.println("Error al procesar los datos del autor: " + e.getMessage());
        }
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = Integer.valueOf(fechaNacimiento != null ? fechaNacimiento : "Fecha de nacimiento desconocida");
    }

    public void setFechaFallecimiento(String fechaFallecimiento) {
        this.fechaFallecimiento = Integer.valueOf(fechaFallecimiento != null ? fechaFallecimiento : "Fecha de fallecimiento desconocida");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Integer getFechaFallecimiento() {
        return fechaFallecimiento;
    }


    public List<String> getLibrosDelAutor() {
        return librosDelAutor.stream()
                .map(libro -> libro.getTitulo())
                .collect(Collectors.toList());
    }

    public void setLibrosDelAutor(Libro libro) {
        librosDelAutor = new ArrayList<>();
        librosDelAutor.add(libro);
        libro.setAutor(this);
    }

    @Override
    public String toString(){
        return
                "Autor = " + nombre +
                        "\nFecha de Nacimiento: " + fechaNacimiento +
                        "\nFecha de Fallecimiento: " + fechaFallecimiento +
                        "\nLibros: " + getLibrosDelAutor() +
                        "\n-------------------------------------------";
    }

}

