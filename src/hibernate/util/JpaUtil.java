package hibernate.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManagerFactory;

public class JpaUtil { 
	
    private static final EntityManagerFactory entityManagerFactory = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("ejemploHibernate");
    }

    public static EntityManager getEntityManager() { 
        return entityManagerFactory.createEntityManager();
    }
}

