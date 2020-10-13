package es.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.biblioteca.entity.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

}
