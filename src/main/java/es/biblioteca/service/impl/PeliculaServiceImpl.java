package es.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import es.biblioteca.entity.Genero;
import es.biblioteca.entity.Pelicula;
import es.biblioteca.entity.Productora;
import es.biblioteca.repository.PeliculaRepository;
import es.biblioteca.service.PeliculaService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PeliculaServiceImpl implements PeliculaService {

	@Autowired
	private PeliculaRepository peliculaRepository; 
	
	@Override
	public List<Pelicula> findAll() {
		log.debug("Se obtienen todas las películas");
		return peliculaRepository.findAll();
	}

	@Override
	public List<Pelicula> findByExample(Pelicula pelicula) {
		log.debug("Se obtienen todas las películas coincidentes");
		Example<Pelicula> exPelicula = Example.of(pelicula);
		return peliculaRepository.findAll(exPelicula);
	}

	@Override
	public Pelicula findById(Integer id) {
		log.debug("Se obtienen la película de id: " + id);
		return peliculaRepository.getOne(id);
	}

	@Override
	public List<Pelicula> findByTitulo(String titulo) {
		log.debug("Se obtienen todas las películas con título: " + titulo);
		return peliculaRepository.findByTitulo(titulo);
	}

	@Override
	public List<Pelicula> findByProductora(Productora productora) {
		log.debug("Se obtienen todas las películas de la productora: " + productora.getNombre());
		return peliculaRepository.findByProductora(productora);
	}

	@Override
	public List<Pelicula> findByGenero(Genero genero) {
		log.debug("Se obtienen todas las películas de género: " + genero.getNombre());
		return peliculaRepository.findByGenero(genero);
	}

	
}
