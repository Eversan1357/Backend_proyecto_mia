package com.SGA.entidades;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Getter
@Setter
@Entity
@Table(name = "usuarios", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }),
		@UniqueConstraint(columnNames = { "email" }) })
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String username;

	private String email;
	
	private String password;



	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL) // EAGER PORQUE SIEMPRE VA A ESTAR ANSIOSA, NO SERA
																	// UNA CARGA PEREZOSA
	@JoinTable(name = "usuario_roles", joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id"))
	private Set<Rol> roles = new HashSet<>();
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_Persona")
	private Persona unaPersona;
	

    public void genearPassword(){
        String minusculas= "abcdefghijklmnopqrstuvwxyz";
        String mayusculas="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String dijitos="0123456789";
        String especiales="@#$%&?";
        String passwordGenerado="";
        for(int i=0;i<2;i++){
            Random aleatorio= new Random();
            int posmin= aleatorio.nextInt(minusculas.length());
            int posmay=aleatorio.nextInt(mayusculas.length());
            int posDigitos= aleatorio.nextInt(dijitos.length());
            int posEspeciales= aleatorio.nextInt(especiales.length());
            
            passwordGenerado+=minusculas.substring(posmin,posmin+1)+
                    mayusculas.substring(posmay,posmay+1)+
                    dijitos.substring(posDigitos,posDigitos+1)+
                    especiales.substring(posEspeciales,posEspeciales+1);
        }
        
        this.password=passwordGenerado;
    }
	public Usuario() {
		super();
	}

	
}
