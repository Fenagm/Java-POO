package sistemaGarage;

import javax.swing.*;

import vehiculos.Auto;
import vehiculos.Moto;

public class GarageTest {
	
	public static void main(String[] args) {
		
		Double precio= 0.0;
		Integer capMax= 0;
		Integer capOcupada= 0;
		
		precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del cambio de rueda"));
		capMax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad máxima del garage"));
		
		//Creación Garage
		Garage g1 = new Garage (precio, capMax, capOcupada);
		
		
		//Creación Vehiculos
		Moto m1 = new Moto (15000, "Kawazaki", 250);
		Moto m2 = new Moto (7500, "Moto model 2", 150);
		Moto m3 = new Moto (25000, "Moto model 3", 350);
		Auto a1 = new Auto (67000, "Auto model 1", 3);
		Auto a2 = new Auto (18000, "Auto model 2", 5);
		
		System.out.println("Se fijo el precio en: $"+precio);
		System.out.println();
		System.out.println("Se fijo la capacidad maxima en: "+capMax+" lugares.");
		System.out.println();
		//Ingresar Vehiculos
		g1.ingresarVehiculo(m1);
		g1.ingresarVehiculo(a1);
		g1.ingresarVehiculo(m2);
			
		
		//System.out.println(g1);
		//System.out.println();
		
		
		g1.retirarVehiculo(a1);
		
		//System.out.println(g1);
		//System.out.println();
		
		g1.ingresarVehiculo(a2);
		
		System.out.println(g1);
		//System.out.println();
		
		System.out.println("Total del cambio de ruedas= " + g1.calcularTotCambioRuedas());
		System.out.println();
		
		System.out.println("Total de atendidos= " + g1.calcularAtendidos());
		System.out.println();
		
		System.out.println("Disponibilidad= " + g1.calcularDisponibilidad());
		System.out.println();

		System.out.println("Kilometraje medio= " + g1.calcularKmMedio());
		System.out.println();
	
	}

}
