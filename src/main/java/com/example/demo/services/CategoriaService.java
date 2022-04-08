package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.ICategoriaService;
import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;


@Service
public class CategoriaService implements ICategoriaService {
	
	@Autowired
	CategoriaRepository categoriarepository;

	@Override
	public void add_categoria(Categoria categoria) {
		categoriarepository.save(categoria);

	}

	@Override
	public Categoria busqueda_id_categoria(int id_categoria) {
		return categoriarepository.findById(id_categoria).orElse(null);

	}

	@Override
	public void modificar_categoria(Categoria categoria) {
		categoriarepository.save(categoria);

	}

	@Override
	public void eliminar_categoria_by_id(int id_categoria) {
		categoriarepository.deleteById(id_categoria);

	}

	@Override
	public ArrayList<Categoria> listado_categoria() {
		return (ArrayList<Categoria>)categoriarepository.findAll();
	}

}
