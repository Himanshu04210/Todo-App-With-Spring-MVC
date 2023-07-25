package com.masai.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtils {
	private static final EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("blue_dartUnit");
	}
	
	public static EntityManager getConnection() {
		return emf.createEntityManager();
	}
	
	
}