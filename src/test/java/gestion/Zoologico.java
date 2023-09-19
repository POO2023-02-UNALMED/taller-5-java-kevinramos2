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
	
	/*MÉTODOS*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre() {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion() {
		this.ubicacion = ubicacion;
	}
	
	public void agregarZona(Zona zona) {
		this.zonaList.add(zona);
	}
	public int cantidadTotalAnimales() {
		int totalAnimales = 0;
		for(Zona zona: zonaList) {
			totalAnimales+=zona.cantidadAnimales();
		}
		return totalAnimales;
	}

}
