package com.crud.http.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Cajero;

public interface ICajeroDAO extends JpaRepository<Cajero, Integer> {
	
}
