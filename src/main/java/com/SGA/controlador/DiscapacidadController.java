package com.SGA.controlador;

import com.SGA.entidades.TipoDiscapacidad;
import com.SGA.servicio.DiscapacidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/discapacidad")
@CrossOrigin("*")
public class DiscapacidadController {

    @Autowired
    private DiscapacidadService discapacidadservice;

    @GetMapping("/listar")
    public List<TipoDiscapacidad> listarDiscapacidad(){
        return discapacidadservice.listarDiscapacidad();
    }

}
