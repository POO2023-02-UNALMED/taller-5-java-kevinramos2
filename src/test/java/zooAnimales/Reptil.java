package zooAnimales;
import java.util.List;
import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal {
	/* ATRIBUTOS*/
	private static List<Reptil> listado =new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	/*CONSTRUCTURES*/
	public Reptil(String nombre,int edad, String habitat,String genero ,String colorEscamas, int  largoCola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}
	
	public Reptil() {
		Reptil.listado.add(this);
	}
	
	/*MÉTODOS*/
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	public static List<Reptil> getListado() {
		return listado;
	}
	public static void setListado(List<Reptil> listado) {
		Reptil.listado = listado;
	}
	public int cantidadReptiles() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "reptar";
	}
	public static Animal crearIguana(String nombre,int edad,String genero ) {
		Reptil.iguanas++;
		return new Reptil(nombre,edad, "humedal",genero,"verde",3);
	}
	public static Animal crearSerpiente(String nombre,int edad,String genero ){
		Reptil.serpientes++;
		return new Reptil(nombre,edad, "jungla",genero,"blanco",1);
	}
}
