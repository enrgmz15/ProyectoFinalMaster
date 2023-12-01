package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.DAO.ReservaDAO;
import com.curso.model.Hotel;
import com.curso.model.Reserva;
import com.curso.model.ReservaCompleta;

/**
 * 
 * @author Enrique
 *
 */
@Service
public class ReservaServiceImp implements ReservaService{
	
	@Autowired
	RestTemplate temp;
	
	@Autowired
	ReservaDAO dao;

	@Override
	public void nuevaReserva(ReservaCompleta rc) {
		Reserva r= new Reserva(rc.getNombrecliente(),rc.getDni(),rc.getIdhotel(),rc.getIdvuelo());
		dao.save(r);
		temp.put("http://localhost:8080/vuelos/"+rc.getIdvuelo()+"/"+rc.getTotalpersonas(),null);
	}

	@Override
	public List<Reserva> reservaPorHotel(String nombre) {
		Hotel h=temp.getForObject("http://localhost:8080/hoteles/"+nombre, Hotel.class);
		int idHotel=h.getIdhotel();
		return dao.findByIdhotel(idHotel);
	}

	@Override
	public List<Reserva> reservas() {
		return dao.findAll();
	}

	@Override
	public void eliminaReserva(int id) {
		Reserva r=dao.findById(id).orElse(null);
		dao.delete(r);
	}
	
	
}
