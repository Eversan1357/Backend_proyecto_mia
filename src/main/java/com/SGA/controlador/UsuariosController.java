package com.SGA.controlador;

import com.SGA.entidades.Usuario;
import com.SGA.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin("*")
public class UsuariosController {

    @Autowired
    private UsuarioService usuarioservice;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios(){
        return usuarioservice.listarUsuarios();
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Usuario> obtenerUsuarios (@PathVariable Long id){
        try{
            Usuario usuario = usuarioservice.obtenerUsuariosporId(id);
            return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);

        }catch (Exception exception){
            return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizarUsuarios(@RequestBody Usuario usuario, @PathVariable Long id){
        try{
            Usuario usuarioExistente = usuarioservice.obtenerUsuariosporId(id);
            usuarioExistente.setPassword(usuario.getPassword());
            usuarioExistente.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuarioExistente.setEmail(usuario.getEmail());
            usuarioExistente.setUsername(usuario.getUsername());
            usuarioservice.guardarUsuarios(usuarioExistente);
            return new ResponseEntity<Usuario>(HttpStatus.OK);

        } catch (Exception exception){
            return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
        }
    }







}









