package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contrasena;
import com.example.demo.services.ContrasenaService;

@RestController
public class ContrasenaController {
    
    @Autowired
    private ContrasenaService services;

    // Crear una nueva contraseña (Create)
    @PostMapping("/contrasena")
    public ResponseEntity<Contrasena> guardarContrasena(@RequestBody Contrasena contrasena) {
        return new ResponseEntity<Contrasena>(services.guardarContrasena(contrasena), HttpStatus.CREATED);
    }

    // Leer una contraseña por ID (Read)
    @GetMapping("/contrasena/{id}")
    public ResponseEntity<Contrasena> leerContrasena(@PathVariable Long id) {
        return services.leerUsuario(id);
    }

    // Leer todas las contraseñas (Read All)
    @GetMapping("/contrasenas")
    public ResponseEntity<List<Contrasena>> obtenerTodasLasContrasenas() {
        return services.obtenerUsuarios();
    }

    // Actualizar una contraseña por ID (Update)
    @PutMapping("/contrasena/{id}")
    public ResponseEntity<Contrasena> actualizarContrasena(@PathVariable Long id, @RequestBody Contrasena contrasena) {
        return services.actualizarUsuario(id, contrasena);
    }

    // Eliminar una contraseña por ID (Delete)
    @DeleteMapping("/contrasena/{id}")
    public ResponseEntity<Contrasena> eliminarContrasena(@PathVariable Long id) {
        return services.eliminarUsuario(id);
    }
    
    @Autowired
    private ContrasenaService service;

    // Endpoint para obtener la comisión según las ventas
    @GetMapping("/comision/{n_sales}")
    public String obtenerComision(@PathVariable int n_sales) {
        return service.obtenerComision(n_sales);
    }
    

    // Endpoint para obtener el ranking basado en la calificación
    @GetMapping("/ranking/{grade}")
    public String obtenerRanking(@PathVariable String grade) {
        return service.obtenerRanking(grade);
    }
    
}
