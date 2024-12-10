package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private ArrayList<Ave> listado =new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
    private static int total;
	
	public Ave() {
		total++;
		this.listado.add(this);
		
	}
	public Ave(String name, int age, String lugar, String Genre , String leg) {
		super(name,age,lugar,Genre);
		
		this.colorPlumas=leg;
		total++;
		this.listado.add(this);
	}
	public static Ave crearHalcon(String name,int edad,String generito) {
		Ave nuevom = new Ave(name,edad,"montanas",generito,"cafe glorioso");
		halcones++;
        return nuevom;
		
	}
	public static Ave crearAguila(String name,int edad,String generito) {
		Ave nuevom = new Ave(name,edad,"montanas",generito,"blanco y amarillo");
		aguilas++;
        return nuevom;
	}
	public static int cantidadAves() {
		int contador= aguilas+halcones+total;
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
