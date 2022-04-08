package com.example.demo.interfaces;

import java.util.ArrayList;

import com.example.demo.documentos.Producto;

public interface IProductoService {
	
	public void add_producto (Producto producto);
	public Producto busqueda_id_producto(int id);
	public void modificar_producto (Producto producto);
	public void eliminar_producto_by_id (int id);
	public ArrayList<Producto> listado_producto();

}
