package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.documentos.Producto;
import com.example.demo.interfaces.IProductoService;


@RequestMapping("/productos")
@RestController
public class ControladorProducto {
	
	@Autowired
	IProductoService productoservice;
	
	@PostMapping("/add")
	public int add(@RequestBody Producto producto) {
		productoservice.add_producto(producto);
		return 0;
	}
	
	@GetMapping("/list_all")
	public ArrayList<Producto> get_producto() {
		return productoservice.listado_producto();
	}
	
	@GetMapping("/find_by_id/{id}")
	public Producto get_producto_by_id(@PathVariable("id") int id) {
		Producto productoaux = productoservice.busqueda_id_producto(id);
		if (productoaux == null) {
			return new Producto();
		} else {
			return productoservice.busqueda_id_producto(id);
		}
	}

	@GetMapping("/delete_by_id/{id}")
	public Integer delete_producto_by_id(@PathVariable("id") int id) {
		Producto productoaux = productoservice.busqueda_id_producto(id);
		if (productoaux == null) {
			return 1;
		} else {
			productoservice.eliminar_producto_by_id(id);
			return 0;
		}
	}

	@PutMapping("/update")
	public Integer update_producto(@RequestBody Producto producto) {
		System.out.println(producto);
		Producto productoaux = productoservice.busqueda_id_producto(producto.getId());
		if (productoaux == null) {
			return 1;
		} else {
			productoservice.modificar_producto(producto);
			return 0;
		}
	}


}
