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
@Table(name="institucion")
public class Institucion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idInstitucion")
	private Long idInstitucion;
	@Column(name="insCodDane")
	private Long  codDane;
	@NotEmpty(message="El campo no debe ser vacio")
	@Column(name="insNombre")
	@Size(max=200, message = "El campo debe tener un maximo de 50 caracteres")
	private String nombre;
	@Column(name="insNaturaleza")
	@Size(max=50, message = "El campo debe tener un maximo de 50 caracteres")
	private String naturaleza;
	@ManyToOne
	@JoinColumn(name="insRector")
	private Usuario rector;
	@ManyToOne
	@JoinColumn(name="idDepartamento")
    private Departamento departamento;
	@ManyToOne
	@JoinColumn(name="idMunicipio")
    private Municipio unMunicipio;
    @Column(length = 50, name="insFechaCreacion")
	private String fechaCreacion;
	@Column(length = 50, name="insFechaModificacion")
	private String fechaModificacion;
	@Column(length = 50, name="insEstado")
	private String estado;
	public Long getCodDane() {
		return codDane;
	}
	public void setCodDane(Long codDane) {
		this.codDane = codDane;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Usuario getRector() {
		return rector;
	}
	public void setRector(Usuario rector) {
		this.rector = rector;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getIdInstitucion() {
		return idInstitucion;
	}
	public void setIdInstitucion(Long idInstitucion) {
		this.idInstitucion = idInstitucion;
	}
	public String getNaturaleza() {
		return naturaleza;
	}
	public void setNaturaleza(String naturaleza) {
		this.naturaleza = naturaleza;
	}

	public Municipio getUnMunicipio() {
		return unMunicipio;
	}
	public void setUnMunicipio(Municipio unMunicipio) {
		this.unMunicipio = unMunicipio;
	}
	public Institucion(
			@NotEmpty(message = "El campo no debe ser vacio") @Size(max = 50, message = "El campo debe tener un maximo de 50 caracteres") Long codDane,
			@NotEmpty(message = "El campo no debe ser vacio") @Size(max = 50, message = "El campo debe tener un maximo de 50 caracteres") String nombre,
			@Size(max = 50, message = "El campo debe tener un maximo de 50 caracteres") String naturaleza,
			Usuario rector, Departamento departamento, Municipio unMunicipio, String fechaCreacion,
			String fechaModificacion, String estado) {
		super();
		this.codDane = codDane;
		this.nombre = nombre;
		this.naturaleza = naturaleza;
		this.rector = rector;
		this.departamento = departamento;
		this.unMunicipio = unMunicipio;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	public Institucion() {
		super();
	}

	
	
	
	
}
	
