package zooAnimales;
import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona = new Zona[1];
	
	public Animal() {
		
		totalAnimales++;
	}
	public Animal(String b, int c , String d, String e ) {
		this.nombre= b;
		this.edad=c;
		this.habitat=d;
		this.genero=e;
		
		totalAnimales++;
		
	}

    public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        this.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona[] getZona() {
        return zona;
    }

    public void setZona(Zona[] zona) {
        this.zona = zona;
        
    }
    public String totalPorTipo() {
    	  return "Mamífero: " + Mamifero.cantidadMamiferos() + "\n" + 
    	           "Aves: " + Ave.cantidadAves() + "\n" +
    	           "Reptiles: " + Reptil.cantidadReptiles() + "\n" +
    	           "Peces: " + Pez.cantidadPeces() + "\n" +
    	           "Anfibios: " + Anfibio.cantidadAnfibios();
    }
    public String toString() {
    	if (zona[0] != null) {
    	    return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + 
    	           " y mi género es " + genero + ", la zona en la que me ubico es " + zona[0].getNombre() + 
    	           ", en el " + zona[0].getZoo() ;
    	} else {
    	    return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + 
    	           " y mi género es " + genero ;
    	}
    	}
    
    public String movimiento() {
    	return "desplazarse";
    }
    
}	
