package com.curso.empleado;

import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;


public class EmpleadoHamcrestTest {
	
	static Empleado empleadoMayor;
	static Empleado empleadoMenor;
	static Empleado empleadoDiferente;

	@BeforeClass
	public static void before() {
		empleadoMayor = new Empleado("Manuel", "Silvano", 50, 3000);
		empleadoMenor = new Empleado("Manuel", "Silvano", 20, 5000);
		empleadoDiferente = new Empleado("Jose", "De Cruz", 20, 1500);
	}
	
	@Test
	public void empleadoPlusHamcrest() {
		
		assertThat(empleadoMayor.plus(500), is(true));
		assertThat(empleadoMenor.plus(500), is(false));
		
	}

}
