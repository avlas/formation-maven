package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.model.Maire;

public class MavenJpa {
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("election");
		EntityManager em = entityManagerFactory.createEntityManager();
			
		TypedQuery<Maire> query = em.createQuery("from Maire", Maire.class);
		System.out.println("Number of maire : " + query.getResultList().size());
	}

}
