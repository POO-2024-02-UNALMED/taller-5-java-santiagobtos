package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado =new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
    private static int total;
	
	public Reptil() {
		total++;
		this.listado.add(this);
		
	}
	public Reptil(String name, int age, String lugar, String Genre , String leg,int large) {
		super(name,age,lugar,Genre);
		
		this.colorEscamas=leg;
		this.largoCola=large;
		
		this.listado.add(this);
	}
	public static Reptil crearSerpiente(String name,int edad,String generito) {
		Reptil nuevom = new Reptil(name,edad,"jungla",generito,"verde",1);
		serpientes++;
		return nuevom;
	}
	public static Reptil crearIguana(String name,int edad,String generito) {
		Reptil nuevom = new Reptil(name,edad,"humedal",generito,"verde",3);
		iguanas++;
        return nuevom;
	}
	public static int cantidadReptiles() {
		int contador= iguanas+serpientes+total;
		return  contador;
	}
	@Override
	public String movimiento() {
		return "reptar";
	}
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
}
