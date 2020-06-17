package com.proyecto.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entidad.Usuario;
import com.proyecto.servicio.UsuarioServicio;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/servicio/usuario")
public class UsuarioRestController {
	
	@Autowired
	private UsuarioServicio servicio;

    @GetMapping()
    public ResponseEntity<List<Usuario>> listaUsuario() {
        return ResponseEntity.ok(servicio.listaUsuario());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable int id) {
        Optional<Usuario> alumno = servicio.buscarUsuarioPorId(id);
        if (!alumno.isPresent()) {
            return ResponseEntity.badRequest().build();
        }else {
        	return ResponseEntity.ok(alumno.get());	
        }
    }

    @PostMapping
    public ResponseEntity<Usuario> agregaUsuario( @RequestBody Usuario obj) {
        return ResponseEntity.ok(servicio.insertaActualizaUsuario(obj));
    }
    
    @PutMapping()
    public ResponseEntity<Usuario> actualizaUsuario(@RequestBody Usuario alumno) {
        if (!servicio.buscarUsuarioPorId(alumno.getIdUsuario()).isPresent()) {
            return ResponseEntity.badRequest().build();
        }else {
        	return ResponseEntity.ok(servicio.insertaActualizaUsuario(alumno));	
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> eliminaUsuario(@PathVariable int id) {
        if (!servicio.buscarUsuarioPorId(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }else {
        	return ResponseEntity.ok().build();	
        }
    }
}
