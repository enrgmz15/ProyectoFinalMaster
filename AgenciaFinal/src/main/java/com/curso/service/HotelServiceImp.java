package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.curso.DAO.HotelDAO;
import com.curso.model.Hotel;

/**
 * 
 * @author Enrique
 *
 */
@Service
public class HotelServiceImp implements HotelService {
	
	@Autowired
	HotelDAO dao;

	@Override
	public List<Hotel> hoteles() {
		return dao.findAll();
	}

	@Override
	public Hotel getHotel(String nombre) {
		return dao.findByNombre(nombre);
	}

	@Override
	public List<Hotel> hotelOrderPorPrecio() {
		return dao.findAllByOrderByPrecioDesc();
	}

	@Override
	public void nuevoHotel(Hotel h) {
		dao.save(h);
	}

	@Override
	public void actualizaHotel(Hotel h) {
		dao.save(h);	
	}

	@Override
	public void eliminaHotel(String nombre) {
		Hotel h=getHotel(nombre);
		dao.delete(h);
	}
}
