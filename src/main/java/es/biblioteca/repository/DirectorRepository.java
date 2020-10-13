package es.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.biblioteca.entity.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Integer> {

}
