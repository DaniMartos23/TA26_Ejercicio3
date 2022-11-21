package com.crud.http.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="productos")//en caso que la tabala sea diferente
public class Producto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private int precio;
	
	@OneToMany()
    @JoinColumn(name = "producto")
    List<Venta> venta;
	
	public Producto() {
		
	}
	
	
	
	public Producto(int codigo, String nombre,int precio, List<Venta> venta) {
		//super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio=precio;
		this.venta = venta;
	}





	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productos")
	public List<Venta> getVenta() {
		return venta;
	}
	
	
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}



	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre +", precio="+precio+"]";
	}

	
	
}
