package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {

	@Id
	@Column(name="IdEmpleado")
	private int idempleado;
	
	@Column(name="Apellidos")
	private String apellido;
	
	@Column(name="Nombres")
	private String nombre;
	
	@Column(name="Edad")
	private int edad;
	
	@Column(name="Sexo")
	private String sexo;
	
	@Column(name="Salario")
	private int salario;
	
	
	
	public Empleado() {
	}

	public Empleado(String apellido, String nombre, int edad, String sexo, int salario) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Usuario [idempleado=" + idempleado + ", apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad
				+ ", sexo=" + sexo + ", salario=" + salario + "]";
	}
		
	
}
