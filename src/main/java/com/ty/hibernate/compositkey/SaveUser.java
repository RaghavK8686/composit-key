package com.ty.hibernate.compositkey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		UserId userId = new UserId();
		userId.setEmail("Dimp@gmail.com");
		userId.setPhone(74743665l);

		User user = new User();
		user.setName("Dimp");
		user.setAge(20);
		user.setGender("female");
		user.setPassword("Dimp@123");
		user.setUserId(userId);

		entityTransaction.begin();
		entityManager.persist(user);
		// entityManager.persist(userId);
		entityTransaction.commit();

	}
}
