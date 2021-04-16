package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controller.CalculadoraController;

@SpringBootApplication
public class SegundoProyectoScrimApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundoProyectoScrimApplication.class, args);
	
		CalculadoraController nuevoControlador = new CalculadoraController();
		nuevoControlador.resolverSuma();
	}

}
