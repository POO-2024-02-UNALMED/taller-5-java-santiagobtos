package zooAnimales;

import java.util.ArrayList;



public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado =new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
    private static int total=1;
	
	public Mamifero() {
		total++;
		this.listado.add(this);
		
	}
	public Mamifero(String name, int age, String lugar, String Genre , boolean estao, int leg) {
		super(name,age,lugar,Genre);
		this.pelaje=estao;
		this.patas=leg;
		
		this.listado.add(this);
	}
	public static Mamifero crearCaballo(String name,int edad,String generito) {
		Mamifero nuevom = new Mamifero(name,edad,"pradera",generito,true,4);
		caballos++;
        return nuevom;
		
	}
	public static Mamifero crearLeon(String name,int edad,String generito) {
		Mamifero nuevom = new Mamifero(name,edad,"selva",generito,true,4);
		leones++;
        return nuevom;
	}
	public static int cantidadMamiferos() {
		int contador= caballos+leones+total;
		return contador;
	}
    public boolean isPelaje() {
    return pelaje;
}

    public void setPelaje(boolean pelaje) {
    this.pelaje = pelaje;
}


    public int getPatas() {
    return patas;
}

    public void setPatas(int patas) {
    this.patas = patas;
}

	
}
