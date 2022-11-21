package com.crud.http.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.http.dto.Producto;
import com.crud.http.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api")

public class ProductoController {

	@Autowired
	ProductoServiceImpl productoServiceImpl;
	
	@GetMapping("/productos")
	public List<Producto> listarProductos(){
		return productoServiceImpl.listarProductos();
	}
	
	//listar productos por campo nombre
	@GetMapping("/productos/nombre/{nombre}")
	public List<Producto> listarProductoNombre(@PathVariable(name="nombre") String nombre) {
	    return productoServiceImpl.listarProductoNombre(nombre);
	}
	
	
	@PostMapping("/productos")
	public Producto salvarProducto( @RequestBody Producto producto) {
		return productoServiceImpl.guardarProducto(producto);
	}
	
	
	@GetMapping("/productos/{codigo}")
	public Producto ProductoXID(@PathVariable(name="codigo") int codigo) {
		
		Producto producto_xid= new Producto();
		
		producto_xid= productoServiceImpl.productoXID(codigo);
		
		System.out.println("Producto XID: "+producto_xid);
		
		return producto_xid;
	}
	
	@PutMapping("/productos/{codigo}")
	public Producto actualizarProducto(@PathVariable(name="codigo")int codigo, @RequestBody Producto producto) {
		
		Producto producto_seleccionado= new Producto();
		Producto producto_actualizado= new Producto();
		
		producto_seleccionado= productoServiceImpl.productoXID(codigo);
		
		producto_seleccionado.setNombre(producto.getNombre());
		producto_actualizado = productoServiceImpl.actualizarProducto(producto_seleccionado);
		
		System.out.println("El Producto actualizado es: "+ producto_actualizado);
		
		return producto_actualizado;
	}
	
	@DeleteMapping("/productos/{codigo}")
	public void eliminarProducto(@PathVariable(name="codigo")int codigo) {
		productoServiceImpl.eliminarProducto(codigo);
	}
}
