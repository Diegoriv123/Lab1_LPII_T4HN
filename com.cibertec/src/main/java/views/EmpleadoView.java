package views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		
		String empleado;
		// Metodo Crear Empleado
		empleado= new EmpleadoController().createEmpleado("Gomes","Juan",11,"Masculino",1500);
		
		
		// Metodo Eliminar Empleado
		empleado= new EmpleadoController().deleteEmpleado(3);
		
		//Metodo Actualizar Empleado
		empleado = new EmpleadoController().updateEmpleado(3, "Juana");
		
		//Metodo get Empleado
		empleado = new EmpleadoController().getEmpleado(3);
		
		System.out.print(empleado);
		
	}

}
