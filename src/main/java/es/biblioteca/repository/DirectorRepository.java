package es.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.biblioteca.entity.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Integer> {

	@Query("select d from Director d where d.nombre like %?1")
	List<Director> findByNombre(String nombre);
	
	@Query("select d from Director d where d.nacionalidad like %?1")
	List<Director> findByNacionalidad(String nacionalidad);
}
