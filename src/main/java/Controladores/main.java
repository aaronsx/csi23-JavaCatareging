package Controladores;

import java.util.Scanner;

import Servicios.ImplCatering;
import Servicios.ImplMenu;
import Servicios.InterMenu;
import Servicios.InterCatering;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Clase para moverme por la aplicacion
 * @author ASMP-14-12-23
 */
public class main {

	public static void main(String[] args) {
		InterMenu menuMos= new ImplMenu();
		boolean cerrarMenu=false;
		int menu=0;
		try {
			EntityManagerFactory ent=Persistence.createEntityManagerFactory("plataforma");
			EntityManager em=ent.createEntityManager();
			do
			{
				InterCatering servCaterin=new ImplCatering ();
				Scanner preguntar=new Scanner(System.in);
				menuMos.MostrarMenu();
				System.out.println("Que opcion eligues");
				menu=preguntar.nextInt();
				
				switch(menu){
					case 1:
						System.out.println("Pulsa 1 si quieres mostrar todo y 2 si quieres mostrar uno");
						int mostrar=preguntar.nextInt();
						if(mostrar<1||mostrar>2)
							System.out.println("Lo siento solo es entre 1 y 2");
						else
						servCaterin.MostrarStock(mostrar,em);
						break;
						
					case 2:
						servCaterin.AñadirVajilla(em);
						break;
					case 3:
						servCaterin.EliminarVajilla(em);
						break;
					case 0:
						cerrarMenu=true;
						break;
				}
			}while(!cerrarMenu);
		}catch(Exception e) {
			System.out.print("Se produjo un error ");
		}
		

	}

}
