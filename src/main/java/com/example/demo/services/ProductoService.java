package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.documentos.Producto;
import com.example.demo.interfaces.IProductoService;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	ProductoRepository productorepository;
	
	@Override
	public void add_producto(Producto producto) {
		productorepository.save(producto);

	}

	@Override
	public Producto busqueda_id_producto(int id) {
		return productorepository.findById(id).orElse(null);
	}

	@Override
	public void modificar_producto(Producto producto) {
		productorepository.save(producto);

	}

	@Override
	public void eliminar_producto_by_id(int id) {
		productorepository.deleteById(id);

	}

	@Override
	public ArrayList<Producto> listado_producto() {
		return (ArrayList<Producto>)productorepository.findAll();
	}

}
