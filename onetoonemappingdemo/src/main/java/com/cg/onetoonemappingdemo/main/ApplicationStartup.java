package com.cg.onetoonemappingdemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.onetoonemappingdemo.model.Employee;
import com.cg.onetoonemappingdemo.model.Project;

public class ApplicationStartup {
public static void main(String[] args) {
		
		
		Employee employee=new Employee();
		employee.setName("Ananya Priyadarshini");
		
		Project project = new Project();
		project.setTitle("J2EE Full Stack Training");
		employee.setProject(project);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.persist(project);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
