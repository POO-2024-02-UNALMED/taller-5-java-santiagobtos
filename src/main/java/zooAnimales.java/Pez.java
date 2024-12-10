package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private ArrayList<Pez> listado =new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		
		this.listado.add(this);
		
	}
	public Pez(String name, int age, String lugar, String Genre , String leg,int large) {
		super(name,age,lugar,Genre);
		
		this.colorEscamas=leg;
		this.cantidadAletas=large;
		
		this.listado.add(this);
	}
	public static void crearBacalao(String name,int edad,String generito) {
		Reptil nuevom = new Reptil(name,edad,"oceano",generito,"gris",6);
		bacalaos++;
		
	}
	public static void crearSalmon(String name,int edad,String generito) {
		Reptil nuevom = new Reptil(name,edad,"oceano",generito,"rojo",6);
		salmones++;
	}
	public static int cantidadPeces() {
		int contador= salmones+bacalaos;
		return  contador;
	}
	@Override
	public String movimiento() {
		return "nadar";
	}
}

