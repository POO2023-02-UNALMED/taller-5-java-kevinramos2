package zooAnimales;
import java.util.List;
import java.util.ArrayList;

public class Pez extends Animal {
	/* ATRIBUTOS*/
	private static List<Pez> listado =new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	/*CONSTRUCTORES*/
	public  Pez(String nombre,int edad, String habitat,String genero ,String colorEscamas, int  cantidadAletas) {
		
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
	}
	public  Pez() {
		Pez.listado.add(this);
	}
	
	/*MÉTODOS*/	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public static List<Pez> getListado() {
		return listado;
	}
	public static void setListado(List<Pez> listado) {
		Pez.listado = listado;
	}
	public int cantidadPeces() {
		return listado.size();
	}
	public String movimiento() {
		return "nadar";
	}
	public static Animal crearSalmon(String nombre,int edad,String genero ) {
		Pez.salmones++;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
	}
	public static Animal crearBacalao(String nombre,int edad,String genero ){
		Pez.bacalaos++;
		return new Pez(nombre,edad,"oceano",genero,"gris",6);
	}
}
