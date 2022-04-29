package com.SGA.entidades;


import java.io.Serializable;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity //le decimos a java que es una entidad
@Table(name="persona") // para que nos cree la tabla user en la base de datos
public class Persona implements Serializable {
	
	private static final long serialVersionUID = 3499113360580787796L;
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY) //le decimos que va a ser de tipo autoincrementable
	@Column(name="idPersona")
	private Long idPersona;
	@ManyToOne()
	@JoinColumn(name="idTipoDumento")
	private TipoDocumento unTipoDocumento;
	@NotEmpty(message="El campo no debe ser vacio")
	@Size(max=50, message = "El campo debe tener un maximo de 10 caracteres")
	@Column(length = 50, name="perNumeroDocumento")
	private String numeroDocumento;
	@NotEmpty(message="El campo no debe ser vacio")
	@Column(length = 50, name="perNombre")
	private String nombre;
	@NotEmpty(message="El campo no debe ser vacio")
	@Size(max=50, message = "El campo debe tener un maximo de 50 caracteres")
	@Column(length = 50, name="perApellido")
	private String apellido;
	@NotEmpty(message="El campo no debe ser vacio")
	@Column(length = 50,name="perFechaNacimiento")
	private String fechaNacimiento;
	@ManyToOne()
	@JoinColumn(name="idMunicipio_LugarNacimimiento" )
	private Municipio lugarDeNacimiento;
	@NotNull 
	@Size(max=50, message = "El campo debe tener un maximo de 50 caracteres")
	@Column(length = 10, name="perTelefono")
	private String telefono;
	@NotNull 
	@Size(max=50, message = "El campo debe tener un maximo de 50 caracteres")
	@Column(length = 50, name="perDireccion")
	private String direccion;
	@NotNull 
	@Size(max=50, message = "El campo debe tener un maximo de 50 caracteres")
	@Column(length = 50, name="perBarrio")
	private String barrio;
	@Column(length = 50, name="perFechaCreacion")
	private String fechaCreacion;
	@Column(length = 50, name="perFechaModificacion")
	private String fechaModificacion;
	@Column(length = 50, name="perEstado")
	private String estado;
	
	public Persona(Long idPersona, TipoDocumento unTipoDocumento,
			@NotEmpty(message = "El campo no debe ser vacio") @Size(max = 50, message = "El campo debe tener un maximo de 10 caracteres") String numeroDocumento,
			@NotEmpty(message = "El campo no debe ser vacio") String nombre,
			@NotEmpty(message = "El campo no debe ser vacio") @Size(max = 50, message = "El campo debe tener un maximo de 50 caracteres") String apellido,
			@NotEmpty(message = "El campo no debe ser vacio") String fechaNacimiento,
			Municipio lugarDeNacimiento,
			@NotNull @Pattern(regexp = "[0-9]", message = "Campo numerico minimo 5 caracteres y maximo 10 caracteres") String telefono,
			@NotNull @Size(max = 50, message = "El campo debe tener un maximo de 50 caracteres") String direccion,
			@NotNull @Size(max = 50, message = "El campo debe tener un maximo de 50 caracteres") String barrio,
			String fechaCreacion, String fechaModificacion, String estado) {
		this.idPersona = idPersona;
		this.unTipoDocumento = unTipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.lugarDeNacimiento = lugarDeNacimiento;
		this.telefono = telefono;
		this.direccion = direccion;
		this.barrio = barrio;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estado = estado;
	}
	
	public Persona() {
		super();
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public TipoDocumento getUnTipoDocumento() {
		return unTipoDocumento;
	}

	public void setUnTipoDocumento(TipoDocumento unTipoDocumento) {
		this.unTipoDocumento = unTipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Municipio getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}

	public void setLugarDeNacimiento(Municipio lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
