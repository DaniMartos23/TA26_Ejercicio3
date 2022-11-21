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

import com.crud.http.dto.Venta;
import com.crud.http.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")

public class VentaController {

	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	@GetMapping("/venta")
	public List<Venta> listarVentas(){
		return ventaServiceImpl.listarVenta();
	}
	
	
	
	
	@PostMapping("/venta")
	public Venta salvarVenta( @RequestBody Venta venta) {
		return ventaServiceImpl.guardarVenta(venta);
	}
	
	
	@GetMapping("/venta/{codigo}")
	public Venta VentaXID(@PathVariable(name="codigo") int id) {
		
		Venta venta_xid= new Venta();
		
		venta_xid= ventaServiceImpl.ventaXID(id);
		
		System.out.println("Venta XID: "+venta_xid);
		
		return venta_xid;
	}
	
	@PutMapping("/venta/{codigo}")
	public Venta actualizarVenta(@PathVariable(name="codigo")int id, @RequestBody Venta venta) {
		
		Venta venta_seleccionado= new Venta();
		Venta venta_actualizado= new Venta();
		
		venta_seleccionado= ventaServiceImpl.ventaXID(id);
		venta_seleccionado.setProductos(venta.getProductos());
		venta_seleccionado.setCajero(venta.getCajero());
		venta_seleccionado.setMaquinas(venta.getMaquinas());
		venta_actualizado = ventaServiceImpl.actualizarVenta(venta_seleccionado);
		
		System.out.println("El Venta actualizado es: "+ venta_actualizado);
		
		return venta_actualizado;
	}
	
	@DeleteMapping("/venta/{codigo}")
	public void eliminarVenta(@PathVariable(name="codigo")int id) {
		ventaServiceImpl.eliminarVenta(id);
	}
}
