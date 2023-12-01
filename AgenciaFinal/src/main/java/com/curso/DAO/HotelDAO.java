package com.curso.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Hotel;

/**
 * 
 * @author Enrique
 *
 */
public interface HotelDAO extends JpaRepository<Hotel, Integer>{
	/**
	 * Creo este metodo para facilitar la busqueda del hotel por nombre ya que se va a utilizar
	 * en diferentes lugares
	 * @param nombre
	 * @return
	 */
	public Hotel findByNombre(String nombre);
	public List<Hotel> findAllByOrderByPrecioDesc();

}
