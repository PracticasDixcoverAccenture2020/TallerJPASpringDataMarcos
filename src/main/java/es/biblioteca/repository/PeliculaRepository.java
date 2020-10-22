package es.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.biblioteca.entity.Genero;
import es.biblioteca.entity.Pelicula;
import es.biblioteca.entity.Productora;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

	@Query("select p from Pelicula p where p.titulo like %?1")
	List<Pelicula> findByTitulo(String titulo);
	
	@Query(value = "SELECT * FROM PELICULA WHERE PRODUCTORA LIKE %?1", nativeQuery = true)
	List<Pelicula> findByProductora(Productora productora);
	
	@Query("select p from Pelicula p where p.genero = :generoPelicula")
	List<Pelicula> findByGenero(@Param("generoPelicula") Genero genero);
}