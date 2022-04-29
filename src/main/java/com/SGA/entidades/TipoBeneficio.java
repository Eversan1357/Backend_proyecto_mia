package com.SGA.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_beneficio")
public class TipoBeneficio {
   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="idTipoBeneficio")
    private  Long idTipoBeneficio;
	@Column(name="tipCodigo")
	private Long codigo;
    @Column(name="tipNombre")
    private String nombre;

	public TipoBeneficio(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdTipoBeneficio() {
		return idTipoBeneficio;
	}

	public void setIdTipoBeneficio(Long idTipoBeneficio) {
		this.idTipoBeneficio = idTipoBeneficio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public TipoBeneficio(Long codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public TipoBeneficio() {
		super();
	}
	


    
    
}