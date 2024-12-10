package gestion;
import java.util.*;
import zooAnimales.Animal;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zona ;
	
	public Zoologico() {
		this.zona =new ArrayList<>();
	}
	public Zoologico(String name , String ubi) {
		this.nombre=name;
		this.ubicacion=ubi;
		this.zona= new ArrayList<>();
	}
	public void agregarZonas(Zona lugar) {
		this.zona.add(lugar);
		lugar.setZoo(this);
	}
	public int cantidadTotalAnimales() {
		int contador=0;
		for (int i = 0; i < this.zona.size(); i++) {
			contador =this.zona.get(i).cantidadAnimales()+ contador;
			
		}
		return contador;
	}
	public void setNombre(String nuevo) {
		this.nombre=nuevo;
		
		
	}
	public void setUbicacion(String ubi) {
		this.ubicacion=ubi;
		
	}
	public String getNombre() {
		return this.nombre;
		
	}
	public String getUbicacion() {
		return this.ubicacion;
	}
    public Zona getZona(){
        return this.zona;
    }
}
