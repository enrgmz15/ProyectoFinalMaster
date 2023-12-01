package com.curso.controller;

import java.util.LinkedList;
import java.util.List;

import javax.print.attribute.standard.Media;

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
import com.curso.service.HotelService;

/**
 * 
 * @author Enrique
 *
 */
@RestController
//@RequestMapping("")
public class HotelController {

@Autowired

HotelService hotelService;


/*
@GetMapping(value="/hoteleslista")

public String pagina(Model m) {

List<Hotel> listaHotel=hotelService.hoteles();

m.addAttribute("lista",listaHotel);

return "hoteles";

}*/

	
	@GetMapping(value="hoteles", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> hoteles(){
		return hotelService.hoteles();	
	}
	
	@GetMapping(value="hoteles/{nombre}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Hotel getHotel(@PathVariable("nombre") String nombre) {
		return hotelService.getHotel(nombre);
	}
	
	@GetMapping(value="hotelesPrecio",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> hotelOrderPorPrecio(){
		return hotelService.hotelOrderPorPrecio();
	}
	
	@PostMapping(value="hoteles", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void nuevoHotel(@RequestBody Hotel h) {
		hotelService.nuevoHotel(h);
	}
	
	@PutMapping(value="hoteles", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizaHotel(@RequestBody Hotel h) {
		hotelService.actualizaHotel(h);
	}
	
	@DeleteMapping(value="hoteles/{nombre}")
	public void eliminaHotel(@PathVariable String nombre) {
		hotelService.eliminaHotel(nombre);
	}
}
