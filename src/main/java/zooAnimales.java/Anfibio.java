package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private ArrayList<Anfibio> listado =new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		
		this.listado.add(this);
		
	}
	public Anfibio(String name, int age, String lugar, String Genre , String leg,boolean large) {
		super(name,age,lugar,Genre);
		
		this.colorPiel=leg;
		this.venenoso=large;
		
		this.listado.add(this);
	}
	public static void crearRana(String name,int edad,String generito) {
		Anfibio nuevom = new Anfibio(name,edad,"selva",generito,"rojo",true);
		ranas++;
		
	}
	public static void crearSalamandra(String name,int edad,String generito) {
		Anfibio nuevom = new Anfibio(name,edad,"selva",generito,"negro y amarillp",false);
		salamandras++;
	}
	public static int cantidadAnfibios() {
		int contador= salamandras+ranas;
		return  contador;
	}
	@Override
	public String movimiento() {
		return "saltar";
	}

}
