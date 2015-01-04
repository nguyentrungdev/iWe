package com.github.nguyentrungdev.iwe.util;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
  
public class HibernateUtil {
  
	private static Configuration configuration = getConfigure();
    private static final SessionFactory sessionFactory = buildSessionFactory();
    //private static final EntityManagerFactory entityMangerFactory = buildEntityManagerFactory();
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return configuration.buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
  
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    private static Configuration getConfigure() {
    	return new Configuration().configure();
    }
    
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
    
    /*private static EntityManagerFactory buildEntityManagerFactory() {
    	Map<String, String> properties = new HashMap<String, String>();
    	properties.put("javax.persistence.jdbc.user", configuration.getProperty("connection.username"));
    	properties.put("javax.persistence.jdbc.password", configuration.getProperty("connection.password"));
    	return Persistence.createEntityManagerFactory(configuration.getProperty("connection.url"), properties);
    }
    
    public static EntityManagerFactory getEntityMangerFactory() {
    	return entityMangerFactory;
    }*/
  
}