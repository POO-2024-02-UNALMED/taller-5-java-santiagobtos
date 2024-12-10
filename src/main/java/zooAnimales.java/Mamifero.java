package zooAnimales;

import java.util.ArrayList;



public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado =new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		
		this.listado.add(this);
		
	}
	public Mamifero(String name, int age, String lugar, String Genre , boolean estao, int leg) {
		super(name,age,lugar,Genre);
		this.pelaje=estao;
		this.patas=leg;
		
		this.listado.add(this);
	}
	public static void crearCaballo(String name,int edad,String generito) {
		Mamifero nuevom = new Mamifero(name,edad,"pradera",generito,true,4);
		caballos++;
		
	}
	public static void crearLeon(String name,int edad,String generito) {
		Mamifero nuevom = new Mamifero(name,edad,"selva",generito,true,4);
		leones++;
	}
	public static int cantidadMamiferos() {
		int contador= caballos+leones;
		return contador;
	}
	
}
