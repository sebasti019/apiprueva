package com.example.clNUBEPLAY.controller;

import com.example.clNUBEPLAY.model.Libro;
import com.example.clNUBEPLAY.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping ("/api/v1/libros")


public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros(){
        return libroService.getLibros();
    }
    
    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @GetMapping("{id}")
    public Libro buscaLibro(@PathVariable int id) {
        return libroService.getLibroId(id);
    }
    
    @PutMapping("{id}")
    public Libro actualizaLibro(@PathVariable int id,@RequestBody Libro libro) {
        return libroService.updateLibro(libro);
    }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id) {
        return libroService.deleteLibro(id);
    }
    
    @GetMapping("/total")
    public int totalLibrosV2(){
        return libroService.totalLibrosV2();
    }

    @GetMapping("/buscarporanio")
    public int contarLibrosPorAnio(){
        return libroService.contarLibrosPorAnio();
    }

}
