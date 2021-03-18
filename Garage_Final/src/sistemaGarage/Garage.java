package sistemaGarage;

import java.util.Arrays;

import vehiculos.Vehiculo;

public class Garage {
	
	private Double precio;
	private Integer capacidadMax;
	private Vehiculo vehiculo[];
	private Integer capacidadOcupada;
	private Integer atendidos=0;
	
	// Constructores
	
	public Garage(){
	}
	
	public Garage(Double precio, Integer capacidadMax, Integer capacidadOcupada) {
		super();
		this.precio = precio;
		this.capacidadMax = capacidadMax;
		this.vehiculo = new Vehiculo[capacidadMax];
		this.capacidadOcupada = capacidadOcupada;
	}
	
	
	// Getters y setters
	
	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(Integer capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	public Vehiculo[] getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo[] vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Integer getCapacidadOcupada() {
		return capacidadOcupada;
	}

	public void setCapacidadOcupada(Integer capacidadOcupada) {
		this.capacidadOcupada = capacidadOcupada;
	}
	
	// Métodos de la Clase
	
	public void ingresarVehiculo(Vehiculo vehiculo){
		
		if (capacidadOcupada >= capacidadMax){
			System.out.println("El garage está lleno");	
			System.out.println();
		}else{
			int i;
			for (i=0; i <= this.capacidadMax - 1; i++ ){
				if (this.vehiculo[i] == null){
					this.vehiculo[i] = vehiculo;
					vehiculo.setPosicion(i);
					this.capacidadOcupada++;
					this.atendidos++;
					System.out.println("Se ha ingresado un vehiculo: "+vehiculo.toString());
					System.out.println("Quedan un total de "+calcularDisponibilidad()+" Espacios disponibles");
					System.out.println();
					break;
				}
			}
		}
	}
	
	public void retirarVehiculo(Vehiculo vehiculo){
			
			boolean noexistevehiculo=false;
			for (int i = 0; i < capacidadMax; i++) {
				if (this.vehiculo[i]==vehiculo)
				{
					this.vehiculo[i]=null;
					noexistevehiculo=true;
					this.vehiculo[vehiculo.getPosicion()] = null;
					this.capacidadOcupada--;
					System.out.println("Se retira = "+vehiculo.toString());
					System.out.println("Quedan un total de "+calcularDisponibilidad()+" Espacios disponibles");	
					System.out.println();
				}
			}
			if (noexistevehiculo){
				System.out.println("El vehiculo no existe, vuelva a intentar");
				System.out.println();
			}
	}
	
	
	public Integer calcularDisponibilidad(){
		Integer disponible = this.capacidadMax - this.capacidadOcupada;
		return disponible;
	}
	
	
	public Integer calcularAtendidos(){
		return this.atendidos;
	}
	
	
	public Double calcularTotCambioRuedas(){
		int i;
		Double total=0.00;
		for (i=0; i <= this.capacidadMax - 1; i++ ){
			if (this.vehiculo[i] != null){
				total += vehiculo[i].calcularCambioRuedas(this.precio);
			}
		}
		return total;
	}
	
	
	public Double calcularKmMedio(){
		int i;
		Double kmMedio=0.0;
		for (i=0; i <= this.capacidadMax - 1; i++ ){
			if (this.vehiculo[i] != null){
				kmMedio += vehiculo[i].getKilometraje();
			}
		}
		kmMedio = kmMedio / this.capacidadOcupada;
		return kmMedio;
	}

	
	

	@Override
	public String toString() {
		return "Garage Informacion: \nPrecio=" + precio + "\nCapacidad Max:" + capacidadMax + "\nvehiculos ingresados:" + Arrays.toString(vehiculo)
				+ "\ncapacidad Ocupada: " + capacidadOcupada+" lugares ocupados" + "\nVehiculos atendidos=" + atendidos;
	}
	
	
}


