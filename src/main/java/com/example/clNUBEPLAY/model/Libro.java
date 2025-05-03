package com.example.clNUBEPLAY.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libro")

public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(length = 255, unique = true, nullable = false)
    private String isbn;

    @Column(nullable = false)
    private String titulo;  
    private String editorial;
    private String autor;

    @Column(name = "created_at", nullable = false)
    private int fechaPublicacion;
    
}

//CREATE TABLE libro (
//    id INT AUTO_INCREMENT PRIMARY KEY,
//    isbn VARCHAR(255) NOT NULL UNIQUE,
//    titulo VARCHAR(255) NOT NULL,
//    editorial VARCHAR(255),
//    autor VARCHAR(255),
//    created_at DATE NOT NULL
//);







