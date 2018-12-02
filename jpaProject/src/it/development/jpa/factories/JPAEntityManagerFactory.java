package it.development.jpa.factories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class JPAEntityManagerFactory {
	
	@PersistenceContext(name="anagrafica")
	EntityManagerFactory e;
	
	private EntityManagerFactory getEntityManagerFactory(String persistenceUnitName) {
		this.e = Persistence.createEntityManagerFactory(persistenceUnitName);
		
		return e;
	}
	
	public EntityManager getEntityManager(String persistenceUnitName) {
		EntityManagerFactory entityManagerFactory = this.getEntityManagerFactory(persistenceUnitName);
		
		return entityManagerFactory.createEntityManager();
	}
	
	public void factoryShutDown() {
		this.e.close();
	}
	
}
