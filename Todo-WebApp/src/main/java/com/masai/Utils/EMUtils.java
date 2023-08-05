package com.masai.Utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtils {

	private static final EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("todos");
	}
	
	public EntityManager getConnection() {
		return emf.createEntityManager();
	}
	
}
