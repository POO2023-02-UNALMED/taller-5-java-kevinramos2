package zooAnimales;
import gestion.Zona;

public class Animal {
	// ATRIBUTOS
	private static int total = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona = new Zona[1];

	//CONSTRUCTURES
	public Animal() {
		Animal.total += 1;
	}
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		Animal.total += 1;
	}
	
	//METODOS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public Zona[] getZona() {
		return zona;
	}
	public void setZona(Zona[] zona) {
		this.zona = zona;}
	public static int getTotalAnimales() {
		return Animal.total;
	}

	public String movimiento() {
		return "desplazarse";
	}
		
	public static String totalPorTipo() {
		int cantidadAves = Ave.cantidadAves();
		int cantidadAnfibios = Anfibio.cantidadAnfibios();
		int cantidadPeces = Pez.cantidadPeces();
		int cantidadReptiles = Reptil.cantidadReptiles();
		int cantidadMamiferos = Mamifero.cantidadMamiferos();
		return "Mamiferos: "+cantidadMamiferos+"\nAves: "+ cantidadAves +"\nReptiles: "+cantidadReptiles+"\nPeces: "+ cantidadPeces +"\nAnfibios: "+ cantidadAnfibios;
		}
		
	public String toString() {
		String zonaZoo = "";
		if (zona[0] != null && zona[0].getZoo()!= null) {
			zonaZoo = ", la zona en la que me ubico es "+this.zona[0]+", en el "+ this.zona[0].getZoo(); 
		return "Mi nombre es " + this.nombre + ", tengo una edad de "+this.edad+
			        ", habito en " + this.habitat + " y mi genero es " + this.genero + zonaZoo;

	}
		return zonaZoo;
	}
}
