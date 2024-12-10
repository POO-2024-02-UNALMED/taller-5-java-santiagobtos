package gestion;
import java.util.*;
import zooAnimales.Animal;
public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona() {
		this.animales=new ArrayList<>();
	}
	public Zona(String name, Zoologico zool) {
		this.nombre=name;
		this.zoo=zool;
		this.animales=new ArrayList<>();
	}
	public int cantidadAnimales() {
		return this.animales.size();
	}
	public void agregarAnimales(Animal animol) {
		this.animales.add(animol);
		
	}
	public void setNombre(String nuevo) {
		this.nombre=nuevo;
		
		
	}
	public void setZoo(Zoologico zo) {
		this.zoo=zo;
		
	}
	public String getNombre() {
		return this.nombre;
		
	}
	public Zoologico getZoo() {
		return this.zoo;
	}
}
