package com.SGA.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipodiscapacidad")
public class TipoDiscapacidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idTipoDiscapacidad")
	private Long idTipoDiscapacidad;
	@Column(name="tipCodigo")
	private Long codigo;
	@Column(name="tipNombre")
	private String nombre;
	public Long getIdTipoDiscapacidad() {
		return idTipoDiscapacidad;
	}
	public void setIdTipoDiscapacidad(Long idTipoDiscapacidad) {
		this.idTipoDiscapacidad = idTipoDiscapacidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoDiscapacidad() {
		super();
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public TipoDiscapacidad(Long codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	
}
