package vehiculos;

public abstract class Vehiculo {
	
	protected Integer cantRuedas;
	protected Integer kilometraje;
	protected String marca;
	protected Integer posicion;
	
	
	// constructores
	public Vehiculo(){
		
	}
	
	public Vehiculo(Integer cantRuedas, Integer kilometraje, String marca) {
		super();
		this.cantRuedas = cantRuedas;
		this.kilometraje = kilometraje;
		this.marca = marca;
	}
	// getters y setters
	public Integer getCantRuedas() {
		return cantRuedas;
	}
	public void setCantRuedas(Integer cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
	public Integer getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getPosicion() {
		return posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}
	
	// Métodos de la Clase

	public Double calcularCambioRuedas(Double precio){
		double total = cantRuedas * precio;
		return total;
	}

	
	// toString
	public String toString() {
		return "Vehiculo"+"\nCantidad de Ruedas:" + cantRuedas + "\nKilometraje: " + kilometraje + "\nMarca:" + marca ;
	}

	
	

}
