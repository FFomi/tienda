package com.example.demo.documentos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Producto {
	
	@Id
	private int id;
	private int id_categoria;
	private String producto;
	private double precio;
	
	public Producto() {
		super();
	}

	public Producto(int id, int id_categoria, String producto, double precio) {
		super();
		this.id = id;
		this.id_categoria = id_categoria;
		this.producto = producto;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", id_categoria=" + id_categoria + ", producto=" + producto + ", precio=" + precio
				+ "]";
	}
	
	
	
	
}
