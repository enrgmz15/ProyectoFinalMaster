package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.DAO.VueloDAO;
import com.curso.model.Vuelo;

/**
 * 
 * @author Enrique
 *
 */
@Service
public class VueloServiceImp implements VueloService{
	
	@Autowired
	VueloDAO dao;

	@Override
	public List<Vuelo> vuelos() {
		return dao.findAll();
	}

	@Override
	public List<Vuelo> vuelosDisponibles(int plazas) {
		List<Vuelo> vuelos=vuelos();
		List<Vuelo> vuelosDisp=new ArrayList<>();
		for (Vuelo v : vuelos) {
			if(v.getPlazasdisponibles()>=plazas) {
				vuelosDisp.add(v);
			}
		}
		return vuelosDisp;
	}

	@Override
	public void actualizaVuelo(int id, int plazas) {
		Vuelo v=dao.findById(id).orElse(null);
		v.setPlazasdisponibles(v.getPlazasdisponibles()-plazas);
		dao.save(v);
	}
	
	@Override
	public List<Vuelo> vueloOrderPorPrecio(){
		return dao.findAllByOrderByPrecioDesc();	
	}

	@Override
	public void nuevoVuelo(Vuelo v) {
		dao.save(v);
	}

	@Override
	public void eliminaVuelo(int id) {
		Vuelo v=dao.findById(id).orElse(null);
		dao.delete(v);
	}
	
	
	
}
