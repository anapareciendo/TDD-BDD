package com.curso.empleado;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TodoEmpleadoImplMockitoInjectMocksTest {
	@Mock
	EmpleadoDAO empleadoDAO;

	@InjectMocks
	EmpleadoManager empleadoManager;

	@Captor
	ArgumentCaptor<Empleado> empleadoArgumentCaptor;

	static Empleado empleadoMayor;
	static Empleado empleadoMenor;
	static Empleado empleadoDiferente;
	static Empleado nuevoEmpleado;

	@BeforeClass
	public static void before() {
		empleadoMayor = new Empleado("Manuel", "Silvano", 50, 3000);
		empleadoMenor = new Empleado("Manuel", "Silvano", 20, 5000);
		empleadoDiferente = new Empleado("Jose", "De Cruz", 20, 1500);
		nuevoEmpleado = new Empleado("Ana", "Aparicio", 29, 9000);
	}
	
	@Test
	public void usingMockito() {
		List<Empleado> allTodos = Arrays.asList(empleadoMayor, empleadoMenor, empleadoDiferente);

		when(empleadoDAO.retrieveTodos()).thenReturn(allTodos);

		List<Empleado> todos = empleadoManager
				.getAll();
		//assertThat(todos, allOf(hasSize(2), hasItems("Learn Spring MVC","Learn Spring") ));
		assertThat(todos, anyOf(hasSize(3), contains(empleadoMayor, empleadoMenor, empleadoDiferente) ));
	}

	@Test
	public void usingMockito_UsingBDD() {
		List<Empleado> allTodos = Arrays.asList(empleadoMayor, empleadoMenor, empleadoDiferente);

		//given
		given(empleadoDAO.retrieveTodos()).willReturn(allTodos);

		//when
		List<Empleado> todos = empleadoManager.getAll();

		//then
		assertThat(todos.size(), is(3));
	}

	@Test
	public void letsTestCreateEmpledao() {

		List<Empleado> allTodos = Arrays.asList(empleadoMayor, empleadoMenor, empleadoDiferente);

		when(empleadoDAO.retrieveTodos()).thenReturn(allTodos);

		empleadoManager.createEmpleado(nuevoEmpleado);

		verify(empleadoDAO).createEmpleado(nuevoEmpleado);

		verify(empleadoDAO, Mockito.times(1)).createEmpleado(nuevoEmpleado);
		// atLeastOnce, atLeast

	}

	@Test
	public void captureArgument() {
		List<Empleado> allTodos = Arrays.asList(empleadoMayor, empleadoMenor, empleadoDiferente);
		
		Mockito.when(empleadoDAO.retrieveTodos()).thenReturn(allTodos);

		empleadoManager.createEmpleado(nuevoEmpleado);
		Mockito.verify(empleadoDAO).createEmpleado(empleadoArgumentCaptor.capture());

		assertEquals(nuevoEmpleado, empleadoArgumentCaptor.getValue());
		assertThat(empleadoArgumentCaptor.getValue(), is(nuevoEmpleado));
		assertThat(empleadoArgumentCaptor.getAllValues(), hasItems(nuevoEmpleado));
	}
}
