package com.SGA.servicio;

import com.SGA.entidades.TipoDiscapacidad;
import com.SGA.repositorio.TipoDiscapacidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscapacidadService {

    @Autowired
    private TipoDiscapacidadRepository discapacidadrepository;

    public List<TipoDiscapacidad> listarDiscapacidad(){
        return discapacidadrepository.findAll();
    }
}
