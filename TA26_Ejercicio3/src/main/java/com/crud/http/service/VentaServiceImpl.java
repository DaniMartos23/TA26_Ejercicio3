package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.IVentaDAO;
import com.crud.http.dto.Venta;


@Service
public class VentaServiceImpl implements IVentaService{
	
	@Autowired
	IVentaDAO iAsignado_asDAO;
	
	@Override
	public List<Venta> listarVenta() {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.save(venta);
	}

	@Override
	public Venta ventaXID(int id) {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.findById(id).get();
	}

	

	@Override
	public Venta actualizarVenta(Venta venta) {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int id) {
		
		iAsignado_asDAO.deleteById(id);
		
	}
	
	

}
