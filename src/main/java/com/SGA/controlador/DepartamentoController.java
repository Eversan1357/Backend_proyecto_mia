package com.SGA.controlador;

import com.SGA.entidades.Departamento;
import com.SGA.servicio.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departamento")
@CrossOrigin("*")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoservice;

    @GetMapping("/listar")
    public List<Departamento> listarDepartamento(){
        return departamentoservice.listarDepartamento();
    }
}
