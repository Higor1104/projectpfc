package br.com.projectpfc.provider;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {
	
	private static final EntityManagerProvider ENTITY_MANAGER_PROVIDER = new EntityManagerProvider();
	
	private EntityManagerFactory entityManagerFactory;
	
	private final String PERSISTENCE_UNIT_NAME = "";
			
	public EntityManagerProvider() {
	}
	
	public static EntityManagerProvider getInstance() {
		return ENTITY_MANAGER_PROVIDER;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return entityManagerFactory;
	}
	
	public void closeEntityManagerFactory() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
			entityManagerFactory = null;
		}
	}

}
