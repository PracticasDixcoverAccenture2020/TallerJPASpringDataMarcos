package es.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.biblioteca.entity.Productora;

@Repository
public interface ProductoraRepository extends JpaRepository<Productora, Integer> {

	@Query("select p from Productora p where p.nombre like %?1")
	List<Productora> findByNombre(String nombre);
	
	@Query("select p from Productora p where p.pais like %?1")
	List<Productora> findByPais(String pais);
}