package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private ArrayList<Ave> listado =new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		
		this.listado.add(this);
		
	}
	public Ave(String name, int age, String lugar, String Genre , String leg) {
		super(name,age,lugar,Genre);
		
		this.colorPlumas=leg;
		
		this.listado.add(this);
	}
	public static void crearHalcon(String name,int edad,String generito) {
		Ave nuevom = new Ave(name,edad,"montañas",generito,"cafe glorioso");
		halcones++;
		
	}
	public static void crearAguila(String name,int edad,String generito) {
		Ave nuevom = new Ave(name,edad,"montañas",generito,"blanco y amarillo");
		aguilas++;
	}
	public static int cantidadAves() {
		int contador= aguilas+halcones;
		return contador;
	}
	@Override
	public String movimiento() {
		return "volar";
		
	}
    public String getColorPlumas() {
    return colorPlumas;
}

    public void setColorPlumas(String colorPlumas) {
    this.colorPlumas = colorPlumas;
}

}
