package com.crud.http.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Maquina_Registradora;

public interface IMaquinaDAO extends JpaRepository<Maquina_Registradora, Integer> {
	
}
