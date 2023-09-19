package gestion;
import java.util.List;
import java.util.ArrayList;

public class Zoologico {
	/* ATRIBUTOS*/
	private String nombre;
	private String ubicacion;
	private  List<Zona> zonaList = new ArrayList<Zona>();
	
	/*CONSTRUCTURES*/
	public Zoologico (String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {
		
	}

}
