package br.com.glandata.glandata.jpa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("glandata");
	
	public  static EntityManager getentEntityManager() {
		
		return FACTORY.createEntityManager();
		
	}
	

}
