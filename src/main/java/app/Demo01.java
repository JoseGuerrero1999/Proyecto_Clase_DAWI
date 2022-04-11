package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo01 {

	public static void main(String[] args) {
		
		//registrar
		
		Usuario u=new Usuario(13, "Juan", "Perez", "jperez@gmail.com", "345", "2000/01/15", 1, 1);
		
		
		/* grabar en tabla  */
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		/*Inicia */
		em.getTransaction().begin();

		/*procesa*/	
		em.persist(u);
		
		/*Cierre*/
		
		em.getTransaction().commit();
		em.close();
		
	}
}
