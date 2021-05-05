package ar.edu.unju.fi.tp4.service;

import java.util.List;

import ar.edu.unju.fi.tp4.models.Empleado;


public interface IEmpleadoService {
	
	/**
	 * Agregamos un empleado a la fuente de datos.
	 */
	public void addEmpleado(Empleado empleado);
	
	public Empleado getUltimoEmpleado();
	
	public Empleado getEmpleado();
	
	public List<Empleado> getAllEmpleados();
	
}
