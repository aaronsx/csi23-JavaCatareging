package Servicios;

import java.util.List;

import Dao.Prestamo;
import Dao.Rel_Vajilla_Prestamo;
import Dao.Vajilla;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TransactionRequiredException;
import jakarta.persistence.TypedQuery;
/**
 * Clase para hacer el crud a la base de datos
 * @author ASMP-14-12-23
 */
public class ImplCrudCatering implements InterCrudCatering {

	@Override
	public List<Vajilla> BuscarVaillasTodo(String query, EntityManager em) {
		TypedQuery<Vajilla> consulta=null;
		try {
			consulta=em.createQuery(query,Vajilla.class);
		}catch(IllegalArgumentException e) {
			System.out.println("[ERROR-ImplCrudCatering-BuscarVaillasTodo]No se ha podido podido sacar vajillas");
		}
		
		return consulta.getResultList();
	}

	@Override
	public Vajilla BuscarVaillasUno(String query, EntityManager em,String indentificador) {
		TypedQuery<Vajilla> consulta=null;
		try {
			consulta=em.createQuery(query,Vajilla.class);
			consulta.setParameter("id", indentificador);
		}catch(IllegalArgumentException e) {
			System.out.println("[ERROR-ImplCrudCatering-BuscarVaillasUno]No se ha podido podido sacar vajillas");
		}
		
		return consulta.getSingleResult();
	}

	@Override
	public void InsertVaillas(Vajilla vajilla, EntityManager em) {
		try {
			em.getTransaction().begin();
			em.persist(vajilla);
			em.getTransaction().commit();
		}catch(IllegalStateException e) {
			System.out.println("[ERROR-ImplCrudCatering-InsertVaillas]No se ha podido insertar la vajilla");
		}catch(EntityExistsException  e) {
			System.out.println("[ERROR-ImplCrudCatering-InsertVaillas]No se ha podido insertar la vajilla");
		}catch(TransactionRequiredException  e) {
			System.out.println("[ERROR-ImplCrudCatering-InsertVaillas]No se ha podido insertar la vajilla");
		}catch(IllegalArgumentException  e) {
			System.out.println("[ERROR-ImplCrudCatering-InsertVaillas]No se ha podido insertar la vajilla");
		}
		
	}

	


	@Override
	public void EliminarVaillas(Vajilla vajilla, EntityManager em) {
		try {
			em.getTransaction().begin();
			em.remove(vajilla);
			em.getTransaction().commit();
		}catch(IllegalStateException e) {
			System.out.println("[ERROR-ImplCrudCatering-EliminarVaillas]No se ha podido eliminar la vajilla");
		}catch(EntityExistsException  e) {
			System.out.println("[ERROR-ImplCrudCatering-EliminarVaillas]No se ha podido eliminar la vajilla");
		}catch(TransactionRequiredException  e) {
			System.out.println("[ERROR-ImplCrudCatering-EliminarVaillas]No se ha podido eliminar la vajilla");
		}catch(IllegalArgumentException  e) {
			System.out.println("[ERROR-ImplCrudCatering-EliminarVaillas]No se ha podido eliminar la vajilla");
		}
		
	}

	

	

	

	

}
