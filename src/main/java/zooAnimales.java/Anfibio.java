package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private ArrayList<Anfibio> listado =new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
    private static int total = 1;
	
	public Anfibio() {
		total++;
		this.listado.add(this);
		
	}
	public Anfibio(String name, int age, String lugar, String Genre , String leg,boolean large) {
		super(name,age,lugar,Genre);
		
		this.colorPiel=leg;
		this.venenoso=large;
		
		this.listado.add(this);
	}
	public static Anfibio crearRana(String name,int edad,String generito) {
		Anfibio nuevom = new Anfibio(name,edad,"selva",generito,"rojo",true);
		ranas++;
        return nuevom;
		
	}
	public static Anfibio crearSalamandra(String name,int edad,String generito) {
		Anfibio nuevom = new Anfibio(name,edad,"selva",generito,"negro y amarillp",false);
		salamandras++;
        return nuevom;
	}
	public static int cantidadAnfibios() {
		int contador= salamandras+ranas+total;
		return  contador;
	}
	@Override
	public String movimiento() {
		return "saltar";
	}
    public String getColorPiel() {
    return colorPiel;
}

    public void setColorPiel(String colorPiel) {
    this.colorPiel = colorPiel;
}


    public boolean isVenenoso() {
    return venenoso;
}

    public void setVenenoso(boolean venenoso) {
    this.venenoso = venenoso;
}

}
