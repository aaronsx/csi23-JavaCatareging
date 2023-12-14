package Dao;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * Clase para indicar los campos de la base de datos de la tabla prestamos
 * @author ASMP-14-12-23
 */
@Entity
@Table(name="prestamos",schema="esqExaDos")
public class Prestamo {

	//Entidades
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPrestamo;
	
	@Column(name="fchPrestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchReserva;
	
}
