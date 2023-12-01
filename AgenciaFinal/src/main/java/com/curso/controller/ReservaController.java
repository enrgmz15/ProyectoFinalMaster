package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Reserva;
import com.curso.model.ReservaCompleta;
import com.curso.service.ReservaService;

/**
 * 
 * @author Enrique
 *
 */
@RestController
public class ReservaController {
	
	@Autowired
	ReservaService service;
	
	@GetMapping(value="reservas", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> reservas(){
		return service.reservas();
	}
	
	@PostMapping(value="reserva", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void nuevaReserva(@RequestBody ReservaCompleta rc) {
		service.nuevaReserva(rc);
	}
	
	@GetMapping(value="reserva/{hotel}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> reservaPorHotel(@PathVariable("hotel") String hotel) {
		return service.reservaPorHotel(hotel);
	}
	
	@DeleteMapping(value="reserva/{id}")
	public void eliminaReserva(@PathVariable("id") int id) {
		service.eliminaReserva(id);
	}
}
