package com.SGA.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="departamento")
public class Departamento implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idDeparmento")
	private Long idDepartamento;
	@Column(name="depCodigo", unique=true)
	private int codigo;
	@NotEmpty(message = "El campo nombre es requerido")
	@Column(name="depNombre")
	private String nombre;
	@ManyToOne
	@JoinColumn(name="idPais")
	private Pais unPais;



	public Long getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Long idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getUnPais() {
		return unPais;
	}

	public void setUnPais(Pais unPais) {
		this.unPais = unPais;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Departamento(int codigo, @NotEmpty(message = "El campo nombre es requerido") String nombre, Pais unPais) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.unPais = unPais;
	}

	public Departamento() {
		super();
	}



	
	
	
}
