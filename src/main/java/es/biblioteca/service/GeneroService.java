package es.biblioteca.service;

import java.util.List;

import es.biblioteca.entity.Genero;

public interface GeneroService {

	public List<Genero> findAll();
	
	public List<Genero> findByNombre(String nombre);
	
	public Genero findById(Integer id);
	
	public void deleteById(Integer id);
	
	public Genero nuevoGenero(Genero genero);
}
