package ar.edu.unju.fi.tp4.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.models.Empleado;
import ar.edu.unju.fi.tp4.service.IEmpleadoService;



@Service
public class EmpleadoServiceImp implements IEmpleadoService {

	@Autowired
	Empleado empleado;
	
	List<Empleado> empleados = new ArrayList<Empleado>();
	
	public EmpleadoServiceImp() {
		Empleado e1 = new Empleado(1233, "Cabrera", "Jose Dario", 200.33d);
		Empleado e2 = new Empleado(1234, "Ramirez", "Damian Pedro", 300.33d);
		Empleado e3 = new Empleado(1235, "Tolaba", "Luis Pedro", 250.33d);
		Empleado e4 = new Empleado(1236, "Zubia", "Manuel", 300.33d);
		Empleado e5 = new Empleado(1237, "Pereira", "Lucas Samuel", 400.33d);
		this.empleados.add(e1);
		this.empleados.add(e2);
		this.empleados.add(e3);
		this.empleados.add(e4);
		this.empleados.add(e5);
		
		
	}
	
	@Override
	public void addEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	@Override
	public Empleado getUltimoEmpleado() {
		int indiceUltimoElemento = empleados.size() - 1;
		Empleado empleado = empleados.get(indiceUltimoElemento); 
		return empleado;
	}
	
	@Override
	public Empleado getEmpleado() {
		this.empleado.setLegajo(9999);
		return this.empleado;
	}

	@Override
	public List<Empleado> getAllEmpleados() {
		return this.empleados;
	}
	

}
