package com.curso.service;

import java.util.List;

import com.curso.model.Hotel;

/**
 * 
 * @author Enrique
 *
 */
public interface HotelService {
	List<Hotel> hoteles();
	Hotel getHotel(String nombre);
	List<Hotel> hotelOrderPorPrecio();
	void nuevoHotel(Hotel h);
	void actualizaHotel(Hotel h);
	void eliminaHotel(String nombre);
}
