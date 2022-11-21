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
@Table(name="cajeros")//en caso que la tabala sea diferente
public class Cajero {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int codigo;
	
	@Column(name = "nomapels")
	private String nomapels;
	
	
	@OneToMany()
    @JoinColumn(name = "cajero")
    List<Venta> venta;
	
	public Cajero() {
		
	}
	
	
	
	public Cajero(int codigo, String nomapels, List<Venta> venta) {
		//super();
		this.codigo = codigo;
		this.nomapels = nomapels;
		this.venta = venta;
	}





	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}



	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cajeros")
	public List<Venta> getVenta() {
		return venta;
	}
	
	
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}



	@Override
	public String toString() {
		return "Cajero [codigo=" + codigo + ", nomapels=" + nomapels +"]";
	}

	
	
}
