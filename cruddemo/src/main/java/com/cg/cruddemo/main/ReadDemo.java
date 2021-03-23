package com.cg.cruddemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.cruddemo.model.UserDetail;

public class ReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");

		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		UserDetail userDetail = entityManager.find(UserDetail.class, 3);
		System.out.println("user id:"+userDetail.getId());
		System.out.println("user name:"+userDetail.getName());
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
