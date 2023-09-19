package gestion;
import java.util.List;
import java.util.ArrayList;

public class Zona {
	/* ATRIBUTOS*/
	private String nombre;
	private Zoologico zoo;
	private  List<Zona> zonaList = new ArrayList<Zona>();
	
	/*CONSTRUCTURES*/
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	public Zona() {
		
	}

}
