package com.crud.http.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="venta")//en caso que la tabala sea diferente
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "producto")
	Producto producto;
	
	@ManyToOne
    @JoinColumn(name = "cajero")
	Cajero cajero;
	
	@ManyToOne
    @JoinColumn(name = "maquina")
	Maquina_Registradora maquina;


	public Venta() {
		
	}


	public Venta(int id, Producto productos, Cajero cajero,Maquina_Registradora maquinas) {
		super();
		this.id = id;
		this.producto = productos;
		this.cajero = cajero;
		this.maquina=maquinas;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}	
	
	public Producto getProductos() {
		return producto;
	}


	public void setProductos(Producto productos) {
		this.producto = productos;
	}


	public Cajero getCajero() {
		return cajero;
	}


	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}


	public Maquina_Registradora getMaquinas() {
		return maquina;
	}


	public void setMaquinas(Maquina_Registradora maquinas) {
		this.maquina = maquinas;
	}


	@Override
	public String toString() {
		return "Venta [id=" + id + ", producto=" + producto + ", cajero=" + cajero + ", maquina=" + maquina + "]";
	}


	


	
	
	
	
	
	
}
