package es.biblioteca.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Director {

	@Id
	private Integer id;

	private String nombre;

	private String nacionalidad;

	@ManyToMany(mappedBy = "directores")
	List<Pelicula> peliculas;
}
