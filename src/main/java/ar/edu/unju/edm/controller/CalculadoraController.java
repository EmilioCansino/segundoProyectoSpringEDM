package ar.edu.unju.edm.controller;
import ar.edu.unju.edm.model.Calculadora;

public class CalculadoraController {

	public void resolverSuma() {
	
		int num1=10;
		int num2=20;
		
		Calculadora nuevaCalculadora = new Calculadora();
		
		nuevaCalculadora.setNum1(num1);
		nuevaCalculadora.setNum2(num2);
		System.out.println("El resultado de la suma es:"+ nuevaCalculadora.sumarDosNumeros());
		nuevaCalculadora.sumarDosNumeros();
	}
	
}
