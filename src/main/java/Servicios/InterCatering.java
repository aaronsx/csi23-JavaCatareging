package Servicios;

import jakarta.persistence.EntityManager;

/**
 * interfaz para el catering
 * @author ASMP 14-12-23
 */
public interface InterCatering {

	/**
	 * Metodo para mostrar
	 * @author ASMP 14-12-23
	 */
	public void MostrarStock(int numero,EntityManager em);
	/**
	 * Metodo para añadir
	 * @author ASMP 14-12-23
	 */
	public void EliminarVajilla(EntityManager em);
	/**
	 * Metodo para añadir 
	 * @author ASMP 14-12-23
	 */
	public void AñadirVajilla(EntityManager em);
	
}
