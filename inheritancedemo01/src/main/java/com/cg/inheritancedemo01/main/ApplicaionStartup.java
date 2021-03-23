package com.cg.inheritancedemo01.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.inheritancedemo01.model.ExternalProject;
import com.cg.inheritancedemo01.model.InternalProject;
import com.cg.inheritancedemo01.model.Project;

public class ApplicaionStartup {
public static void main(String[] args) {
		
		Project project = new Project();
		project.setTitle("Test Project");
		
		InternalProject internalProject =  new InternalProject();
		internalProject.setTitle("Internal_Project");
		internalProject.setManagerName("Ananya");
		
		ExternalProject externalProject = new ExternalProject();
		externalProject.setTitle("External_Project");
		externalProject.setClientName("Vijay_Capg");
	
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(project);
		entityManager.persist(internalProject);
		entityManager.persist(externalProject);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}


}
