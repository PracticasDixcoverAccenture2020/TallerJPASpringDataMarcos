package es.biblioteca.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.api.DBRider;

import es.biblioteca.entity.Pelicula;
import es.biblioteca.repository.GeneroRepository;
import lombok.extern.slf4j.Slf4j;

@DataJpaTest
@Slf4j
@DBRider
@DisplayName("JUnit Test unitario implementación service Pelicula")
@ComponentScan("es.biblioteca.service.impl")
public class PeliculaServiceImplTest {

	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@Autowired
	GeneroRepository generoRepository;
	
	@Test
	@DataSet(value = "directores.yml, generos.yml, productoras.yml, peliculas.yml", cleanBefore = true, cleanAfter = true)
	@DisplayName("Test unitario buscar por genero")
	public void testGenero() {

		  List<Pelicula> peliculas = peliculaServiceImpl.findByGenero(generoRepository.getOne(9));

		  assertEquals(peliculas.size(),3);
	}
}
