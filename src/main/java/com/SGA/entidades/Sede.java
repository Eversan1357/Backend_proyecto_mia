package com.SGA.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="sede")
public class Sede {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_sede")
	private Long idSede;
	@Column(name="sedConDane", unique = true)
	private Long codDane;
	@Column(name="sedConsecutivo", unique = true)
	private Long consecutivo;
	@NotEmpty(message="El campo no debe ser vacio")
	@Size(max=100, message = "El campo debe tener un maximo de 50 caracteres")
	@Column(name="sedNombre", unique = true)
	private String nombre;
	@NotEmpty(message="El campo no debe ser vacio")
	@Size(max=50, message = "El campo debe tener un maximo de 50 caracteres")
	@Column(name="sedZona")
	private String zona;
	@JoinColumn(name="idUsuario_Coordinador")
	@ManyToOne
	private Usuario coordinador;
	@JoinColumn(name="id_municipio")
	@ManyToOne
	private Municipio municipio;
	@JoinColumn(name="idInstitucion")
	@ManyToOne
	private Institucion unaInstitucion;
	public Long getIdSede() {
		return idSede;
	}
	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}
	public Long getCodDane() {
		return codDane;
	}
	public void setCodDane(Long codDane) {
		this.codDane = codDane;
	}
	public Long getConsecutivo() {
		return consecutivo;
	}
	public void setConsecutivo(Long consecutivo) {
		this.consecutivo = consecutivo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Usuario getCoordinador() {
		return coordinador;
	}
	public void setCoordinador(Usuario coordinador) {
		this.coordinador = coordinador;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public Institucion getUnaInstitucion() {
		return unaInstitucion;
	}
	public void setUnaInstitucion(Institucion unaInstitucion) {
		this.unaInstitucion = unaInstitucion;
	}
	
	
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public Sede(
			@NotEmpty(message = "El campo no debe ser vacio") @Size(message = "El campo debe tener un maximo de 50 caracteres") Long codDane,
			@NotEmpty(message = "El campo no debe ser vacio") @Size(message = "El campo debe tener un maximo de 50 caracteres") Long consecutivo,
			@NotEmpty(message = "El campo no debe ser vacio") @Size(max = 50, message = "El campo debe tener un maximo de 50 caracteres") String nombre,
			Usuario coordinador, @NotEmpty(message = "El campo no debe ser vacio") Municipio municipio,
			Institucion unaInstitucion) {
		super();
		this.codDane = codDane;
		this.consecutivo = consecutivo;
		this.nombre = nombre;
		this.coordinador = coordinador;
		this.municipio = municipio;
		this.unaInstitucion = unaInstitucion;
	}
	public Sede() {
		super();
	}
	
	
}
