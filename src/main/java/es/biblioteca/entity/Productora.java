package es.biblioteca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Productora {
	
	@Id
	private Integer id;
	
	@Column(name = "nombre", nullable = false, length = 150)
	private String nombre;
	
	private String pais;
	
	
}
