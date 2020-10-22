package es.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.biblioteca.entity.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {

	@Query("select g from Genero g where g.nombre like %?1")
	List<Genero> findByNombre(String nombre);
}
