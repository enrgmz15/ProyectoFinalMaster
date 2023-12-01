package com.curso.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * @author Enrique
 * 
 */
@Entity
@Table(name="vuelos")
public class Vuelo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idvuelos;
	private String companyia;
	private LocalDate fechavuelo;
	private float precio;
	private int plazasdisponibles;
	public Vuelo() {
		super();
	}
	public Vuelo(String companyia, LocalDate fechavuelo, float precio, int plazasdisponibles) {
		super();
		this.idvuelos = idvuelos;
		this.companyia = companyia;
		this.fechavuelo = fechavuelo;
		this.precio = precio;
		this.plazasdisponibles = plazasdisponibles;
	}
	public Integer getIdvuelo() {
		return idvuelos;
	}
	public void setIdvuelo(Integer idvuelo) {
		this.idvuelos = idvuelo;
	}
	public String getCompanyia() {
		return companyia;
	}
	public void setCompanyia(String companyia) {
		this.companyia = companyia;
	}
	public LocalDate getFechavuelo() {
		return fechavuelo;
	}
	public void setFechavuelo(LocalDate fechavuelo) {
		this.fechavuelo = fechavuelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getPlazasdisponibles() {
		return plazasdisponibles;
	}
	public void setPlazasdisponibles(int plazasdisponibles) {
		this.plazasdisponibles = plazasdisponibles;
	}
	
	
}
