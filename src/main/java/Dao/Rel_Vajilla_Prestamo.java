package Dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
/**
 * Clase para indicar los campos de la base de datos de la tabla rel_vajillas_prestamos
 * @author ASMP-14-12-23
 */
@Entity
@Table(name="rel_vajillas_prestamos",schema="esqExaDos")
public class Rel_Vajilla_Prestamo {
	
	//Entidades
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idRelVajillaPrestamo;
	
	@ManyToOne
	@JoinColumn(name="idVajilla")
	Vajilla vajilla;
	
	@ManyToOne
	@JoinColumn(name="idPrestamo")
	Prestamo prestamo;
	
	@Column(name="cantidadRelVajilla")
	private int cantidadRelVajilla;
}
