package com.SGA.controlador;

import com.SGA.entidades.Sede;
import com.SGA.servicio.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sede")
@CrossOrigin("*")
public class SedeController {

    @Autowired
    private SedeService sedeservice;

    @GetMapping("/listar")
    public List<Sede> listarSede(){
        return sedeservice.findAll();
    }

    @GetMapping(value={"/listarfiltro/{id_municipio}/{sed_zona}"})
    public List<Sede> listarsedes1(@PathVariable("id_municipio")Long id_municipio, @PathVariable("sed_zona") String sed_zona ){
        return sedeservice.listarSedes1(id_municipio , sed_zona);
    }
}
