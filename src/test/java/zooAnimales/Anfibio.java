package zooAnimales;
import java.util.List;
import java.util.ArrayList;

public class Anfibio extends Animal{
	/* ATRIBUTOS*/
	private static  List<Anfibio> listado =new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

	/*CONSTRUCTURES*/
	public Anfibio(String nombre,int edad, String habitat,String genero, String colorPiel, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
		}
	public Anfibio() {
		Anfibio.listado.add(this);
	}
	
	/*MÉTODOS*/
	public static List<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(List<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public int getRanas() {
		return ranas;
	}
	public void setRanas(int ranas) {
		this.ranas = ranas;
	}
	public int getSalamandras() {
		return salamandras;
	}
	public void setSalamandras(int salamandras) {
		this.salamandras = salamandras;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public int  cantidadAnfibios() {
		return listado.size();
	}
	public String movimiento() {
		return "saltar";
	}
	public  static Animal crearRana(String nombre,int edad,String genero) {
		Anfibio.ranas++;
		return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
	}
	public  static Animal crearSalamandra(String nombre,int edad,String genero) {
		Anfibio.salamandras++;
		return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
	}
}
