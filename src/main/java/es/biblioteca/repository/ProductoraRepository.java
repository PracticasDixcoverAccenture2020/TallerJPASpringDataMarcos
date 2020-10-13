package es.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.biblioteca.entity.Productora;

@Repository
public interface ProductoraRepository extends JpaRepository<Productora, Integer> {

}
