package es.biblioteca.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.api.DBRider;

import es.biblioteca.entity.Pelicula;
import lombok.extern.slf4j.Slf4j;

@DataJpaTest
@Slf4j
@DBRider
@DisplayName("JUnit Test unitario repositorio Pelicula")
public class PeliculaRepositoryTest {

	@Autowired
	PeliculaRepository peliculaRepository;
	
	@Test
	@DataSet(value = "directores.yml, generos.yml, productoras.yml, peliculas.yml", cleanBefore = true, cleanAfter = true)
	@DisplayName("Test unitario buscar todos")
	public void testFindAll() {

		  List<Pelicula> peliculas = peliculaRepository.findAll();

		  assertEquals(peliculas.size(),6);
	}
}
