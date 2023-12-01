package com.curso.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Vuelo;

/**
 * 
 * @author Enrique
 *
 */
public interface VueloDAO extends JpaRepository<Vuelo, Integer> {
	public List<Vuelo> findAllByOrderByPrecioDesc();
}
