package Servicios;

import java.util.List;

import Dao.Vajilla;

public class ImplMenu implements InterMenu{

	@Override
	public void MostrarMenu() {
		System.out.println("-------------------------------");
		System.out.println("1-Mostrar");
		System.out.println("2-Añadir");
		System.out.println("2-Eliminar");
		System.out.println("0-Salir");
		System.out.println("-------------------------------");
	}


}
