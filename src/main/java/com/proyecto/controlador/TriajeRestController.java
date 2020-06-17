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

import com.proyecto.entidad.Triaje;
import com.proyecto.servicio.TriajeServicio;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/servicio/triaje")
public class TriajeRestController {

	@Autowired
	private TriajeServicio servicio;

    @GetMapping()
    public ResponseEntity<List<Triaje>> listaTriaje() {
        return ResponseEntity.ok(servicio.listaTriaje());
    }

    @PostMapping
    public ResponseEntity<Triaje> agregaTriaje( @RequestBody Triaje obj) {
        return ResponseEntity.ok(servicio.insertaActualizaTriaje(obj));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Triaje> buscarPorId(@PathVariable int id) {
        Optional<Triaje> triaje = servicio.buscarTriajePorId(id);
        if (!triaje.isPresent()) {
            return ResponseEntity.badRequest().build();
        }else {
        	return ResponseEntity.ok(triaje.get());	
        }
    }

    @PutMapping()
    public ResponseEntity<Triaje> actualizaTriaje(@RequestBody Triaje triaje) {
        if (!servicio.buscarTriajePorId(triaje.getIdTriaje()).isPresent()) {
            return ResponseEntity.badRequest().build();
        }else {
        	return ResponseEntity.ok(servicio.insertaActualizaTriaje(triaje));	
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Triaje> eliminaTriaje(@PathVariable int id) {
        if (!servicio.buscarTriajePorId(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }else {
        	return ResponseEntity.ok().build();	
        }
    }
	
}
