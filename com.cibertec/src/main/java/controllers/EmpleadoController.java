package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Empleado;


public class EmpleadoController {

	//Creacion de Usuario
	public String createEmpleado(String apellido, String nombre, int edad, String sexo, int salario) {
	
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
	
		Session session;
		session = sessionFactory.openSession();
		
		try {
			Empleado empleado;
			empleado= new Empleado(apellido, nombre, edad, sexo, salario);
		
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();
		
			sessionFactory.close();
			
			return "Empleado creado";
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return "Error al crear usuario";
		
	}
	//Eliminar Usuario
	public String deleteEmpleado(int idempleado) {
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
	
		Session session;
		session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado= session.get(Empleado.class, idempleado);
			session.delete(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Empleado eliminado correctamente";
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return "Error al eliminar usuario";
	}
	
	// Actualizar o modificar Empleado
		public String updateEmpleado(int idempleado, String nombre) {
				
			SessionFactory sessionFactory;
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
			
			Session session;
			session= sessionFactory.openSession();
			
			try {
				
				session.beginTransaction();
				Empleado empleado = session.get(Empleado.class, idempleado);
				empleado.setNombre(nombre);
				session.update(empleado);
				session.getTransaction().commit();
				
				sessionFactory.close();
				
				return "Empleado actualizado correctamente";
			}
			
			catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
			return "Error al actualizar usuario";
			
			}
		//Leer u obtener empleado
		public String getEmpleado(int idempleado) {
			
			SessionFactory sessionFactory;
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
			
			Session session;
			session= sessionFactory.openSession();
			
			try {
			
				session.beginTransaction();
				Empleado empleado = session.get(Empleado.class, idempleado);
				session.getTransaction().commit();
				sessionFactory.close();
				
				return empleado.toString();
			}
			
			catch(Exception e){
				
				e.printStackTrace();
			}
			
			return "Empleado no existe";
			
		}
}

