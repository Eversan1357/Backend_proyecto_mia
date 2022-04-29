package com.SGA.entidades;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="jornada")
public class Jornada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idJornada")
	private Long idJornada;
	@Column(name="jorCodigo")
	private Long codigo;
	@Column(name="nombre", unique = true)
	@NotEmpty(message ="El campo no debe de ser vacio")
	private String nombre;
	public Long getIdJornada() {
		return idJornada;
	}
	public void setIdJornada(Long idJornada) {
		this.idJornada = idJornada;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	public Jornada() {
		super();
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Jornada(Long codigo, @NotEmpty(message = "El campo no debe de ser vacio") String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
}
