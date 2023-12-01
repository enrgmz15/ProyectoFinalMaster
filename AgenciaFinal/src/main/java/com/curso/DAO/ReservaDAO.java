package com.curso.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Reserva;

/**
 * 
 * @author Enrique
 *
 */
public interface ReservaDAO extends JpaRepository<Reserva, Integer> {
	/**
	 * Este metodo recuperara las reservas que contengan la id del hotel que recibe
	 * y se utilizara en junto al metodo creado en el {@link HotelDAO}
	 * @param idHotel
	 * @return
	 */
	List<Reserva> findByIdhotel(int idHotel);
}
