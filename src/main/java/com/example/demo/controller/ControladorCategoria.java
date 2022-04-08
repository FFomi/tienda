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

import com.example.demo.interfaces.ICategoriaService;
import com.example.demo.model.Categoria;

@RestController
@RequestMapping("/categoria")
public class ControladorCategoria {
	
	@Autowired
	ICategoriaService categoriaservice;

	@GetMapping("/list_all")
	public ArrayList<Categoria> get_categoria() {
		return categoriaservice.listado_categoria();
	}

	@PostMapping("/add")
	public Integer add_id_categoria(@RequestBody Categoria categoria) {
		Categoria categoriaaux = categoriaservice.busqueda_id_categoria(categoria.getId_categoria());
		if (categoriaaux == null) {
			categoriaservice.add_categoria(categoria);
			return 0;
		} else {
			return 1;
		}
	}

	@GetMapping("/find_by_id_categoria/{id_categoria}")
	public Categoria get_categoria_by_id(@PathVariable("id_categoria") int id_categoria) {
		Categoria categoriaaux = categoriaservice.busqueda_id_categoria(id_categoria);
		if (categoriaaux == null) {
			return new Categoria();
		} else {
			return categoriaservice.busqueda_id_categoria(id_categoria);
		}
	}

	@GetMapping("/delete_by_id_categoria/{id_categoria}")
	public Integer delete_categoria_by_id(@PathVariable("id_categoria") int id_categoria) {
		Categoria categoriaaux = categoriaservice.busqueda_id_categoria(id_categoria);
		if (categoriaaux == null) {
			return 1;
		} else {
			categoriaservice.eliminar_categoria_by_id(id_categoria);
			return 0;
		}
	}

	@PutMapping("/update")
	public Integer update_categoria(@RequestBody Categoria categoria) {
		System.out.println(categoria);
		Categoria categoriaaux = categoriaservice.busqueda_id_categoria(categoria.getId_categoria());
		if (categoriaaux == null) {
			return 1;
		} else {
			categoriaservice.modificar_categoria(categoria);
			return 0;
		}
	}


}
