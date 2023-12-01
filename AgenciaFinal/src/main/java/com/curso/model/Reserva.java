package com.curso.model;

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
@Table(name="reservas")
public class Reserva {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idreserva;
	private String nombrecliente;
	private String dni;
	private int idhotel;
	private int idvuelo;
	public Reserva() {
		super();
	}
	public Reserva(String nombrecliente, String dni, int idhotel, int idvuelo) {
		super();
		this.idreserva = idreserva;
		this.nombrecliente = nombrecliente;
		this.dni = dni;
		this.idhotel = idhotel;
		this.idvuelo = idvuelo;
	}
	public Integer getIdreserva() {
		return idreserva;
	}
	public void setIdreserva(Integer idreserva) {
		this.idreserva = idreserva;
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getIdhotel() {
		return idhotel;
	}
	public void setIdhotel(int idhotel) {
		this.idhotel = idhotel;
	}
	public int getIdvuelo() {
		return idvuelo;
	}
	public void setIdvuelo(int idvuelo) {
		this.idvuelo = idvuelo;
	}
	
	
	
}
