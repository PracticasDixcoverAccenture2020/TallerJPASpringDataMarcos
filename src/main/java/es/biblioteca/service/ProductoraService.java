package es.biblioteca.service;

import java.util.List;

import es.biblioteca.entity.Productora;

public interface ProductoraService {

	public List<Productora> findAll();
	
	public Productora findById(Integer id);
	
	public List<Productora> findByNombre(String nombre);
	
	public List<Productora> findByPais(String pais);
	
	public void deleteById(Integer id);
	
	public Productora nuevoProductora(Productora productora);
}
