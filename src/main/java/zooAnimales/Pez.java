package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	// ATRIBUTOS
	private static ArrayList<Pez> listado =new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	private static int cantidadPeces = 0;
	
	// CONSTRUCTORES
	public Pez() {
		Pez.cantidadPeces += 1;
		Pez.listado.add(this);
	}
	public Pez(String colorEscamas, int cantidadAletas) {
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.cantidadPeces += 1;
		Pez.listado.add(this);
	}
	public Pez(String nombre,int edad, String habitat,String genero ,String colorEscamas, int  cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.cantidadPeces += 1;
		Pez.listado.add(this);
	}


	
	// METODOS
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public static int cantidadPeces() {
		return Pez.cantidadPeces;
	}
	public String movimiento() {
		return "nadar";
	}
	public static Animal crearSalmon(String nombre,int edad,String genero ) {
		salmones += 1;
		Pez salmon = new Pez(nombre,edad,"oceano",genero,"rojo",6);
		return salmon;
	}
	public static Animal crearBacalao(String nombre,int edad,String genero ){
		bacalaos += 1;
		Pez bacalao = new Pez(nombre,edad,"oceano",genero,"gris",6);
		return bacalao;
	}
}
