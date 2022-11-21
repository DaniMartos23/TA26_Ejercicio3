package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Maquina_Registradora;


public interface IMaquinaService {
	//Metodos del CRUD
	public List<Maquina_Registradora> listarMaquinas(); //Listar All 
	
	public Maquina_Registradora guardarMaquina(Maquina_Registradora maquina);	//Guarda un maquina CREATE
	
	public Maquina_Registradora maquinaXID(int codigo); //Leer datos de un maquina READ
			
			
	public Maquina_Registradora actualizarMaquina(Maquina_Registradora maquina); //Actualiza datos del maquina UPDATE
			
	public void eliminarMaquina(int codigo);// Elimina el maquina DELETE
}
