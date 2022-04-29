package com.SGA.servicio;

import com.SGA.entidades.Usuario;
import com.SGA.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired

    private UsuarioRepositorio usuariorepository;

    public List<Usuario> listarUsuarios() {
        return usuariorepository.findAll();
    }

    public void guardarUsuarios (Usuario usuario){
        usuariorepository.save(usuario);
    }

    public Usuario obtenerUsuariosporId(Long id){
        return usuariorepository.findById(id).get();
    }

    public void eliminarUsuario (Long id){
         usuariorepository.deleteById(id);
    }



}
