package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	/* ATRIBUTOS*/
	private static ArrayList<Mamifero> listado =new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	private static int cantidadMamiferos = 0;
	
	/*CONSTRUCTURES*/
	public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.cantidadMamiferos += 1;
		Mamifero.listado.add(this);
	}
	public Mamifero(boolean pelaje, int patas) {
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.cantidadMamiferos += 1;
		Mamifero.listado.add(this);
	}
	public Mamifero() {
		Mamifero.cantidadMamiferos += 1;
		Mamifero.listado.add(this);
	}
	
	/*METODOS*/
	
	public boolean isPelaje() {
		return this.pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return this.patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public static ArrayList<Mamifero> getListado() {
		return Mamifero.listado;
	}
	public static int cantidadMamiferos() {
		return Mamifero.cantidadMamiferos;
	}
	public static Animal crearCaballo(String nombre,int edad,String genero ) {
		Mamifero.caballos += 1;
		Mamifero caballo = new Mamifero(nombre,edad,"pradera",genero,true,4);
		return caballo;
	}
	public static Animal crearLeon(String nombre,int edad,String genero ){
		Mamifero.leones += 1;
		Mamifero leon = new Mamifero(nombre,edad,"selva",genero,true,4);
		return leon;
	}
}