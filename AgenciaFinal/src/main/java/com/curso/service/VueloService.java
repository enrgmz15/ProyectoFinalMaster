package com.curso.service;

import java.util.List;

import com.curso.model.Hotel;
import com.curso.model.Vuelo;

/**
 * 
 * @author Enrique
 *
 */
public interface VueloService {
	List<Vuelo> vuelos();
	List<Vuelo> vuelosDisponibles(int plazas);
	void actualizaVuelo(int id, int plazas);
	List<Vuelo> vueloOrderPorPrecio();
	void nuevoVuelo(Vuelo v);
	void eliminaVuelo(int id);
}
