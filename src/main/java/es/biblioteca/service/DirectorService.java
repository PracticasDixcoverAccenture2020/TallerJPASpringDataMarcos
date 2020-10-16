package es.biblioteca.service;

import java.util.List;

import es.biblioteca.entity.Director;

public interface DirectorService {

	public List<Director> findAll();
	
	public List<Director> findByNacionalidad(String nacionalidad);
	
	public List<Director> findByNombre(String nombre);
	
	public Director findById(Integer id);
	
	public void deleteById(Integer id);
	
	public Director nuevoDirector(Integer id);
}
