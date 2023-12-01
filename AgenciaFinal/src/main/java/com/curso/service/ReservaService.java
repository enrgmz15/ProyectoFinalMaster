package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;
import com.curso.model.ReservaCompleta;

/**
 * 
 * @author Enrique
 *
 */
public interface ReservaService {
	public List<Reserva> reservas();
	public void nuevaReserva(ReservaCompleta rc);
	public List<Reserva> reservaPorHotel(String nombre);
	public void eliminaReserva(int id);
}
