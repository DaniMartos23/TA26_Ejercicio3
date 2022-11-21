package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Producto;

public interface IProductoService {
	//Metodos del CRUD
	public List<Producto> listarProductos(); //Listar All 
	
	public Producto guardarProducto(Producto producto);	//Guarda un producto CREATE
	
	public Producto productoXID(int codigo); //Leer datos de un producto READ
			
	public List<Producto> listarProductoNombre(String nombre);//Listar Productos por campo nombre
			
	public Producto actualizarProducto(Producto producto); //Actualiza datos del producto UPDATE
			
	public void eliminarProducto(int codigo);// Elimina el producto DELETE
}
