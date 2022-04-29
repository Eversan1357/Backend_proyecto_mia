package com.SGA.controlador;

import com.SGA.entidades.Municipio;
import com.SGA.servicio.MunicipioService;
import com.SGA.servicio.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/municipios")
@CrossOrigin("*")
public class MunicipioController {

    @Autowired
    private MunicipioService municipioservice;

    @GetMapping("/listar")
    public List<Municipio> listarMunicipio(){
        return municipioservice.listarMunicipio();
    }

}
