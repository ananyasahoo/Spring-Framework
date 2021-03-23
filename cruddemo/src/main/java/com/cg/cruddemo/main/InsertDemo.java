package com.cg.cruddemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.cruddemo.model.UserDetail;

public class InsertDemo {

	public static void main(String[] args) {
		UserDetail userDetail=new UserDetail();
		userDetail.setName("Srihari");
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");

		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(userDetail);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
