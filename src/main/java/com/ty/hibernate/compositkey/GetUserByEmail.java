package com.ty.hibernate.compositkey;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetUserByEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select user from User user where user.userId.email=?1");
		query.setParameter(1, "Lily@gmail.com");

		List<User> users = query.getResultList();

		if (users.size() > 0) {
			for (User user : users) {
				System.out.println("name is :" + user.getName());
				System.out.println("age is: " + user.getAge());
				System.out.println("gender is :" + user.getGender());
				System.out.println("password is :" + user.getPassword());
				System.out.println("email is :" + user.getUserId().getEmail());
				System.out.println("user phone is :" + user.getUserId().getPhone());
			}
		}
	}
}
