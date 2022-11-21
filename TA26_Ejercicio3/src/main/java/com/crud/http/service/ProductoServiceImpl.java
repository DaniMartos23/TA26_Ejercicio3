package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.IProductoDAO;
import com.crud.http.dto.Producto;


@Service
public class ProductoServiceImpl implements IProductoService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IProductoDAO iProductosDAO;
	
	@Override
	public List<Producto> listarProductos() {
		// TODO Auto-generated method stub
		return iProductosDAO.findAll();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return iProductosDAO.save(producto);
	}

	@Override
	public Producto productoXID(int codigo) {
		// TODO Auto-generated method stub
		return iProductosDAO.findById(codigo).get();
	}

	@Override
	public List<Producto> listarProductoNombre(String nombre) {
		// TODO Auto-generated method stub
		return iProductosDAO.findByNombre(nombre);
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return iProductosDAO.save(producto);
	}

	@Override
	public void eliminarProducto(int codigo) {
		
		iProductosDAO.deleteById(codigo);
		
	}
	
	

}
