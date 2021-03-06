package com.cg.cruddemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.cruddemo.model.UserDetail;

public class UpdateDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");

		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		UserDetail userDetail = entityManager.find(UserDetail.class, 1);
		userDetail.setName("Ananya");
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
