package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo03 {
	public static void main(String[] args) {
	
	/*este viene con error de no poder eliminar usa la demo04 como guia para buscar y la demo05 para eliminar con busqueda*/
		/*Eliminar usuario*/
		
		/* grabar en tabla  */
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		/*Inicia */
		em.getTransaction().begin();

		/*Eliminar 1 usuario*/
		
		/*borrado 1- SE MANTIENE COMO UPDATE */
		
		
		/*BORRADO 2 SE ELIMINA POR COMPLETO*/
		Usuario u = new Usuario(33, "Carla", "Toro", "U0022@gmail.com", "10002", "2022-03-24", 2, 1);
		em.remove(u);
		
		
		/*Cierre*/
		
		em.getTransaction().commit();
		em.close();
		
	}
}


