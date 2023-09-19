package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	// ATRIBUTOS
	private static ArrayList<Reptil> listado =new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	private static int cantidadReptiles = 0;
	
	// CONSTRUCTURES
	public Reptil() {
		Reptil.cantidadReptiles += 1;
		Reptil.listado.add(this);
	}
	public Reptil(String colorEscamas, int largoCola) {
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.cantidadReptiles += 1;
		Reptil.listado.add(this);
	}
	public Reptil(String nombre,int edad, String habitat,String genero ,String colorEscamas, int  largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.cantidadReptiles += 1;
		Reptil.listado.add(this);
	}

	// METODOS
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return this.largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public static int cantidadReptiles() {
		return Reptil.cantidadReptiles;
	}

	public String movimiento() {
		return "reptar";
	}
	public static Animal crearIguana(String nombre,int edad,String genero ) {
		Reptil.iguanas += 1;
		Reptil iguana = new Reptil(nombre,edad, "humedal",genero,"verde",3);
		return iguana;
	}
	public static Animal crearSerpiente(String nombre,int edad,String genero ){
		Reptil.serpientes += 1;
		Reptil serpiente = new Reptil(nombre,edad, "jungla",genero,"blanco",1);
		return serpiente;
	}
}
