package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.documentos.Producto;

public interface ProductoRepository extends MongoRepository<Producto, Integer> {

}
