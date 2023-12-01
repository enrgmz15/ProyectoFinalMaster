package com.curso.model;

/**
 * Esta clase la utilizo como apoyo para poder crear las reservas {@link Reserva} con el total de personas 
 * indicado en el body de la petición ya que este no se encuentra en la base de datos
 * @author Enrique
 *
 */
public class ReservaCompleta {
	private Integer idreserva;
	private String nombrecliente;
	private String dni;
	private int idhotel;
	private int idvuelo;
	private int totalpersonas;
	public ReservaCompleta() {
		super();
	}
	public ReservaCompleta(Integer idreserva, String nombrecliente, String dni, int idhotel, int idvuelo,
			int totalpersonas) {
		super();
		this.idreserva = idreserva;
		this.nombrecliente = nombrecliente;
		this.dni = dni;
		this.idhotel = idhotel;
		this.idvuelo = idvuelo;
		this.totalpersonas = totalpersonas;
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
	public int getTotalpersonas() {
		return totalpersonas;
	}
	public void setTotalpersonas(int totalpersonas) {
		this.totalpersonas = totalpersonas;
	}
	
	
}
