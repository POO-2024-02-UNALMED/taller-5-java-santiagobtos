package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado =new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		
		this.listado.add(this);
		
	}
	public Reptil(String name, int age, String lugar, String Genre , String leg,int large) {
		super(name,age,lugar,Genre);
		
		this.colorEscamas=leg;
		this.largoCola=large;
		
		this.listado.add(this);
	}
	public static void crearSerpiente(String name,int edad,String generito) {
		Reptil nuevom = new Reptil(name,edad,"jungla",generito,"verde",1);
		serpientes++;
		
	}
	public static void crearIguana(String name,int edad,String generito) {
		Reptil nuevom = new Reptil(name,edad,"humedal",generito,"verde",3);
		iguanas++;
	}
	public static int cantidadReptiles() {
		int contador= iguanas+serpientes;
		return  contador;
	}
	@Override
	public String movimiento() {
		return "reptar";
	}
}
