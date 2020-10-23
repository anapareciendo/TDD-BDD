package com.curso.empleado;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EmpleadoJUnitParameterizedTest {
	
	Empleado empleado = new Empleado();
	private static Empleado empleadoMayor = new Empleado("Manuel", "Silvano", 50, 3700);
	private static Empleado empleadoMenor = new Empleado("Manuel", "Silvano", 20, 2000);
	
	private Boolean expectedOutput;
	
	public EmpleadoJUnitParameterizedTest(Empleado empleado, Boolean expectedOutput) {
		this.empleado = empleado;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection testConditions() {
		Object expectedOutputs[][] = {
				{empleadoMayor, true}, 
				{empleadoMenor, false}};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testsEmpleado() {
		assertEquals(expectedOutput, 
				empleado.plus(500.0));
	}

}
