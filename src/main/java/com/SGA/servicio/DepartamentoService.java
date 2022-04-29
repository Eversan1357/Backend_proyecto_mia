package com.SGA.servicio;

import com.SGA.entidades.Departamento;
import com.SGA.repositorio.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired

    private DepartamentoRepository departamentorepository;

    public List<Departamento> listarDepartamento(){
        return departamentorepository.findAll();
    }
}
