package com.curso.empleado;

import java.util.List;

public class EmpleadoManager {
	
	private EmpleadoDAO todoServiceEmpleado;

	EmpleadoManager(EmpleadoDAO todoServiceEmpleado) {
		this.todoServiceEmpleado = todoServiceEmpleado;
	}

	public List<Empleado> getAll() {
		List<Empleado> allTodos = todoServiceEmpleado.retrieveTodos();
	
		return allTodos;
	}
	
	public void createEmpleado(Empleado empleado) {
		
		todoServiceEmpleado.createEmpleado(empleado);
		
	}
}
