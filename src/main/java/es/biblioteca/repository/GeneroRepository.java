package es.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.biblioteca.entity.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {

}
