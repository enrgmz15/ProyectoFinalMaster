package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.model.Vuelo;
import com.curso.service.HotelService;
import com.curso.service.VueloService;

/**
 * 
 * @author Enrique
 *
 */
@RestController
//@RequestMapping("")
public class VueloController {

@Autowired

VueloService vueloService;


/*
@GetMapping(value="/vueloslista")

public String pagina(Model m) {

List<Vuelo> listaVuelos=vueloService.vuelos();

m.addAttribute("lista",listaVuelos);

return "vuelos";

}*/
	
	@Autowired
	VueloService service;
	
	@GetMapping(value="vuelos",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> vuelos(){
		return service.vuelos();
	}
	
	@GetMapping(value="vuelosDisponibles/{plazas}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> vuelosDisponibles(@PathVariable("plazas") int plazas){
		return service.vuelosDisponibles(plazas);
	}
	
	@PutMapping(value="vuelos/{id}/{plazas}")
	public void actualizaVuelo(@PathVariable("id") int id,@PathVariable("plazas") int plazas) {
		service.actualizaVuelo(id, plazas);
	}
	
	@GetMapping(value="vuelosPrecio",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> vuelosOrderPorPrecio(){
		return service.vueloOrderPorPrecio();
	}
	
	@PostMapping(value="vuelos", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void nuevoVuelo(@RequestBody Vuelo v) {
		service.nuevoVuelo(v);
	}
	
	@DeleteMapping(value="vuelos/{id}")
	public void eliminaHotel(@PathVariable int id) {
		service.eliminaVuelo(id);
	}
}
