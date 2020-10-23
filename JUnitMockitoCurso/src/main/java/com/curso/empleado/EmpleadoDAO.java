package com.curso.empleado;

import java.util.List;

public interface EmpleadoDAO {
	
	public List<Empleado> retrieveTodos();

	default void createEmpleado(Empleado empleado) {
		this.retrieveTodos().add(empleado);
	};

}
