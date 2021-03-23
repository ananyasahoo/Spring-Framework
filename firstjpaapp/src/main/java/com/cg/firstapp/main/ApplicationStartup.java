package com.cg.firstapp.main;


import com.cg.firstapp.model.UserDetail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ApplicationStartup {
	
	public static void main(String[] args) {
			UserDetail userDetail=new UserDetail();
			userDetail.setName("Ananya Priyadarshini");
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
			
			EntityManager entityManager =entityManagerFactory.createEntityManager();
			
			entityManager.getTransaction().begin();
			entityManager.persist(userDetail);
			entityManager.getTransaction().commit();
			entityManager.close();
			entityManagerFactory.close();
		     
	}
	
}
