package com.ty.hibernate.compositkey;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ValidateUserByEmailAndPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager
				.createQuery("select user from User user where user.userId.email=?1 and user.password=?2");
		query.setParameter(1, "Lily@gmail.com");
		query.setParameter(2, "Lily@123");

		List<User> users = query.getResultList();
		if (users.size() > 0) {
			System.out.println("valid email id and password");
			for (User user : users) {
				System.out.println("name is :" + user.getName());
				System.out.println("gender is :" + user.getGender());
			}
		} else {
			System.out.println("invalid");
		}
	}
}
