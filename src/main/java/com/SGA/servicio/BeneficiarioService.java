package com.SGA.servicio;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Repository;

import com.SGA.entidades.Beneficiario;

@Repository
public interface BeneficiarioService{ 

    public List<Beneficiario> findAll();
}