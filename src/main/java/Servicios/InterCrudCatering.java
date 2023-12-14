package Servicios;

import java.util.List;

import Dao.Prestamo;
import Dao.Rel_Vajilla_Prestamo;
import Dao.Vajilla;
import jakarta.persistence.EntityManager;

/**
 * Interfaz de hacer los crud
 * @author ASMP 14-12-23
 */
public interface InterCrudCatering {
	
	/**
	 * Metodo para buscar todas las vajilla
	 * @author ASMP 14-12-23
	 */
	public List<Vajilla> BuscarVaillasTodo(String query, EntityManager em);
	
	/**
	 * Metodo para buscar una las vajilla
	 * @author ASMP 14-12-23
	 */
	public Vajilla BuscarVaillasUno(String query, EntityManager em,String indentificador);
	
	/**
	 * Metodo para insertar las vajilla
	 * @author ASMP 14-12-23
	 */
	public void InsertVaillas(Vajilla vajilla,EntityManager em);
	
		
	/**
	 * Metodo para eliminar las vajilla
	 * @author ASMP 14-12-23
	 */
	public void EliminarVaillas(Vajilla vajilla,EntityManager em);
	
	
	
	
}
