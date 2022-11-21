package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.IMaquinaDAO;
import com.crud.http.dto.Maquina_Registradora;


@Service
public class MaquinaServiceImpl implements IMaquinaService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IMaquinaDAO iMaquinasDAO;
	
	@Override
	public List<Maquina_Registradora> listarMaquinas() {
		// TODO Auto-generated method stub
		return iMaquinasDAO.findAll();
	}

	@Override
	public Maquina_Registradora guardarMaquina(Maquina_Registradora producto) {
		// TODO Auto-generated method stub
		return iMaquinasDAO.save(producto);
	}

	@Override
	public Maquina_Registradora maquinaXID(int codigo) {
		// TODO Auto-generated method stub
		return iMaquinasDAO.findById(codigo).get();
	}


	@Override
	public Maquina_Registradora actualizarMaquina(Maquina_Registradora producto) {
		// TODO Auto-generated method stub
		return iMaquinasDAO.save(producto);
	}

	@Override
	public void eliminarMaquina(int codigo) {
		
		iMaquinasDAO.deleteById(codigo);
		
	}
	
	

}
