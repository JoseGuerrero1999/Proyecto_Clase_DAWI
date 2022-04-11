package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {
	public static void main(String[] args) {
		
		//actualizar
		
		Usuario u=new Usuario(33, "Carla", "Toro", "U0022@gmail.com", "10002", "2022-03-24", 2, 1);
		
		
		/* grabar en tabla  */
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		/*Inicia */
		em.getTransaction().begin();

		/*procesa-ACTUALIZAr, si no existe solo crea uno */
		em.merge(u);
		
		/*Cierre*/
		
		em.getTransaction().commit();
		em.close();
		
	}
}
