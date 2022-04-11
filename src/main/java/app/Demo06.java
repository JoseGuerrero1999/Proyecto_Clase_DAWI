package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.mysql.cj.conf.ConnectionUrl.Type;

import model.Usuario;

public class Demo06 {

	/*Listado*/
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		/*Select * from  tb_usuarios*/
		
		/*Esta forma la debes hacer siempre*/
		/* 
		 * TypedQuery<Usuario> consulta =
		 * em.createQuery("select a from Usuario a",Usuario.class);
		 * List<Usuario>lstUsuario=consulta.getResultList();
		 */
		
		/*esta puede ser debes en cuanto*/
		
		List<Usuario>lstUsuario= em.createQuery("select a from Usuario a",Usuario.class).getResultList();
		
		for (Usuario u : lstUsuario) {
			System.out.println(u);
		}
		
		/*Cierre*/
		
		em.getTransaction().commit();
		em.close();
	}
	
}
