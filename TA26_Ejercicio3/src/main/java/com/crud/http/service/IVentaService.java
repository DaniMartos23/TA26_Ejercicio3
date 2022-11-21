package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Venta;

public interface IVentaService {
	//Metodos del CRUD
	public List<Venta> listarVenta(); //Listar All 
	
	public Venta guardarVenta(Venta venta);	//Guarda un asignado_a CREATE
	
	public Venta ventaXID(int id); //Leer datos de un asignado_a READ
			
	
			
	public Venta actualizarVenta(Venta venta); //Actualiza datos del asignado_a UPDATE
			
	public void eliminarVenta(int id);// Elimina el asignado_a DELETE
}
