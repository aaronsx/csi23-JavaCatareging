package Servicios;

import java.util.List;
import java.util.Scanner;

import Dao.Vajilla;
import jakarta.persistence.EntityManager;

/**
 * Clase para indicar la logica de Catering
 * @author ASMP-14-12-23
 */
public class ImplCatering implements InterCatering {

	@Override
	public void MostrarStock(int numero,EntityManager em) {
		
			InterCrudCatering crud= new ImplCrudCatering();
			if(numero==0)
			{
				String query="SELECT v FROM Vajilla v";
				List<Vajilla> vajillalist=crud.BuscarVaillasTodo(query,em);
				for(Vajilla a : vajillalist) {
					a.toString();
				}
			}else
			{
				Scanner preguntar=new Scanner(System.in);
				System.out.println("Dime un identificador que quieras mostrar: ");
				String indentificador=preguntar.next();
				String query="SELECT v FROM Vajilla v WHERE v.codigoVajilla=:id";
				Vajilla vajilla=crud.BuscarVaillasUno(query,em,indentificador);
				if(vajilla==null)
					System.out.println("[Info-ImplCatering-MostrarStock]No se encontro ninguna Vajilla");
				else
					vajilla.toString();
			}
		
		
	}

	@Override
	public void EliminarVajilla(EntityManager em) {
		Scanner preguntar=new Scanner(System.in);
		String codigo="aaaaa";
		InterCrudCatering crud= new ImplCrudCatering();
		System.out.println("Dime el codigo que quieres eliminar");
		codigo=preguntar.next();
		String query="SELECT v FROM Vajilla v WHERE v.codigoVajilla=:id";
		Vajilla vajilla=crud.BuscarVaillasUno(query,em,codigo);
		if(vajilla!=null)
			crud.EliminarVaillas(vajilla, em);
		else
			System.out.println("[Info-ImplCatering-EliminarVajilla]No se encontro ninguna Vajilla para eliminar");
	}

	@Override
	public void AñadirVajilla(EntityManager em) {
		Scanner preguntar=new Scanner(System.in);
		String nombre="aaaaa";
		String descripcion="aaaaa";
		String codigo="aaaaa";
		int cantidad=0;
		System.out.println("Dime el nombre de la vajillas que quieres añadir");
		nombre=preguntar.next();
		System.out.println("Dime la descripcion de la vajillas que quieres añadir");
		descripcion=preguntar.next();
		do {
			System.out.println("Dime el numero de esta vajilla que quieres añadir");
			cantidad=preguntar.nextInt();
			if(cantidad==0)
				System.out.println("[Info-ImplCatering-AñadirVajilla]Lo siento el numero no puede ser 0");
		}while(cantidad==0);
		codigo=nombre+" "+descripcion;
		InterCrudCatering crud= new ImplCrudCatering();
		Vajilla vajilla=new Vajilla(codigo,nombre,descripcion,cantidad);
		crud.InsertVaillas(vajilla, em);
		
	}


}
