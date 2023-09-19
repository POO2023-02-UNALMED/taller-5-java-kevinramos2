package zooAnimales;
import java.util.List;
import java.util.ArrayList;

public class Ave extends Animal{
	/* ATRIBUTOS*/
	private  static List<Ave> listado =new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	/*CONSTRUCTURES*/
	public Ave(String nombre,int edad, String habitat,String genero, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas=colorPlumas;
		Ave.listado.add(this);
	}
	
	public Ave() {
		Ave.listado.add(this);
	}
	
	/*MÉTODOS*/
	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public static List<Ave> getListado() {
		return listado;
	}

	public static void setListado(List<Ave> listado) {
		Ave.listado = listado;
	}

	public int cantidadAves() {
		return listado.size();
	}
	public String movimiento() {
		return "volar";
	}
	
	public static Animal crearHalcon(String nombre,int edad,String genero) {
		Ave.halcones++;
		return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
	}	

	public static Animal crearAguila(String nombre,int edad,String genero){
		Ave.aguilas++;
		return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
	}
}