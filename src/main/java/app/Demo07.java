package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Usuario;

public class Demo07 {

	/*Listado con filtro en este caso segun tipo*/
	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		TypedQuery<Usuario> consulta = em.createQuery("select a from Usuario a where a.tipo= :xtipo",Usuario.class);
		consulta.setParameter("xtipo", 2);
		List<Usuario>lstUsuario=consulta.getResultList();
		
		
		
		
		for (Usuario u : lstUsuario) {
			System.out.println(u);
		}
		
		/*Cierre*/
		
		em.getTransaction().commit();
		em.close();
	}
	
	
}
