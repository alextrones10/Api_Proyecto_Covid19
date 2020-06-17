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

import com.proyecto.entidad.Resultado;
import com.proyecto.servicio.ResultadoServicio;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/servicio/resultado")
public class ResultadoRestController {
	
	@Autowired
	private ResultadoServicio servicio;

    @GetMapping()
    public ResponseEntity<List<Resultado>> listaResultado() {
        return ResponseEntity.ok(servicio.listaResultado());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resultado> buscarPorId(@PathVariable int id) {
        Optional<Resultado> alumno = servicio.buscarResultadoPorId(id);
        if (!alumno.isPresent()) {
            return ResponseEntity.badRequest().build();
        }else {
        	return ResponseEntity.ok(alumno.get());	
        }
    }

    @PostMapping
    public ResponseEntity<Resultado> agregaResultado( @RequestBody Resultado obj) {
        return ResponseEntity.ok(servicio.insertaActualizaResultado(obj));
    }
    
    @PutMapping()
    public ResponseEntity<Resultado> actualizaUsuario(@RequestBody Resultado alumno) {
        if (!servicio.buscarResultadoPorId(alumno.getIdResultado()).isPresent()) {
            return ResponseEntity.badRequest().build();
        }else {
        	return ResponseEntity.ok(servicio.insertaActualizaResultado(alumno));	
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Resultado> eliminaResultado(@PathVariable int id) {
        if (!servicio.buscarResultadoPorId(id).isPresent()) {
            return ResponseEntity.badRequest().build();
        }else {
        	return ResponseEntity.ok().build();	
        }
    }
}
