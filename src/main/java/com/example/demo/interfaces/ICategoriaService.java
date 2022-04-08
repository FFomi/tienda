package com.example.demo.interfaces;

import java.util.ArrayList;

import com.example.demo.model.Categoria;

public interface ICategoriaService {
	
	public void add_categoria (Categoria categoria);
	public Categoria busqueda_id_categoria(int id_categoria);
	public void modificar_categoria (Categoria categoria);
	public void eliminar_categoria_by_id (int id_categoria);
	public ArrayList<Categoria> listado_categoria();
	

}
