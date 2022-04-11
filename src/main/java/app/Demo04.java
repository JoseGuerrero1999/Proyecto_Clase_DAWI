package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo04 {
 
	public static void main(String[] args) {
		//buscar los datos segun codigo
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		/*Inicia */
		em.getTransaction().begin();


	    /* Buscar por algo   */
		Usuario u = em.find(Usuario.class, 33);
		System.out.println(u);
		
		
		/*Cierre*/
		
		em.getTransaction().commit();
		em.close();
		
	}
}
