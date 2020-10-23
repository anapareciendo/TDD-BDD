package com.curso.empleado.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.curso.empleado.EmpleadoHamcrestTest;
import com.curso.empleado.EmpleadoJUnitParameterizedTest;
import com.curso.empleado.EmpleadoJUnitTest;

@RunWith(Suite.class)
@SuiteClasses({EmpleadoJUnitTest.class, EmpleadoJUnitParameterizedTest.class, EmpleadoHamcrestTest.class})
public class EmpleadoTestSuite {

}
