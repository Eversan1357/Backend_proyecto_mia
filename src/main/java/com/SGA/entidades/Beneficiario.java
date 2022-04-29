package com.SGA.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="beneficiario")
public class Beneficiario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY) //le decimos que va a ser de tipo autoincrementable
	@Column(name="idBeneficiaro")
	private Long idBeneficiario;

	@OneToOne
	@JoinColumn(name="idEstudiante")
	private Estudiante unEstudiante;

	@ManyToOne
	@JoinColumn(name="idSede")
	private Sede unaSede;

	@ManyToOne
	private TipoBeneficio tipoBeneficio;
	
	@Column(length = 50, name="benFechaInicio")
	private String fechaInicio;
	@Size(max=50, message = "El campo debe tener un maximo de 10 caracteres")

	@Column(length = 50, name="benFechaFin")
	private String fechaFin;

	@Column(length = 50, name="benFechaCreacion")
	private String fechaCreacion;

	@Column(length = 50, name="benFechaModificacion")
	private String fechaModificacion;

	@Column(length = 50, name="benEstado")
	private String estado;

}
