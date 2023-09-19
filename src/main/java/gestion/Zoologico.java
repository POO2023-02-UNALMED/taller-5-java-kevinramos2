package gestion;
import java.util.ArrayList;

public class Zoologico {
	// ATRIBUTOS
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	//CONSTRUCTURES
	public Zoologico() {
		
	}
	public Zoologico (String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	
	//METODOS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	
	public void agregarZona(Zona zon) {
		zonas.add(zon);
	}
    public int cantidadTotalAnimales(){
        int totalAnimales = 0;
        for (Zona zona : zonas) {
            totalAnimales += zona.cantidadAnimales();
        }
        return totalAnimales;
    }
}