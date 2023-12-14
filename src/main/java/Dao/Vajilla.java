package Dao;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Clase para indicar los campos de la base de datos de la tabla vajilla
 * @author ASMP-14-12-23
 */
@Entity
@Table(name="vajillas",schema="esqExaDos")
public class Vajilla {
	//Entidades
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idVajilla;
	
	@Column(name="codigoVajilla")
	private String codigoVajilla;

	@Column(name="nombreVajilla")
	private String nombreVajilla;
	
	@Column(name="descripcionVajilla")
	private String descripcionVajilla;
	
	@Column(name="cantidadVajilla")
	private int cantidadVajilla;
	//toString
	@Override
	public String toString() {
		return "Vajilla [idVajilla=" + idVajilla + ", codigoVajilla=" + codigoVajilla + ", nombreVajilla="
				+ nombreVajilla + ", descripcionVajilla=" + descripcionVajilla + ", cantidadVajilla=" + cantidadVajilla
				+ "]";
	}
	//Constructores
	public Vajilla() {
		super();
		
	}
	public Vajilla(String codigoVajilla, String nombreVajilla, String descripcionVajilla, int cantidadVajilla) {
		super();
		this.codigoVajilla = codigoVajilla;
		this.nombreVajilla = nombreVajilla;
		this.descripcionVajilla = descripcionVajilla;
		this.cantidadVajilla = cantidadVajilla;
	}

}
