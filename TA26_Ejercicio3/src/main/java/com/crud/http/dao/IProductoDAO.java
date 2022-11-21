package com.crud.http.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer> {
	//Listar articulos por campo nombre
			public List<Producto> findByNombre(String nombre);
}
