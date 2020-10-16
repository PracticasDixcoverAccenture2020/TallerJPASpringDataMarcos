package es.biblioteca.service;

import java.util.List;

import es.biblioteca.entity.Genero;
import es.biblioteca.entity.Pelicula;
import es.biblioteca.entity.Productora;

public interface PeliculaService {

	public List<Pelicula> findAll();
	
	public List<Pelicula> findByExample(Pelicula pelicula);
	
	public Pelicula findById(Integer id);
	
	public List<Pelicula> findByTitulo(String titulo);
	
	public List<Pelicula> findByProductora(Productora productora);
	
	public List<Pelicula> findByGenero(Genero genero);
}
