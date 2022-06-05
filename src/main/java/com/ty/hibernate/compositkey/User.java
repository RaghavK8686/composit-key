package com.ty.hibernate.compositkey;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity // as we want table only for user not for user id
public class User {

	private String name;
	private int age;
	private String gender;
	private String password;
	@EmbeddedId
	private UserId userId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserId getUserId() {
		return userId;
	}

	public void setUserId(UserId userId) {
		this.userId = userId;
	}

}
