package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.ICajeroDAO;
import com.crud.http.dto.Cajero;


@Service
public class CajeroServiceImpl implements ICajeroService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	ICajeroDAO iCajerosDAO;
	
	@Override
	public List<Cajero> listarCajeros() {
		// TODO Auto-generated method stub
		return iCajerosDAO.findAll();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return iCajerosDAO.save(cajero);
	}

	@Override
	public Cajero cajeroXID(int codigo) {
		// TODO Auto-generated method stub
		return iCajerosDAO.findById(codigo).get();
	}



	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return iCajerosDAO.save(cajero);
	}

	@Override
	public void eliminarCajero(int codigo) {
		
		iCajerosDAO.deleteById(codigo);
		
	}
	
	

}
