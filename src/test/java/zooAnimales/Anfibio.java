package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	// ATRIBUTOS
	private static  ArrayList<Anfibio> listado =new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	private static int cantidadAnfibios = 0;

	//CONSTRUCTURES
	public Anfibio() {
		Anfibio.listado.add(this);
		Anfibio.cantidadAnfibios += 1;
	}
	public Anfibio(String colorPiel, boolean venenoso) {
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
		Anfibio.cantidadAnfibios += 1;
	}
	public Anfibio(String nombre,int edad, String habitat,String genero, String colorPiel, boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
		Anfibio.cantidadAnfibios += 1;
		}

	//METODOS
	public static ArrayList<Anfibio> getListado() {
		return Anfibio.listado;
	}
	public String getColorPiel() {
		return this.colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return this.venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public static int cantidadAnfibios() {
		return Anfibio.cantidadAnfibios;
	}
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nombre,int edad,String genero) {
		ranas += 1;
		Anfibio rana = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		return rana;
	}
	public  static Anfibio crearSalamandra(String nombre,int edad,String genero) {
		salamandras += 1;
		Anfibio salamandra = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		return salamandra;
	}
}
