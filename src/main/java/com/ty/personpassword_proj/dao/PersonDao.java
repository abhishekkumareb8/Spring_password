package com.ty.personpassword_proj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.personpassword_proj.dto.Application;
import com.ty.personpassword_proj.dto.User;

@Repository
public class PersonDao {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public User saveUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}
	
	
	
	public Application saveApp(Application application) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(application);
		entityTransaction.commit();
		return application;
	}
	
	
	
	

	public void updateUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
		
	}
	
	
	public void updateApp(Application application) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(application);
		entityTransaction.commit();

	}
	
	
	public Application  getAppById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		return entityManager.find(Application.class, id);
		

	}

	

	public boolean deleteUser(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		User user = entityManager.find(User.class, id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();

		return true;
	}

	public User getUserById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(User.class, id);
	}

	public List<User> getUser() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select u from User u", User.class);
		List<User> employee = query.getResultList();
		return employee;
	}
	
	public List<Application> getapp() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select u from Application u", Application.class);
		return query.getResultList();
	
	}

	public User getUserEmail(String email) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("Select u from User u where u.email=?1", User.class)
				.setParameter(1, email);

		return (User) query.getSingleResult();
	}
	public Application getAppByEmail(String email) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("Select u from Application u where u.email=?1", Application.class)
				.setParameter(1, email);

		return (Application) query.getSingleResult();
	}
	
		
}
