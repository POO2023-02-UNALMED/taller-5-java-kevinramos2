package zooAnimales;
import gestion.Zona;

public class Animal {
	/* ATRIBUTOS*/
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;

	/*CONSTRUCTURES*/
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		Animal.totalAnimales++;
	}
	public Animal() {
		
	}
	
	/*Métodos*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;}

	public String movimiento() {
		return "desplazarse";
	}
		
	public static String totalPorTipo() {
		return "Mamiferos: "+Mamifero.getListado().size()+"\nAves: "+ Ave.getListado().size()+"\nReptiles: "+ Reptil.getListado().size()+"\nPeces: "+ Pez.getListado().size()+"\nAnfibios: "+ Anfibio.getListado().size();
		}
		
	public String toString() {
		if (this.zona!=null) {
			return ("Mi nombre es "+ this.nombre+", tengo una edad de "+this.edad+", habito en "+ this.habitat+" y mi genero es "+this.genero+", la zona en la que me ubico es"+ this.zona.getNombre()+", en el "+ this.zona.getZoo().getNombre());}
			
		else {
			return ("Mi nombre es "+ this.nombre+", tengo una edad de "+this.edad+", habito en "+ this.habitat+" y mi genero es "+this.genero);
			}
	}
}
