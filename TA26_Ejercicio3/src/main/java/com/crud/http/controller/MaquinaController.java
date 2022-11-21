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

import com.crud.http.dto.Maquina_Registradora;
import com.crud.http.service.MaquinaServiceImpl;

@RestController
@RequestMapping("/api")

public class MaquinaController {

	@Autowired
	MaquinaServiceImpl maquinaServiceImpl;
	
	@GetMapping("/maquinas")
	public List<Maquina_Registradora> listarMaquinas(){
		return maquinaServiceImpl.listarMaquinas();
	}
	
	
	
	
	@PostMapping("/maquinas")
	public Maquina_Registradora salvarMaquina( @RequestBody Maquina_Registradora maquina) {
		return maquinaServiceImpl.guardarMaquina(maquina);
	}
	
	
	@GetMapping("/maquinas/{codigo}")
	public Maquina_Registradora MaquinaXID(@PathVariable(name="codigo") int codigo) {
		
		Maquina_Registradora maquina_xid= new Maquina_Registradora();
		
		maquina_xid= maquinaServiceImpl.maquinaXID(codigo);
		
		System.out.println("Maquina_Registradora XID: "+maquina_xid);
		
		return maquina_xid;
	}
	
	@PutMapping("/maquinas/{codigo}")
	public Maquina_Registradora actualizarMaquina(@PathVariable(name="codigo")int codigo, @RequestBody Maquina_Registradora maquina) {
		
		Maquina_Registradora maquina_seleccionado= new Maquina_Registradora();
		Maquina_Registradora maquina_actualizado= new Maquina_Registradora();
		
		maquina_seleccionado= maquinaServiceImpl.maquinaXID(codigo);
		
		maquina_seleccionado.setPiso(maquina.getPiso());
		maquina_actualizado = maquinaServiceImpl.actualizarMaquina(maquina_seleccionado);
		
		System.out.println("La Maquina Registradora actualizada es: "+ maquina_actualizado);
		
		return maquina_actualizado;
	}
	
	@DeleteMapping("/maquinas/{codigo}")
	public void eliminarMaquina(@PathVariable(name="codigo")int codigo) {
		maquinaServiceImpl.eliminarMaquina(codigo);
	}
}
