package es.biblioteca.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Genero {

	@Id
	private Integer id;
	
	private String nombre;
	
	@OneToMany(mappedBy="genero")
    private List<Pelicula> peliculas;
}
