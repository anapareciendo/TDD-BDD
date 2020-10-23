package com.curso.empleado;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class EmpleadoJUnitTest {
	
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
	public void testPlusSalario() {
		assertTrue(empleadoMayor.plus(100));
	}
	
	@Test
	public void testNoPlusSalario() {
		assertFalse(empleadoMenor.plus(300));
	}
	
	@Test
	public void testEqualsEmpleadosNombreApellido() {
		assertTrue(empleadoMayor.equals(empleadoMenor));
	}
	
	@Test
	public void testNotEqualsEmpleadosNombreApellido() {
		assertFalse(empleadoMayor.equals(empleadoDiferente));
	}
	
	@Test
	public void testEmpleadoMayor() {
		assertEquals(empleadoMayor.compareTo(empleadoMenor), 1);
	}
	
	@Test
	public void testEmpleadoMenor() {
		assertEquals(empleadoMenor.compareTo(empleadoMayor), -1);
	}
	
	@Test
	public void testEmpleadoIguales() {
		assertEquals(empleadoMenor.compareTo(empleadoDiferente), 0);
	}
	
	@Test
	public void testEstadoEmpleado() {
		assertEquals("El empleado se llama Manuel Silvano con 50 años y un salario de 3000.0", empleadoMayor.toString());
	}

}
