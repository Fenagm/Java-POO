package vehiculos;

public class Auto extends Vehiculo {
	
	private Integer numeroPuertas;
	
	// Constructores
	public Auto() {
		super();
	}
	public Auto(Integer kilometraje, String marca, Integer numeroPuertas) {   
		super(4,kilometraje,marca);
		this.numeroPuertas = numeroPuertas;
	}
	
	// Getters y setters
	public Integer getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(Integer numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	// toString
	public String toString() {
		return "[Auto \nCantidad de Ruedas: " + cantRuedas + "\nkilometraje: " + kilometraje+"kms" + "\nMarca:" + marca + "\nN° de Puertas: " + numeroPuertas+"]";
	}
	
	

}
