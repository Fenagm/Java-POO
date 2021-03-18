package vehiculos;

public class Moto extends Vehiculo {
	
	private Integer cilindrada;

	// Constructores
	public Moto() {
		super();
	}
	public Moto(Integer kilometraje, String marca, Integer cilindrada) {
		super(2,kilometraje,marca);
		this.cilindrada = cilindrada;
	}
	
	// Getters y setters
	public Integer getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	// toSring
	public String toString() {
		return "[Moto \nCantidad de Ruedas:" + cantRuedas + "\nkilometraje: " + kilometraje+" kms." + "\nMarca:" + marca + "\nCilindrada: " + cilindrada + "cc]";
	}
	
	
}
