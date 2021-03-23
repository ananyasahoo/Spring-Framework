package com.cg.embeddeddemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.embeddeddemo.modal.Address;
import com.cg.embeddeddemo.modal.UserDetail;

public class ApplicationStartup {
	public static void main(String [] args) {
		UserDetail userDetail=new UserDetail();
		userDetail.setName("Ananya");
		
		Address address=new Address();
		address.setCity("Khordha");
		address.setHouseNo("1-38");
		address.setState("Odisha");
		address.setZip("752057");
		userDetail.setAddress(address);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(userDetail);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
