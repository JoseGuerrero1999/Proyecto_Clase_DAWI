package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {
	
	
	
	public static void main(String[] args) {
		//buscar y eliminar un codigo si existe o no
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		/*Inicia */
		em.getTransaction().begin();


	    /* Buscar y eliminar  */
		
		Usuario u = em.find(Usuario.class, 33);

		if (u==null){
			System.out.println("no existe  ");
		}else {
					em.remove(u);
					System.out.println("existe y eliminado");
		}
		

		
		
		
		/*Cierre*/
		
		em.getTransaction().commit();
		em.close();
		
	}
}
