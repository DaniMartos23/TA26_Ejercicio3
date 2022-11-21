package com.crud.http.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer> {
	
}
